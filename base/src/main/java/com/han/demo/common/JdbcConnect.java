package com.han.demo.common;

import com.han.demo.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Amy on 2016/9/11.
 */
public class JdbcConnect {

    private DriverManagerDataSource dataSource;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcConnect(DriverManagerDataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * 普通的jdbc连接数据库的新增
     */
    public void createUser() {
        Connection con = null;
        PreparedStatement stmt = null;

        try{
            con = dataSource.getConnection();
            stmt = con.prepareStatement("insert into user (name, password, email, phone) values('amy', '111111', '923575965@qq.com', 18233138990)");
            stmt.execute();
        } catch (SQLException e) {
           e.printStackTrace();
        } finally {
            try {
                if(stmt != null) {
                    stmt.close();
                }
                if(con != null) {
                    con.close();
                }
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 普通的jdbc连接数据库的查询
     * @return
     */
    public User getById() {
        Connection con = null;
        PreparedStatement stmt = null;
        User user = new User();
        try{
            con = dataSource.getConnection();
            stmt = con.prepareStatement("SELECT * from user where user_id = 1");
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                user.setUserId(rs.getInt("user_id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setPhone(rs.getString("phone"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(stmt != null) {
                    stmt.close();
                }
                if(con != null) {
                    con.close();
                }
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return user;
    }

    /**
     * 用jdbcTemplate模板查询
      * @return
     */
    public User getByTemplate() {
//        return jdbcTemplate.queryForObject("select * from user where user_id = 1", new org.springframework.jdbc.core.RowMapper<User>() {
//            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
//                return new User(
//                        rs.getInt("user_id"),
//                        rs.getString("name"),
//                        rs.getString("email"),
//                        rs.getString("password"),
//                        rs.getString("phone")
//                );
//            }
//        });
        return null;
    }

    public void setDataSource(DriverManagerDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public DriverManagerDataSource getDataSource() {
        return dataSource;
    }
}
