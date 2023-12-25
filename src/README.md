
# PayU SDK for java Apis
This API gives you the status of the transaction. PayU recommends this API to reconcile with PayU’s database after you receive the response, where var1 is your transaction id.

## Features Supported
Following features are supported in the Payment link JAVA SDK:
- Create Payment Link
- Verify transactions, check the transaction status, transaction details, or discount rate for a transaction
- Initiated refunds, cancel refund, check refund status.
- Retrieve settlement details which the bank has to settle you.
- Get information of the payment options, offers, recommendations, and downtime details.
- Check the customer’s eligibility for EMI and get the EMI amount according to interest
- Pay by link
  To get started with PayU, visit our [Developer Guide](https://devguide.payu.in/)
# Table of Contents
1. [Getting Started](#getting-started)
2. [Installation](#installation)
3. [Documentation for various Methods](#documentation-for-various-methods)
## Getting Started
Please follow the [installation](#installation) instruction and execute the following JS code for creating the instance of PayU Object:
```javascript
PayuClient payuClient = PayuClient.init("KEY", "SALT");
// Need to set merchant key and salt
```
## Installation
* **Prerequisites:**

```shell

  Install the latest version of [Java](https://java.com) and [Maven](https://maven.apache.org/download.html).
  Set the environment variable: `export GOOGLE_APPLICATION_CREDENTIALS=your-key-filename.json`
  You may need to set your `JAVA_HOME`.

  bash
      cd java-docs-samples/storage/xml-api/cmdline-sample
      # Compile and run
      mvn compile install
      mvn -q exec:java -Dexec.args="your-bucket-name"
```

* **Run**

  * Right-click on project
  * Run As > Java Application
  * If asked, type "StorageSample" and click OK


## Documentation for various Methods
 Method                                                                                                           |  Description
|------------------------------------------------------------------------------------------------------------------| -------------
| [**Verify_payment**](/Users/sumit.pawar/Desktop/Java_SDK/payu-java/src/varify_payment.md) ```[async]```          | Provides the details of a transaction
| [**TransactionDetails**](/Users/sumit.pawar/Desktop/Java_SDK/payu-java/src/Transaction_dtls.md) ```[async]```    | Provides the details of a transactions for a specfic timeperiod
| [**ValidateVPA**](/Users/sumit.pawar/Desktop/Java_SDK/payu-java/src/ValidateUPI.md) ```[async]```                | Used to validate VPA of a user.
| [**RefundTransaction**](/Users/sumit.pawar/Desktop/Java_SDK/payu-java/src/RefunsApi.md) ```[async]```            | Initiate refunds.
| [**DowntimeCheck**](/Users/sumit.pawar/Desktop/Java_SDK/payu-java/src/DowntimeCheck.md) ```[async]```            | Check downtime through bin number.
| [**InvoiceAPI**](/Users/sumit.pawar/Desktop/Java_SDK/payu-java/src/InvoiceAPIs.md) ```[async]```                 |  Used to create and expire invoice link.
| [**EMI**](/Users/sumit.pawar/Desktop/Java_SDK/payu-java/src/EMIApi.md) ```[async]```                             |  Used for checking the card eligibilty for EMI through the bin number and Check Emi amount according to interest.
| [**Check_isDomesticapi**](/Users/sumit.pawar/Desktop/Java_SDK/payu-java/src/check_isDomesticapi.md)```[async]``` | The BIN API or check_isDomestic API is used to detect whether a particular BIN number is international or domestic.
| [**CheckoutDetails**](/Users/sumit.pawar/Desktop/Java_SDK/payu-java/src/CheckoutDetails.md) ```[async]```        |  The get_checkout_details API is a generic API using which they can get information when you create the custom checkout-pages.
