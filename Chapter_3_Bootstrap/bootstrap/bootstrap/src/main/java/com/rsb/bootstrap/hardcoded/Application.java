package com.rsb.bootstrap.hardcoded;

import com.rsb.bootstrap.Demo;

public class Application {
    public static void main(String[] args) {
        DevelopmentOnlyCustomerService customerService = new
                DevelopmentOnlyCustomerService();
        Demo.workWithCustomerService(Application.class, customerService);
    }
}
