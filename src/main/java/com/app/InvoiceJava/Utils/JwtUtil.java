package com.app.InvoiceJava.Utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.context.annotation.Configuration;
import java.security.Key;
import java.util.Date;
import io.jsonwebtoken.*;
import org.springframework.beans.factory.annotation.Value;

@Configuration
public class JwtUtil {
    private final Key key;

    public JwtUtil(@Value("${jwt.secret}") String secret) {
        this.key = Keys.hmacShaKeyFor(secret.getBytes());
    }

    public String generateToken(String email){
        return Jwts.builder().setSubject(email).
                setIssuedAt(new Date()).setExpiration(new Date(System.currentTimeMillis()+86400000)).signWith(key).compact();
    }

    public String extractUsername(String token){
        return getClaims(token).getSubject();
    }

    public boolean validateToken(String token,String email){
        String username = extractUsername(token);
        return username.equals(email)&&!isTokenExpired(token);
    }

    private boolean isTokenExpired(String token){
        Date expiration = Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token).getBody().getExpiration();
        return expiration.before(new Date());
    }

    private Claims getClaims(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody();
    }




}

