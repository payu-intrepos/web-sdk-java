package com.payu;

import java.util.Map;

public class CheckIsDomestic extends ApiClient {
    static final String COMMAND = "check_isDomestic";

    public CheckIsDomestic(String key, String salt, String env) {
        super(key, salt, env);
    }

    public String getCheckIsDomesticResponse(Integer bin) {
        String binStr = String.valueOf(bin);
        String hash = hasher.generateApiHash(COMMAND, binStr);
        Map<String, String> params = Map.of(
                "key", key,
                "command", COMMAND,
                "var1", binStr,
                "hash", hash);
        return apiRequest(params);
    }
}
