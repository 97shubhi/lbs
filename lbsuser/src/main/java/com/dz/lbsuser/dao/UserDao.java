package com.dz.lbsuser.dao;

import com.dz.lbsuser.Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Long> {
}
