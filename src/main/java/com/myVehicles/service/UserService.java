package com.myVehicles.service;

import java.util.List;

import com.myVehicles.model.User;

public interface UserService {
    public User saveUserDetails(User user);

    public User getUserDetails(long id);

    public List<User> getAllUserDetails();

    public void deleteUserDetails(long id);

    public User getUserByUsername(String username);

    Boolean loginValidator(String username, String password);
}
