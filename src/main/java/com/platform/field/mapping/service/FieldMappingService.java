package com.platform.field.mapping.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.platform.configure.base.BaseService;
import com.platform.configure.base.ConditionToExample;
import com.platform.configure.base.StatusResult;
import com.platform.field.mapping.condition.FieldMappingCondition;
import com.platform.field.mapping.dao.master.FieldMappingMapper;
import com.platform.field.mapping.entity.FieldMapping;
import com.platform.field.mapping.entity.FieldMappingExample;
import com.platform.field.mapping.entity.FieldMappingExample.Criteria;

@Service
@Transactional
public class FieldMappingService implements BaseService<FieldMapping, FieldMappingCondition>{
	private Logger logger =LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	FieldMappingMapper fieldMappingMapper;
	

	@Override
	@Transactional(rollbackFor=Exception.class)
	public StatusResult<Integer> bathcDeleteUpdateOrInsertByExample(List<FieldMapping> record, FieldMappingCondition condition) {
		StatusResult<Integer> result=null;
		try {
			FieldMappingExample example=new FieldMappingExample();
			Criteria criteria=example.createCriteria();
			ConditionToExample<FieldMappingExample,FieldMappingCondition,Criteria> change=new ConditionToExample<FieldMappingExample,FieldMappingCondition,Criteria>();
			example = change.getExample(example, condition,criteria);
			//fieldMappingMapper.bathcDeleteUpdateOrInsertByExample(record,example);
			result=new StatusResult<Integer>(200,0);
			return result;
		} catch (Exception e) {
			logger.error(Thread.currentThread().getStackTrace()[1].getClassName()+">"+Thread.currentThread().getStackTrace()[1].getMethodName()+">Exception:"+e);
		}
		return new StatusResult<Integer>(500,-1);
	}

	@Override
	public StatusResult<Long> countByExample() {
		return new StatusResult<Long>(200,-1l);
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public StatusResult<Integer> deleteByExample() {
		return new StatusResult<Integer>(200,-1);
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public StatusResult<Integer> insert(FieldMapping record) {
		return new StatusResult<Integer>(200,-1);
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public StatusResult<Integer> insertSelective(FieldMapping record) {
		return new StatusResult<Integer>(200,-1);
	}

	@Override
	public StatusResult<List<FieldMapping>> selectByExample() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StatusResult<List<FieldMapping>> selectByExample(FieldMappingCondition condition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StatusResult<List<FieldMapping>> selectRecordsByExists(FieldMappingCondition condition, String subTable) {
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
	@Transactional(rollbackFor=Exception.class)
	public StatusResult<Integer> updateByExample(FieldMapping record) {
		return new StatusResult<Integer>(200,-1);
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public StatusResult<Integer> updateByExampleSelective(FieldMapping record) {
		return new StatusResult<Integer>(200,-1);
	}

}
