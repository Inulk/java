package com.inu.test.repository.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.inu.test.model.User;
import com.inu.test.repository.UserRepository;

@Repository
@Transactional
public class UserRepositoryImpl implements UserRepository {
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	private Session session;

	public User save(User u) {
//		session = sessionFactory.openSession();
//		Transaction transaction = session.beginTransaction();
//		session.save(u);
//		session.flush();
//		transaction.commit();
//		session.close();
		hibernateTemplate.save(u);
		return u;
	}

	public User update(User u) {
		hibernateTemplate.update(u);
		
		return u;
	}

	public void delete(User u) {
		hibernateTemplate.delete(u);
	}

	public User find(Integer Id) {
		return hibernateTemplate.load(User.class, Id);
	}

	public List<User> findAll() {
		
	    return hibernateTemplate.loadAll(User.class);
	}

}
