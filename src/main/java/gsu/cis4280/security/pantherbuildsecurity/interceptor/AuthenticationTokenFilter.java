package gsu.cis4280.security.pantherbuildsecurity.interceptor;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.filter.OncePerRequestFilter;

import gsu.cis4280.security.pantherbuildsecurity.security.JwtTokenUtil;


public class AuthenticationTokenFilter extends OncePerRequestFilter {

	
	@Autowired private UserDetailsService userDetailsService;
	@Autowired private JwtTokenUtil jwtTokenUtil;
	
	
	private String tokenHeader;
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	
}
