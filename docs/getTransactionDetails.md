[**<- back**](https://github.com/payu-intrepos/web-sdk-java/blob/main/README.md)

# getTransactionDetails


API Command: get_Transaction_Details

The Get Transaction Details (get_Transaction_Details) API takes works on basis input as two dates (initial and final), between which the transaction details are needed. The output consists of the status of the API (success or failed) and all the transaction details in an array format.


* **Method:**

         POST


*  **Request Header**

        Content-Type  multipart/form-data


* **Request**
  ```java
    PayuClient payuClient = PayuClient.init("Key", "salt", PayuClient.Environment.TEST);
    String response = payuClient.getTransactionDetails(startDate, endDate);
  ```



### Method Arguments


|  Argument   |  Data Type   |                                                    Description                                                     |   value    |
|:-----------:|:------------:|:------------------------------------------------------------------------------------------------------------------:|:----------:|
| *startDate* | ```String``` | This parameter must contain the starting date (from when the transaction details are needed) in YYYY-MM-DD format. |                                                    2022-10-20                                                     |
|  *endDate*  | ```String``` |   This parameter must contain the end date (till when the transaction details are needed) in YYYY-MM-DD format.    |                                                     2022-10-27                                                     |

