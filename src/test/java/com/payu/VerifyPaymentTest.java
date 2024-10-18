package com.payu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VerifyPaymentTest {
    PayuClient payuClient = PayuClient.init("QyT13U", "UnJ0FGO0kt3dUgnHo9Xgwi0lpipBV0hB", PayuClient.Environment.TEST);
    @Test
    void testgenrateverifypayment() {
        String response1 = payuClient.verifyPayment("qazwsxedc3435366566");
        System.out.println("verify payment->"+response1);

        assertEquals(response1, "{\"status\":1,\"msg\":\"1 out of 1 Transactions Fetched Successfully\",\"transaction_details\":{\"qazwsxedc3435366566\":{\"mihpayid\":\"403993715527264430\",\"request_id\":\"\",\"bank_ref_num\":\"264724\",\"amt\":\"10.00\",\"transaction_amount\":\"10.00\",\"txnid\":\"qazwsxedc3435366566\",\"additional_charges\":\"0.00\",\"productinfo\":\"iphone\",\"firstname\":\"sumit\",\"bankcode\":\"CC\",\"udf1\":null,\"udf3\":null,\"udf4\":null,\"udf5\":null,\"field2\":\"573041\",\"field9\":\"No Error\",\"error_code\":\"E000\",\"addedon\":\"2022-09-13 13:07:31\",\"payment_source\":\"payu\",\"card_type\":\"MAST\",\"error_Message\":\"No Error\",\"net_amount_debit\":10,\"disc\":\"0.00\",\"mode\":\"CC\",\"PG_TYPE\":\"CC-PG\",\"card_no\":\"XXXXXXXXXXXX2346\",\"name_on_card\":null,\"udf2\":null,\"field3\":\"20220913\",\"field1\":\"264724\",\"status\":\"success\",\"unmappedstatus\":\"captured\",\"Merchant_UTR\":null,\"Settled_At\":\"0000-00-00 00:00:00\"}}}");

    }

}
