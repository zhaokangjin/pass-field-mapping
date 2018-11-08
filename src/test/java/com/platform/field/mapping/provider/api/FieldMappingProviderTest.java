package com.platform.field.mapping.provider.api;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.platform.configure.base.ResultStatus;
import com.platform.configure.base.enums.Status;
import com.platform.configure.condition.Between;
import com.platform.configure.condition.Conditions;
import com.platform.field.mapping.condition.FieldMappingCondition;
import com.platform.field.mapping.entity.FieldMapping;
import com.platform.field.mapping.service.FieldMappingService;

public class FieldMappingProviderTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	FieldMappingService fieldMappingService;

	@Test
	public ResultStatus<Integer> bathcDeleteUpdateOrInsertByConditionTest(List<FieldMapping> record, FieldMappingCondition condition) {
		ResultStatus<Integer> result = null;
		result = new ResultStatus<Integer>(Status.SUCCESS, 0);
		logger.info("ddd");
		
		return result;
	}

	@Test
	public ResultStatus<Long> countByConditionTest() {
		FieldMappingCondition condition=new FieldMappingCondition();
		
		Conditions<Date> creationTimeCondition=new Conditions<Date>();
		Between<Date> bw=new Between<Date>();
		bw.setPreValue(new Date());
		bw.setEndValue(new Date());
		creationTimeCondition.setBw(bw);
		creationTimeCondition.setGt(new Date());
		condition.setCreatecreationTime(creationTimeCondition);
		
		Conditions<String> creator=new Conditions<String>();
		creator.setEq("zhangsan");
		condition.setCreator(creator);
		
		return new ResultStatus<Long>(Status.SUCCESS, -1l);
	}

	@Test
	public ResultStatus<Integer> deleteByConditionTest(FieldMappingCondition condition) {
		return new ResultStatus<Integer>(Status.SUCCESS, -1);
	}

	@Test
	public ResultStatus<Integer> insertTest(FieldMapping record) {
		return new ResultStatus<Integer>(Status.SUCCESS, -1);
	}

	@Test
	public ResultStatus<Integer> insertSelectiveTest(FieldMapping record) {
		return new ResultStatus<Integer>(Status.SUCCESS, -1);
	}

	@Test
	public ResultStatus<List<FieldMapping>> selectByConditionTest() {
		return null;
	}

	@Test
	public ResultStatus<List<FieldMapping>> selectByConditionTest(FieldMappingCondition condition) {
		return null;
	}

	@Test
	public ResultStatus<List<FieldMapping>> selectRecordsByExistsConditionTest(FieldMappingCondition condition, String subTable) {
		return null;
	}

	@Test
	public ResultStatus<List<FieldMapping>> selectRecordsByInListTest(String fieldName, List<Object> paramList, Integer splitSize) {
		return null;
	}

	@Test
	public ResultStatus<List<FieldMapping>> selectRecordsByNotInListTest(String fieldName, List<Object> paramList, Integer splitSize) {
		return null;
	}

	@Test
	public ResultStatus<Integer> updateByConditionTest(FieldMapping record) {
		return new ResultStatus<Integer>(Status.SUCCESS, -1);
	}

	@Test
	public ResultStatus<Integer> updateByExampleSelectiveTest(FieldMapping record) {
		return new ResultStatus<Integer>(Status.SUCCESS, -1);
	}
}
