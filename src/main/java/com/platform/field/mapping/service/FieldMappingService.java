package com.platform.field.mapping.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.alibaba.fastjson.JSON;
import com.platform.configure.base.BaseService;
import com.platform.configure.base.ConditionToExample;
import com.platform.configure.base.Status;
import com.platform.configure.base.StatusResult;

import com.platform.field.mapping.condition.FieldMappingCondition;
import com.platform.field.mapping.dao.master.FieldMappingMapper;
import com.platform.field.mapping.entity.FieldMapping;
import com.platform.field.mapping.entity.FieldMappingExample;
import com.platform.field.mapping.entity.FieldMappingExample.Criteria;
/**
 * @author kangjin.zhao@accenture
 */
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
		logger.info(Thread.currentThread().getStackTrace()[1].getClassName()+">"+Thread.currentThread().getStackTrace()[1].getMethodName()+">condition:"+JSON.toJSONString(condition)+">paramList:"+JSON.toJSONString(record));
		FieldMappingExample example=new FieldMappingExample();
		Criteria criteria=example.createCriteria();
		try {
			ConditionToExample<FieldMappingExample,FieldMappingCondition,Criteria> conditionToExample=new ConditionToExample<FieldMappingExample,FieldMappingCondition,Criteria>();
			example = conditionToExample.getExample(example, condition,criteria);
			fieldMappingMapper.bathcDeleteUpdateOrInsertByExample(record,example);
			result=new StatusResult<Integer>(Status.Success,0);
			logger.info(Thread.currentThread().getStackTrace()[1].getClassName()+">"+Thread.currentThread().getStackTrace()[1].getMethodName()+">result:"+JSON.toJSONString(result));
			return result;
		} catch (Exception e) {
			logger.error(Thread.currentThread().getStackTrace()[1].getClassName()+">"+Thread.currentThread().getStackTrace()[1].getMethodName()+">Exception:"+e);
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
		}
		return new StatusResult<Integer>(Status.Exception,-1);
	}

	@Override
	public StatusResult<List<FieldMapping>> selectRecordsByInList(String fieldName, List<Object> paramList, Integer splitSize,FieldMappingCondition condition) {
		StatusResult<List<FieldMapping>> result=null;
		logger.info(Thread.currentThread().getStackTrace()[1].getClassName()+">"+Thread.currentThread().getStackTrace()[1].getMethodName()+">condition:"+JSON.toJSONString(condition)+">paramList:"+JSON.toJSONString(paramList));
		FieldMappingExample example=new FieldMappingExample();
		Criteria criteria=example.createCriteria();
		try {
			ConditionToExample<FieldMappingExample,FieldMappingCondition,Criteria> conditionToExample=new ConditionToExample<FieldMappingExample,FieldMappingCondition,Criteria>();
			example = conditionToExample.getExample(example, condition,criteria);
			List<FieldMapping> resultList=fieldMappingMapper.selectFieldByList(fieldName,paramList,1000,example);
			result=new StatusResult<List<FieldMapping>>(Status.Success,resultList);
			logger.info(Thread.currentThread().getStackTrace()[1].getClassName()+">"+Thread.currentThread().getStackTrace()[1].getMethodName()+">result:"+JSON.toJSONString(result));
			return result;
		} catch (Exception e) {
			logger.error(Thread.currentThread().getStackTrace()[1].getClassName()+">"+Thread.currentThread().getStackTrace()[1].getMethodName()+">Exception:"+e);
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
		}
		return new StatusResult<List<FieldMapping>>(Status.Exception,null);
	}
	@Override
	public StatusResult<Long> countByExample() {
		return new StatusResult<Long>(Status.Success,-1l);
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public StatusResult<Integer> deleteByExample() {
		return new StatusResult<Integer>(Status.Success,-1);
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public StatusResult<Integer> insert(FieldMapping record) {
		return new StatusResult<Integer>(Status.Success,-1);
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public StatusResult<Integer> insertSelective(FieldMapping record) {
		return new StatusResult<Integer>(Status.Success,-1);
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
	@Transactional(rollbackFor=Exception.class)
	public StatusResult<Integer> updateByExample(FieldMapping record) {
		return new StatusResult<Integer>(Status.Success,-1);
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public StatusResult<Integer> updateByExampleSelective(FieldMapping record) {
		return new StatusResult<Integer>(Status.Success,-1);
	}

	@Override
	public StatusResult<List<FieldMapping>> selectRecordsByNotInList(String arg0, List<Object> arg1, Integer arg2, FieldMappingCondition arg3) {
		// TODO Auto-generated method stub
		return null;
	}

}
