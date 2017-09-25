package com.grv.spring.security.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
 
import com.grv.spring.security.model.UserInfo;
import org.springframework.jdbc.core.RowMapper;
 
public class UserInfoMapper implements RowMapper<UserInfo> {
 
    @Override
    public UserInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
 
        String email    = rs.getString("email");
        String password = rs.getString("password");
 
        return new UserInfo(email, password);
    }
 
}