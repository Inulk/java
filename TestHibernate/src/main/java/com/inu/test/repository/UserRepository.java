package com.inu.test.repository;

import java.util.List;

import com.inu.test.model.User;

public interface UserRepository {
	
	User save(User u);
	User update(User u);
	void delete(User u);
	User find(Integer Id);
	List<User> findAll();

}
