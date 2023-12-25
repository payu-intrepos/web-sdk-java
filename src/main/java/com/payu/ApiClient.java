package com.payu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class ApiClient {

  public Hasher hasher;

  protected String key;
  protected String salt;
  protected String env;

  public ApiClient(String key, String salt, String env) {
    this.key = key;
    this.salt = salt;
    this.env = env;
    hasher = new Hasher(key, salt);
  }

  private String request(String endpoint, Map<String, String> params) {
    try {
      URL url = new URL(endpoint);
      StringBuilder postData = new StringBuilder();
      for (Map.Entry<String, String> entry : params.entrySet()) {
        if (postData.length() != 0)
          postData.append('&');
        postData.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
        postData.append('=');
        postData.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
      }

      byte[] postDataBytes = postData.toString().getBytes(StandardCharsets.UTF_8);

      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      try {
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        conn.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));
        conn.setDoOutput(true);

        conn.getOutputStream().write(postDataBytes);

        try (Reader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8))) {
          StringBuilder sb = new StringBuilder();
          for (int c; (c = in.read()) >= 0;)
            sb.append((char) c);
          return sb.toString();
        }
      } finally {
        conn.disconnect();
      }
    } catch (Exception e) {
      return e.toString();
    }
  }

  public String getPaymentUrl() {
    return env.equalsIgnoreCase("TEST") ? "https://test.payu.in/_payment" : "https://secure.payu.in/_payment";
  }

  public String getApiUrl() {
    return env.equalsIgnoreCase("TEST") ? "https://test.payu.in/merchant/postservice.php?form=2"
        : "https://info.payu.in/merchant/postservice.php?form=2";
  }

  public String apiRequest(Map<String, String> params) {
    return request(getApiUrl(), params);
  }

  public String paymentRequest(Map<String, String> params) {
    return request(getPaymentUrl(), params);
  }
}