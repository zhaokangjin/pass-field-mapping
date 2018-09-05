package com.platform.field.mapping.provider.api;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platform.field.mapping.entity.FieldCommonts;

import io.swagger.annotations.Api;

@Api(value = "field", tags = "字段修改测试")
@RestController
@RequestMapping(value = "field")
public interface FieldMapingController {
	
	
	@PostMapping(value = "listQuery")
	public List<FieldCommonts> fieldCommontsMapper();
}