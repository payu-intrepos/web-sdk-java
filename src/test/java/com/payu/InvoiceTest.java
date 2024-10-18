package com.payu;

import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceTest {
    PayuClient payuClient = PayuClient.init("QyT13U", "UnJ0FGO0kt3dUgnHo9Xgwi0lpipBV0hB", PayuClient.Environment.TEST);
    @Test
    void testgenratecreateinvoice() {
        JSONObject h = new JSONObject();
        h.put("txnid","qazwsxedc54321");
        h.put("amount",1);
        h.put("productinfo","iphone");
        h.put("firstname","sumit");
        h.put("email","test@payu.in");
        h.put("phone","9999999999");
        h.put("surl","https://apiplayground-response.herokuapp.com/");
        h.put("furl","https://apiplayground-response.herokuapp.com/");
        String response1 = payuClient.createInvoice(h);
        assertEquals( response1, "\"Invoice has not been expired or max attempt has been reached for requested txnid.\"");
    }

    @Test
    void testgenrateexpireinvoice() {
        String response2 = payuClient.expireInvoice("oknjhyg64tgd");
        assertEquals( response2, "{\"status\":1,\"msg\":\"Invoice expired\"}");
    }

}
