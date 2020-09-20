/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.kingsoft.host;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author qilong.zql 18/6/12-下午8:48
 */
@SpringBootApplication
public class HostApplication {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(HostApplication.class);
        springApplication.run(args);
    }
}