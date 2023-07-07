package com.coaching2.filter;

import com.coaching2.util.JwtTokenUtil;
import io.jsonwebtoken.Claims;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		String authorizationHeader = request.getHeader("Authorization");
		String requestURI = request.getRequestURI();
		if (requestURI.startsWith("/user/*") && authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
			String jwtToken = authorizationHeader.substring(7);
			try {
				Claims claims = JwtTokenUtil.extractClaims(jwtToken);
				String emailId = claims.getSubject();
				String userType = (String) claims.get("userType");
				request.setAttribute("emailId", emailId);
				request.setAttribute("userType", userType);
			} catch (Exception e) {
				
			}
		}

		filterChain.doFilter(request, response);
	}
}
