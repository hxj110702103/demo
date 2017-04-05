package com.han.demo.user.service;

import com.han.demo.user.model.User;
/**
 * Created by Amy on 2016/9/7.
 */
public interface UserService {
    User login(User users);
    User getById(Integer userId);
}
