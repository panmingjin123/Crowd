package com.atguigu.atcrowdfunding.controller;

import com.atguigu.atcrowdfunding.bean.User;
import com.atguigu.atcrowdfunding.manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author panjin
 * @date 2019/3/716:25
 */
@Controller
public class DispatcherController {

    @Autowired
    private UserService userService;
    @RequestMapping("/index")
    public   String index(){
       return "index";
   }
   @RequestMapping("/login")
    public String login(){
        return "login";
   }
   @RequestMapping("/dologin")
    public String dologin(String loginacct,String userpswd,String type){
       Map<String,Object> paramMap=new HashMap<String, Object>();
       paramMap.put("loginacct",loginacct);
       paramMap.put("userpswd",userpswd);
       paramMap.put("type",type);

      User user= (User) userService.qureUserLogin(paramMap);
       return "main";
   }

}