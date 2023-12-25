package com.payu;

import okhttp3.*;

import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;

public class DowntimeCheckAPI extends ApiClient{
    private final String COMMAND_NB = "getNetbankingStatus";
    private final String COMMAND_IB = "getIssuingBankStatus";
    private String returnResponse;
    public DowntimeCheckAPI(String key, String salt, String env) {
        super(key, salt, env);
    }
    public String getNetbankingStatusResponse(String bankCode) {
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
        String hash = hasher.generateApiHash(COMMAND_IB, binStr);
        Map<String, String> params = Map.of(
                "key", key,
                "command", COMMAND_IB,
                "var1", binStr,
                "hash", hash);
        return apiRequest(params);
    }
}


