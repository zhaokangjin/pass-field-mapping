package com.platform.field.mapping.entity;

import java.io.Serializable;
import java.util.Date;

import com.platform.configure.base.BaseEntity;

public class FieldCommonts extends BaseEntity implements Serializable {
    // field_commonts.field_id
    private String fieldId;

    // field_commonts.field_name_cn
    private String fieldNameCn;

    // field_commonts.field_code
    private String fieldCode;

    // field_commonts.field_name_en
    private String fieldNameEn;

    // field_commonts.createDate
    private Date createdate;

    // field_commonts.createBy
    private String createby;

    // field_commonts.updateDate
    private Date updatedate;

    // field_commonts.updateBy
    private String updateby;

    // field_commonts.field_type
    private String fieldType;

    //field_commonts
    private static final long serialVersionUID = 1L;

    public String getFieldId() {
        return fieldId;
    }

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId == null ? null : fieldId.trim();
    }

    public String getFieldNameCn() {
        return fieldNameCn;
    }

    public void setFieldNameCn(String fieldNameCn) {
        this.fieldNameCn = fieldNameCn == null ? null : fieldNameCn.trim();
    }

    public String getFieldCode() {
        return fieldCode;
    }

    public void setFieldCode(String fieldCode) {
        this.fieldCode = fieldCode == null ? null : fieldCode.trim();
    }

    public String getFieldNameEn() {
        return fieldNameEn;
    }

    public void setFieldNameEn(String fieldNameEn) {
        this.fieldNameEn = fieldNameEn == null ? null : fieldNameEn.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType == null ? null : fieldType.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fieldId=").append(fieldId);
        sb.append(", fieldNameCn=").append(fieldNameCn);
        sb.append(", fieldCode=").append(fieldCode);
        sb.append(", fieldNameEn=").append(fieldNameEn);
        sb.append(", createdate=").append(createdate);
        sb.append(", createby=").append(createby);
        sb.append(", updatedate=").append(updatedate);
        sb.append(", updateby=").append(updateby);
        sb.append(", fieldType=").append(fieldType);
        sb.append("]");
        return sb.toString();
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
        FieldCommonts other = (FieldCommonts) that;
        return (this.getFieldId() == null ? other.getFieldId() == null : this.getFieldId().equals(other.getFieldId()))
            && (this.getFieldNameCn() == null ? other.getFieldNameCn() == null : this.getFieldNameCn().equals(other.getFieldNameCn()))
            && (this.getFieldCode() == null ? other.getFieldCode() == null : this.getFieldCode().equals(other.getFieldCode()))
            && (this.getFieldNameEn() == null ? other.getFieldNameEn() == null : this.getFieldNameEn().equals(other.getFieldNameEn()))
            && (this.getCreatedate() == null ? other.getCreatedate() == null : this.getCreatedate().equals(other.getCreatedate()))
            && (this.getCreateby() == null ? other.getCreateby() == null : this.getCreateby().equals(other.getCreateby()))
            && (this.getUpdatedate() == null ? other.getUpdatedate() == null : this.getUpdatedate().equals(other.getUpdatedate()))
            && (this.getUpdateby() == null ? other.getUpdateby() == null : this.getUpdateby().equals(other.getUpdateby()))
            && (this.getFieldType() == null ? other.getFieldType() == null : this.getFieldType().equals(other.getFieldType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFieldId() == null) ? 0 : getFieldId().hashCode());
        result = prime * result + ((getFieldNameCn() == null) ? 0 : getFieldNameCn().hashCode());
        result = prime * result + ((getFieldCode() == null) ? 0 : getFieldCode().hashCode());
        result = prime * result + ((getFieldNameEn() == null) ? 0 : getFieldNameEn().hashCode());
        result = prime * result + ((getCreatedate() == null) ? 0 : getCreatedate().hashCode());
        result = prime * result + ((getCreateby() == null) ? 0 : getCreateby().hashCode());
        result = prime * result + ((getUpdatedate() == null) ? 0 : getUpdatedate().hashCode());
        result = prime * result + ((getUpdateby() == null) ? 0 : getUpdateby().hashCode());
        result = prime * result + ((getFieldType() == null) ? 0 : getFieldType().hashCode());
        return result;
    }
}