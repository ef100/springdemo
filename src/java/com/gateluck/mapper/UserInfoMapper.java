package com.gateluck.mapper;

import java.util.*;
import com.gateluck.model.UserInfo;

/**
 * Created by cef on 16/6/11.
 */
public interface UserInfoMapper {

    UserInfo getUserInfo(int userId);
    List<UserInfo> getAllUserInfos();
}
