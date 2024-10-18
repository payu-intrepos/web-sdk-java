package com.payu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DowntimeTest {
    PayuClient payuClient = PayuClient.init("QyT13U", "UnJ0FGO0kt3dUgnHo9Xgwi0lpipBV0hB", PayuClient.Environment.TEST);
    @Test
    void testgenrategetNetbankingStatus() {
        String response1 = payuClient.getNetbankingStatus("AXIB");
        assertEquals(response1, "{\"ibibo_code\":\"AXIB\",\"title\":\"Axis NB\",\"up_status\":1,\"mode\":\"NB\"}");
    }

    @Test
    void testgenrategetissuingBankStatus() {
        String response2 = payuClient.getIssuingBankStatus(512345);
        assertEquals(response2, "{\"issuing_bank\":\"AXIS\",\"up_status\":1}");
    }
}
