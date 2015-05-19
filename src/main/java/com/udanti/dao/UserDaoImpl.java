package com.udanti.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.udanti.UserTest;



@Repository
public class UserDaoImpl  implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public UserTest  loginCheck(String UName,String password){/*loginCheck(String UName, String password) {*/
		
		List<UserTest> userTests = sessionFactory
				.getCurrentSession()
				.createQuery(
						"FROM UserTest userTest Where userTest.uName=" +"'"+UName+"'"
								+ " AND userTest.password=" +"'"+password+"'").list();

		return userTests.get(0);
	}

}
