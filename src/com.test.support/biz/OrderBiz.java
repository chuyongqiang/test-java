


public class OrderBiz{

    @AutoWired
    private IndexController indexController;

    @Autowired
    public SiteDao siteDao;

    @Override
    public void doSomething() {
        indexController.index();
    }


}

