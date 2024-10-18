
# PayU SDK for java Apis
This API gives you the status of the transaction. PayU recommends this API to reconcile with PayU’s database after you receive the response, where var1 is your transaction id.

## Features Supported
Following features are supported in the PayU JAVA web SDK:
- Create Payment Link.
- Verify transactions, check the transaction status, transaction details, or discount rate for a transaction
- Initiated refunds, cancel refund, check refund status.
- Retrieve settlement details which the bank has to settle you.
- Get information of the payment options, offers, recommendations, and downtime details.
- Check the customer’s eligibility for EMI and get the EMI amount according to interest
- Pay by link
  To get started with PayU, visit our [Developer Guide](https://devguide.payu.in/low-code-web-sdk/getting-started-low-code-web-sdk/register-for-a-test-merchant-account/)
# Table of Contents
1. [Getting Started](#getting-started)
2. [Installation](#installation)
3. [Documentation for various Methods](#documentation-for-various-methods)
## Getting Started
Please follow the [installation](#installation) instruction and execute the following JS code for creating the instance of PayU Object:
```java
PayuClient payuClient = PayuClient.init("KEY", "SALT", PayuClient.Environment.TEST);
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
| [**generatePaymentForm**](/docs/generatePaymentForm.md) | Generate html form for initating payment from frontend.
| [**verifyPayment**](https://github.com/payu-intrepos/web-sdk-java/blob/main/docs/verifyPayment.md) | Provides the details of a transaction
| [**getTransactionDetails**](https://github.com/payu-intrepos/web-sdk-java/blob/main/docs/getTransactionDetails.md)| Provides the details of a transactions for a specfic timeperiod
| [**validateVPA**](https://github.com/payu-intrepos/web-sdk-java/blob/main/docs/validateVPA.md)       | Used to validate VPA of a user.
| [**cancelRefundTransaction**](https://github.com/payu-intrepos/web-sdk-java/blob/main/docs/cancelRefundTransaction.md)   | Initiate refunds.
| [**getIssuingBankStatus**](https://github.com/payu-intrepos/web-sdk-java/blob/main/docs/getIssuingBankStatus.md)   | Check downtime through bin number.
| [**getNetbankingStatus**](https://github.com/payu-intrepos/web-sdk-java/blob/main/docs/getNetbankingStatus.md)   | Check downtime through bankCode ( Netbanking ).
| [**createInvoice**](https://github.com/payu-intrepos/web-sdk-java/blob/main/docs/createInvoice.md)        |  Used to create invoice link.
| [**expireInvoice**](https://github.com/payu-intrepos/web-sdk-java/blob/main/docs/expireInvoice.md)        |  Used to expire invoice link.
| [**eligibleBinsForEMI**](https://github.com/payu-intrepos/web-sdk-java/blob/main/docs/eligibleBinsForEMI.md)                    |  Used for checking the card eligibilty for CC EMI through the bin number.
| [**getEmiAmountAccordingToInterest**](https://github.com/payu-intrepos/web-sdk-java/blob/main/docs/getEmiAmountAccordingToInterest.md)                    |  Used for checking Emi amount according to interest.
| [**checkIsDomestic**](https://github.com/payu-intrepos/web-sdk-java/blob/main/docs/checkIsDomestic.md)| The BIN API or check_isDomestic API is used to detect whether a particular BIN number is international or domestic.
