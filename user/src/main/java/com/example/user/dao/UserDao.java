package com.example.user.dao;

import com.example.user.model.User;
import java.util.Random;

public interface UserDao {

    int insertUser(long id, User user);

    default int insertUser(User user) {
        Random rand = new Random();
        long id = rand.nextLong();
        return insertUser(id, user);
    }


}
