package com.inu.test.service;

import java.util.List;


import com.inu.test.model.User;

public interface UserService {

	User save(User u);
	User update(User u);
	User delete(User u);
	User find(Integer Id);
	List<User> findAll();
	
}
