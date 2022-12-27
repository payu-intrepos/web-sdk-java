
import com.payu.HasherParams;
import com.payu.Payment;
import com.payu.PayuClient;

import java.util.*;

public class Payment_Main {

    public static void main(String[] args) {

        PayuClient payuClient = PayuClient.init("QyT13U", "UnJ0FGO0kt3dUgnHo9Xgwi0lpipBV0hB");
        HasherParams hashParams = new HasherParams.Builder()
            .setTxnId("qazwsxedc3435366566")
            .setAmount("10.00")
            .setProductInfo("iphone")
            .setFirstName("sumit")
            .setEmail("test@payu.in")
            .build();
        String hashStr = payuClient.hasher.generateHash(hashParams);
        //System.out.println("frist hash"+hashStr);


        Payment payment = new Payment();
        HashMap h = new HashMap();
        h.put("key","QyT13U");
        h.put("txnid","qazwsxedc3435366566");
        h.put("amount","10.00");
        h.put("productinfo","iphone");
        h.put("firstname","sumit");
        h.put("email","test@payu.in");
        h.put("phone","9999999999");
        h.put("surl","https://apiplayground-response.herokuapp.com/");
        h.put("furl","https://apiplayground-response.herokuapp.com/");
        h.put("hash",hashStr);
        payment.form(h);

    }
}
