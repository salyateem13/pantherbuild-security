package gsu.cis4280.security.pantherbuildsecurity.service;

import gsu.cis4280.security.pantherbuildsecurity.repository.UserRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import gsu.cis4280.security.pantherbuildsecurity.model.User;
import gsu.cis4280.security.pantherbuildsecurity.util.PasswordUtil;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired UserRepository userRepository;
	
	@Override
	public User save(User user) {
		String password = PasswordUtil.getPasswordHash(user.getPassword());
		user.setPassword(password);
		
		return userRepository.save(user);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return (List<User>) userRepository.findAll();
	}

	@Override
	public User getUserByEmail(String name) {
		// TODO Auto-generated method stub
		return (User) userRepository.findByEmailIgnoreCase(name);
	}
}

