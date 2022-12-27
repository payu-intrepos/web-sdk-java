package com.payu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RefundTest {

    PayuClient payuClient = PayuClient.init("QyT13U", "UnJ0FGO0kt3dUgnHo9Xgwi0lpipBV0hB");


    @Test
    void testgenrateEligibleBinsForEMI() {
        PayuAPIHash refund = new PayuAPIHash();
        refund.key = payuClient.hasher.yourKey();
        refund.var1 = "403993715527261883";
        refund.salt = payuClient.hasher.yourSalt();
        String HashForrefund = refund.generateHashForrefund();
        // call class to Refund api....
        Refund refundObj = new Refund();
        refundObj.key = payuClient.hasher.yourKey();
        refundObj.environment = "Test";
        refundObj.var1 = "403993715527261883";                      //This parameter must contain the Payu ID
        refundObj.var2 = "rfveds238456uyt8yh34";                    //unique token from the merchant
        refundObj.var3 = "05.00";                                   //Refund Amount
        refundObj.hash = HashForrefund;
        String response2 = refundObj.Get_cancel_refund_transaction();
        System.out.println("Refund transaction dtls->" + response2);
        assertEquals(response2, "{\"status\":0,\"msg\":\"Refund FAILURE - Transactions with same amount and same token not allowed\",\"error_code\":227,\"mihpayid\":403993715527261883}");
    }
}
