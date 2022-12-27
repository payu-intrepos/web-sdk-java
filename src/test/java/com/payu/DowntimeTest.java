package com.payu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DowntimeTest {

    PayuClient payuClient = PayuClient.init("QyT13U", "UnJ0FGO0kt3dUgnHo9Xgwi0lpipBV0hB");

    @BeforeEach
    void init() {
        String s = new DowntimeCheckAPI().getNetbankingStatus();
        PayuAPIHash netbankingStatus = new PayuAPIHash();
        netbankingStatus.key = payuClient.hasher.yourKey();
        netbankingStatus.var1 = "AXIB";
        netbankingStatus.salt = payuClient.hasher.yourSalt();
        String HashFornetbankingStatus= netbankingStatus.generateHashForNetbankingStatus();
    }

    @Test
    void testgenrategetNetbankingStatus() {

        PayuAPIHash netbankingStatus = new PayuAPIHash();
        netbankingStatus.key = payuClient.hasher.yourKey();
        netbankingStatus.var1 = "AXIB";
        netbankingStatus.salt = payuClient.hasher.yourSalt();
        String HashFornetbankingStatus= netbankingStatus.generateHashForNetbankingStatus();
        DowntimeCheckAPI obj1 = new DowntimeCheckAPI();
        obj1.key = payuClient.hasher.yourKey();
        obj1.var1 = "AXIB";
        obj1.environment = "Test";
        obj1.hash = HashFornetbankingStatus;
        String response1 = obj1.getNetbankingStatus();

        assertEquals(response1, "{\"ibibo_code\":\"AXIB\",\"title\":\"Axis NB\",\"up_status\":1,\"mode\":\"NB\"}");
    }

    @Test
    void testgenrategetissuingBankStatus() {

        PayuAPIHash issuingBankStatus = new PayuAPIHash();
        issuingBankStatus.key = payuClient.hasher.yourKey();
        issuingBankStatus.var1 = "512345";
        issuingBankStatus.salt = payuClient.hasher.yourSalt();
        String HashForissuingBankStatus= issuingBankStatus.generateHashForissuingBankStatus();
        DowntimeCheckAPI obj2 = new DowntimeCheckAPI();
        obj2.key = payuClient.hasher.yourKey();
        obj2.var1 = "512345";
        obj2.environment = "Test";
        obj2.hash = HashForissuingBankStatus;
        String response2 = obj2.getissuingBankStatus();

        assertEquals(response2, "{\"issuing_bank\":\"HDFC\",\"up_status\":\"1\"}");
    }
}
