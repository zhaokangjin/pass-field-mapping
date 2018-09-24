package com.platform.field.mapping.configure.multi.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicDataSource extends AbstractRoutingDataSource {
	
	private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();
 
 
	@Override
	protected Object determineCurrentLookupKey() {
		return getDataSourceType();
	}
	
	public static void setDataSourceType(String dataSourceType) {
        contextHolder.set(dataSourceType);
    }
 
 
    public static String getDataSourceType() {
        return contextHolder.get();
    }
 
 
    public static void clearDataSourceType() {
        contextHolder.remove();
    }
 
 
}