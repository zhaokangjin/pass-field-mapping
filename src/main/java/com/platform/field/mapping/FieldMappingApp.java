package com.platform.field.mapping;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.platform.field.mapping.dao")
@EnableCaching
@ComponentScan("com.platform.field.mapping.configure")
public class FieldMappingApp {
	public static void main(String[] args) {
		SpringApplication.run(FieldMappingApp.class, args);
	}
}
