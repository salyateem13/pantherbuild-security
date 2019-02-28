package gsu.cis4280.security.pantherbuildsecurity.service;


import java.util.List;

import gsu.cis4280.security.pantherbuildsecurity.model.User;

public interface UserService {
	
	User save(User user) ;

	List<User> findAll();

	User getUserByEmail(String name);

}
