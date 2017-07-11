package com.hhcf.learn.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hhcf.learn.service.FullService;

/**
 * 
 * @Title: MybatisController
 * @Description:mybatis 学习
 * @Author: zhaotf
 * @Since:2017年7月11日 上午9:21:46
 * @Version:1.0
 */
@Controller
@RequestMapping("/fullMybatis")
public class FullMybatisController {
	private static Logger logger = LogManager.getLogger(FullMybatisController.class);
	@Autowired
	private FullService fullService;
//	https://git.coding.net/shulanztf/springmvc-mybatis.git

	/**
	 * 数据列表查询
	 * 
	 * @param request
	 */
	@ResponseBody
	@RequestMapping(value = "/findUsers")
	public Object findUsers(HttpServletRequest request) {
		logger.info("nginx反向代理");
		return this.fullService.findUsers(request);
	}

}
