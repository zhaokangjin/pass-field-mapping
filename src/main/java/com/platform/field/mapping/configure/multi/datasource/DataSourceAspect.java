package com.platform.field.mapping.configure.multi.datasource;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(-1)//在@Transactional事务标注的方法内切换数据源需要设置
@Component
public class DataSourceAspect {
	
	private static final Logger logger = LoggerFactory.getLogger(DataSourceAspect.class);
 
 
	@Before("@annotation(dataTest)")
	public void setDataSourceKey(JoinPoint point,TargetDataSource dataTest) throws Throwable{
		//根据连接点所属的类实例,动态切换数据源
		logger.info("切换数据源为:{}",dataTest.value());
		DynamicDataSource.setDataSourceType(dataTest.value());
	}
	
	@After("@annotation(dataTest)")
    public void clearDataSourceType(JoinPoint point,TargetDataSource dataTest) {  
		DynamicDataSource.clearDataSourceType();
    } 
	
}