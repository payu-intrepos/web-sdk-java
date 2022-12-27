import com.payu.*;
import java.io.File;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        //create instance of client.
        PayuClient payuClient = PayuClient.init("QyT13U", "UnJ0FGO0kt3dUgnHo9Xgwi0lpipBV0hB");

//***************************************** call verify_payment API********************************//
// Hash generate For verify_payment api
       /* PayuAPIHash verifyPaymentHash = new  PayuAPIHash();
        verifyPaymentHash.key = payuClient.hasher.yourKey();
        verifyPaymentHash.var1 = "qazwsxedc3435366566";
        verifyPaymentHash.salt = payuClient.hasher.yourSalt();
        String HashForverify_payment =  verifyPaymentHash.generateHashForverify_payment();
// call class to verify_Payment
        Verify_Payment obj1 = new Verify_Payment();
        obj1.key = "QyT13U";                                // merchant key
        obj1.var1 = "qazwsxedc3435366566";                    // Need to pass txnid
        obj1.environment = "Test";
        obj1.hash = HashForverify_payment;
        String response1 = obj1.Get_Verify_Payment();
        System.out.println("verify payment->"+response1);*/


//*****************************************call cancel_refund_transaction API********************************//
// Hash generate For refund api
        /*PayuAPIHash refund = new  PayuAPIHash();
        refund.key = "QyT13U";
        refund.var1 = "403993715527261883";
        refund.salt = payuClient.hasher.yourSalt();
        String HashForrefund =  refund.generateHashForrefund();
// call class to Refund api....
        Refund refundObj = new Refund();
        refundObj.key = "QyT13U";
        refundObj.environment = "Test";
        refundObj.var1 = "403993715527261883";                      //This parameter must contain the Payu ID
        refundObj.var2 = "rfveds238456uyt8yh34";                    //unique token from the merchant
        refundObj.var3 = "05.00";                                   //Refund Amount
        refundObj.hash = HashForrefund;
        String response2 = refundObj.Get_cancel_refund_transaction();
        System.out.println("Refund transaction dtls->"+response2);*/



//*****************************************call checkdomastic API********************************//
// Hash generate For rcheckdomastic api

       /* PayuAPIHash checkdomastic = new  PayuAPIHash();
        checkdomastic.key = "QyT13U";
        checkdomastic.var1 = "512345";
        checkdomastic.salt = payuClient.hasher.yourSalt();
        String HashForcheckdomastic =  checkdomastic.generateHashForcheckisDomestic();
// call class to CheckisDomestic api....
        CheckisDomestic checkdomasticObj = new CheckisDomestic();
        checkdomasticObj.key = "QyT13U";
        checkdomasticObj.environment = "Test";
        checkdomasticObj.var1 = "512345";                       //This is the Card Number(First 6 digits of a card)
        checkdomasticObj.hash = HashForcheckdomastic;
        String response3 = checkdomasticObj.Get_Check_is_Domestic();
        System.out.println("checkdomastic dtls->"+response3);*/



//*****************************************call validateVPA API********************************//

       /* PayuAPIHash validateVPA = new  PayuAPIHash();
        validateVPA.key = "QyT13U";
        validateVPA.var1 = "9999999999@upi";
        validateVPA.salt = payuClient.hasher.yourSalt();
        String HashForvalidateVPA =  validateVPA.generateHashForvalidateVPA();
// call class to ValidateVPA api....
        ValidateVPA validate_VPA = new ValidateVPA();
        validate_VPA.key = "QyT13U";
        validate_VPA.environment = "Test";
        validate_VPA.var1 = "9999999999@upi";                           //customerVPA
        validate_VPA.hash = HashForvalidateVPA;
        String response4 = validate_VPA.Get_validateVPA();
        System.out.println("validate VPA ->"+response4);*/



//*****************************************call transactionDtls API********************************//

      /*  PayuAPIHash transactionDtls = new  PayuAPIHash();
        transactionDtls.key = "QyT13U";
        transactionDtls.var1 = "2022-09-12";
        transactionDtls.salt = payuClient.hasher.yourSalt();
        String HashFortransactionDtls =  transactionDtls.generateHashFortransactionDtls();
// call class to Get_Transaction_Details api....
        Get_Transaction_Details txndtls = new Get_Transaction_Details();
        txndtls.key = "QyT13U";
        txndtls.environment = "Test";
        txndtls.var1 = "2022-09-12";                                //parameter must contain the starting date
        txndtls.var2 = "2022-09-13";                                //This parameter must contain the end date
        txndtls.hash = HashFortransactionDtls;
        String response5 = txndtls.GetTransactionDetails();
        System.out.println("Transactions dtls->"+response5);*/

//*****************************************call checkoutDtls API********************************//

        PayuAPIHash checkoutDtls = new  PayuAPIHash();
        checkoutDtls.key = payuClient.hasher.yourKey();
        String s="{\"requestId\":\"1234567890\",\"transactionDetails\":{\"amount\":\"28900\"},\"customerDetails\":{\"mobile\":\"7715987327\"},\"filters\":{\"paymentOptions\":{\"emi\":{\"dc\":\"ICIC\"}}},\"useCase\":{\"checkCustomerEligibility\":true}}";
        checkoutDtls.var1 = s;
        checkoutDtls.salt = payuClient.hasher.yourSalt();
        String HashForcheckoutDtls =  checkoutDtls.generateHashForcheckoutDtls();
// call class to Get_Transaction_Details api....
        CheckoutDetails checkoutdtl = new CheckoutDetails();
        checkoutdtl.key = payuClient.hasher.yourKey();
        checkoutdtl.environment = "Test";
        checkoutdtl.var1 = s;
        checkoutdtl.hash = HashForcheckoutDtls;
        String response5 = checkoutdtl.Get_Checkout_Details();
        //System.out.println("Checkout dtls->"+response5);






    }

}

