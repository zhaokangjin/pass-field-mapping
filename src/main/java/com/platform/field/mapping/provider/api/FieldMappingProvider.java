package com.platform.field.mapping.provider.api;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platform.configure.base.StatusResult;
import com.platform.field.mapping.condition.FieldMappingCondition;
import com.platform.field.mapping.entity.FieldMapping;

@RestController
@RequestMapping(value = "fieldMapping")
public interface FieldMappingProvider {
	public StatusResult<Integer> bathcDeleteUpdateOrInsertByCondition(List<FieldMapping> record, FieldMappingCondition condition);

	public StatusResult<Long> countByCondition(FieldMappingCondition condition);

	public StatusResult<Integer> deleteByCondition(FieldMappingCondition condition);

	public StatusResult<Integer> insert(FieldMapping record) ;

	public StatusResult<Integer> insertSelective(FieldMapping record);

	public StatusResult<List<FieldMapping>> selectByCondition();

	public StatusResult<List<FieldMapping>> selectByCondition(FieldMappingCondition condition);

	public StatusResult<List<FieldMapping>> selectRecordsByExistsCondition(FieldMappingCondition condition, String subTable);

	public StatusResult<List<FieldMapping>> selectRecordsByInList(String fieldName, List<Object> paramList, Integer splitSize);

	public StatusResult<List<FieldMapping>> selectRecordsByNotInList(String fieldName, List<Object> paramList, Integer splitSize);

	public StatusResult<Integer> updateByCondition(FieldMapping record);

	public StatusResult<Integer> updateByExampleSelective(FieldMapping record);
}
