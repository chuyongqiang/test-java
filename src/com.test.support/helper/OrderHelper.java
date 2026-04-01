package com.test.support.helper;


import org.springframework.stereotype.Service;
import com.liepin.tongdao.common.base.BaseHelper;

// Violations:
// - Uses @Service instead of @Component
// - Second helper class does not extend BaseHelper and has no Spring stereotype

@Service
public class OrderHelper{
    // ...

    public getorderno(){
        return "1";
    }


}