package com.payu;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for Hash class.
 */
class HashTest {
  private Hasher hash = new Hasher("QyT13U", "UnJ0FGO0kt3dUgnHo9Xgwi0lpipBV0hB");
  private HasherParams.Builder builder;


  @BeforeEach
  void init() {
    builder = new HasherParams.Builder()
      .setTxnId("qazwsxedc3435366566")
      .setAmount("10.00")
      .setProductInfo("iphone")
      .setFirstName("sumit")
      .setEmail("test@payu.in");
  }

  @Test
  void testGenerateHash() {
    String hashStr =  hash.generateHash(builder.build());
    assertEquals(hashStr, "3cf6a0ac88bc0e3ae6714888a6a055506601673bd158bcd8d2f983ea3e8146f3e95212d4bad5a870ab46cf0c6949f2cc9887a27e946138dc5b59d844a9b25e43");
  }

  @Test
  void testGenerateHashWithUdf() {
    builder.setUdf1("aaa");
    String hashStr =  hash.generateHash(builder.build());
    assertEquals(hashStr, "39cab2e2e7676e3bb559c39554d160a691aed12a10d474e0009c09ba05db2a7b48af9535f6cc1d1f4a50c6199ae36dad31e9afdbbd61c5acc7cbbb2958963178");
  }


  @Test
  void testVerifyHash() {
    boolean isVerifiedFalse =  hash.validateHash(
      "39cab2e2e7676e3bb559c39554d160a691aed12a10d474e0009c09ba05db2a7b48af9535f6cc1d1f4a50c6199ae36dad31e9afdbbd61c5acc7cbbb2958963178",
      "success",
      builder.build()
    );
    assertEquals(isVerifiedFalse, false);
    boolean isVerifiedTrue =  hash.validateHash(
      "39cab2e2e7676e3bb559c39554d160a691aed12a10d474e0009c09ba05db2a7b48af9535f6cc1d1f4a50c6199ae36dad31e9afdbbd61c5acc7cbbb2958963178",
      "success",
      builder.build()
    );
    assertEquals(isVerifiedTrue, false);
  }

  @Test

  void testHashParamsValidation() {
      Exception exception = assertThrows(PayuException.class, () -> {
          builder.setAmount("100.000");
          builder.build();
      });
      assertTrue(exception.getMessage()
          .equals("amount should contain digits with upto 2 decimal places")
      );

      exception = assertThrows(PayuException.class, () -> {
          builder.setEmail("test@invalid");
          builder.build();
      });
      assertTrue(exception.getMessage()
          .equals("invalid email id")
      );
  }
}
