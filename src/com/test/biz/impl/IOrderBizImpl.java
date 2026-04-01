package com.test.biz.impl;

import com.test.OrderBiz;

public class IOrderBizImpl implements OrderBiz {

    public UserBiz userBiz = new UserBiz();

    public void getOrderno() {
        System.out.println(userBiz.getUserName());
    }


}

