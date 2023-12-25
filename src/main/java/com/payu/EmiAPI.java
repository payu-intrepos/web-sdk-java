package com.payu;

import okhttp3.*;

import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;

public class EmiAPI extends ApiClient {

    private final String COMMAND_BIN = "eligibleBinsForEMI";
    private final String COMMAND_IN = "getEmiAmountAccordingToInterest";

    public EmiAPI(String key, String salt, String env) {
        super(key, salt, env);
    }

    public String getEligibleBinsForEMIResponse(Integer bin) {
        String hash = hasher.generateApiHash(COMMAND_BIN, "bin");
        Map<String, String> params = Map.of(
                "key", key,
                "command", COMMAND_BIN,
                "var1", "bin",
                "var2", String.valueOf(bin),
                "hash", hash);
        return apiRequest(params);
    }

    public String getEmiAmountAccordingToInterest(String bankCode) {
        String hash = hasher.generateApiHash(COMMAND_IN, bankCode);
        Map<String, String> params = Map.of(
                "key", key,
                "command", COMMAND_IN,
                "var1", bankCode,
                "hash", hash);
        return apiRequest(params);
    }
}