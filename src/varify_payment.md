
[**<- back**](/Users/sumit.pawar/Desktop/Java_SDK/payu-java/src/readme1.md)
# verifyPayment



The Verify Payment (verify_payment) API gives you the status of the transaction. PayU recommends using this API to reconcile with PayU’s database after you receive the response.

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

    String HashForverify_payment =  verifyPaymentHash.generateHashForverify_payment();

    Verify_Payment obj1 = new Verify_Payment();
    obj1.key = "key";
    obj1.var1 = "txnid";
    obj1.environment = "env";   //(Test / Production)
    obj1.hash = HashForverify_payment;
    String response1 = obj1.Get_Verify_Payment();



  ```



### Method Arguments


| Argument | Data Type    | Description   |
| :---:   | :---: | :---: |
| *txnID*  | ```String```   | In this argument you can put all the transaction IDs, that is, txnid (your transaction ID/order ID) values separated by pipe.   |

