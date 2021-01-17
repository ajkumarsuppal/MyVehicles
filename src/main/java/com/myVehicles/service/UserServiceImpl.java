package com.myVehicles.service;

import java.util.ArrayList;
import java.util.List;

import com.myVehicles.dao.UserDaoImpl;
import com.myVehicles.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDaoImpl userDao;

    @Override
    public User saveUserDetails(User user) {
        return userDao.save(user);
    }

    @Override
    public User getUserDetails(long id) {
        return userDao.findById(id);
    }

    @Override
    public List<User> getAllUserDetails() {
        List<User> user = new ArrayList<>();
        userDao.findAll().forEach(user::add);
        return user;
    }

    @Override
    public void deleteUserDetails(long id) {
        userDao.deleteById(id);
    }

}
