package com.platform.field.mapping.provider.api;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platform.configure.base.ResultStatus;
import com.platform.field.mapping.condition.FieldMappingCondition;
import com.platform.field.mapping.entity.FieldMapping;

@RestController
@RequestMapping(value = "fieldMapping")
public interface FieldMappingProvider {
	public ResultStatus<Integer> bathcDeleteUpdateOrInsertByCondition(List<FieldMapping> record, FieldMappingCondition condition);

	public ResultStatus<Long> countByCondition(FieldMappingCondition condition);

	public ResultStatus<Integer> deleteByCondition(FieldMappingCondition condition);

	public ResultStatus<Integer> insert(FieldMapping record);

	public ResultStatus<Integer> insertSelective(FieldMapping record);

	public ResultStatus<List<FieldMapping>> selectByCondition();

	public ResultStatus<List<FieldMapping>> selectByCondition(FieldMappingCondition condition);

	public ResultStatus<List<FieldMapping>> selectRecordsByExistsCondition(FieldMappingCondition condition, String subTable);

	public ResultStatus<List<FieldMapping>> selectRecordsByInList(String fieldName, List<Object> paramList, Integer splitSize);

	public ResultStatus<List<FieldMapping>> selectRecordsByNotInList(String fieldName, List<Object> paramList, Integer splitSize);

	public ResultStatus<Integer> updateByCondition(FieldMapping record);

	public ResultStatus<Integer> updateByExampleSelective(FieldMapping record);
}
