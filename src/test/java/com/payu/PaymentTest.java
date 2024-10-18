package com.payu;
import org.json.JSONObject;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentTest {

    PayuClient payuClient = PayuClient.init("QyT13U", "UnJ0FGO0kt3dUgnHo9Xgwi0lpipBV0hB", PayuClient.Environment.TEST);
    @Test
    void testgenratehtml() {
        JSONObject h = new JSONObject();
        h.put("key", "QyT13U");
        h.put("txnid", "345345");
        h.put("amount", "10.00");
        h.put("productinfo", "iphone");
        h.put("firstname", "sumit");
        h.put("email", "test@payu.in");
        h.put("phone", "9999999999");
        h.put("surl", "https://apiplayground-response.herokuapp.com/");
        h.put("furl", "https://apiplayground-response.herokuapp.com/");
        assertEquals(payuClient.generatePaymentForm(h), "<form name='payment_post' id='payment_post' action='https://test.payu.in/_payment' method='post'><input hidden type='text' name='amount' value='10.00'/><input hidden type='text' name='firstname' value='sumit'/><input hidden type='text' name='phone' value='9999999999'/><input hidden type='text' name='furl' value='https://apiplayground-response.herokuapp.com/'/><input hidden type='text' name='surl' value='https://apiplayground-response.herokuapp.com/'/><input hidden type='text' name='productinfo' value='iphone'/><input hidden type='text' name='key' value='QyT13U'/><input hidden type='text' name='email' value='test@payu.in'/><input hidden type='text' name='hash' value='f512861a635cae943fde319e86c3ff026d011da0dec95d549bbdf0f26afa24f24887579cd0e58de3a651d2c77405f13a95d9acadbf3392292d7e485eff61ca59'/><input hidden type='text' name='txnid' value='345345'/></form><script type='text/javascript'>window.onload=function(){document.forms['payment_post'].submit()};</script>");
    }

}
