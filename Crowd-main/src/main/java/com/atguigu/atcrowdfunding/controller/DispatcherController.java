package com.atguigu.atcrowdfunding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author panjin
 * @date 2019/3/716:25
 */
@Controller
public class DispatcherController {

   @RequestMapping("/index")
   @ResponseBody
    public String dispatcherController(){

       return "index";
   }
}