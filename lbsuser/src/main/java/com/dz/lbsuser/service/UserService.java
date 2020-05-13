package com.dz.lbsuser.service;

import com.dz.lbsuser.Entity.User;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface UserService {

    public Optional<User> getUserById(long id);

    public User saveUser(User user);
}
