package com.gateluck.controller;

import com.gateluck.model.UserInfo;
import com.gateluck.service.UserInfoService;
//import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

/**
 * Created by cef on 16/6/11.
 */
@Controller
public class TestController {

    @Autowired
    UserInfoService service;

    @RequestMapping(value = "/hello")
    public ModelAndView hello() {

        List<UserInfo> list = new ArrayList<UserInfo>();

        UserInfo info1 = service.getUserInfo(2);

        list.add(info1);

        for(int i=0;i<50;i++){
            UserInfo info = new UserInfo();
            info.setUserId(i+1);
            info.setUserName("用户名"+Integer.toString(i+1));
            info.setBirthday((new Date()));

            list.add(info);
        }

        //返回ModelAndView
        ModelAndView modelAndView = new ModelAndView();
        //相当于request的setAttribute方法,在jsp页面中通过itemsList取数据
        modelAndView.addObject("itemsList",list);

        //指定视图
        modelAndView.setViewName("hello");

        return modelAndView;
    }

    @RequestMapping(value = "/all")
    public ModelAndView all() {

        List<UserInfo> list = service.getAllUserInfos();

        //返回ModelAndView
        ModelAndView modelAndView = new ModelAndView();
        //相当于request的setAttribute方法,在jsp页面中通过itemsList取数据
        modelAndView.addObject("itemsList",list);

        //指定视图
        modelAndView.setViewName("hello");

        return modelAndView;
    }
}
