package com.payu;

import java.util.Map;
class EmiAPI extends ApiClient {

    public EmiAPI(String key, String salt, String env) {
        super(key, salt, env);
    }

    public String getEligibleBinsForEMIResponse(Integer bin) {
        String COMMAND = "eligibleBinsForEMI";
        String hash = hasher.generateApiHash(COMMAND, "bin");
        Map<String, String> params = Map.of(
                "key", key,
                "command", COMMAND,
                "var1", "bin",
                "var2", String.valueOf(bin),
                "hash", hash);
        return apiRequest(params);
    }
    public String getEmiAmountAccordingToInterestResponse(Number amount) {
        String amountStr = String.valueOf(amount);
        String COMMAND = "getEmiAmountAccordingToInterest";
        String hash = hasher.generateApiHash(COMMAND, amountStr);
        Map<String, String> params = Map.of(
                "key", key,
                "command", COMMAND,
                "var1", amountStr,
                "hash", hash);
        return apiRequest(params);
    }
}