package com.payu;

import java.util.Map;
class Refund extends ApiClient {
    static final String COMMAND = "cancel_refund_transaction";
    public Refund(String key, String salt, String env) {
        super(key, salt, env);
    }
    public String getCancelRefundTransactionResponse(String payuid, String requestId, Number amount) {
        String hash = hasher.generateApiHash(COMMAND, payuid);
        Map<String, String> params = Map.of(
                "key", key,
                "command", COMMAND,
                "var1", payuid,
                "var2", requestId,
                "var3", String.valueOf(amount),
                "hash", hash);
        return apiRequest(params);
    }
}