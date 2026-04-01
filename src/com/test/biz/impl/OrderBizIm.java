package com.test.biz.impl;

import com.test.OrderBiz;

public class OrderBizIm implements OrderBiz {

    @AutoWired
    public UserBiz userBiz;

    public void getOrderno() {
        System.out.println(userBiz.getUserName());
    }


}

