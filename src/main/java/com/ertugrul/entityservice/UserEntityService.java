package com.ertugrul.entityservice;


import com.ertugrul.dao.UserDao;
import com.ertugrul.dto.UserActionDto;
import com.ertugrul.entity.User;

import java.util.List;

public class UserEntityService {

    private final UserDao userDao;

    public UserEntityService() {
        userDao = new UserDao();
    }

    public List<User> findAll() {
        return userDao.findAll();
    }

    public List<UserActionDto> findUserCommentsByUserId(Long id) {
        return userDao.findUserCommentsByUserId(id);
    }
}