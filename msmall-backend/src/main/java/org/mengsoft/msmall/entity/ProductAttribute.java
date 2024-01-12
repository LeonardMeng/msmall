package org.mengsoft.msmall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 商品属性参数表
 * @TableName product_attribute
 */
@TableName(value ="product_attribute")
public class ProductAttribute implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 
     */
    @TableField(value = "product_attribute_category_id")
    private Long productAttributeCategoryId;

    /**
     * 
     */
    @TableField(value = "name")
    private String name;

    /**
     * 属性选择类型：0->唯一；1->单选；2->多选
     */
    @TableField(value = "select_type")
    private Integer selectType;

    /**
     * 属性录入方式：0->手工录入；1->从列表中选取
     */
    @TableField(value = "input_type")
    private Integer inputType;

    /**
     * 可选值列表，以逗号隔开
     */
    @TableField(value = "input_list")
    private String inputList;

    /**
     * 排序字段：最高的可以单独上传图片
     */
    @TableField(value = "sort")
    private Integer sort;

    /**
     * 分类筛选样式：1->普通；1->颜色
     */
    @TableField(value = "filter_type")
    private Integer filterType;

    /**
     * 检索类型；0->不需要进行检索；1->关键字检索；2->范围检索
     */
    @TableField(value = "search_type")
    private Integer searchType;

    /**
     * 相同属性产品是否关联；0->不关联；1->关联
     */
    @TableField(value = "related_status")
    private Integer relatedStatus;

    /**
     * 是否支持手动新增；0->不支持；1->支持
     */
    @TableField(value = "hand_add_status")
    private Integer handAddStatus;

    /**
     * 属性的类型；0->规格；1->参数
     */
    @TableField(value = "type")
    private Integer type;

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
    public Long getProductAttributeCategoryId() {
        return productAttributeCategoryId;
    }

    /**
     * 
     */
    public void setProductAttributeCategoryId(Long productAttributeCategoryId) {
        this.productAttributeCategoryId = productAttributeCategoryId;
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
     * 属性选择类型：0->唯一；1->单选；2->多选
     */
    public Integer getSelectType() {
        return selectType;
    }

    /**
     * 属性选择类型：0->唯一；1->单选；2->多选
     */
    public void setSelectType(Integer selectType) {
        this.selectType = selectType;
    }

    /**
     * 属性录入方式：0->手工录入；1->从列表中选取
     */
    public Integer getInputType() {
        return inputType;
    }

    /**
     * 属性录入方式：0->手工录入；1->从列表中选取
     */
    public void setInputType(Integer inputType) {
        this.inputType = inputType;
    }

    /**
     * 可选值列表，以逗号隔开
     */
    public String getInputList() {
        return inputList;
    }

    /**
     * 可选值列表，以逗号隔开
     */
    public void setInputList(String inputList) {
        this.inputList = inputList;
    }

    /**
     * 排序字段：最高的可以单独上传图片
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 排序字段：最高的可以单独上传图片
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 分类筛选样式：1->普通；1->颜色
     */
    public Integer getFilterType() {
        return filterType;
    }

    /**
     * 分类筛选样式：1->普通；1->颜色
     */
    public void setFilterType(Integer filterType) {
        this.filterType = filterType;
    }

    /**
     * 检索类型；0->不需要进行检索；1->关键字检索；2->范围检索
     */
    public Integer getSearchType() {
        return searchType;
    }

    /**
     * 检索类型；0->不需要进行检索；1->关键字检索；2->范围检索
     */
    public void setSearchType(Integer searchType) {
        this.searchType = searchType;
    }

    /**
     * 相同属性产品是否关联；0->不关联；1->关联
     */
    public Integer getRelatedStatus() {
        return relatedStatus;
    }

    /**
     * 相同属性产品是否关联；0->不关联；1->关联
     */
    public void setRelatedStatus(Integer relatedStatus) {
        this.relatedStatus = relatedStatus;
    }

    /**
     * 是否支持手动新增；0->不支持；1->支持
     */
    public Integer getHandAddStatus() {
        return handAddStatus;
    }

    /**
     * 是否支持手动新增；0->不支持；1->支持
     */
    public void setHandAddStatus(Integer handAddStatus) {
        this.handAddStatus = handAddStatus;
    }

    /**
     * 属性的类型；0->规格；1->参数
     */
    public Integer getType() {
        return type;
    }

    /**
     * 属性的类型；0->规格；1->参数
     */
    public void setType(Integer type) {
        this.type = type;
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
        ProductAttribute other = (ProductAttribute) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProductAttributeCategoryId() == null ? other.getProductAttributeCategoryId() == null : this.getProductAttributeCategoryId().equals(other.getProductAttributeCategoryId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSelectType() == null ? other.getSelectType() == null : this.getSelectType().equals(other.getSelectType()))
            && (this.getInputType() == null ? other.getInputType() == null : this.getInputType().equals(other.getInputType()))
            && (this.getInputList() == null ? other.getInputList() == null : this.getInputList().equals(other.getInputList()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getFilterType() == null ? other.getFilterType() == null : this.getFilterType().equals(other.getFilterType()))
            && (this.getSearchType() == null ? other.getSearchType() == null : this.getSearchType().equals(other.getSearchType()))
            && (this.getRelatedStatus() == null ? other.getRelatedStatus() == null : this.getRelatedStatus().equals(other.getRelatedStatus()))
            && (this.getHandAddStatus() == null ? other.getHandAddStatus() == null : this.getHandAddStatus().equals(other.getHandAddStatus()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProductAttributeCategoryId() == null) ? 0 : getProductAttributeCategoryId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSelectType() == null) ? 0 : getSelectType().hashCode());
        result = prime * result + ((getInputType() == null) ? 0 : getInputType().hashCode());
        result = prime * result + ((getInputList() == null) ? 0 : getInputList().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getFilterType() == null) ? 0 : getFilterType().hashCode());
        result = prime * result + ((getSearchType() == null) ? 0 : getSearchType().hashCode());
        result = prime * result + ((getRelatedStatus() == null) ? 0 : getRelatedStatus().hashCode());
        result = prime * result + ((getHandAddStatus() == null) ? 0 : getHandAddStatus().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productAttributeCategoryId=").append(productAttributeCategoryId);
        sb.append(", name=").append(name);
        sb.append(", selectType=").append(selectType);
        sb.append(", inputType=").append(inputType);
        sb.append(", inputList=").append(inputList);
        sb.append(", sort=").append(sort);
        sb.append(", filterType=").append(filterType);
        sb.append(", searchType=").append(searchType);
        sb.append(", relatedStatus=").append(relatedStatus);
        sb.append(", handAddStatus=").append(handAddStatus);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}