[**<- back**](/Users/sumit.pawar/Desktop/Java_SDK/payu-java/src/readme1.md)

# Get Transaction Details


API Command: get_Transaction_Details

The Get Transaction Details (get_Transaction_Details) API takes works on basis input as two dates (initial and final), between which the transaction details are needed. The output consists of the status of the API (success or failed) and all the transaction details in an array format.
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

    String HashFortransactionDtls =  transactionDtls.generateHashFortransactionDtls();


    Get_Transaction_Details txndtls = new Get_Transaction_Details();
    txndtls.key = "key";
    txndtls.environment = "Test";
    txndtls.var1 = "startdate";                                //parameter must contain the starting date
    txndtls.var2 = "enddate";                                //This parameter must contain the end date
    txndtls.hash = HashFortransactionDtls;
    String response5 = txndtls.GetTransactionDetails();


  ```



### Method Arguments


| Argument | Description   |   value    |
|:--------:| :---: |:----------:|
|  *var1*  | This parameter must contain the starting date (from when the transaction details are needed) in YYYY-MM-DD format.   | 2022-10-20 |
|  *var2*  | This parameter must contain the end date (till when the transaction details are needed) in YYYY-MM-DD format.| 2022-10-27 |

