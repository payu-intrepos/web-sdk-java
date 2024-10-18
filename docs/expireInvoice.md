[**<- back**](https://github.com/payu-intrepos/web-sdk-java/blob/main/README.md)

# expireInvoice

PayU helps you send Invoices to your customers through email and below API is used to expiry an existing invoice.

* **Method:**

         POST


*  **Request Header**

        Content-Type  multipart/form-data


* **Request**

  ```java
    PayuClient payuClient = PayuClient.init("Key", "salt", PayuClient.Environment.TEST);
    String response = payuClient.expireInvoice(txnid);
  ```


### Method Arguments

| Argument |                                                                                       Description                                                                                       |   value   |
|:--------:|:--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|:---------:|
| *txnid*  |Specify the transaction ID in this field.Note: The transaction ID specified here is same as the transaction ID specified in the txnID field of the var1 parameter for Create Invoice API| test11390 |
