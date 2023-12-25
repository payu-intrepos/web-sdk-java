
[**<- back**](https://github.com/payu-intrepos/web-sdk-java/blob/main/README.md)

# getEmiAmountAccordingToInterest
The EMI APIs allows you to fetch the EMI amount according to interest.

* **Method:**

         POST

*  **Request Header**

        Content-Type  multipart/form-data

* **Request**

  ```java
    PayuClient payuClient = PayuClient.init("Key", "salt", PayuClient.Environment.TEST);
    String response = payuClient.getEmiAmountAccordingToInterest(amount);
  ```


### Method Arguments


| Argument |  Data Type   |                              Description             |                   Example           |
|:--------:|:------------:|:-----------------------------------------:|:---------------------------------------:|
| *amount* | ```Number``` | The amount that must be converted to EMI. |                  10000                  |
