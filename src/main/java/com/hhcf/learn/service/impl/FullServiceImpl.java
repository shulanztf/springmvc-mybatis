package com.hhcf.learn.service.impl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hhcf.learn.dao.FullMybatisDao;
import com.hhcf.learn.service.FullService;

/**
 * 
 * @Title: FullServiceImpl
 * @Description:
 * @Author: zhaotf
 * @Since:2017年7月11日 上午10:06:53
 * @Version:1.0
 */
@Service("fullService")
@Transactional
public class FullServiceImpl implements FullService {
	@Autowired
	private FullMybatisDao fullMybatisDao;

	@Override
	public Object findUsers(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
