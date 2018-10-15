package com.platform.field.mapping.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platform.field.mapping.configure.multi.datasource.DataSourceType;
import com.platform.field.mapping.configure.multi.datasource.TargetDataSource;
import com.platform.field.mapping.dao.hypotaxis.BasedataI18nMapper;
import com.platform.field.mapping.dao.hypotaxis.FieldCommontsMapper;
import com.platform.field.mapping.dao.master.FieldMappingMapper;
import com.platform.field.mapping.dao.master.TableMappingMapper;
import com.platform.field.mapping.entity.BasedataI18n;
import com.platform.field.mapping.entity.FieldCommonts;
import com.platform.field.mapping.entity.FieldMapping;
import com.platform.field.mapping.entity.FieldMappingExample;
import com.platform.field.mapping.entity.FieldMappingExample.Criteria;
import com.platform.field.mapping.entity.TableMapping;

@Service
public class FieldCommontsService {
	private final int splitSize=1000;
	@Autowired
	FieldCommontsMapper fieldCommontsMapper;
	@Autowired
	BasedataI18nMapper basedataI18nMapper;
	@Autowired
	TableMappingMapper tableMappingMapper;
	@Autowired
	FieldMappingMapper fieldMappingMapper;

	@TargetDataSource(value=DataSourceType.HYPOTAXIS)
	public List<FieldCommonts> selectFieldByList() {
		String fieldName = "field_code";
		List<String> list = new ArrayList<String>();
		list.add("sss");
		List<FieldCommonts> result = fieldCommontsMapper.selectFieldByList(fieldName, list);
		return result;
	}
	@TargetDataSource(value=DataSourceType.HYPOTAXIS)
	public List<BasedataI18n> selectSepretor() {
		List<BasedataI18n> result = basedataI18nMapper.selectSepretor();
		return result;
	}
	@TargetDataSource(value=DataSourceType.MASTER)
	public List<FieldCommonts> fieldMappingMapper() {
		List<TableMapping> resultTable = tableMappingMapper.selectAllSort();
		List<FieldMapping> resultField = fieldMappingMapper.selectAllSort();
		List<FieldCommonts> list = new ArrayList<FieldCommonts>();
		FieldCommonts com = null;
		for (int i = 0; i < resultTable.size(); i++) {
			com = new FieldCommonts();
			com.setFieldNameCn(resultTable.get(i).getTableCn());
			com.setFieldNameEn(resultTable.get(i).getTableEn());
			list.add(com);
		}
		for (int i = 0; i < resultField.size(); i++) {
			com = new FieldCommonts();
			String shortName = null;
			String longName = resultField.get(i).getFieldEn();
			String[] longArr = longName.split("_");
			if (longArr.length > 3 && longName.length() >= 30) {
				StringBuilder sb = new StringBuilder();
				for (int j = 0; j < 3; j++) {
					if(!longArr[j].equals("")) {
						sb.append("_").append(longArr[j]);
					}
				}
				shortName = sb.toString();
			} else {
				shortName = longName;
			}
			com.setFieldNameCn(resultField.get(i).getFieldCn());
			com.setFieldNameEn(shortName);
			list.add(com);
		}
		return list;
	}

	@TargetDataSource(value=DataSourceType.MASTER)
	public List<FieldMapping> getList(String fieldName,List<String> paramList) {
		FieldMappingExample example=null;
		example=new FieldMappingExample();
		Criteria criteria=example.createCriteria();
		criteria.andFieldEnEqualTo("_FIRE_RISK_EXTENSION_CLAUSEFOR");
		List<FieldMapping> resultField = fieldMappingMapper.selectFieldByList(fieldName, paramList,splitSize,example);
		return resultField;
	}
}
