package com.atguigu.atcrowdfunding.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author panjin
 * @date 2019/3/514:05
 */
public class StartSystemListener  implements ServletContextListener {
   //在服务器启动时，创建application对象时需要执行的方法
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //1、将项目的上下文路径放在application域中
        ServletContext application=sce.getServletContext();
        String contextPath=application.getContextPath();
        application.setAttribute("APP_PATH",contextPath);

    }
    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
