package com.platform.field.mapping.condition;

import java.io.Serializable;
import java.util.Date;

import com.platform.configure.condition.Conditions;

public class FieldMappingCondition implements Serializable{
	private static final long serialVersionUID = 1L;

	// tpl_field_mapping.FIELDID
    private Conditions<String> fieldid;

    // tpl_field_mapping.FIELD_CN
    private Conditions<String> fieldCn;

    // tpl_field_mapping.FIELD_EN
    private Conditions<String> fieldEn;

    // tpl_field_mapping.EVENTUALLY_UPDATE_PEOPLE
    private Conditions<String> eventuallyUpdatePeople;

    // tpl_field_mapping.CREATOR
    private Conditions<String> creator;

    // tpl_field_mapping.CREATECREATION_TIME
    private Conditions<Date> createcreationTime;

    // tpl_field_mapping.EVENTUALLY_UPDATE_TIME
    private Conditions<Date> eventuallyUpdateTime;

    // tpl_field_mapping.DELETE_FLAG
    private Conditions<String> deleteFlag;
	public void setFieldid(Conditions<String> fieldid) {
		this.fieldid = fieldid;
	}

	public void setFieldCn(Conditions<String> fieldCn) {
		this.fieldCn = fieldCn;
	}

	public void setFieldEn(Conditions<String> fieldEn) {
		this.fieldEn = fieldEn;
	}

	public void setEventuallyUpdatePeople(Conditions<String> eventuallyUpdatePeople) {
		this.eventuallyUpdatePeople = eventuallyUpdatePeople;
	}

	public void setCreator(Conditions<String> creator) {
		this.creator = creator;
	}

	public void setCreatecreationTime(Conditions<Date> createcreationTime) {
		this.createcreationTime = createcreationTime;
	}

	public void setEventuallyUpdateTime(Conditions<Date> eventuallyUpdateTime) {
		this.eventuallyUpdateTime = eventuallyUpdateTime;
	}

	public void setDeleteFlag(Conditions<String> deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
    
	public Conditions<String> getFieldid() {
		return fieldid;
	}

	public Conditions<String> getFieldCn() {
		return fieldCn;
	}

	public Conditions<String> getFieldEn() {
		return fieldEn;
	}

	public Conditions<String> getEventuallyUpdatePeople() {
		return eventuallyUpdatePeople;
	}

	public Conditions<String> getCreator() {
		return creator;
	}

	public Conditions<Date> getCreatecreationTime() {
		return createcreationTime;
	}

	public Conditions<Date> getEventuallyUpdateTime() {
		return eventuallyUpdateTime;
	}

	public Conditions<String> getDeleteFlag() {
		return deleteFlag;
	}
}
