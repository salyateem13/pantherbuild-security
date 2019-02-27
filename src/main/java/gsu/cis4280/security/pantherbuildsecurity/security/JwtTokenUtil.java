package gsu.cis4280.security.pantherbuildsecurity.security;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

@Component
public class JwtTokenUtil implements Serializable {
	
	static final String CLAM_KEY_USERNAME = "sub";
	static final String CLAM_KEY_AUDIENCE =" aud";
	static final String CLAM_KEY_CREATED = "created";
	
	
	@Value ("${jwt.secret}")
	private String secret;
	
	@Value ("$jwt.expiration")
	private Long expiration;
	
	
	public String getUserNameFromToken(String token) {
		String username = null;
		try {
			final Claims claims = getClaimsFromToken(token);
			username = claims.getSubject();
			
			
		}catch (Exception e) {
			username= null;
		}
		
		return null;
	}
	
	private Claims getClaimsFromToken(String token) {
		Claims claims = null;
		try {
			claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
		}catch(Exception e) {
			claims = null;
		}
		
		return claims;
	}

}
