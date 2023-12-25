
package com.payu;

import java.util.HashMap;
import java.util.Map;
import okhttp3.*;

public class Invoice extends ApiClient {

    static final String COMMAND_CREATE = "create_invoice";
    static final String COMMAND_EXPIRE = "expire_invoice";

    public Invoice(String key, String salt, String env) {
        super(key, salt, env);
    }

    public String getCreateInvoiceResponse(HashMap<String, String> payload) {
        String hash = hasher.generateApiHash(COMMAND_CREATE, payload.toString());
        Map<String, String> params = Map.of(
                "key", key,
                "command", COMMAND_CREATE,
                "var1", payload.toString(),
                "hash", hash);
        return apiRequest(params);
    }
    public String getExpireInvoiceResponse(String txnid) {
        String hash = hasher.generateApiHash(COMMAND_EXPIRE, txnid);
        Map<String, String> params = Map.of(
                "key", key,
                "command", COMMAND_EXPIRE,
                "var1", txnid,
                "hash", hash);
        return apiRequest(params);
    }
}



