package com.app.InvoiceJava.Utils;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.context.annotation.Configuration;
import java.security.Key;
import java.util.Date;


@Configuration

public class JwtUtil {
    private final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    public String generateToken(String email){
        return Jwts.builder().setSubject(email).
                setIssuedAt(new Date()).setExpiration(new Date(System.currentTimeMillis()+86400000)).signWith(key).compact();
    }

}
