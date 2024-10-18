
[**<- back**](https://github.com/payu-intrepos/web-sdk-java/blob/main/README.md)

# eligibleBinsForEMI
The EMI APIs allows you to check the customer’s eligibility for CC EMI

* **Method:**

         POST


*  **Request Header**

        Content-Type  multipart/form-data

* **Request**

  ```java
    PayuClient payuClient = PayuClient.init("Key", "salt", PayuClient.Environment.TEST);
    String response = payuClient.eligibleBinsForEMI(type,txnid);
  ```


### Method Arguments



| Argument |                                                                                  Data Type                                                                                   | Description| Example |
|:--------:|:----------:|:------------------------------------------------------------------------------------------------------------------------------------------------------------------:|:-------:|
|  *type*  |            |                                     This parameter needs can include any of the following the values:BIN and NET                                                 |   bin   |
|  *bin*   | |If bin is passed in type parameter, the first 6/8/9 digits of card number or network token.or If NET is pased in the type parameter, the entire network token must be passed | 434668  |