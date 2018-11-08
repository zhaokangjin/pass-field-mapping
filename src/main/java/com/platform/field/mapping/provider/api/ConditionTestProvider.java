package com.platform.field.mapping.provider.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platform.field.mapping.condition.FieldMappingCondition;

@RestController
@RequestMapping(value = "fieldMapping")
public class ConditionTestProvider {
	public void testConditon(FieldMappingCondition condition) {
		
	}
}
