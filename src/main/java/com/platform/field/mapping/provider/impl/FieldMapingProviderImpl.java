package com.platform.field.mapping.provider.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platform.field.mapping.provider.api.FieldMapingProvider;
import com.platform.field.mapping.service.FieldMapingService;

import io.swagger.annotations.ApiOperation;
@Service
public class FieldMapingProviderImpl implements FieldMapingProvider{
	Logger logger =LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	FieldMapingService fieldMapingService;
	
	@ApiOperation(value = "添加用户信息", notes = "添加用户信息")
//	@ApiImplicitParam(name = "applicationName", value = "subAppId", required = true, dataType = "com.platflat.eureka.server.entity.SubApp")
	@Override
	public int listQuery() {
		return fieldMapingService.batchUpdateBySingleExample();
	}
}
