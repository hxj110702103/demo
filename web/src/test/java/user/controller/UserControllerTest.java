package user.controller;

import com.han.demo.common.JdbcConnect;
import com.han.demo.goods.controller.GoodsController;
import com.han.demo.user.dao.ibatis.UserDao;
import com.han.demo.user.dao.mybatis.MybatisUserDao;
import com.han.demo.user.model.User;
import com.han.demo.user.service.UserService;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sound.midi.Soundbank;

/**
 * Created by Amy on 2016/9/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
/** 设置要加载的配置文件
 *  因为Test目录下，没有resource包，既没有resource配置文件，所以自己需要加载配置文件
 *  注入controller类需要spring-mvc.xml配置文件，注入service和dao类需要spring-web-beans.xml配置文件
 * */
@ContextConfiguration(locations = {"classpath:spring/spring-mvc.xml", "classpath:spring/spring-web-beans.xml"})
@FixMethodOrder(MethodSorters.DEFAULT)  //测试方法的执行顺序
public class UserControllerTest {
     @Autowired
     private GoodsController goodsController;
    @Autowired
    private  JdbcConnect jdbcConnect;
    @Autowired
    private UserService userService;
    @Autowired
    private UserDao userDao;
    @Autowired
    private MybatisUserDao mybatisUserDao;
    @Test
      public void test() {
        User user = jdbcConnect.getByTemplate();
        System.out.println("用户名称：" + user.getName());
      }

    @Test
    public void ibatisTest() {
        User user1 = new User();
        user1.setName("amy1");
        user1.setPassword("123321");
        user1.setEmail("12345435qq.com");
        user1.setPhone("13817556575");
        userDao.create(user1);
        System.out.println("新增的user的ID==="+user1.getUserId());
        User user =  userDao.getById(1);
        System.out.println("hhhhhh===="+ user.getName());
    }

    @Test
    public void mybatisTest() {
        User user2 = mybatisUserDao.getById(5);
        System.out.println("手机号《《《《《" + user2.getPhone());
    }

    @Test
    public void ehcacheTest() {
        User user3 = userService.getById(5);
        System.out.println("11111111111111111111111"+user3.getName());
        User user4 = userService.getById(5);
        System.out.println("22222222222222222222222"+user3.getEmail());
    }
}
