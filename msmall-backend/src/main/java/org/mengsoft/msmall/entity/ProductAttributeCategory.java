package org.mengsoft.msmall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 产品属性分类表
 * @TableName product_attribute_category
 */
@TableName(value ="product_attribute_category")
public class ProductAttributeCategory implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 
     */
    @TableField(value = "name")
    private String name;

    /**
     * 属性数量
     */
    @TableField(value = "attribute_count")
    private Integer attributeCount;

    /**
     * 参数数量
     */
    @TableField(value = "param_count")
    private Integer paramCount;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 属性数量
     */
    public Integer getAttributeCount() {
        return attributeCount;
    }

    /**
     * 属性数量
     */
    public void setAttributeCount(Integer attributeCount) {
        this.attributeCount = attributeCount;
    }

    /**
     * 参数数量
     */
    public Integer getParamCount() {
        return paramCount;
    }

    /**
     * 参数数量
     */
    public void setParamCount(Integer paramCount) {
        this.paramCount = paramCount;
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
        ProductAttributeCategory other = (ProductAttributeCategory) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAttributeCount() == null ? other.getAttributeCount() == null : this.getAttributeCount().equals(other.getAttributeCount()))
            && (this.getParamCount() == null ? other.getParamCount() == null : this.getParamCount().equals(other.getParamCount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAttributeCount() == null) ? 0 : getAttributeCount().hashCode());
        result = prime * result + ((getParamCount() == null) ? 0 : getParamCount().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", attributeCount=").append(attributeCount);
        sb.append(", paramCount=").append(paramCount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}