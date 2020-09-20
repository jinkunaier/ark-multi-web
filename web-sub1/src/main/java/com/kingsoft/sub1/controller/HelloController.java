/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.kingsoft.sub1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qilong.zql 18/6/13-上午6:56
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		return "this is sub1!";
	}

}