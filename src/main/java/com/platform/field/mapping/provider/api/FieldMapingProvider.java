package com.platform.field.mapping.provider.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@Api(value = "field", tags = "字段修改测试")
@RestController
@RequestMapping(value = "field")
public interface FieldMapingProvider {
	
	@RequestMapping(value = "listQuery", method = { RequestMethod.POST, RequestMethod.GET })
	public int listQuery();
}
