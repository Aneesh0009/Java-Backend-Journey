package com.aneesh.SpringSecurity.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.Key;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@Service
public class JWTService {

    //private String secretKey = "a-string-secret-at-least-256-bits-long";

    private String secretKey = "";

    public JWTService () {
        try{
            KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacSHA256");
            SecretKey sKey = keyGenerator.generateKey();
            secretKey = Base64.getEncoder().encodeToString(sKey.getEncoded());
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public String getToken(String username) {

        Map<String,Object> map = new HashMap<>();

        return Jwts.builder()
                .claims()
                .add(map)
                .subject(username)
                .issuedAt(new Date(System.currentTimeMillis()))
                .expiration(new Date(System.currentTimeMillis() + 60*60*60*60))
                .and()
                .signWith(SignatureAlgorithm.HS256, secretKey)
                .compact();
    }

    private Key getKey() {
        byte[] keyBytes = Decoders.BASE64.decode(secretKey);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}
