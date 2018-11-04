package com.platform.field.mapping.provider.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.platform.configure.base.ConditionToExample;
import com.platform.configure.base.Status;
import com.platform.configure.base.StatusResult;
import com.platform.field.mapping.condition.FieldMappingCondition;
import com.platform.field.mapping.entity.FieldMapping;
import com.platform.field.mapping.entity.FieldMappingExample;
import com.platform.field.mapping.entity.FieldMappingExample.Criteria;
import com.platform.field.mapping.provider.api.FieldMappingProvider;
import com.platform.field.mapping.service.FieldMappingService;


public class FieldMappingProviderImpl implements FieldMappingProvider{
	private Logger logger =LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	FieldMappingService fieldMappingService;
	

	@Override
	public StatusResult<Integer> bathcDeleteUpdateOrInsertByCondition(List<FieldMapping> record, FieldMappingCondition condition) {
		StatusResult<Integer> result=null;
		try {
			FieldMappingExample example=new FieldMappingExample();
			Criteria criteria=example.createCriteria();
			ConditionToExample<FieldMappingExample,FieldMappingCondition,Criteria> change=new ConditionToExample<FieldMappingExample,FieldMappingCondition,Criteria>();
			example = change.getExample(example, condition,criteria);
			//fieldMappingMapper.bathcDeleteUpdateOrInsertByExample(record,example);
			result=new StatusResult<Integer>(Status.Success,0);
			return result;
		} catch (Exception e) {
			logger.error(Thread.currentThread().getStackTrace()[1].getClassName()+">"+Thread.currentThread().getStackTrace()[1].getMethodName()+">Exception:"+e);
		}
		return new StatusResult<Integer>(Status.Exception,-1);
	}

	@Override
	public StatusResult<Long> countByCondition(FieldMappingCondition condition) {
		return new StatusResult<Long>(Status.Success,-1l);
	}

	@Override
	public StatusResult<Integer> deleteByCondition(FieldMappingCondition condition) {
		return new StatusResult<Integer>(Status.Success,-1);
	}

	@Override
	public StatusResult<Integer> insert(FieldMapping record) {
		return new StatusResult<Integer>(Status.Success,-1);
	}

	@Override
	public StatusResult<Integer> insertSelective(FieldMapping record) {
		return new StatusResult<Integer>(Status.Success,-1);
	}

	@Override
	public StatusResult<List<FieldMapping>> selectByCondition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StatusResult<List<FieldMapping>> selectByCondition(FieldMappingCondition condition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StatusResult<List<FieldMapping>> selectRecordsByExistsCondition(FieldMappingCondition condition, String subTable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StatusResult<List<FieldMapping>> selectRecordsByInList(String fieldName, List<Object> paramList, Integer splitSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StatusResult<List<FieldMapping>> selectRecordsByNotInList(String fieldName, List<Object> paramList, Integer splitSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StatusResult<Integer> updateByCondition(FieldMapping record) {
		return new StatusResult<Integer>(Status.Success,-1);
	}

	@Override
	public StatusResult<Integer> updateByExampleSelective(FieldMapping record) {
		return new StatusResult<Integer>(Status.Success,-1);
	}
}
