package org.example;

import static org.junit.jupiter.api.Assertions.*;

class JwtPrimaryKeyGenTest {


    @org.junit.jupiter.api.Test

    // test for invalid token
    void inValidTokenTest() {
        // test for valid toke and not valid token

        String token = "wrong token";

        assertFalse( JwtPrimaryKeyGen.verifyToken(token));

    }
    // test for a valid token

    @org.junit.jupiter.api.Test
    void validTokenTest() {
        // test for valid toke and not valid token

        String genToken = JwtPrimaryKeyGen.jwtKeyGen("Samuel");
        assertTrue( JwtPrimaryKeyGen.verifyToken(genToken));

    }
}