package com.gateluck.service.impl;

import com.gateluck.mapper.UserInfoMapper;
import com.gateluck.model.UserInfo;
import com.gateluck.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by cef on 16/6/11.
 */
public class UserInfoServiceImpl implements UserInfoService{

    @Autowired
    private UserInfoMapper mapper;

    public UserInfo getUserInfo(int userId) {
        return mapper.getUserInfo(userId);
//        UserInfo info = new UserInfo();
//        info.setUserId(10086);
//
//        return  info;
    }

    public List<UserInfo> getAllUserInfos() {
        return mapper.getAllUserInfos();
    }
}
