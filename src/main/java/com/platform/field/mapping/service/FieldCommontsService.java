package com.platform.field.mapping.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platform.field.mapping.dao.FieldCommontsMapper;
import com.platform.field.mapping.entity.FieldCommonts;

@Service
public class FieldCommontsService {
	@Autowired
	FieldCommontsMapper fieldCommontsMapper;

	public List<FieldCommonts> selectFieldByList() {
		String fieldName = "field_code";
		List<String> list = new ArrayList<String>();
		list.add("sss");
		List<FieldCommonts> result = fieldCommontsMapper.selectFieldByList(fieldName, list);
		return result;
	}
}
