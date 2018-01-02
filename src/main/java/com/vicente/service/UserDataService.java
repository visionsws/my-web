package com.vicente.service;

import java.util.List;

public interface UserDataService {
	
	/**
	 * 分页查询分群时的字段属性信息
	 * @return
	 */
	public List queryUserFieldPage(Integer pageSize, Integer curPage);

}
