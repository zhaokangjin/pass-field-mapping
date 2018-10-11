package com.platform.field.mapping.entity;

import com.platform.configure.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public class FieldName extends BaseEntity implements Serializable {
    // tpl_field_name.FIELDID
    private String fieldid;

    // tpl_field_name.FIELD_CN
    private String fieldCn;

    // tpl_field_name.FIELD_EN
    private String fieldEn;

    // tpl_field_name.CREATED_TIME
    private Date createdTime;

    // tpl_field_name.LAST_UPDATED_DATETIME
    private Date lastUpdatedDatetime;

    // tpl_field_name.DELETE_FLAG
    private String deleteFlag;

    //tpl_field_name
    private static final long serialVersionUID = 1L;

    public String getFieldid() {
        return fieldid;
    }

    public void setFieldid(String fieldid) {
        this.fieldid = fieldid == null ? null : fieldid.trim();
    }

    public String getFieldCn() {
        return fieldCn;
    }

    public void setFieldCn(String fieldCn) {
        this.fieldCn = fieldCn == null ? null : fieldCn.trim();
    }

    public String getFieldEn() {
        return fieldEn;
    }

    public void setFieldEn(String fieldEn) {
        this.fieldEn = fieldEn == null ? null : fieldEn.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getLastUpdatedDatetime() {
        return lastUpdatedDatetime;
    }

    public void setLastUpdatedDatetime(Date lastUpdatedDatetime) {
        this.lastUpdatedDatetime = lastUpdatedDatetime;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        FieldName other = (FieldName) that;
        return (this.getFieldid() == null ? other.getFieldid() == null : this.getFieldid().equals(other.getFieldid()))
            && (this.getFieldCn() == null ? other.getFieldCn() == null : this.getFieldCn().equals(other.getFieldCn()))
            && (this.getFieldEn() == null ? other.getFieldEn() == null : this.getFieldEn().equals(other.getFieldEn()))
            && (this.getLastUpdatedBy() == null ? other.getLastUpdatedBy() == null : this.getLastUpdatedBy().equals(other.getLastUpdatedBy()))
            && (this.getCreatedBy() == null ? other.getCreatedBy() == null : this.getCreatedBy().equals(other.getCreatedBy()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getLastUpdatedDatetime() == null ? other.getLastUpdatedDatetime() == null : this.getLastUpdatedDatetime().equals(other.getLastUpdatedDatetime()))
            && (this.getDeleteFlag() == null ? other.getDeleteFlag() == null : this.getDeleteFlag().equals(other.getDeleteFlag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFieldid() == null) ? 0 : getFieldid().hashCode());
        result = prime * result + ((getFieldCn() == null) ? 0 : getFieldCn().hashCode());
        result = prime * result + ((getFieldEn() == null) ? 0 : getFieldEn().hashCode());
        result = prime * result + ((getLastUpdatedBy() == null) ? 0 : getLastUpdatedBy().hashCode());
        result = prime * result + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        result = prime * result + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        result = prime * result + ((getLastUpdatedDatetime() == null) ? 0 : getLastUpdatedDatetime().hashCode());
        result = prime * result + ((getDeleteFlag() == null) ? 0 : getDeleteFlag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fieldid=").append(fieldid);
        sb.append(", fieldCn=").append(fieldCn);
        sb.append(", fieldEn=").append(fieldEn);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", lastUpdatedDatetime=").append(lastUpdatedDatetime);
        sb.append(", deleteFlag=").append(deleteFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}