package com.atguigu.atcrowdfunding.manager.controller;

import com.atguigu.atcrowdfunding.manager.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author panjin
 * @date 2019/2/2715:13
 */
@Controller
public class TestAtCrowd {

    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    public String test(){
        testService.insert();
        System.out.println("testController");
        return "success";
    }
}
