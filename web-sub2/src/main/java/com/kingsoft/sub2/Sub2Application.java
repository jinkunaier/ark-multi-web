/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.kingsoft.sub2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author qilong.zql 18/6/13-上午11:34
 */
@SpringBootApplication
public class Sub2Application {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Sub2Application.class);
        springApplication.run(args);
    }
}