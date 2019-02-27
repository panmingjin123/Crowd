package com.atguigu.atcrowdfunding.manager.service.impl;

import com.atguigu.atcrowdfunding.manager.dao.TestDao;
import com.atguigu.atcrowdfunding.manager.service.TestService;

import java.util.HashMap;
import java.util.Map;


/**
 * @author panjin
 * @date 2019/2/2715:30
 */
public class TestServiceImpl implements TestService {
    private TestDao testDao;
    @Override
    public void insert() {
        Map map=new HashMap();
        map.put("name","zhangsan");
        testDao.insert(map);
    }
}
