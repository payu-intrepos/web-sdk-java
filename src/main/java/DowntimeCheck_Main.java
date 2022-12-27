import com.payu.DowntimeCheckAPI;
import com.payu.Invoice;
import com.payu.PayuAPIHash;
import com.payu.PayuClient;

public class DowntimeCheck_Main {

    public static void main(String[] args) {
        //create instance of client.
        PayuClient payuClient = PayuClient.init("QyT13U", "UnJ0FGO0kt3dUgnHo9Xgwi0lpipBV0hB");

//***************************************** call netbankingStatus API********************************//

        PayuAPIHash netbankingStatus = new PayuAPIHash();
        netbankingStatus.key = payuClient.hasher.yourKey();
        netbankingStatus.var1 = "AXIB";
        netbankingStatus.salt = payuClient.hasher.yourSalt();
        String HashFornetbankingStatus= netbankingStatus.generateHashForNetbankingStatus();

        DowntimeCheckAPI obj1 = new DowntimeCheckAPI();
        obj1.key = payuClient.hasher.yourKey();
        obj1.var1 = "AXIB";
        obj1.environment = "Test";
        obj1.hash = HashFornetbankingStatus;
        String response1 = obj1.getNetbankingStatus();
        //System.out.println("NetbankingStatus ->" + response1);

//***************************************** call issuingBankStatus API********************************//

        PayuAPIHash issuingBankStatus = new PayuAPIHash();
        issuingBankStatus.key = payuClient.hasher.yourKey();
        issuingBankStatus.var1 = "512345";
        issuingBankStatus.salt = payuClient.hasher.yourSalt();
        String HashForissuingBankStatus= issuingBankStatus.generateHashForissuingBankStatus();
//
        DowntimeCheckAPI obj2 = new DowntimeCheckAPI();
        obj2.key = payuClient.hasher.yourKey();
        obj2.var1 = "512345";
        obj2.environment = "Test";
        obj2.hash = HashForissuingBankStatus;
        String response2 = obj2.getissuingBankStatus();
        //System.out.println("IssuingBankStatusStatus ->" + response2);

    }
}
