import com.payu.EMI_APIs;
import com.payu.PayuAPIHash;
import com.payu.PayuClient;

public class Emi_Main {

    public static void main(String[] args) {
        //create instance of client.
        PayuClient payuClient = PayuClient.init("QyT13U", "UnJ0FGO0kt3dUgnHo9Xgwi0lpipBV0hB");

//***************************************** call eligibleBinsForEMI API********************************//

        PayuAPIHash eligibleBinsForEMI = new PayuAPIHash();
        eligibleBinsForEMI.key = payuClient.hasher.yourKey();
        eligibleBinsForEMI.var1 = "bin";
        eligibleBinsForEMI.salt = payuClient.hasher.yourSalt();
        String HashForeligibleBinsForEMI= eligibleBinsForEMI.generateHashForeligibleBinsForEMI();

        EMI_APIs obj1 = new EMI_APIs();
        obj1.key = payuClient.hasher.yourKey();
        obj1.var1 = "bin";
        obj1.var2 = "512345";
        obj1.environment = "Test";
        obj1.hash = HashForeligibleBinsForEMI;
        String response1 = obj1.geteligibleBinsForEMI();
       // System.out.println("EligibleBinsForEMI ->" + response1);

 //***************************************** call getEmiAmountAccordingToInterest API********************************//


        PayuAPIHash EmiAmountAccordingToInterest = new PayuAPIHash();
        EmiAmountAccordingToInterest.key = payuClient.hasher.yourKey();
        EmiAmountAccordingToInterest.var1 = "100";
        EmiAmountAccordingToInterest.salt = payuClient.hasher.yourSalt();
        String HashForEmiAmountAccordingToInterest= EmiAmountAccordingToInterest.generateHashForEmiAmountAccordingToInterest();

        EMI_APIs obj2 = new EMI_APIs();
        obj2.key = payuClient.hasher.yourKey();
        obj2.var1 = "100";
        obj2.environment = "Test";
        obj2.hash = HashForEmiAmountAccordingToInterest;
        String response2 = obj2.getEmiAmountAccordingToInterest();
        //System.out.println("EmiAmountAccordingToInterest ->" + response2);


    }


}
