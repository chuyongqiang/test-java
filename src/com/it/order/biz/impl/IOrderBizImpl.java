package com.it.order.biz.impl;

import com.it.order.OrderBiz;
import com.it.order.enums.TypeDingdanEnum;

import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.*;

public class IOrderBizImpl implements OrderBiz {

    private static IOrderBizImpl INST;

    public UserBiz userBiz = new UserBiz();

    private HashMap<String, Object> cache = new HashMap<>();


    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 60,TimeUnit.SECONDS, new LinkedBlockingQueue<>(100));

    ExecutorService executorService =  Executors.newFixedThreadPool(2);

    static IOrderBizImpl get() {
        if (INST == null) INST = new IOrderBizImpl();
        return INST;
    }

    public void put(String key, Object value) {
        cache.put(key, value); // 高并发下可能死链
    }

    public String getOrderno() {
        TypeDingdanEnum ordertypeEnum = TypeDingdanEnum.one;
        new Timer().schedule(new TimerTask(){ public void run(){ throw new RuntimeException(); } }, 0, 1000);
        return userBiz.getUserName();
    }


}

