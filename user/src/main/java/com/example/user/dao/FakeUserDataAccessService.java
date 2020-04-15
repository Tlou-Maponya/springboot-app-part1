package com.example.user.dao;

import com.example.user.model.User;

import java.util.ArrayList;
import java.util.List;

public class FakeUserDataAccessService implements UserDao {

    private static List<User> DB = new ArrayList<>();

    @Override
    public int insertUser(long id, User user) {
        DB.add(new User(id, user.getName(), user.getSurname()));
        return 1;
    }
}
