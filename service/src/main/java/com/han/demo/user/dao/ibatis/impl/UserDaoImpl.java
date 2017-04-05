package com.han.demo.user.dao.ibatis.impl;

import com.han.demo.user.dao.ibatis.UserDao;
import com.han.demo.user.model.User;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * Created by Amy on 2016/9/20.
 */

public class UserDaoImpl extends SqlMapClientDaoSupport implements UserDao {

    public void create(User user) {
        getSqlMapClientTemplate().insert("create", user);
    }

    public User getById(Integer userId) {
        return (User)getSqlMapClientTemplate().queryForObject("getById", userId);
    }
}
