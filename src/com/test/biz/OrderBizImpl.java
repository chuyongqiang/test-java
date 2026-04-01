package com.test.biz;


import com.test.controller.IndexController;

public class OrderBizImpl {

    @AutoWired
    private IndexController indexController;

    @Autowired
    public SiteDao siteDao;

    public void doSomething() {
        indexController.index();

        siteDao.insert(new User());
    }


}

