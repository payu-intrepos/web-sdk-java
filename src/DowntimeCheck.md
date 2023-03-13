[**<- back**](https://github.com/payu-intrepos/web-sdk-java/blob/main/README.md)

# Downtime Check APIs
The Downtime Check APIs help you get  the downtime of the Net Banking or card BINs for all the banks which are observing either full downtime or partial downtime.

This API is used to help you in handling the credit card/debit card issuing bank’s downtime. It allows you to get the present status of the issuing bank using the specific Bank Identification Number (BIN). BIN is identified as the first six digits of a credit or debit card. You need to provide the BIN number as input and the corresponding issuing bank’s status would be returned in the output (whether up or down).
This API is used to retrieve the card BINs for all banks which are observing either full downtime or partial downtime at an instant. The information related to full/partial downtime depends on the input.
This section describes how to use the following APIs:

* getNetbankingStatus
* getIssuingBankStatus



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

     //getNetbankingStatus
    String HashFornetbankingStatus= netbankingStatus.generateHashForNetbankingStatus();

    DowntimeCheckAPI obj1 = new DowntimeCheckAPI();
        obj1.key = "QyT13U";
        obj1.var1 = "AXIB";
        obj1.environment = "Test";
        obj1.hash = HashFornetbankingStatus;
        String response1 = obj1.getNetbankingStatus();

     //getIssuingBankStatus
     String HashForissuingBankStatus= issuingBankStatus.generateHashForissuingBankStatus();

    DowntimeCheckAPI obj2 = new DowntimeCheckAPI();
        obj2.key = "QyT13U";
        obj2.var1 = "512345";
        obj2.environment = "Test";
        obj2.hash = HashForissuingBankStatus;
        String response2 = obj2.getissuingBankStatus();


  ```



### Method Arguments

* getNetbankingStatus

| Argument |                       Data Type                        | Description   |
|:--------:|:------------------------------------------------------:| :---: |
|  *var1*  | This parameter must contain any of NetBanking code or default | AXIB/“default”  |

* getIssuingBankStatus

| Argument |                       Data Type                        | Description |
|:--------:|:------------------------------------------------------:|:-----------:|
|  *var1*  |  This parameter must contain the bank identification number |   123456    |
