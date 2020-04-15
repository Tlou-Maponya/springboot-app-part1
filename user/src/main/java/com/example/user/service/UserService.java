package com.example.user.service;

import com.example.user.dao.UserDao;
import com.example.user.model.User;

public class UserService {
    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public int addUser(User user) {
        return userDao.insertUser(user);
    }
}
