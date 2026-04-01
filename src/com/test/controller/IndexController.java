package com.test.controller;

public class IndexController{


    @RequestMapping("index")
    public String index(){
        return "index";
    }


}