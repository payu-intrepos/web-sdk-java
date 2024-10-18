
package com.payu;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.*;

public class Refund {

    public String key;
    public String var1;
    public String var2;
    public String var3;
    public String hash;
    public String environment;
    private String returnResponse;

    public String Get_cancel_refund_transaction() {
        try {

            URL url = new URL("https://info.payu.in/merchant/postservice.php?form=2");
            if (this.environment.equalsIgnoreCase("Test")) {
                url = new URL("https://test.payu.in/merchant/postservice.php?form=2");
//            System.out.println("This is test environment");

            } else if (this.environment.equalsIgnoreCase("Production")) {
                url = new URL("https://info.payu.in/merchant/postservice.php?form=2");
//            System.out.println("This is Production environment");

            }

            System.out.println("....." + var1 + "....." + key+"..."+var3+"..."+var2);

            Map<String, String> params = new LinkedHashMap<String, String>();
            params.put("key", this.key);
            params.put("command", "cancel_refund_transaction");
            params.put("var1", this.var1);
            params.put("var2", this.var1);
            params.put("var3", this.var1);
            params.put("hash", this.hash);
            StringBuilder postData = new StringBuilder();
            if (this.key == null) {
                throw new PayuException("key is mandatory param, please pass your merchant key");
            } else if (this.var1 == null) {
                throw new PayuException("var1 is mandatory param, please pass var1 for the API");
            }else if (this.var2 == null) {
                throw new PayuException("var2 is mandatory param, please pass var2 for the API");
            }else if (this.var3 == null) {
                throw new PayuException("var3 is mandatory param, please pass var3 for the API");
            }

            OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
            MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
            RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
                .addFormDataPart("key",this.key)
                .addFormDataPart("command","cancel_refund_transaction")
                .addFormDataPart("var1",this.var1)
                .addFormDataPart("var2",this.var2)
                .addFormDataPart("var3",this.var3)
                .addFormDataPart("hash",this.hash)
                .build();
            Request request = new Request.Builder()
                .url(url)
                .method("POST", body)
                .build();
            Response response = client.newCall(request).execute();
            returnResponse = response.body().string();
            return returnResponse;
        } catch (Exception e) {
            return e.toString();
        }
        //  return null;
    }

}



