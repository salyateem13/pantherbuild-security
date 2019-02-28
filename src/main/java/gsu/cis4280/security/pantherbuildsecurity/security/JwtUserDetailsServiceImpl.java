package gsu.cis4280.security.pantherbuildsecurity.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import gsu.cis4280.security.pantherbuildsecurity.UserRepository;
import gsu.cis4280.security.pantherbuildsecurity.model.User;

@Service("userDetailsService")
public class JwtUserDetailsServiceImpl implements UserDetailsService {


	 @Autowired private UserRepository userRepository;
	 
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByEmailIgnoreCase(username);
		
		if (user == null) {
			throw new UsernameNotFoundException(String.format("No user found with usernam '%s' .", username));
		}else {
			return JwtUserFactory.create(user);
		}
		
	}
}
