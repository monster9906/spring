package com.soul.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 符浩灵
 * @date 2020/2/2 22:10
 */
@Service
public class TestService {
	@Autowired
	CityService cityService;

	public TestService() {
		System.out.println("init ...  TestService");
	}

}
