package com.ramostear.application.service;

import com.ramostear.application.model.User;

import java.util.Collection;

/**
 * Created by ramostear on 2019/3/11 0011.
 */
public interface UserService {

    /**
     * create user
     * @param user
     */
    void create(User user);

    /**
     * update user info by ID
     * @param id
     * @param user
     */
    void update(long id,User user);

    /**
     * delete user by ID
     * @param id
     */
    void delete(long id);

    /**
     * query all user
     * @return
     */
    Collection<User> findAll();
}
