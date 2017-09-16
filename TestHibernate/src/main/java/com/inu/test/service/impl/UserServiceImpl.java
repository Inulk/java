package com.inu.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inu.test.model.User;
import com.inu.test.repository.UserRepository;
import com.inu.test.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	public User save(User u) {
		userRepository.save(u);
		return u;
	}

	public User update(User u) {
		userRepository.update(u);
		return u;
	}

	public User delete(User u) {
		userRepository.delete(u);
		return u;
	}

	public User find(Integer Id) {
		return userRepository.find(Id);
	}

	public List<User> findAll() {
//		User u = new User();
//		u.setFname("Indika");
//		u.setLname("baandara");
//		u.setId(1);
//		List<User> users =  new ArrayList();
//		users.add(u);
		return userRepository.findAll();
	}

}
