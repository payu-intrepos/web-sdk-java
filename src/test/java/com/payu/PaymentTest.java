package com.payu;
import org.junit.jupiter.api.*;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentTest {

    private Hasher hash = new Hasher("QyT13U", "UnJ0FGO0kt3dUgnHo9Xgwi0lpipBV0hB");
    private HasherParams.Builder builder;
    Payment payment = new Payment();


    @Test
    void testgenratehtml() {

        HashMap h = new HashMap();
        h.put("key", "QyT13U");
        h.put("txnid", "qazwsxedc3435366566");
        h.put("amount", "10.00");
        h.put("productinfo", "iphone");
        h.put("firstname", "sumit");
        h.put("email", "test@payu.in");
        h.put("phone", "9999999999");
        h.put("surl", "https://apiplayground-response.herokuapp.com/");
        h.put("furl", "https://apiplayground-response.herokuapp.com/");
        h.put("hash", "39cab2e2e7676e3bb559c39554d160a691aed12a10d474e0009c09ba05db2a7b48af9535f6cc1d1f4a50c6199ae36dad31e9afdbbd61c5acc7cbbb2958963178");

        assertEquals(payment.form(h), "sdfs");
    }

}
