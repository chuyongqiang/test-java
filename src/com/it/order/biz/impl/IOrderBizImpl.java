package com.it.order.biz.impl;

import com.it.order.OrderBiz;

public class IOrderBizImpl implements OrderBiz {

    public UserBiz userBiz = new UserBiz();

    public void getOrderno() {
        System.out.println(userBiz.getUserName());
    }


}

