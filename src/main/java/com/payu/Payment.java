package com.payu;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Payment extends ApiClient {

    public Payment(String key, String salt, String env) {
        super(key, salt, env);
    }

    public String comp(String str1, String val1) {
        return "<input hidden type='text' name='" + str1 + "' value='" + val1 + "'/>";
    }

    public String form(@NotNull HashMap<String, String> map) {
        if(map.isEmpty()) throw new PayuException("txnId is mandatory param.");
        if (map.get("txnid") == null) {
            throw new PayuException("txnId is mandatory param.");
        }
        if (map.get("amount") == null) {
            throw new PayuException("amount is mandatory param.");
        }
        if (map.get("productinfo") == null) {
            throw new PayuException("productInfo is mandatory param.");
        }
        if (map.get("firstname") == null) {
            throw new PayuException("firstName is mandatory param.");
        }
        if (map.get("email") == null) {
           throw new PayuException("email is mandatory param.");
        }
        if (map.get("surl") == null) {
           throw new PayuException("email is mandatory param.");
        } 
        map.put("key", key);
        map.put("hash", hasher.generatePaymentHash(map));
        StringBuilder form = new StringBuilder();
        form.append("<form name='payment_post' id='payment_post' action='").append(getPaymentUrl()).append("' method='post'>");
        Set<Map.Entry<String, String>> set = map.entrySet();// Converting to Set so that we can traverse
        for (Map.Entry<String, String> stringStringEntry : set) {
            form.append(comp(((Map.Entry) stringStringEntry).getKey().toString(), ((Map.Entry) stringStringEntry).getValue().toString()));
        }
        form.append(
                "</form><script type='text/javascript'>window.onload=function(){document.forms['payment_post'].submit()};</script>");
        return form.toString();
    }
}
