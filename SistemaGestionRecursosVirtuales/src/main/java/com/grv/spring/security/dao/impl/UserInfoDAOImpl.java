package com.grv.spring.security.dao.impl;

import java.util.List;

import javax.sql.DataSource;
 
import com.grv.spring.security.dao.UserInfoDAO;
import com.grv.spring.security.mapper.UserInfoMapper;
import com.grv.spring.security.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
@Service
@Transactional
public class UserInfoDAOImpl extends JdbcDaoSupport implements UserInfoDAO {
 
    @Autowired
    public UserInfoDAOImpl(DataSource dataSource) {
        this.setDataSource(dataSource);
    }
  
    @Override
    public UserInfo findUserInfo(String email) {
        String sql = "Select u.email,u.password from bd_wsgrv.usuarios u where u.email = ? ";
 
        Object[] params = new Object[] { email };
        UserInfoMapper mapper = new UserInfoMapper();
        try {
            UserInfo userInfo = this.getJdbcTemplate().queryForObject(sql, params, mapper);
            return userInfo;
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
 
    @Override
    public List<String> getUserRoles(String email) {
        String sql = "Select r.rol from bd_wsgrv.roles r where r.id_rol = "//
                   + " (select u.id_rol from bd_wsgrv.usuarios u where u.email = ? ) ";
         
        Object[] params = new Object[] { email };
         
        List<String> roles = this.getJdbcTemplate().queryForList(sql,params, String.class);
         
        return roles;
    }
     
}