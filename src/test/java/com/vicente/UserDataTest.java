package com.vicente;


import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.vicente.common.util.JsonUtil;
import com.vicente.service.UserDataService;

public class UserDataTest extends BaseTest {
	
	@Autowired
	private UserDataService userDataService;
	
	@Test
	public void testQueryUserFieldPage(){
		List result= userDataService.queryUserFieldPage(1, 2);
		System.out.println(JsonUtil.toJSONString(result));
	}
	
	

}
