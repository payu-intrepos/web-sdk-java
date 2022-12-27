[**<- back**](/Users/sumit.pawar/Desktop/Java_SDK/payu-java/src/readme1.md)

# Validate UPI Handle API

API command: validateVPA

This web service will let you validate VPA if it is a valid VPA or not.

After the customer enters VPA on the merchant page, you need to call this API to check for VPA validation. If VPA is valid only then, the second call should be made.


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

        String HashForvalidateVPA =  validateVPA.generateHashForvalidateVPA();

    ValidateVPA validate_VPA = new ValidateVPA();
        validate_VPA.key = "QyT13U";
        validate_VPA.environment = "Test";
        validate_VPA.var1 = "9999999999@upi";                           //customerVPA
        validate_VPA.hash = HashForvalidateVPA;
        String response4 = validate_VPA.Get_validateVPA();



  ```



### Method Arguments


| Argument | Data Type    | Description   |
|:--------:| :---: | :---: |
|  *var1*  | ```String```   | customerVPA |

