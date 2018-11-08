package com.platform.field.mapping.provider.api;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class BaseCondition<T> implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public BaseCondition() {
		
	}


}