[**<- back**](https://github.com/payu-intrepos/web-sdk-java/blob/main/README.md)

# Invoice APIs
Create an email professional invoices so that your customers, wherever they are, can pay you faster. Use the PayU Invoicing solution to send or manage invoices.

PayU helps you send Invoices to your customers through email using the following APIs:

* create_invoice
* expire_invoice



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

     //create_invoice
        String HashForcreateinvoice = crate_invoiceHash.generateHashForCreateInvoice();

    Invoice obj1 = new Invoice();
        obj1.key = "QyT13U";
        obj1.var1 = json;
        obj1.environment = "Test";
        obj1.hash = HashForcreateinvoice;
        String response1 = obj1.Get_Create_invoic();

     //expire_invoice
        String HashForexpireinvoice = expire_invoiceHash.generateHashForexpireInvoice();

    DowntimeCheckAPI obj2 = new DowntimeCheckAPI();
        Invoice obj2 = new Invoice();
        obj2.key = "QyT13U";
        obj2.var1 = "oknjhyg64tgd";
        obj2.environment = "Test";
        obj2.hash = HashForexpireinvoice;
        String response2 = obj2.Get_expire_invoic();

  ```



### Method Arguments

* create_invoice

| Argument |                      Description                      |                                                                                                                                                Value                                                                                                                                                |
|:--------:|:------------------------------------------------------:|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
|  *var1*  | The input var1 parameter must be generated in the JSON string format mentioned in the sample value string above.  | {“amount“:”10000”,”txnid“:”abaac3332″,”productinfo“:”iPhone”,”firstname“:”Samir”,”em ail“:”test@test.com”,”phone“:”9988776655”,”address1“:”testaddress”,”city“:”Mumbai”,”stat e“:”Maharashtra”,”country“:”India”,”zipcode“:”122002″,”template_id“:”14″,”validation_period“: 6,”send_email_now“:”1”} |

* expire_invoice

| Argument |                                                                                       Description                                                                                       |   value   |
|:--------:|:--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|:---------:|
|  *var1*  |Specify the transaction ID in this field.Note: The transaction ID specified here is same as the transaction ID specified in the txnID field of the var1 parameter for Create Invoice API| test11390 |
