package com.dao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.daos.UserDao;
@Service
public class UserService {
	@Autowired
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public boolean authenticate(String username, String password) {
        return userDao.isValidUser(username, password);
    }
}

//@Service
//public class UserService {
//    @Autowired
//    private UserDao userDao; // Automatically initialized by Spring
//
//    public boolean checkUser(String username, String password) {
//        return userDao.isValidUser(username, password); // No NullPointerException
//    }
//}

