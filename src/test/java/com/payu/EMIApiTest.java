package com.payu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EMIApiTest {
    PayuClient payuClient = PayuClient.init("QyT13U", "UnJ0FGO0kt3dUgnHo9Xgwi0lpipBV0hB", PayuClient.Environment.TEST);
    @Test
    void testgenrateEligibleBinsForEMI() {
        String response1 = payuClient.eligibleBinsForEMI(512345);
        assertEquals(response1, "{\"status\":1,\"msg\":\"Details fetched successfully\",\"details\":{\"isEligible\":1,\"bank\":\"AXIS\",\"minAmount\":2500}}");
    }

    @Test
    void testgenrateEmiAmountAccordingToInterest() {
        String response2 = payuClient.getEmiAmountAccordingToInterest(100);
        assertEquals(response2, "{\"21\":{\"EMIIC3\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":33.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":14.99,\"bankRate\":null,\"bankCharge\":0,\"amount\":33.33,\"card_type\":\"credit card\",\"emi_value\":34.17,\"emi_interest_paid\":2.51,\"tenure\":\"03 months\"},\"EMIIC6\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":16.67,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":14.99,\"bankRate\":null,\"bankCharge\":0,\"amount\":16.67,\"card_type\":\"credit card\",\"emi_value\":17.4,\"emi_interest_paid\":4.42,\"tenure\":\"06 months\"},\"EMIIC9\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":11.11,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":14.99,\"bankRate\":null,\"bankCharge\":0,\"amount\":11.11,\"card_type\":\"credit card\",\"emi_value\":11.82,\"emi_interest_paid\":6.35,\"tenure\":\"09 months\"},\"EMIIC12\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":8.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":14.99,\"bankRate\":null,\"bankCharge\":0,\"amount\":8.33,\"card_type\":\"credit card\",\"emi_value\":9.03,\"emi_interest_paid\":8.3,\"tenure\":\"12 months\"}},\"SCB\":{\"EMISCB3\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":33.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":11.88,\"bankRate\":null,\"bankCharge\":0,\"amount\":33.33,\"card_type\":\"credit card\",\"emi_value\":34,\"emi_interest_paid\":1.99,\"tenure\":\"03 months\"},\"EMISCB6\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":16.67,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":14,\"bankRate\":null,\"bankCharge\":0,\"amount\":16.67,\"card_type\":\"credit card\",\"emi_value\":17.35,\"emi_interest_paid\":4.12,\"tenure\":\"06 months\"},\"EMISCB9\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":11.11,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":15,\"bankRate\":null,\"bankCharge\":0,\"amount\":11.11,\"card_type\":\"credit card\",\"emi_value\":11.82,\"emi_interest_paid\":6.35,\"tenure\":\"09 months\"},\"EMISCB12\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":8.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":15,\"bankRate\":null,\"bankCharge\":0,\"amount\":8.33,\"card_type\":\"credit card\",\"emi_value\":9.03,\"emi_interest_paid\":8.31,\"tenure\":\"12 months\"},\"EMISCB18\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":5.56,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":15,\"bankRate\":null,\"bankCharge\":0,\"amount\":5.56,\"card_type\":\"credit card\",\"emi_value\":6.24,\"emi_interest_paid\":12.29,\"tenure\":\"18 months\"},\"EMISCB24\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":4.17,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":15,\"bankRate\":null,\"bankCharge\":0,\"amount\":4.17,\"card_type\":\"credit card\",\"emi_value\":4.85,\"emi_interest_paid\":16.37,\"tenure\":\"24 months\"}},\"FEDED\":{\"FEDED03\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":33.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":15,\"bankRate\":null,\"bankCharge\":0,\"amount\":33.33,\"card_type\":\"debit card\",\"emi_value\":34.17,\"emi_interest_paid\":2.51,\"tenure\":\"03 months\"},\"FEDED06\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":16.67,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":15,\"bankRate\":null,\"bankCharge\":0,\"amount\":16.67,\"card_type\":\"debit card\",\"emi_value\":17.4,\"emi_interest_paid\":4.42,\"tenure\":\"06 months\"},\"FEDED09\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":11.11,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":15,\"bankRate\":null,\"bankCharge\":0,\"amount\":11.11,\"card_type\":\"debit card\",\"emi_value\":11.82,\"emi_interest_paid\":6.35,\"tenure\":\"09 months\"},\"FEDED12\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":8.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":15,\"bankRate\":null,\"bankCharge\":0,\"amount\":8.33,\"card_type\":\"debit card\",\"emi_value\":9.03,\"emi_interest_paid\":8.31,\"tenure\":\"12 months\"}},\"ICICI_CL\":{\"ICICIC03\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":33.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":16,\"bankRate\":null,\"bankCharge\":0,\"amount\":33.33,\"card_type\":\"cardless\",\"emi_value\":34.23,\"emi_interest_paid\":2.68,\"tenure\":\"03 months\"},\"ICICIC06\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":16.67,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":16,\"bankRate\":null,\"bankCharge\":0,\"amount\":16.67,\"card_type\":\"cardless\",\"emi_value\":17.45,\"emi_interest_paid\":4.72,\"tenure\":\"06 months\"},\"ICICIC09\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":11.11,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":16,\"bankRate\":null,\"bankCharge\":0,\"amount\":11.11,\"card_type\":\"cardless\",\"emi_value\":11.86,\"emi_interest_paid\":6.78,\"tenure\":\"09 months\"},\"ICICIC12\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":8.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":16,\"bankRate\":null,\"bankCharge\":0,\"amount\":8.33,\"card_type\":\"cardless\",\"emi_value\":9.07,\"emi_interest_paid\":8.88,\"tenure\":\"12 months\"}},\"HSBC\":{\"EMIHS03\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":33.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":12.5,\"bankRate\":null,\"bankCharge\":0,\"amount\":33.33,\"card_type\":\"credit card\",\"emi_value\":34.03,\"emi_interest_paid\":2.09,\"tenure\":\"03 months\"},\"EMIHS06\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":16.67,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":12.5,\"bankRate\":null,\"bankCharge\":0,\"amount\":16.67,\"card_type\":\"credit card\",\"emi_value\":17.28,\"emi_interest_paid\":3.68,\"tenure\":\"06 months\"},\"EMIHS09\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":11.11,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":13.5,\"bankRate\":null,\"bankCharge\":0,\"amount\":11.11,\"card_type\":\"credit card\",\"emi_value\":11.75,\"emi_interest_paid\":5.71,\"tenure\":\"09 months\"},\"EMIHS12\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":8.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":13.5,\"bankRate\":null,\"bankCharge\":0,\"amount\":8.33,\"card_type\":\"credit card\",\"emi_value\":8.96,\"emi_interest_paid\":7.46,\"tenure\":\"12 months\"},\"EMIHS18\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":5.56,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":13.5,\"bankRate\":null,\"bankCharge\":0,\"amount\":5.56,\"card_type\":\"credit card\",\"emi_value\":6.17,\"emi_interest_paid\":11.03,\"tenure\":\"18 months\"},\"EMIHS24\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":4.17,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":0,\"bankRate\":null,\"bankCharge\":0,\"amount\":4.17,\"card_type\":\"credit card\",\"tenure\":\"24 months\"}},\"ZESTMON\":{\"ZESTMON\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":100,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":0,\"bankRate\":null,\"bankCharge\":0,\"amount\":100,\"card_type\":\"cardless\",\"tenure\":\"00 months\"},\"ZEST03\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":33.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":0,\"bankRate\":null,\"bankCharge\":0,\"amount\":33.33,\"card_type\":\"cardless\",\"tenure\":\"03 months\"},\"ZEST06\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":16.67,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":0,\"bankRate\":null,\"bankCharge\":0,\"amount\":16.67,\"card_type\":\"cardless\",\"tenure\":\"06 months\"},\"ZEST09\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":11.11,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":0,\"bankRate\":null,\"bankCharge\":0,\"amount\":11.11,\"card_type\":\"cardless\",\"tenure\":\"09 months\"},\"ZEST12\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":8.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":0,\"bankRate\":null,\"bankCharge\":0,\"amount\":8.33,\"card_type\":\"cardless\",\"tenure\":\"12 months\"}},\"54\":{\"EMIAMEX1\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":8.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":0,\"bankRate\":null,\"bankCharge\":0,\"amount\":8.33,\"card_type\":\"credit card\",\"tenure\":\"12 months\"},\"EMIAMEX3\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":33.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":14,\"bankRate\":null,\"bankCharge\":0,\"amount\":33.33,\"card_type\":\"credit card\",\"emi_value\":34.11,\"emi_interest_paid\":2.34,\"tenure\":\"03 months\"},\"EMIAMEX6\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":16.67,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":14,\"bankRate\":null,\"bankCharge\":0,\"amount\":16.67,\"card_type\":\"credit card\",\"emi_value\":17.35,\"emi_interest_paid\":4.12,\"tenure\":\"06 months\"},\"EMIAMEX9\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":11.11,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":14,\"bankRate\":null,\"bankCharge\":0,\"amount\":11.11,\"card_type\":\"credit card\",\"emi_value\":11.77,\"emi_interest_paid\":5.92,\"tenure\":\"09 months\"}},\"HDFC_CL\":{\"HDFCCL03\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":33.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":16,\"bankRate\":null,\"bankCharge\":0,\"amount\":33.33,\"card_type\":\"cardless\",\"emi_value\":34.23,\"emi_interest_paid\":2.68,\"tenure\":\"03 months\"},\"HDFCCL06\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":16.67,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":16,\"bankRate\":null,\"bankCharge\":0,\"amount\":16.67,\"card_type\":\"cardless\",\"emi_value\":17.45,\"emi_interest_paid\":4.72,\"tenure\":\"06 months\"},\"HDFCCL09\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":11.11,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":16,\"bankRate\":null,\"bankCharge\":0,\"amount\":11.11,\"card_type\":\"cardless\",\"emi_value\":11.86,\"emi_interest_paid\":6.78,\"tenure\":\"09 months\"},\"HDFCCL12\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":8.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":16,\"bankRate\":null,\"bankCharge\":0,\"amount\":8.33,\"card_type\":\"cardless\",\"emi_value\":9.07,\"emi_interest_paid\":8.88,\"tenure\":\"12 months\"},\"HDFCCL18\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":5.56,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":16,\"bankRate\":null,\"bankCharge\":0,\"amount\":5.56,\"card_type\":\"cardless\",\"emi_value\":6.29,\"emi_interest_paid\":13.14,\"tenure\":\"18 months\"}},\"BAJFIN\":{\"BAJFIN02\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":50,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":0,\"bankRate\":null,\"bankCharge\":0,\"amount\":50,\"card_type\":\"other\",\"tenure\":\"02 months\"},\"BAJFIN03\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":33.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":0,\"bankRate\":null,\"bankCharge\":0,\"amount\":33.33,\"card_type\":\"other\",\"tenure\":\"03 months\"},\"BAJFIN06\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":16.67,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":0,\"bankRate\":null,\"bankCharge\":0,\"amount\":16.67,\"card_type\":\"other\",\"tenure\":\"06 months\"},\"BAJFIN09\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":11.11,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":0,\"bankRate\":null,\"bankCharge\":0,\"amount\":11.11,\"card_type\":\"other\",\"tenure\":\"09 months\"},\"BAJFIN12\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":8.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":0,\"bankRate\":null,\"bankCharge\":0,\"amount\":8.33,\"card_type\":\"other\",\"tenure\":\"12 months\"}},\"15\":{\"EMI\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":33.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":14,\"bankRate\":null,\"bankCharge\":0,\"amount\":33.33,\"card_type\":\"credit card\",\"emi_value\":34.11,\"emi_interest_paid\":2.34,\"tenure\":\"03 months\"},\"EMI6\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":16.67,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":16,\"bankRate\":null,\"bankCharge\":0,\"amount\":16.67,\"card_type\":\"credit card\",\"emi_value\":17.45,\"emi_interest_paid\":4.72,\"tenure\":\"06 months\"},\"EMI9\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":11.11,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":16,\"bankRate\":null,\"bankCharge\":0,\"amount\":11.11,\"card_type\":\"credit card\",\"emi_value\":11.86,\"emi_interest_paid\":6.78,\"tenure\":\"09 months\"},\"EMI12\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":8.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":16,\"bankRate\":null,\"bankCharge\":0,\"amount\":8.33,\"card_type\":\"credit card\",\"emi_value\":9.07,\"emi_interest_paid\":8.88,\"tenure\":\"12 months\"}},\"ONEC\":{\"ONEC03\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":33.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":16,\"bankRate\":null,\"bankCharge\":0,\"amount\":33.33,\"card_type\":\"credit card\",\"emi_value\":34.23,\"emi_interest_paid\":2.68,\"tenure\":\"03 months\"},\"ONEC06\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":16.67,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":16,\"bankRate\":null,\"bankCharge\":0,\"amount\":16.67,\"card_type\":\"credit card\",\"emi_value\":17.45,\"emi_interest_paid\":4.72,\"tenure\":\"06 months\"},\"ONEC09\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":11.11,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":16,\"bankRate\":null,\"bankCharge\":0,\"amount\":11.11,\"card_type\":\"credit card\",\"emi_value\":11.86,\"emi_interest_paid\":6.78,\"tenure\":\"09 months\"},\"ONEC12\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":8.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":16,\"bankRate\":null,\"bankCharge\":0,\"amount\":8.33,\"card_type\":\"credit card\",\"emi_value\":9.07,\"emi_interest_paid\":8.88,\"tenure\":\"12 months\"},\"ONEC18\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":5.56,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":16,\"bankRate\":null,\"bankCharge\":0,\"amount\":5.56,\"card_type\":\"credit card\",\"emi_value\":6.29,\"emi_interest_paid\":13.14,\"tenure\":\"18 months\"},\"ONEC24\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":4.17,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":16,\"bankRate\":null,\"bankCharge\":0,\"amount\":4.17,\"card_type\":\"credit card\",\"emi_value\":4.9,\"emi_interest_paid\":17.51,\"tenure\":\"24 months\"}},\"INDUS\":{\"EMIIND3\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":33.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":14,\"bankRate\":null,\"bankCharge\":0,\"amount\":33.33,\"card_type\":\"credit card\",\"emi_value\":34.11,\"emi_interest_paid\":2.34,\"tenure\":\"03 months\"},\"EMIIND6\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":16.67,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":14,\"bankRate\":null,\"bankCharge\":0,\"amount\":16.67,\"card_type\":\"credit card\",\"emi_value\":17.35,\"emi_interest_paid\":4.12,\"tenure\":\"06 months\"},\"EMIIND9\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":11.11,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":15,\"bankRate\":null,\"bankCharge\":0,\"amount\":11.11,\"card_type\":\"credit card\",\"emi_value\":11.82,\"emi_interest_paid\":6.35,\"tenure\":\"09 months\"},\"EMIIND12\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":8.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":15,\"bankRate\":null,\"bankCharge\":0,\"amount\":8.33,\"card_type\":\"credit card\",\"emi_value\":9.03,\"emi_interest_paid\":8.31,\"tenure\":\"12 months\"},\"EMIIND18\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":5.56,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":15,\"bankRate\":null,\"bankCharge\":0,\"amount\":5.56,\"card_type\":\"credit card\",\"emi_value\":6.24,\"emi_interest_paid\":12.29,\"tenure\":\"18 months\"},\"EMIIND24\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":4.17,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":15,\"bankRate\":null,\"bankCharge\":0,\"amount\":4.17,\"card_type\":\"credit card\",\"emi_value\":4.85,\"emi_interest_paid\":16.37,\"tenure\":\"24 months\"},\"EMIIND36\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":2.78,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":15,\"bankRate\":null,\"bankCharge\":0,\"amount\":2.78,\"card_type\":\"credit card\",\"emi_value\":3.47,\"emi_interest_paid\":24.8,\"tenure\":\"36 months\"}},\"SBID\":{\"SBID03\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":33.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":17.6,\"bankRate\":null,\"bankCharge\":0,\"amount\":33.33,\"card_type\":\"debit card\",\"emi_value\":34.32,\"emi_interest_paid\":2.95,\"tenure\":\"03 months\"},\"SBID06\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":16.67,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":17.6,\"bankRate\":null,\"bankCharge\":0,\"amount\":16.67,\"card_type\":\"debit card\",\"emi_value\":17.53,\"emi_interest_paid\":5.2,\"tenure\":\"06 months\"},\"SBID09\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":11.11,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":17.6,\"bankRate\":null,\"bankCharge\":0,\"amount\":11.11,\"card_type\":\"debit card\",\"emi_value\":11.94,\"emi_interest_paid\":7.48,\"tenure\":\"09 months\"},\"SBID12\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":8.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":17.6,\"bankRate\":null,\"bankCharge\":0,\"amount\":8.33,\"card_type\":\"debit card\",\"emi_value\":9.15,\"emi_interest_paid\":9.79,\"tenure\":\"12 months\"},\"SBID18\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":5.56,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":17.6,\"bankRate\":null,\"bankCharge\":0,\"amount\":5.56,\"card_type\":\"debit card\",\"emi_value\":6.36,\"emi_interest_paid\":14.51,\"tenure\":\"18 months\"},\"SBID24\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":4.17,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":17.6,\"bankRate\":null,\"bankCharge\":0,\"amount\":4.17,\"card_type\":\"debit card\",\"emi_value\":4.97,\"emi_interest_paid\":19.35,\"tenure\":\"24 months\"},\"SBID30\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":3.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":17.6,\"bankRate\":null,\"bankCharge\":0,\"amount\":3.33,\"card_type\":\"debit card\",\"emi_value\":4.14,\"emi_interest_paid\":24.33,\"tenure\":\"30 months\"},\"SBID36\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":2.78,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":17.6,\"bankRate\":null,\"bankCharge\":0,\"amount\":2.78,\"card_type\":\"debit card\",\"emi_value\":3.6,\"emi_interest_paid\":29.43,\"tenure\":\"36 months\"}},\"BOB\":{\"BOBCC03\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":33.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":13,\"bankRate\":null,\"bankCharge\":0,\"amount\":33.33,\"card_type\":\"credit card\",\"emi_value\":34.06,\"emi_interest_paid\":2.17,\"tenure\":\"03 months\"},\"BOBCC06\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":16.67,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":14,\"bankRate\":null,\"bankCharge\":0,\"amount\":16.67,\"card_type\":\"credit card\",\"emi_value\":17.35,\"emi_interest_paid\":4.12,\"tenure\":\"06 months\"},\"BOBCC09\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":11.11,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":14,\"bankRate\":null,\"bankCharge\":0,\"amount\":11.11,\"card_type\":\"credit card\",\"emi_value\":11.77,\"emi_interest_paid\":5.92,\"tenure\":\"09 months\"},\"BOBCC12\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":8.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":15,\"bankRate\":null,\"bankCharge\":0,\"amount\":8.33,\"card_type\":\"credit card\",\"emi_value\":9.03,\"emi_interest_paid\":8.31,\"tenure\":\"12 months\"},\"BOBCC18\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":5.56,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":15,\"bankRate\":null,\"bankCharge\":0,\"amount\":5.56,\"card_type\":\"credit card\",\"emi_value\":6.24,\"emi_interest_paid\":12.29,\"tenure\":\"18 months\"},\"BOBCC24\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":4.17,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":16,\"bankRate\":null,\"bankCharge\":0,\"amount\":4.17,\"card_type\":\"credit card\",\"emi_value\":4.9,\"emi_interest_paid\":17.51,\"tenure\":\"24 months\"}},\"ICICID\":{\"ICICID03\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":33.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":16,\"bankRate\":null,\"bankCharge\":0,\"amount\":33.33,\"card_type\":\"debit card\",\"emi_value\":34.23,\"emi_interest_paid\":2.68,\"tenure\":\"03 months\"},\"ICICID06\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":16.67,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":16,\"bankRate\":null,\"bankCharge\":0,\"amount\":16.67,\"card_type\":\"debit card\",\"emi_value\":17.45,\"emi_interest_paid\":4.72,\"tenure\":\"06 months\"},\"ICICID09\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":11.11,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":16,\"bankRate\":null,\"bankCharge\":0,\"amount\":11.11,\"card_type\":\"debit card\",\"emi_value\":11.86,\"emi_interest_paid\":6.78,\"tenure\":\"09 months\"},\"ICICID12\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":8.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":16,\"bankRate\":null,\"bankCharge\":0,\"amount\":8.33,\"card_type\":\"debit card\",\"emi_value\":9.07,\"emi_interest_paid\":8.88,\"tenure\":\"12 months\"}},\"KOTAKD\":{\"KOTAKD02\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":50,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":20,\"bankRate\":null,\"bankCharge\":0,\"amount\":50,\"card_type\":\"debit card\",\"emi_value\":51.25,\"emi_interest_paid\":2.51,\"tenure\":\"02 months\"},\"KOTAKD03\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":33.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":17.1,\"bankRate\":null,\"bankCharge\":0,\"amount\":33.33,\"card_type\":\"debit card\",\"emi_value\":34.29,\"emi_interest_paid\":2.86,\"tenure\":\"03 months\"},\"KOTAKD06\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":16.67,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":17,\"bankRate\":null,\"bankCharge\":0,\"amount\":16.67,\"card_type\":\"debit card\",\"emi_value\":17.5,\"emi_interest_paid\":5.02,\"tenure\":\"06 months\"},\"KOTAKD09\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":11.11,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":17,\"bankRate\":null,\"bankCharge\":0,\"amount\":11.11,\"card_type\":\"debit card\",\"emi_value\":11.91,\"emi_interest_paid\":7.22,\"tenure\":\"09 months\"},\"KOTAKD12\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":8.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":17,\"bankRate\":null,\"bankCharge\":0,\"amount\":8.33,\"card_type\":\"debit card\",\"emi_value\":9.12,\"emi_interest_paid\":9.45,\"tenure\":\"12 months\"}},\"HDFCD\":{\"HDFCD06\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":16.67,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":16,\"bankRate\":null,\"bankCharge\":0,\"amount\":16.67,\"card_type\":\"debit card\",\"emi_value\":17.45,\"emi_interest_paid\":4.72,\"tenure\":\"06 months\"},\"HDFCD09\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":11.11,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":16,\"bankRate\":null,\"bankCharge\":0,\"amount\":11.11,\"card_type\":\"debit card\",\"emi_value\":11.86,\"emi_interest_paid\":6.78,\"tenure\":\"09 months\"},\"HDFCD12\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":8.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":16,\"bankRate\":null,\"bankCharge\":0,\"amount\":8.33,\"card_type\":\"debit card\",\"emi_value\":9.07,\"emi_interest_paid\":8.88,\"tenure\":\"12 months\"},\"HDFCD18\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":5.56,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":16,\"bankRate\":null,\"bankCharge\":0,\"amount\":5.56,\"card_type\":\"debit card\",\"emi_value\":6.29,\"emi_interest_paid\":13.14,\"tenure\":\"18 months\"}},\"KOTAK\":{\"EMIK3\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":33.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":15,\"bankRate\":null,\"bankCharge\":0,\"amount\":33.33,\"card_type\":\"credit card\",\"emi_value\":34.17,\"emi_interest_paid\":2.51,\"tenure\":\"03 months\"},\"EMIK6\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":16.67,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":15,\"bankRate\":null,\"bankCharge\":0,\"amount\":16.67,\"card_type\":\"credit card\",\"emi_value\":17.4,\"emi_interest_paid\":4.42,\"tenure\":\"06 months\"},\"EMIK9\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":11.11,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":15,\"bankRate\":null,\"bankCharge\":0,\"amount\":11.11,\"card_type\":\"credit card\",\"emi_value\":11.82,\"emi_interest_paid\":6.35,\"tenure\":\"09 months\"},\"EMIK12\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":100,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":15,\"bankRate\":null,\"bankCharge\":0,\"amount\":100,\"card_type\":\"credit card\",\"emi_value\":100,\"emi_interest_paid\":0,\"tenure\":\"00 months\"},\"EMIK18\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":5.56,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":16,\"bankRate\":null,\"bankCharge\":0,\"amount\":5.56,\"card_type\":\"credit card\",\"emi_value\":6.29,\"emi_interest_paid\":13.14,\"tenure\":\"18 months\"},\"EMIK24\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":4.17,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":16,\"bankRate\":null,\"bankCharge\":0,\"amount\":4.17,\"card_type\":\"credit card\",\"emi_value\":4.9,\"emi_interest_paid\":17.51,\"tenure\":\"24 months\"}},\"7\":{\"EMIA3\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":33.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":13.3,\"bankRate\":null,\"bankCharge\":0,\"amount\":33.33,\"card_type\":\"credit card\",\"emi_value\":34.07,\"emi_interest_paid\":2.22,\"tenure\":\"03 months\"},\"EMIA6\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":16.67,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":14,\"bankRate\":null,\"bankCharge\":0,\"amount\":16.67,\"card_type\":\"credit card\",\"emi_value\":17.35,\"emi_interest_paid\":4.12,\"tenure\":\"06 months\"},\"EMIA9\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":11.11,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":15,\"bankRate\":null,\"bankCharge\":0,\"amount\":11.11,\"card_type\":\"credit card\",\"emi_value\":11.82,\"emi_interest_paid\":6.35,\"tenure\":\"09 months\"},\"EMIA12\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":33.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":15,\"bankRate\":null,\"bankCharge\":0,\"amount\":33.33,\"card_type\":\"credit card\",\"emi_value\":34.17,\"emi_interest_paid\":2.51,\"tenure\":\"03 months\"},\"EMIA18\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":5.56,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":16,\"bankRate\":null,\"bankCharge\":0,\"amount\":5.56,\"card_type\":\"credit card\",\"emi_value\":6.29,\"emi_interest_paid\":13.14,\"tenure\":\"18 months\"},\"EMIA24\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":4.17,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":16,\"bankRate\":null,\"bankCharge\":0,\"amount\":4.17,\"card_type\":\"credit card\",\"emi_value\":4.9,\"emi_interest_paid\":17.51,\"tenure\":\"24 months\"}},\"AXISD\":{\"AXISD03\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":33.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":14,\"bankRate\":null,\"bankCharge\":0,\"amount\":33.33,\"card_type\":\"debit card\",\"emi_value\":34.11,\"emi_interest_paid\":2.34,\"tenure\":\"03 months\"},\"AXISD06\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":16.67,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":14,\"bankRate\":null,\"bankCharge\":0,\"amount\":16.67,\"card_type\":\"debit card\",\"emi_value\":17.35,\"emi_interest_paid\":4.12,\"tenure\":\"06 months\"},\"AXISD09\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":11.11,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":16,\"bankRate\":null,\"bankCharge\":0,\"amount\":11.11,\"card_type\":\"debit card\",\"emi_value\":11.86,\"emi_interest_paid\":6.78,\"tenure\":\"09 months\"},\"AXISD12\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":8.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":16,\"bankRate\":null,\"bankCharge\":0,\"amount\":8.33,\"card_type\":\"debit card\",\"emi_value\":9.07,\"emi_interest_paid\":8.88,\"tenure\":\"12 months\"},\"AXISD18\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":5.56,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":16,\"bankRate\":null,\"bankCharge\":0,\"amount\":5.56,\"card_type\":\"debit card\",\"emi_value\":6.29,\"emi_interest_paid\":13.14,\"tenure\":\"18 months\"},\"AXISD24\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":4.17,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":16,\"bankRate\":null,\"bankCharge\":0,\"amount\":4.17,\"card_type\":\"debit card\",\"emi_value\":4.9,\"emi_interest_paid\":17.51,\"tenure\":\"24 months\"}},\"AXIS\":{\"EMIAP3\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":33.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":0,\"bankRate\":null,\"bankCharge\":0,\"amount\":33.33,\"card_type\":\"credit card\",\"tenure\":\"03 months\"}},\"SBI\":{\"SBI03\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":33.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":14,\"bankRate\":null,\"bankCharge\":0,\"amount\":33.33,\"card_type\":\"credit card\",\"emi_value\":34.11,\"emi_interest_paid\":2.34,\"tenure\":\"03 months\"},\"SBI06\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":16.67,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":14,\"bankRate\":null,\"bankCharge\":0,\"amount\":16.67,\"card_type\":\"credit card\",\"emi_value\":17.35,\"emi_interest_paid\":4.12,\"tenure\":\"06 months\"}},\"20\":{\"EMI03\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":33.33,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":13,\"bankRate\":null,\"bankCharge\":0,\"amount\":33.33,\"card_type\":\"credit card\",\"emi_value\":34.06,\"emi_interest_paid\":2.17,\"tenure\":\"03 months\"},\"EMI06\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":16.67,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":13,\"bankRate\":null,\"bankCharge\":0,\"amount\":16.67,\"card_type\":\"credit card\",\"emi_value\":17.3,\"emi_interest_paid\":3.83,\"tenure\":\"06 months\"},\"EMI09\":{\"transactionAmount\":100,\"paybackAmount\":0,\"loanAmount\":100,\"emiAmount\":11.11,\"additionalCost\":\"0.00\",\"emiMdrNote\":null,\"emiBankInterest\":15,\"bankRate\":null,\"bankCharge\":0,\"amount\":11.11,\"card_type\":\"credit card\",\"emi_value\":11.82,\"emi_interest_paid\":6.35,\"tenure\":\"09 months\"}}}");  }
}
