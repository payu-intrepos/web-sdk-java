package com.payu;

import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

/**
 * Hasher class
 */
public class Hasher {
    private String key;
    private String salt;
    
    public Hasher(String key, String salt) {
       this.key = key;
       this.salt = salt;
    }

    public String calculateDigest(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(Constants.HASH_ALGO);
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
            byte[] mdbytes = messageDigest.digest();

            StringBuilder hash = new StringBuilder();
            for (byte hashByte : mdbytes) {
                hash.append(Integer.toString((hashByte & 0xff) + 0x100, 16).substring(1));
            }

            return hash.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Hash algorithm not available: " + Constants.HASH_ALGO, e);
        }
    }

    public String generatePaymentHash(HashMap params) {
        if (params == null) {
            throw new PayuException("generateHash parameter should not be null");
        }
        String template = "%s|%s|%s|%s|%s|%s|%s|%s|%s|%s|%s||||||%s";
        String str = String.format(template, key, params.getOrDefault("txnid",""), params.getOrDefault("amount",""),
                params.getOrDefault("productinfo",""), params.getOrDefault("firstname",""), params.getOrDefault("email",""),
                params.getOrDefault("udf1",""), params.getOrDefault("udf2",""), params.getOrDefault("udf3",""), params.getOrDefault("udf4",""), params.getOrDefault("udf5",""), salt);
        return calculateDigest(str);
    }

    public boolean validateHash(String receivedHash, String status, HashMap params) {
        if (receivedHash == null || status == null || params == null) {
            throw new PayuException("validateHash parameters should not be null");
        }

        String template = "%s|%s||||||%s|%s|%s|%s|%s|%s|%s|%s|%s|%s|%s";
        String str = String.format(template, salt, status, params.getOrDefault("udf5",""), params.getOrDefault("udf4",""),
                params.getOrDefault("udf3",""), params.getOrDefault("udf2",""), params.getOrDefault("udf1",""), params.getOrDefault("email",""),
                params.getOrDefault("firstname",""), params.getOrDefault("productinfo",""), params.getOrDefault("amount",""),
                params.getOrDefault("txnid",""), key);

        if (params.get("additionalCharges") != null) {
            str = params.get("additionalCharges") + "|" + str;
        }

        return calculateDigest(str).equals(receivedHash);
    }

    public String generateApiHash(String command, String var1) {
        if (command == null || var1 == null) {
            throw new PayuException("parameters should not be null");
        }
        String template = "%s|%s|%s|%s";
        String str = String.format(template, key, command, var1, salt);
        return calculateDigest(str);
    }
}
