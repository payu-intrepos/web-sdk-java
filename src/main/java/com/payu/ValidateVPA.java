package com.payu;

import java.util.Map;
class ValidateVPA extends ApiClient {
    static final String COMMAND = "validateVPA";
    public ValidateVPA(String key, String salt, String env) {
        super(key, salt, env);
    }
    public String getValidateVPAResponse(String vpa) {
        String hash = hasher.generateApiHash(COMMAND, vpa);
        Map<String, String> params = Map.of(
                "key", key,
                "command", COMMAND,
                "var1", vpa,
                "hash", hash);
        return apiRequest(params);
    }
}