
package com.payu;

import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;



public class PayuAPIHash  {

    //public PayuAPIHash(String key, String salt) {super(key, salt);}


    public String key;
    public String command ;
    public String var1;
    public String salt;

    public String generateHashForverify_payment() {
        this.command = "verify_payment";
        String template = "%s|%s|%s|%s";
        String str = String.format(template, this.key, this.command, this.var1, this.salt);
        return digestHashForAPIsAPI(str);
        // return str;
    }

    private String digestHashForAPIsAPI(String str) {
        StringBuilder hash = new StringBuilder();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(Constants.HASH_ALGO);
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
            byte[] mdbytes = messageDigest.digest();
            for (byte hashByte : mdbytes) {
                hash.append(Integer.toString((hashByte & 0xff) + 0x100, 16).substring(1));
            }
            return hash.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public String generateHashForrefund() {
        this.command = "cancel_refund_transaction";
        String template = "%s|%s|%s|%s";
        String str = String.format(template, this.key, this.command, this.var1, this.salt);
        return digestHashForAPIsAPI(str);
        // return str;
    }

    public String generateHashForcheckisDomestic() {
        this.command = "check_isDomestic";
        String template = "%s|%s|%s|%s";
        String str = String.format(template, this.key, this.command, this.var1, this.salt);
        return digestHashForAPIsAPI(str);
        // return str;
    }

    public String generateHashForvalidateVPA() {
        this.command = "validateVPA";
        String template = "%s|%s|%s|%s";
        String str = String.format(template, this.key, this.command, this.var1, this.salt);
        return digestHashForAPIsAPI(str);
        // return str;
    }
    public String generateHashFortransactionDtls() {
        this.command = "get_Transaction_Details";
        String template = "%s|%s|%s|%s";
        String str = String.format(template, this.key, this.command, this.var1, this.salt);
        return digestHashForAPIsAPI(str);
        // return str;
    }

    public String generateHashForCreateInvoice() {
        this.command = "create_invoice";
        String template = "%s|%s|%s|%s";
        String str = String.format(template, this.key, this.command, this.var1, this.salt);
        return digestHashForAPIsAPI(str);
    }

    public String generateHashForexpireInvoice() {
        this.command = "expire_invoice";
        String template = "%s|%s|%s|%s";
        String str = String.format(template, this.key, this.command, this.var1, this.salt);
        return digestHashForAPIsAPI(str);
    }

    public String generateHashForcheckoutDtls() {
        this.command = "get_checkout_details";
        String template = "%s|%s|%s|%s";
        String str = String.format(template, this.key, this.command, this.var1, this.salt);
        return digestHashForAPIsAPI(str);

    }

    public String generateHashForNetbankingStatus() {
        this.command = "getNetbankingStatus";
        String template = "%s|%s|%s|%s";
        String str = String.format(template, this.key, this.command, this.var1, this.salt);
        return digestHashForAPIsAPI(str);
    }

    public String generateHashForissuingBankStatus() {
        this.command = "getIssuingBankStatus";
        String template = "%s|%s|%s|%s";
        String str = String.format(template, this.key, this.command, this.var1, this.salt);
        return digestHashForAPIsAPI(str);

    }

    public String generateHashForeligibleBinsForEMI() {
        this.command = "eligibleBinsForEMI";
        String template = "%s|%s|%s|%s";
        String str = String.format(template, this.key, this.command, this.var1, this.salt);
        return digestHashForAPIsAPI(str);

    }

    public String generateHashForEmiAmountAccordingToInterest() {
        this.command = "getEmiAmountAccordingToInterest";
        String template = "%s|%s|%s|%s";
        String str = String.format(template, this.key, this.command, this.var1, this.salt);
        return digestHashForAPIsAPI(str);

    }
}



