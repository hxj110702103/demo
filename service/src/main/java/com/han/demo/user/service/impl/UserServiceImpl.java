package com.han.demo.user.service.impl;

import com.han.demo.user.dao.mybatis.MybatisUserDao;
import com.han.demo.user.service.UserService;
import com.han.demo.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by Amy on 2016/9/7.
 */
@Service
@CacheConfig(cacheNames = "service")
public class UserServiceImpl implements UserService {
    @Autowired
    private MybatisUserDao mybatisUserDao;

   public User login(User user) {
        return user;
   }

    @Cacheable(key = "#userId")
    public User getById(Integer userId) {
        User user3 = mybatisUserDao.getById(userId);
        System.out.println("用户邮件为：："+user3.getEmail());
        return user3;
    }
}
