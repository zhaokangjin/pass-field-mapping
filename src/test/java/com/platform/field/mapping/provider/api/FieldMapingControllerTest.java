package com.platform.field.mapping.provider.api;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.platform.field.mapping.FieldMappingApp;
import com.platform.field.mapping.entity.FieldCommonts;

@RunWith(SpringJUnit4ClassRunner.class) // SpringJUnit支持，由此引入Spring-Test框架支持！
@SpringBootTest(classes=FieldMappingApp.class)
public class FieldMapingControllerTest {
	@Autowired
	FieldMapingController fieldMapingController;

	@Test
	public void test() {
		List<FieldCommonts> list = fieldMapingController.fieldCommontsMapper();
		System.err.println(JSON.toJSON(list));
	}

}
