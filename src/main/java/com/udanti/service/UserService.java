package com.udanti.service;

import com.udanti.UserTest;
import com.udanti.exception.ServiceException;

public interface UserService {

	
	public UserTest loginCheck(String UName,String password) throws ServiceException;
}
