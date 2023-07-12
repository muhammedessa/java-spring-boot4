package com.muhammedessa.crudapidata.services;

import java.util.List;

import com.muhammedessa.crudapidata.entity.User;

public interface UserService {
    User createUser(User user);

    User getUserById(Long userId);

    List<User> getAllUsers();

    User updateUser(User user);

    void deleteUser(Long userId);
}
