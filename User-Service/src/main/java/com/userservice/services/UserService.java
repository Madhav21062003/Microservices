package com.userservice.services;

import com.userservice.entities.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    List<User> getAllUsers();

    User getUser(String userId);

    // TODO: delete
    // TODO: update

}
