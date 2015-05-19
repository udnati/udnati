package com.udanti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.udanti.UserTest;
import com.udanti.dao.UserDaoImpl;



@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserDaoImpl dao;

	@Override
	public UserTest loginCheck(String UName, String password) {
		return dao.loginCheck(UName, password);
	}

	
}
