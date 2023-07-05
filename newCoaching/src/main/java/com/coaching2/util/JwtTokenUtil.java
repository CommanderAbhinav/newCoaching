package com.coaching2.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.Date;

public class JwtTokenUtil {

	private static final Key SECRET_KEY = Keys.secretKeyFor(SignatureAlgorithm.HS256);

	public static String generateToken(String emailId, String userType) {
		Date now = new Date();
		Date expirationDate = new Date(now.getTime() + 3600000);

		String token = Jwts.builder().setSubject(emailId).claim("userType", userType).setIssuedAt(now)
				.setExpiration(expirationDate).signWith(SECRET_KEY).compact();

		return token;
	}

	public static Claims extractClaims(String token) {
		return Jwts.parserBuilder().setSigningKey(SECRET_KEY).build().parseClaimsJws(token).getBody();
	}
}