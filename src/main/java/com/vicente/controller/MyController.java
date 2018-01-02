package com.vicente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.vicente.service.UserDataService;

@Controller
public class MyController {
	
	@Autowired
	private UserDataService userDataService;
	
	@RequestMapping(value="qryUserData")
	@ResponseBody
	public Object qryUserData(){
		List result = userDataService.queryUserFieldPage(1, 2);
		return result;
	}

}
