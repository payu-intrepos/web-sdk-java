[**<- back**](https://github.com/payu-intrepos/web-sdk-java/blob/main/README.md)

# Refund Transaction API
API Command: cancel_refund_transaction

The Cancel Refund Transaction API (cancel_refund_transaction) can be used for the following purposes:

Cancel a transaction that is in ‘auth’ state at the moment
Refund a transaction that is in a ‘captured’ state at the moment.
In this API: var1 is the Payu ID (mihpayid) of the transaction, var2 should contain the Token ID (unique token from the merchant), and va
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

    String HashForrefund =  refund.generateHashForrefund();

    Refund refundObj = new Refund();
        refundObj.key = "QyT13U";
        refundObj.environment = "Test";
        refundObj.var1 = "403993715527261883";                      //This parameter must contain the Payu ID
        refundObj.var2 = "rfveds238456uyt8yh34";                    //unique token from the merchant
        refundObj.var3 = "05.00";                                   //Refund Amount
        refundObj.hash = HashForrefund;
        String response2 = refundObj.Get_cancel_refund_transaction();



  ```



### Method Arguments


| Argument | Description   |  Value   |
|:--------:| :---: |:--------:|
|  *var1*  | This parameter must contain the Payu ID (mihpayid) of the transaction. For more information on mihpayid, refer to the Post Parameters table.| 8000123  |
|  *var2*  | This parameter must contain the Token ID (unique token from the merchant)| 20221027 |
|  *var3*  |  For captured transaction: This parameter must contain the amount which needs to be refunded. Both partial and full refunds are allowed. |   500    |


