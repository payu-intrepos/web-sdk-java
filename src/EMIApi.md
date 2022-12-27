
[**<- back**](/Users/sumit.pawar/Desktop/Java_SDK/payu-java/src/readme1.md)

# EMI APIs
The EMI APIs allows you to check the customer’s eligibility for EMI and get the EMI amount according to interest using the following APIS:

* eligibleBinsForEMI
* getEmiAmountAccordingToInterest



* **URL**

         -Test        https://test.payu.in/merchant/postservice.php?form=2

         -Production	https://info.payu.in/merchant/postservice.php?form=2



* **Method:**

         POST


*  **Request Header**

        Content-Type  multipart/form-data


* **Request**

  ```javascript

    PayuClient payuClient = PayuClient.init("Key", "salt");

     //eligibleBinsForEMI
        String HashForeligibleBinsForEMI= eligibleBinsForEMI.generateHashForeligibleBinsForEMI();

    DowntimeCheckAPI obj1 = new DowntimeCheckAPI();
        EMI_APIs obj1 = new EMI_APIs();
        obj1.key = "QyT13U";
        obj1.var1 = "bin";
        obj1.var2 = "512345";
        obj1.environment = "Test";
        obj1.hash = HashForeligibleBinsForEMI;
        String response1 = obj1.geteligibleBinsForEMI();

     //getEmiAmountAccordingToInterest
        String HashForEmiAmountAccordingToInterest= EmiAmountAccordingToInterest.generateHashForEmiAmountAccordingToInterest();

    DowntimeCheckAPI obj2 = new DowntimeCheckAPI();
         EMI_APIs obj2 = new EMI_APIs();
        obj2.key = "QyT13U";
        obj2.var1 = "100";
        obj2.environment = "Test";
        obj2.hash = HashForEmiAmountAccordingToInterest;
        String response2 = obj2.getEmiAmountAccordingToInterest();


  ```



### Method Arguments

* eligibleBinsForEMI

| Argument |                                         Data Type                                         | Description |
|:--------:|:-----------------------------------------------------------------------------------------:|:-----------:|
|  *var1*  |       This parameter needs can include any of the following the values:BIN and NET        |     bin     |
|  *var2*  | If bin used in var1 parameter, the first 6/8/9 digits of card number or network token.or If NET used in the var1 parameter, the entire network token must be passed |     434668     |

* getEmiAmountAccordingToInterest

| Argument |                       Data Type                        | Description |
|:--------:|:------------------------------------------------------:|:-----------:|
|  *var1*  |  The amount that must be converted to EMI. |   10000    |
