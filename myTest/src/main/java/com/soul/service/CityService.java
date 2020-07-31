package com.soul.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 符浩灵
 * @date 2020/2/2 22:14
 */
@Service
public class CityService {
	@Autowired
	TestService testService;

	public CityService() {
		System.out.println("init ... CityService");
	}
}
