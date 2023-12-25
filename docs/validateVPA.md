[**<- back**](https://github.com/payu-intrepos/web-sdk-java/blob/main/README.md)


# validateVPA

API command: validateVPA

This web service will let you validate VPA if it is a valid VPA or not.

After the customer enters VPA on the merchant page, you need to call this API to check for VPA validation. If VPA is valid only then, the second call should be made.

* **Method:**

         POST


*  **Request Header**

        Content-Type  multipart/form-data


* **Request**
  ```java
    PayuClient payuClient = PayuClient.init("Key", "salt", PayuClient.Environment.TEST);
    String response = payuClient.validateVPA(vpa);
  ```
  
### Method Arguments


| Argument | Data Type    | Description   |
|:--------:| :---: | :---: |
|  *vpa*   | ```String```   | customerVPA |

