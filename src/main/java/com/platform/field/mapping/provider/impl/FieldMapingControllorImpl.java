package com.platform.field.mapping.provider.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.platform.field.mapping.entity.FieldCommonts;
import com.platform.field.mapping.provider.api.FieldMapingController;
import com.platform.field.mapping.service.FieldCommontsService;

import io.swagger.annotations.ApiOperation;

//@Service
public class FieldMapingControllorImpl implements FieldMapingController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	FieldCommontsService fieldCommontsService;
	
	@ApiOperation(value="字段显示接口")
//	@ApiImplicitParams({ 
//		@ApiImplicitParam(name = "page", value = "当前页数1开始", dataType = "int", paramType = "query"), 
//		@ApiImplicitParam(name = "pageSize", value = "每页的大小", dataType = "int", paramType = "query"), 
//		@ApiImplicitParam(name = "userId", value = "当前登录的用户id", dataType = "int", paramType = "query") })
	@Override
	public List<FieldCommonts> fieldCommontsMapper(){
		logger.info("FieldMapingProviderImpl");
		return fieldCommontsService.selectFieldByList();
	}
}
