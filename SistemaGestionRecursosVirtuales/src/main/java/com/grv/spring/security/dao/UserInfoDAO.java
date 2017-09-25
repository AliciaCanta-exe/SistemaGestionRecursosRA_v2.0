package com.grv.spring.security.dao;

import java.util.List;

import com.grv.spring.security.model.UserInfo;
 
public interface UserInfoDAO {
     
    public UserInfo findUserInfo(String email);
     
    // [USER,AMIN,..]
    public List<String> getUserRoles(String email);
     
}