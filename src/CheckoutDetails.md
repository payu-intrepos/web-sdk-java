[**<- back**](/Users/sumit.pawar/Desktop/Java_SDK/payu-java/src/readme1.md)

# Get Checkout Details API

API Command: get_checkout_details

The get_checkout_details API is a generic API using which they can get information when you create the custom checkout-pages, that will contain the payment options, offers, recommendations, and downtime details. The API provides the following details:

Payment option details: The extended details for each payment option available for the merchant.
Additional charges: The additional charges configured for all payment options.
eligibility details
Downtime details: The downtime status of the payment options.

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

    String HashForcheckoutDtls =  checkoutDtls.generateHashForcheckoutDtls();

    CheckoutDetails checkoutdtl = new CheckoutDetails();
    checkoutdtl.key = "key";
    checkoutdtl.environment = "Test";
    checkoutdtl.var1 = json;
    checkoutdtl.hash = HashForcheckoutDtls;
    String response5 = checkoutdtl.Get_Checkout_Details();



  ```



### Method Arguments


| Argument | Data Type  | Description   |
| :---:   |:----------:| :---: |
| *txnID*  | ```json``` | The request is in a JSON format as described in the JSON Format section and JSON Fields Description.|

