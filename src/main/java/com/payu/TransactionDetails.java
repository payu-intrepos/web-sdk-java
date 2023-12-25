package com.payu;

import java.util.Map;
public class TransactionDetails extends ApiClient {
    static final String COMMAND = "get_Transaction_Details";

    public TransactionDetails(String key, String salt, String env) {
        super(key, salt, env);
    }
    public String getTransactionDetailsResponse(String startDate, String endDate) {
        String hash = hasher.generateApiHash(COMMAND, startDate);
        Map<String, String> params = Map.of(
                "key", key,
                "command", COMMAND,
                "var1", startDate,
                "var2", endDate,
                "hash", hash);
        return apiRequest(params);
    }
}
