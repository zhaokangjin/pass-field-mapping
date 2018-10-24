package com.platform.field.mapping.provider.api;

import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.platform.configure.base.StatusResult;
import com.platform.field.mapping.condition.FieldMappingCondition;
import com.platform.field.mapping.entity.FieldMapping;
import com.platform.field.mapping.service.FieldMappingService;

public class FieldMappingProviderTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	FieldMappingService fieldMappingService;

	@Test
	public StatusResult<Integer> bathcDeleteUpdateOrInsertByConditionTest(List<FieldMapping> record, FieldMappingCondition condition) {
		StatusResult<Integer> result = null;
		result = new StatusResult<Integer>(200, 0);
		logger.info("ddd");
		
		return result;
	}

	@Test
	public StatusResult<Long> countByConditionTest(FieldMappingCondition condition) {
		return new StatusResult<Long>(200, -1l);
	}

	@Test
	public StatusResult<Integer> deleteByConditionTest(FieldMappingCondition condition) {
		return new StatusResult<Integer>(200, -1);
	}

	@Test
	public StatusResult<Integer> insertTest(FieldMapping record) {
		return new StatusResult<Integer>(200, -1);
	}

	@Test
	public StatusResult<Integer> insertSelectiveTest(FieldMapping record) {
		return new StatusResult<Integer>(200, -1);
	}

	@Test
	public StatusResult<List<FieldMapping>> selectByConditionTest() {
		return null;
	}

	@Test
	public StatusResult<List<FieldMapping>> selectByConditionTest(FieldMappingCondition condition) {
		return null;
	}

	@Test
	public StatusResult<List<FieldMapping>> selectRecordsByExistsConditionTest(FieldMappingCondition condition, String subTable) {
		return null;
	}

	@Test
	public StatusResult<List<FieldMapping>> selectRecordsByInListTest(String fieldName, List<Object> paramList, Integer splitSize) {
		return null;
	}

	@Test
	public StatusResult<List<FieldMapping>> selectRecordsByNotInListTest(String fieldName, List<Object> paramList, Integer splitSize) {
		return null;
	}

	@Test
	public StatusResult<Integer> updateByConditionTest(FieldMapping record) {
		return new StatusResult<Integer>(200, -1);
	}

	@Test
	public StatusResult<Integer> updateByExampleSelectiveTest(FieldMapping record) {
		return new StatusResult<Integer>(200, -1);
	}
}
