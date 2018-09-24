package com.platform.field.mapping.entity;

import com.platform.mybatis.plugin.common.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public class TableMapping extends BaseEntity implements Serializable {
    // tpl_table_mapping.TABLE_NAMEID
    private String tableNameid;

    // tpl_table_mapping.TABLE_CN
    private String tableCn;

    // tpl_table_mapping.TABLE_EN
    private String tableEn;

    // tpl_table_mapping.LAST_UPDATE_BY
    private String lastUpdateBy;

    // tpl_table_mapping.LAST_UPDATED_TIME
    private Date lastUpdatedTime;

    // tpl_table_mapping.CREATOR
    private String creator;

    // tpl_table_mapping.CREATECREATION_TIME
    private Date createcreationTime;

    // tpl_table_mapping.DELETE_FLAG
    private String deleteFlag;

    // tpl_table_mapping.TYPE
    private String type;

    // tpl_table_mapping.comments
    private String comments;

    //tpl_table_mapping
    private static final long serialVersionUID = 1L;

    public String getTableNameid() {
        return tableNameid;
    }

    public void setTableNameid(String tableNameid) {
        this.tableNameid = tableNameid == null ? null : tableNameid.trim();
    }

    public String getTableCn() {
        return tableCn;
    }

    public void setTableCn(String tableCn) {
        this.tableCn = tableCn == null ? null : tableCn.trim();
    }

    public String getTableEn() {
        return tableEn;
    }

    public void setTableEn(String tableEn) {
        this.tableEn = tableEn == null ? null : tableEn.trim();
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy == null ? null : lastUpdateBy.trim();
    }

    public Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getCreatecreationTime() {
        return createcreationTime;
    }

    public void setCreatecreationTime(Date createcreationTime) {
        this.createcreationTime = createcreationTime;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tableNameid=").append(tableNameid);
        sb.append(", tableCn=").append(tableCn);
        sb.append(", tableEn=").append(tableEn);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", lastUpdatedTime=").append(lastUpdatedTime);
        sb.append(", creator=").append(creator);
        sb.append(", createcreationTime=").append(createcreationTime);
        sb.append(", deleteFlag=").append(deleteFlag);
        sb.append(", type=").append(type);
        sb.append(", comments=").append(comments);
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
        TableMapping other = (TableMapping) that;
        return (this.getTableNameid() == null ? other.getTableNameid() == null : this.getTableNameid().equals(other.getTableNameid()))
            && (this.getTableCn() == null ? other.getTableCn() == null : this.getTableCn().equals(other.getTableCn()))
            && (this.getTableEn() == null ? other.getTableEn() == null : this.getTableEn().equals(other.getTableEn()))
            && (this.getLastUpdateBy() == null ? other.getLastUpdateBy() == null : this.getLastUpdateBy().equals(other.getLastUpdateBy()))
            && (this.getLastUpdatedTime() == null ? other.getLastUpdatedTime() == null : this.getLastUpdatedTime().equals(other.getLastUpdatedTime()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getCreatecreationTime() == null ? other.getCreatecreationTime() == null : this.getCreatecreationTime().equals(other.getCreatecreationTime()))
            && (this.getDeleteFlag() == null ? other.getDeleteFlag() == null : this.getDeleteFlag().equals(other.getDeleteFlag()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getComments() == null ? other.getComments() == null : this.getComments().equals(other.getComments()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTableNameid() == null) ? 0 : getTableNameid().hashCode());
        result = prime * result + ((getTableCn() == null) ? 0 : getTableCn().hashCode());
        result = prime * result + ((getTableEn() == null) ? 0 : getTableEn().hashCode());
        result = prime * result + ((getLastUpdateBy() == null) ? 0 : getLastUpdateBy().hashCode());
        result = prime * result + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCreatecreationTime() == null) ? 0 : getCreatecreationTime().hashCode());
        result = prime * result + ((getDeleteFlag() == null) ? 0 : getDeleteFlag().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getComments() == null) ? 0 : getComments().hashCode());
        return result;
    }
}