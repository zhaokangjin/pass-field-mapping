package com.platform.field.mapping.entity;

import com.platform.mybatis.plugin.common.base.BaseEntity;
import java.io.Serializable;

public class PlatformFields extends BaseEntity implements Serializable {
    // PLATFORM_FIELDS.ID
    private String id;

    // PLATFORM_FIELDS.FIELD_NAME_CN
    private String fieldNameCn;

    // PLATFORM_FIELDS.TYPE
    private String type;

    // PLATFORM_FIELDS.FIELD_NAME_EN
    private String fieldNameEn;

    //PLATFORM_FIELDS
    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFieldNameCn() {
        return fieldNameCn;
    }

    public void setFieldNameCn(String fieldNameCn) {
        this.fieldNameCn = fieldNameCn == null ? null : fieldNameCn.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getFieldNameEn() {
        return fieldNameEn;
    }

    public void setFieldNameEn(String fieldNameEn) {
        this.fieldNameEn = fieldNameEn == null ? null : fieldNameEn.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", fieldNameCn=").append(fieldNameCn);
        sb.append(", type=").append(type);
        sb.append(", fieldNameEn=").append(fieldNameEn);
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
        PlatformFields other = (PlatformFields) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFieldNameCn() == null ? other.getFieldNameCn() == null : this.getFieldNameCn().equals(other.getFieldNameCn()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getFieldNameEn() == null ? other.getFieldNameEn() == null : this.getFieldNameEn().equals(other.getFieldNameEn()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFieldNameCn() == null) ? 0 : getFieldNameCn().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getFieldNameEn() == null) ? 0 : getFieldNameEn().hashCode());
        return result;
    }
}