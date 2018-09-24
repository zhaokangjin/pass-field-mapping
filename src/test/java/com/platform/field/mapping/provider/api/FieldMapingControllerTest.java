package com.platform.field.mapping.provider.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.platform.field.mapping.FieldMappingApp;
import com.platform.field.mapping.entity.BasedataI18n;
import com.platform.field.mapping.entity.FieldCommonts;

@RunWith(SpringJUnit4ClassRunner.class) // SpringJUnit支持，由此引入Spring-Test框架支持！
@SpringBootTest(classes = FieldMappingApp.class)
public class FieldMapingControllerTest {
	@Autowired
	FieldMapingController fieldMapingController;

	@Test
	public void test() {
		List<FieldCommonts> list = fieldMapingController.fieldCommontsMapper();
		System.err.println(JSON.toJSON(list));
	}

	@Test
	public void testSelectSepretor() {
		List<BasedataI18n> list = fieldMapingController.selectSepretor();
/*		List<BasedataI18n> lists =new ArrayList<BasedataI18n>();
		
		for(int i=0;i<list.size();i++) {
			list.get(i).setCn(list.get(i).getCn().replaceAll("[0-9 -]", ""));
		}
		System.err.println("selectSepretor:" + JSON.toJSON(list));*/
		
		
		List<String> newList = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			// 放线,_THROW_LINErin
			String en=null;
			if(list.get(i).getType().equals("university")||list.get(i).getType().equals("project")) {
				en = list.get(i).getNick();
			}else {
				en = list.get(i).getEn();
			}
			String newEn = (en.replaceAll("[^a-zA-Z ]", "")).replaceAll("[ ]+", " ");
			String[] enArr=newEn.split(" ");
			StringBuilder sb=new StringBuilder();
			sb.append("");
			String temp="";
			for(int k=0;k<enArr.length;k++) {
				if(enArr[0].length()==1) {
					enArr[0]=enArr[0]+"T";
				}
				if(k<=5) {
					temp=temp+enArr[k];
					if(k+temp.length()<=30) {
						sb.append("_").append(enArr[k].toUpperCase());
					}
				}
			}
			String outLine = list.get(i).getCn().trim() + "ζ" + sb.toString().trim();
			newList.add(outLine);
		}
		System.err.println("selectSepretor:" + JSON.toJSON(newList));
	}
	
	@Test
	public void testFieldMapping() {
		List<FieldCommonts> list = fieldMapingController.fieldMapping();
		
		System.err.println("selectSepretor:" + JSON.toJSON(list));
	}
	public static void main(String[] args) {
		String en="Beijing General Engineering Design & Research Institute ";
		String newEn = (en.replaceAll("[^a-zA-Z ]", "")).replaceAll("[ ]+", " ");
		String[] enArr=newEn.split(" ");
		StringBuilder sb=new StringBuilder();
		sb.append("");
		String temp="";
		for(int k=0;k<enArr.length;k++) {
			if(enArr[0].length()==1) {
				enArr[0]=enArr[0]+"T";
			}
			if(k<=5) {
				temp=temp+enArr[k];
				if(k+temp.length()<=32) {
					sb.append("_").append(enArr[k].toUpperCase());
				}
			}
		}
		String outLine =  sb.toString();
		System.err.println(outLine);
	}
}
