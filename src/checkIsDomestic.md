[**<- back**](https://github.com/payu-intrepos/web-sdk-java/blob/main/README.md)

# Get Card BIN Information

API Command: check_isDomestic

The BIN API or check_isDomestic API is used to detect whether a particular BIN number is international or domestic. It is also useful to determine:

* card’s issuing bank
* card type such as, Visa, Master, etc.,
* card category such as Credit/Debit, etc.
* var1 is bin number which is the first 6 digits of a Credit/Debit card.


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

        String HashForcheckdomastic =  checkdomastic.generateHashForcheckisDomestic();

    CheckisDomestic checkdomasticObj = new CheckisDomestic();
        checkdomasticObj.key = "QyT13U";
        checkdomasticObj.environment = "Test";
        checkdomasticObj.var1 = "512345";                       //This is the Card Number(First 6 digits of a card)
        checkdomasticObj.hash = HashForcheckdomastic;
        String response3 = checkdomasticObj.Get_Check_is_Domestic();


  ```



### Method Arguments


| Argument | Data Type    | Description   |
|:--------:| :---: | :---: |
|  *var1*  | ```String```   | This is the Card Number/Bin (First 6 digits of a card)	|
