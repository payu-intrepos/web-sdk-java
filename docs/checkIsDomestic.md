[**<- back**](https://github.com/payu-intrepos/web-sdk-java/blob/main/README.md)

# checkIsDomestic

API Command: check_isDomestic

The BIN API or check_isDomestic API is used to detect whether a particular BIN number is international or domestic. It is also useful to determine:

* card’s issuing bank
* card type such as, Visa, Master, etc.,
* card category such as Credit/Debit, etc.
* var1 is bin number which is the first 6 digits of a Credit/Debit card.


* **Method:**

         POST


*  **Request Header**

        Content-Type  multipart/form-data

* **Request**

  ```java
    PayuClient payuClient = PayuClient.init("Key", "salt", PayuClient.Environment.TEST);
    String response = payuClient.checkIsDomestic(bin);
  ```


### Method Arguments


| Argument |   Data Type   |                       Description                       |
|:--------:|:-------------:|:-------------------------------------------------------:|
|  *bin*   | ```Integer``` | This is the Card Number/Bin (First 6 digits of a card)	 |
