package com.dz.lbsuser.service.impl;

import com.dz.lbsuser.Entity.User;
import com.dz.lbsuser.dao.UserDao;
import com.dz.lbsuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Optional<User> getUserById(long id){

        return userDao.findById (id);
    }

    public User saveUser(User user){

        return userDao.save(user);
    }
}
