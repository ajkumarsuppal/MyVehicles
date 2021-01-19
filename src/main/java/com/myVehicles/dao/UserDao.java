package com.myVehicles.dao;

import com.myVehicles.model.User;

public interface UserDao {
    public User save(User user);

    public User findById(long id);

    public Iterable<User> findAll();

    public void deleteById(long id);

    public User findByUsername(String username);

}