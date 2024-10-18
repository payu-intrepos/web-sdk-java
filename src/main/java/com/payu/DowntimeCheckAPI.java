package com.payu;

import java.util.Map;

class DowntimeCheckAPI extends ApiClient{
    private String returnResponse;
    public DowntimeCheckAPI(String key, String salt, String env) {
        super(key, salt, env);
    }
    public String getNetbankingStatusResponse(String bankCode) {
        String COMMAND_NB = "getNetbankingStatus";
        String hash = hasher.generateApiHash(COMMAND_NB, bankCode);
        Map<String, String> params = Map.of(
                "key", key,
                "command", COMMAND_NB,
                "var1", bankCode,
                "hash", hash);
        return apiRequest(params);
    }

    public String getIssuingBankStatusResponse(Integer bin) {
        String binStr = String.valueOf(bin);
        String COMMAND_IB = "getIssuingBankStatus";
        String hash = hasher.generateApiHash(COMMAND_IB, binStr);
        Map<String, String> params = Map.of(
                "key", key,
                "command", COMMAND_IB,
                "var1", binStr,
                "hash", hash);
        return apiRequest(params);
    }
}


