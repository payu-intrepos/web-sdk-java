package com.payu;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for Hash class.
 */
class HashTest {
  PayuClient payuClient = PayuClient.init("QyT13U", "UnJ0FGO0kt3dUgnHo9Xgwi0lpipBV0hB", PayuClient.Environment.TEST);
  @Test
  void testGenerateHash() {
    String hashStr =  payuClient.hasher.calculateDigest("a");
    assertEquals(hashStr, "1f40fc92da241694750979ee6cf582f2d5d7d28e18335de05abc54d0560e0f5302860c652bf08d560252aa5e74210546f369fbbbce8c12cfc7957b2652fe9a75");
  }

}
