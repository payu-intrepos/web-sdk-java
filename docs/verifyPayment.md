
[**<- back**](https://github.com/payu-intrepos/web-sdk-java/blob/main/README.md)
# verifyPayment



The Verify Payment (verify_payment) API gives you the status of the transaction. PayU recommends using this API to reconcile with PayU’s database after you receive the response.


* **Method:**

         POST


*  **Request Header**

        Content-Type  multipart/form-data


* **Request**

  ```java
    PayuClient payuClient = PayuClient.init("Key", "salt", PayuClient.Environment.TEST);
    String response = payuClient.verifyPayment(txnid);
  ```

### Method Arguments


| Argument | Data Type    | Description   |
|:--------:| :---: | :---: |
| *txnid*  | ```String```   | In this argument you can put all the transaction IDs, that is, txnid (your transaction ID/order ID) values separated by pipe.   |

