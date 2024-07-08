package org.example;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.security.SecureRandom;
import java.util.Base64;
import java.util.Date;

public class JwtPrimaryKeyGen {

    private static String key = "WDCR5cbTEsykdHqWv16cVguIvMRDdQPvEphtofRdslw=";

    public static String jwtKeyGen(String username){
        long currentTimeMillis = System.currentTimeMillis();
        Date expirationTime = new Date(currentTimeMillis + 864000000L); // ten days in milliseconds

        String jwtToken = Jwts.builder()
                .setSubject(username)
                .setExpiration(expirationTime)
                .signWith(SignatureAlgorithm.HS256, key.getBytes())
                .compact();


        return jwtToken;
    }

    // to verify the key:

    public static boolean verifyToken(String token) {
        try {
            Jws<Claims> claimsJws = Jwts.parser()
                    .setSigningKey(key.getBytes())
                    .build().parseClaimsJws(token);

            // You can also retrieve claims if needed
            Claims claims = claimsJws.getBody();
            String username = claims.getSubject();
            //Date expiration = claims.getExpiration();

            System.out.println(username);
            // Further verification can be done here if needed

            return true; // Token is valid
        } catch (Exception e) {
            return false; // Token is invalid
        }
    }

}
