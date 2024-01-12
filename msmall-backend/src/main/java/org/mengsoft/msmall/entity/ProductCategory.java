package org.mengsoft.msmall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 产品分类
 * @TableName product_category
 */
@TableName(value ="product_category")
public class ProductCategory implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 上机分类的编号：0表示一级分类
     */
    @TableField(value = "parent_id")
    private Long parentId;

    /**
     * 
     */
    @TableField(value = "name")
    private String name;

    /**
     * 分类级别：0->1级；1->2级
     */
    @TableField(value = "level")
    private Integer level;

    /**
     * 
     */
    @TableField(value = "product_count")
    private Integer productCount;

    /**
     * 
     */
    @TableField(value = "product_unit")
    private String productUnit;

    /**
     * 是否显示在导航栏：0->不显示；1->显示
     */
    @TableField(value = "nav_status")
    private Integer navStatus;

    /**
     * 显示状态：0->不显示；1->显示
     */
    @TableField(value = "show_status")
    private Integer showStatus;

    /**
     * 
     */
    @TableField(value = "sort")
    private Integer sort;

    /**
     * 图标
     */
    @TableField(value = "icon")
    private String icon;

    /**
     * 
     */
    @TableField(value = "keywords")
    private String keywords;

    /**
     * 描述
     */
    @TableField(value = "description")
    private String description;

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
     * 上机分类的编号：0表示一级分类
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 上机分类的编号：0表示一级分类
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
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
     * 分类级别：0->1级；1->2级
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 分类级别：0->1级；1->2级
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 
     */
    public Integer getProductCount() {
        return productCount;
    }

    /**
     * 
     */
    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    /**
     * 
     */
    public String getProductUnit() {
        return productUnit;
    }

    /**
     * 
     */
    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    /**
     * 是否显示在导航栏：0->不显示；1->显示
     */
    public Integer getNavStatus() {
        return navStatus;
    }

    /**
     * 是否显示在导航栏：0->不显示；1->显示
     */
    public void setNavStatus(Integer navStatus) {
        this.navStatus = navStatus;
    }

    /**
     * 显示状态：0->不显示；1->显示
     */
    public Integer getShowStatus() {
        return showStatus;
    }

    /**
     * 显示状态：0->不显示；1->显示
     */
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    /**
     * 
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * 
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    /**
     * 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 描述
     */
    public void setDescription(String description) {
        this.description = description;
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
        ProductCategory other = (ProductCategory) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
            && (this.getProductCount() == null ? other.getProductCount() == null : this.getProductCount().equals(other.getProductCount()))
            && (this.getProductUnit() == null ? other.getProductUnit() == null : this.getProductUnit().equals(other.getProductUnit()))
            && (this.getNavStatus() == null ? other.getNavStatus() == null : this.getNavStatus().equals(other.getNavStatus()))
            && (this.getShowStatus() == null ? other.getShowStatus() == null : this.getShowStatus().equals(other.getShowStatus()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getIcon() == null ? other.getIcon() == null : this.getIcon().equals(other.getIcon()))
            && (this.getKeywords() == null ? other.getKeywords() == null : this.getKeywords().equals(other.getKeywords()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getProductCount() == null) ? 0 : getProductCount().hashCode());
        result = prime * result + ((getProductUnit() == null) ? 0 : getProductUnit().hashCode());
        result = prime * result + ((getNavStatus() == null) ? 0 : getNavStatus().hashCode());
        result = prime * result + ((getShowStatus() == null) ? 0 : getShowStatus().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getIcon() == null) ? 0 : getIcon().hashCode());
        result = prime * result + ((getKeywords() == null) ? 0 : getKeywords().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parentId=").append(parentId);
        sb.append(", name=").append(name);
        sb.append(", level=").append(level);
        sb.append(", productCount=").append(productCount);
        sb.append(", productUnit=").append(productUnit);
        sb.append(", navStatus=").append(navStatus);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", sort=").append(sort);
        sb.append(", icon=").append(icon);
        sb.append(", keywords=").append(keywords);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}