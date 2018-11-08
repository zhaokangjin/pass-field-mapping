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
import com.platform.configure.base.ResultStatus;
import com.platform.configure.base.enums.Status;
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
	public ResultStatus<Integer> bathcDeleteUpdateOrInsertByExample(List<FieldMapping> record, FieldMappingCondition condition) {
		ResultStatus<Integer> result=null;
		logger.info(Thread.currentThread().getStackTrace()[1].getClassName()+">"+Thread.currentThread().getStackTrace()[1].getMethodName()+">condition:"+JSON.toJSONString(condition)+">paramList:"+JSON.toJSONString(record));
		FieldMappingExample example=new FieldMappingExample();
		Criteria criteria=example.createCriteria();
		try {
			ConditionToExample<FieldMappingExample,FieldMappingCondition,Criteria> conditionToExample=new ConditionToExample<FieldMappingExample,FieldMappingCondition,Criteria>();
			example = conditionToExample.getExample(example, condition,criteria);
			fieldMappingMapper.bathcDeleteUpdateOrInsertByExample(record,example);
			result=new ResultStatus<Integer>(Status.SUCCESS,0);
			logger.info(Thread.currentThread().getStackTrace()[1].getClassName()+">"+Thread.currentThread().getStackTrace()[1].getMethodName()+">result:"+JSON.toJSONString(result));
			return result;
		} catch (Exception e) {
			logger.error(Thread.currentThread().getStackTrace()[1].getClassName()+">"+Thread.currentThread().getStackTrace()[1].getMethodName()+">Exception:"+e);
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
		}
		return new ResultStatus<Integer>(Status.EXCEPTION,-1);
	}

	@Override
	public ResultStatus<List<FieldMapping>> selectRecordsByInList(String fieldName, List<Object> paramList, Integer splitSize,FieldMappingCondition condition) {
		ResultStatus<List<FieldMapping>> result=null;
		logger.info(Thread.currentThread().getStackTrace()[1].getClassName()+">"+Thread.currentThread().getStackTrace()[1].getMethodName()+">condition:"+JSON.toJSONString(condition)+">paramList:"+JSON.toJSONString(paramList));
		FieldMappingExample example=new FieldMappingExample();
		Criteria criteria=example.createCriteria();
		try {
			ConditionToExample<FieldMappingExample,FieldMappingCondition,Criteria> conditionToExample=new ConditionToExample<FieldMappingExample,FieldMappingCondition,Criteria>();
			example = conditionToExample.getExample(example, condition,criteria);
			List<FieldMapping> resultList=fieldMappingMapper.selectFieldByList(fieldName,paramList,1000,example);
			result=new ResultStatus<List<FieldMapping>>(Status.SUCCESS,resultList);
			logger.info(Thread.currentThread().getStackTrace()[1].getClassName()+">"+Thread.currentThread().getStackTrace()[1].getMethodName()+">result:"+JSON.toJSONString(result));
			return result;
		} catch (Exception e) {
			logger.error(Thread.currentThread().getStackTrace()[1].getClassName()+">"+Thread.currentThread().getStackTrace()[1].getMethodName()+">Exception:"+e);
		}
		return new ResultStatus<List<FieldMapping>>(Status.EXCEPTION,null);
	}
	@Override
	public ResultStatus<Long> countByExample() {
		return new ResultStatus<Long>(Status.SUCCESS,-1l);
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public ResultStatus<Integer> deleteByExample() {
		return new ResultStatus<Integer>(Status.SUCCESS,-1);
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public ResultStatus<Integer> insert(FieldMapping record) {
		return new ResultStatus<Integer>(Status.SUCCESS,-1);
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public ResultStatus<Integer> insertSelective(FieldMapping record) {
		return new ResultStatus<Integer>(Status.SUCCESS,-1);
	}

	@Override
	public ResultStatus<List<FieldMapping>> selectByExample() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultStatus<List<FieldMapping>> selectByExample(FieldMappingCondition condition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultStatus<List<FieldMapping>> selectRecordsByExists(FieldMappingCondition condition, String subTable) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	@Transactional(rollbackFor=Exception.class)
	public ResultStatus<Integer> updateByExample(FieldMapping record) {
		return new ResultStatus<Integer>(Status.SUCCESS,-1);
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public ResultStatus<Integer> updateByExampleSelective(FieldMapping record) {
		return new ResultStatus<Integer>(Status.SUCCESS,-1);
	}

	@Override
	public ResultStatus<List<FieldMapping>> selectRecordsByNotInList(String arg0, List<Object> arg1, Integer arg2, FieldMappingCondition arg3) {
		// TODO Auto-generated method stub
		return null;
	}

}
