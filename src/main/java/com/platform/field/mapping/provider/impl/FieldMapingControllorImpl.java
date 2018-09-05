package com.platform.field.mapping.provider.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platform.field.mapping.entity.FieldCommonts;
import com.platform.field.mapping.provider.api.FieldMapingController;
import com.platform.field.mapping.service.FieldCommontsService;

import io.swagger.annotations.ApiOperation;
@Service
public class FieldMapingControllorImpl implements FieldMapingController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	FieldCommontsService fieldCommontsService;
	
	@ApiOperation(value="字段显示接口")
	@Override
	public List<FieldCommonts> fieldCommontsMapper(){
		logger.info("FieldMapingProviderImpl");
		return fieldCommontsService.selectFieldByList();
	}
}
