package com.payu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RefundTest {

    PayuClient payuClient = PayuClient.init("QyT13U", "UnJ0FGO0kt3dUgnHo9Xgwi0lpipBV0hB", PayuClient.Environment.TEST);
    @Test
    void testgenrateEligibleBinsForEMI() {
        String response2 = payuClient.cancelRefundTransaction("403993715527261883","rfveds238456uyt8yh34", 5.00);
        assertEquals(response2, "{\"status\":0,\"msg\":\"Refund FAILURE - Purged Transaction. Refund request requires manual follow-up\",\"error_code\":230,\"mihpayid\":403993715527261883}");
    }
}
