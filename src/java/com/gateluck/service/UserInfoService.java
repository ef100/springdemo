package com.gateluck.service;

import java.util.*;
import com.gateluck.model.UserInfo;

/**
 * Created by cef on 16/6/11.
 */
public interface UserInfoService {

    UserInfo getUserInfo(int userId);
    List<UserInfo> getAllUserInfos();

}
