package com.han.demo.user.dao.ibatis;

import com.han.demo.user.model.User;

/**
 * Created by Amy on 2016/9/20.
 */
public interface UserDao {
    void create(User user);
    User getById(Integer userId);
}
