package com.data.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.data.config.JwtTokenGeneratorFilter;
import com.data.dto.AuthResponse;
import com.data.dto.Login;

@Service
public class UserServices {
	
	@Autowired
	private UserDetailsServices userDetailsServices;
	@Autowired
	private JwtTokenGeneratorFilter jwtTokenGeneratorFilter;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	
	public AuthResponse loginUser(Login login) {
      Authentication authentication = authenticate(login.getUsername(), login.getPassword());
      SecurityContextHolder.getContext().setAuthentication(authentication);
      String token = jwtTokenGeneratorFilter.genrateToken(authentication);
      AuthResponse auth=new AuthResponse(token, "Sign In Success");
      return auth; 
  }
	private Authentication authenticate(String username, String password) {
      UserDetails userDetails = userDetailsServices.loadUserByUsername(username);
      if (userDetails == null)
          throw new BadCredentialsException("Invalid Username");
      if (!passwordEncoder.matches(password, userDetails.getPassword()))
          throw new BadCredentialsException("Invalid Password");
      return new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
  }

}
