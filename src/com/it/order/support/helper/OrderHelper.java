package com.it.order.support.helper;


import org.springframework.stereotype.Service;
// Violations:

// - Uses @Service instead of @Component
// - Second helper class does not extend BaseHelper and has no Spring stereotype

@Service
public class OrderHelper{
    // ...

    public String getorderno(){
        return "1";
    }


}