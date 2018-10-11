package com.platform.field.mapping;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.platform.field.mapping.configure.multi.datasource.DynamicDataSourceRegister;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.platform.field.mapping.dao.**")
//@EnableCaching
@Import(DynamicDataSourceRegister.class)
public class FieldMappingApp{
	public static void main(String[] args) {
		SpringApplication.run(FieldMappingApp.class, args);
	}
}
