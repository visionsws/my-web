package com.vicente.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vicente.dao.autogen.MaUserDataMapper;
import com.vicente.entity.autogen.MaUserData;
import com.vicente.entity.autogen.MaUserDataExample;
import com.vicente.service.UserDataService;

@Service
public class UserDataServiceImpl implements UserDataService {
	
	@Autowired
	private MaUserDataMapper maUserDataMapper;
	
	@Override
	public List queryUserFieldPage(Integer pageSize, Integer curPage) {
		MaUserDataExample example = new MaUserDataExample();
		example.createCriteria().andUseridGreaterThan((long) 18).andUseridLessThan((long) 28);
		List<MaUserData> result = maUserDataMapper.selectByExample(example);
		return result;
	}

}
