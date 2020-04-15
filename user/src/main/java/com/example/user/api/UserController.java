package com.example.user.api;

import com.example.user.model.User;
import com.example.user.service.UserService;

public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void addUser(User user) {
        userService.addUser(user);
    }
}
