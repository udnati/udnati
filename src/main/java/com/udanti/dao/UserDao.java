package com.udanti.dao;

import com.udanti.UserTest;
import com.udanti.exception.DaoException;

public interface UserDao {

	public UserTest loginCheck(String UName, String password) throws DaoException;
}
