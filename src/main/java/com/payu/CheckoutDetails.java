package com.payu;

import okhttp3.*;

import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;

public class CheckoutDetails {
    public String key;
    public String var1;

    public String hash;
    public String environment;
    private String returnResponse;

    public String Get_Checkout_Details() {
        try {

            URL url = new URL("https://info.payu.in/merchant/postservice.php?form=2");
            if (this.environment.equalsIgnoreCase("Test")) {
                url = new URL("https://test.payu.in/merchant/postservice.php?form=2");
//            System.out.println("This is test environment");

            } else if (this.environment.equalsIgnoreCase("Production")) {
                url = new URL("https://info.payu.in/merchant/postservice.php?form=2");
//            System.out.println("This is Production environment");

            }


            Map<String, String> params = new LinkedHashMap<String, String>();
            params.put("key", this.key);
            params.put("command", "get_checkout_details");
            params.put("var1", this.var1);
            params.put("hash", this.hash);
            StringBuilder postData = new StringBuilder();
            if (this.key == null) {
                throw new PayuException("key is mandatory param, please pass your merchant key");
            } else if (this.var1 == null) {
                throw new PayuException("var1 is mandatory param, please pass var1 for the API");
            }

            OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
            MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
            RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
                .addFormDataPart("key",this.key)
                .addFormDataPart("command","get_checkout_details")
                .addFormDataPart("var1",this.var1)
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
