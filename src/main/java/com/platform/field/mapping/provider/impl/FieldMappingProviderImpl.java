package com.platform.field.mapping.provider.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.platform.configure.base.ConditionToExample;
import com.platform.configure.base.ResultStatus;
import com.platform.configure.base.enums.Status;
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
	public ResultStatus<Integer> bathcDeleteUpdateOrInsertByCondition(List<FieldMapping> record, FieldMappingCondition condition) {
		ResultStatus<Integer> result=null;
		try {
			FieldMappingExample example=new FieldMappingExample();
			Criteria criteria=example.createCriteria();
			ConditionToExample<FieldMappingExample,FieldMappingCondition,Criteria> change=new ConditionToExample<FieldMappingExample,FieldMappingCondition,Criteria>();
			example = change.getExample(example, condition,criteria);
			//fieldMappingMapper.bathcDeleteUpdateOrInsertByExample(record,example);
			result=new ResultStatus<Integer>(Status.SUCCESS,0);
			return result;
		} catch (Exception e) {
			logger.error(Thread.currentThread().getStackTrace()[1].getClassName()+">"+Thread.currentThread().getStackTrace()[1].getMethodName()+">Exception:"+e);
		}
		return new ResultStatus<Integer>(Status.EXCEPTION,-1);
	}

	@Override
	public ResultStatus<Long> countByCondition(FieldMappingCondition condition) {
		return new ResultStatus<Long>(Status.SUCCESS,-1l);
	}

	@Override
	public ResultStatus<Integer> deleteByCondition(FieldMappingCondition condition) {
		return new ResultStatus<Integer>(Status.SUCCESS,-1);
	}

	@Override
	public ResultStatus<Integer> insert(FieldMapping record) {
		return new ResultStatus<Integer>(Status.SUCCESS,-1);
	}

	@Override
	public ResultStatus<Integer> insertSelective(FieldMapping record) {
		return new ResultStatus<Integer>(Status.SUCCESS,-1);
	}

	@Override
	public ResultStatus<List<FieldMapping>> selectByCondition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultStatus<List<FieldMapping>> selectByCondition(FieldMappingCondition condition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultStatus<List<FieldMapping>> selectRecordsByExistsCondition(FieldMappingCondition condition, String subTable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultStatus<List<FieldMapping>> selectRecordsByInList(String fieldName, List<Object> paramList, Integer splitSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultStatus<List<FieldMapping>> selectRecordsByNotInList(String fieldName, List<Object> paramList, Integer splitSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultStatus<Integer> updateByCondition(FieldMapping record) {
		return new ResultStatus<Integer>(Status.SUCCESS,-1);
	}

	@Override
	public ResultStatus<Integer> updateByExampleSelective(FieldMapping record) {
		return new ResultStatus<Integer>(Status.SUCCESS,-1);
	}
}
