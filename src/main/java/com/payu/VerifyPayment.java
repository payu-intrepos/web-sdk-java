package com.payu;

import java.util.Map;

class VerifyPayment extends ApiClient {

    static final String COMMAND = "verify_payment";

    public VerifyPayment(String key, String salt, String env) {
        super(key, salt, env);
    }

    public String getVerifyPaymentResponse(String txnid) {
        String hash = hasher.generateApiHash(COMMAND, txnid);
        Map<String, String> params = Map.of(
                "key", key,
                "command", COMMAND,
                "var1", txnid,
                "hash", hash);
        return apiRequest(params);
    }
}
