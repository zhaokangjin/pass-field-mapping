package com.platform.field.mapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platform.field.mapping.dao.BasedataI18nMapper;
import com.platform.field.mapping.dao.FieldCommontsMapper;
import com.platform.field.mapping.entity.FieldCommonts;
import com.platform.field.mapping.entity.FieldCommontsExample;
import com.platform.field.mapping.entity.FieldCommontsExample.Criteria;

@Service
public class FieldMapingService {
		@Autowired
		FieldCommontsMapper fieldCommontsMapper;
		@Autowired
		BasedataI18nMapper basedataI18nMapper;
		
		public int batchUpdateBySingleExample() {
			FieldCommontsExample example=new FieldCommontsExample();
			Criteria cri=example.createCriteria();
			cri.andFieldCodeEqualTo("sss");
			List<FieldCommonts> list=fieldCommontsMapper.selectByExample(example);
			list.forEach((item)->{
				item.setLastUpdatedBy("kangjin.zhao");
			});
			return fieldCommontsMapper.batchUpdateByPrimaryKeySelective(list, example);
		}
}
