package com.payu;

import org.json.JSONObject;

public class PayuClient{

  public Hasher hasher;
  private final VerifyPayment verifyPaymentClient;
  private final ValidateVPA validateVPAClient;
  private final Refund refundClient;
  private final Payment paymentClient;
  private final EmiAPI emiAPIClient;
  private final DowntimeCheckAPI downtimeCheckAPIClient;
  private final CheckIsDomestic checkIsDomesticClient;
  private final Invoice invoiceClient;
  private final TransactionDetails transactionDetailsClient;
  private static volatile PayuClient instance = null;

  public enum Environment {
    TEST,
    LIVE
  }
  
  public PayuClient(String key, String salt, Environment env) {
    hasher = new Hasher(key, salt);
    verifyPaymentClient = new VerifyPayment(key, salt, env.toString());
    validateVPAClient = new ValidateVPA(key, salt, env.toString());
    refundClient = new Refund(key, salt, env.toString());
    paymentClient = new Payment(key, salt, env.toString());
    emiAPIClient = new EmiAPI(key,salt,env.toString());
    downtimeCheckAPIClient = new DowntimeCheckAPI(key,salt,env.toString());
    checkIsDomesticClient = new CheckIsDomestic(key,salt,env.toString());
    invoiceClient = new Invoice(key,salt,env.toString());
    transactionDetailsClient = new TransactionDetails(key,salt,env.toString());
  }

  public static PayuClient init(String key, String salt, Environment env) {
    if (instance == null) {
      synchronized (PayuClient.class) {
        if (instance == null) {
          instance = new PayuClient(key, salt, env);
        }
      }
    }
    return instance;
  }

  public String generatePaymentForm(JSONObject params){
    return paymentClient.form(params);
  }
  public String verifyPayment(String txnid){
    return verifyPaymentClient.getVerifyPaymentResponse(txnid);
  }
  public String cancelRefundTransaction(String payuid, String requestId, Number amount){
    return refundClient.getCancelRefundTransactionResponse(payuid, requestId, amount);
  }
  public String validateVPA(String vpa){
    return validateVPAClient.getValidateVPAResponse(vpa);
  }
  public String eligibleBinsForEMI(Integer bin){
    return emiAPIClient.getEligibleBinsForEMIResponse(bin);
  }

  public String getEmiAmountAccordingToInterest(Number amount){
    return emiAPIClient.getEmiAmountAccordingToInterestResponse(amount);
  }

  public String getNetbankingStatus(String bankCode){
    return downtimeCheckAPIClient.getNetbankingStatusResponse(bankCode);
  }

  public String getIssuingBankStatus(Integer bin){
    return downtimeCheckAPIClient.getIssuingBankStatusResponse(bin);
  }

  public String checkIsDomestic(Integer bin){
    return checkIsDomesticClient.getCheckIsDomesticResponse(bin);
  }

  public String createInvoice(JSONObject params){
    return invoiceClient.getCreateInvoiceResponse(params);
  }

  public String expireInvoice(String txnid){
    return invoiceClient.getExpireInvoiceResponse(txnid);
  }

  public String getTransactionDetails(String startDate, String endDate){
    return transactionDetailsClient.getTransactionDetailsResponse(startDate, endDate);
  }
}