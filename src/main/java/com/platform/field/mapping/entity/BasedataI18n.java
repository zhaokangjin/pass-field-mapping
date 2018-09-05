package com.platform.field.mapping.entity;

import com.platform.mybatis.plugin.common.base.BaseEntity;
import java.io.Serializable;

public class BasedataI18n extends BaseEntity implements Serializable {
    // basedata_i18n.ID
    private String id;

    // basedata_i18n.CN
    private String cn;

    // basedata_i18n.TYPE
    private String type;

    // basedata_i18n.NICK
    private String nick;

    // basedata_i18n.EN
    private String en;

    //basedata_i18n
    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn == null ? null : cn.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick == null ? null : nick.trim();
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en == null ? null : en.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cn=").append(cn);
        sb.append(", type=").append(type);
        sb.append(", nick=").append(nick);
        sb.append(", en=").append(en);
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
        BasedataI18n other = (BasedataI18n) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCn() == null ? other.getCn() == null : this.getCn().equals(other.getCn()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getNick() == null ? other.getNick() == null : this.getNick().equals(other.getNick()))
            && (this.getEn() == null ? other.getEn() == null : this.getEn().equals(other.getEn()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCn() == null) ? 0 : getCn().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getNick() == null) ? 0 : getNick().hashCode());
        result = prime * result + ((getEn() == null) ? 0 : getEn().hashCode());
        return result;
    }
}