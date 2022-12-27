import com.payu.Invoice;
import com.payu.PayuAPIHash;
import com.payu.PayuClient;

public class Invoice_Main {


    public static void main(String[] args) {
        //create instance of client.
        PayuClient payuClient = PayuClient.init("QyT13U", "UnJ0FGO0kt3dUgnHo9Xgwi0lpipBV0hB");

//***************************************** call crate_invoiceHash API********************************//
        PayuAPIHash crate_invoiceHash = new PayuAPIHash();
        crate_invoiceHash.key = payuClient.hasher.yourKey();
        String s = "{\"amount\":\"1\",\"txnid\":\"qazwsxedc54321\",\"productinfo\":\"jnvjrenv\",\"firstname\":\"test\",\"email\":\"pawarsum007@gmail.com\",\"phone\":\"7798549784\",\"address1\":\"testaddress\",\"city\":\"test\",\"state\":\"test\",\"country\":\"test\",\"zipcode\":\"122002\",\"template_id\":\"1290|1580\",\"validation_period\":\"6\",\"send_email_now\":\"1\",\"send_sms\":\"1\"}";
        crate_invoiceHash.var1 = s;
        crate_invoiceHash.salt = payuClient.hasher.yourSalt();
        String HashForcreateinvoice = crate_invoiceHash.generateHashForCreateInvoice();

        Invoice obj1 = new Invoice();
        obj1.key = payuClient.hasher.yourKey();
        obj1.var1 = s;
        obj1.environment = "Test";
        obj1.hash = HashForcreateinvoice;
        String response1 = obj1.Get_Create_invoic();
        //System.out.println("create invoice->" + response1);


//***************************************** call expire_invoiceHash API********************************//

        PayuAPIHash expire_invoiceHash = new PayuAPIHash();
        expire_invoiceHash.key = payuClient.hasher.yourKey();
        expire_invoiceHash.var1 = "oknjhyg64tgd";
        expire_invoiceHash.salt = payuClient.hasher.yourSalt();
        String HashForexpireinvoice = expire_invoiceHash.generateHashForexpireInvoice();

        Invoice obj2 = new Invoice();
        obj2.key = payuClient.hasher.yourKey();
        obj2.var1 = "oknjhyg64tgd";
        obj2.environment = "Test";
        obj2.hash = HashForexpireinvoice;
        String response2 = obj2.Get_expire_invoic();
        //System.out.println("expire invoice->" + response2);




    }

}
