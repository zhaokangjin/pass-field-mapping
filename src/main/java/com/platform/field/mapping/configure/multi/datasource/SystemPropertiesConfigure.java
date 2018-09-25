package com.platform.field.mapping.configure.multi.datasource;
import java.io.Serializable;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
/**
 * 系统配置
 * @ClassName: SystemPropertiesConfigure   
 * @Description: 环境变量配置  
 * @author: Administrator  
 * @date:2018年8月23日 上午12:36:59
 */
@Component  
@ConfigurationProperties(prefix="spring") 
public class SystemPropertiesConfigure implements Serializable{
	private static final long serialVersionUID = 4170140471320327958L;
	private MultiConfigure datasource;
	public MultiConfigure getDatasource() {
		return datasource;
	}
	public void setDatasource(MultiConfigure datasource) {
		this.datasource = datasource;
	}
 
}