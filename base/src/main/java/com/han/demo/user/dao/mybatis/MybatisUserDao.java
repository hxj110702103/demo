package com.han.demo.user.dao.mybatis;

import com.han.demo.user.model.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by Amy on 2016/9/22.
 */
@Component
public interface MybatisUserDao {

    User getById(Integer userId);
}
