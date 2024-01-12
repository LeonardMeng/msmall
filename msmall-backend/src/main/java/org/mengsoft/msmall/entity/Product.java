package org.mengsoft.msmall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品信息
 * @TableName product
 */
@TableName(value ="product")
public class Product implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 
     */
    @TableField(value = "brand_id")
    private Long brandId;

    /**
     * 
     */
    @TableField(value = "product_category_id")
    private Long productCategoryId;

    /**
     * 
     */
    @TableField(value = "feight_template_id")
    private Long feightTemplateId;

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
     * 
     */
    @TableField(value = "pic")
    private String pic;

    /**
     * 货号
     */
    @TableField(value = "product_sn")
    private String productSn;

    /**
     * 删除状态：0->未删除；1->已删除
     */
    @TableField(value = "delete_status")
    private Integer deleteStatus;

    /**
     * 上架状态：0->下架；1->上架
     */
    @TableField(value = "publish_status")
    private Integer publishStatus;

    /**
     * 新品状态:0->不是新品；1->新品
     */
    @TableField(value = "new_status")
    private Integer newStatus;

    /**
     * 推荐状态；0->不推荐；1->推荐
     */
    @TableField(value = "recommand_status")
    private Integer recommandStatus;

    /**
     * 审核状态：0->未审核；1->审核通过
     */
    @TableField(value = "verify_status")
    private Integer verifyStatus;

    /**
     * 排序
     */
    @TableField(value = "sort")
    private Integer sort;

    /**
     * 销量
     */
    @TableField(value = "sale")
    private Integer sale;

    /**
     * 
     */
    @TableField(value = "price")
    private BigDecimal price;

    /**
     * 促销价格
     */
    @TableField(value = "promotion_price")
    private BigDecimal promotionPrice;

    /**
     * 赠送的成长值
     */
    @TableField(value = "gift_growth")
    private Integer giftGrowth;

    /**
     * 赠送的积分
     */
    @TableField(value = "gift_point")
    private Integer giftPoint;

    /**
     * 限制使用的积分数
     */
    @TableField(value = "use_point_limit")
    private Integer usePointLimit;

    /**
     * 副标题
     */
    @TableField(value = "sub_title")
    private String subTitle;

    /**
     * 商品描述
     */
    @TableField(value = "description")
    private String description;

    /**
     * 市场价
     */
    @TableField(value = "original_price")
    private BigDecimal originalPrice;

    /**
     * 库存
     */
    @TableField(value = "stock")
    private Integer stock;

    /**
     * 库存预警值
     */
    @TableField(value = "low_stock")
    private Integer lowStock;

    /**
     * 单位
     */
    @TableField(value = "unit")
    private String unit;

    /**
     * 商品重量，默认为克
     */
    @TableField(value = "weight")
    private BigDecimal weight;

    /**
     * 是否为预告商品：0->不是；1->是
     */
    @TableField(value = "preview_status")
    private Integer previewStatus;

    /**
     * 以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮
     */
    @TableField(value = "service_ids")
    private String serviceIds;

    /**
     * 
     */
    @TableField(value = "keywords")
    private String keywords;

    /**
     * 
     */
    @TableField(value = "note")
    private String note;

    /**
     * 画册图片，连产品图片限制为5张，以逗号分割
     */
    @TableField(value = "album_pics")
    private String albumPics;

    /**
     * 
     */
    @TableField(value = "detail_title")
    private String detailTitle;

    /**
     * 
     */
    @TableField(value = "detail_desc")
    private String detailDesc;

    /**
     * 产品详情网页内容
     */
    @TableField(value = "detail_html")
    private String detailHtml;

    /**
     * 移动端网页详情
     */
    @TableField(value = "detail_mobile_html")
    private String detailMobileHtml;

    /**
     * 促销开始时间
     */
    @TableField(value = "promotion_start_time")
    private Date promotionStartTime;

    /**
     * 促销结束时间
     */
    @TableField(value = "promotion_end_time")
    private Date promotionEndTime;

    /**
     * 活动限购数量
     */
    @TableField(value = "promotion_per_limit")
    private Integer promotionPerLimit;

    /**
     * 促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购
     */
    @TableField(value = "promotion_type")
    private Integer promotionType;

    /**
     * 品牌名称
     */
    @TableField(value = "brand_name")
    private String brandName;

    /**
     * 商品分类名称
     */
    @TableField(value = "product_category_name")
    private String productCategoryName;

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
    public Long getBrandId() {
        return brandId;
    }

    /**
     * 
     */
    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    /**
     * 
     */
    public Long getProductCategoryId() {
        return productCategoryId;
    }

    /**
     * 
     */
    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    /**
     * 
     */
    public Long getFeightTemplateId() {
        return feightTemplateId;
    }

    /**
     * 
     */
    public void setFeightTemplateId(Long feightTemplateId) {
        this.feightTemplateId = feightTemplateId;
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
     * 
     */
    public String getPic() {
        return pic;
    }

    /**
     * 
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * 货号
     */
    public String getProductSn() {
        return productSn;
    }

    /**
     * 货号
     */
    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    /**
     * 删除状态：0->未删除；1->已删除
     */
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * 删除状态：0->未删除；1->已删除
     */
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    /**
     * 上架状态：0->下架；1->上架
     */
    public Integer getPublishStatus() {
        return publishStatus;
    }

    /**
     * 上架状态：0->下架；1->上架
     */
    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    /**
     * 新品状态:0->不是新品；1->新品
     */
    public Integer getNewStatus() {
        return newStatus;
    }

    /**
     * 新品状态:0->不是新品；1->新品
     */
    public void setNewStatus(Integer newStatus) {
        this.newStatus = newStatus;
    }

    /**
     * 推荐状态；0->不推荐；1->推荐
     */
    public Integer getRecommandStatus() {
        return recommandStatus;
    }

    /**
     * 推荐状态；0->不推荐；1->推荐
     */
    public void setRecommandStatus(Integer recommandStatus) {
        this.recommandStatus = recommandStatus;
    }

    /**
     * 审核状态：0->未审核；1->审核通过
     */
    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    /**
     * 审核状态：0->未审核；1->审核通过
     */
    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    /**
     * 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 销量
     */
    public Integer getSale() {
        return sale;
    }

    /**
     * 销量
     */
    public void setSale(Integer sale) {
        this.sale = sale;
    }

    /**
     * 
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 促销价格
     */
    public BigDecimal getPromotionPrice() {
        return promotionPrice;
    }

    /**
     * 促销价格
     */
    public void setPromotionPrice(BigDecimal promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    /**
     * 赠送的成长值
     */
    public Integer getGiftGrowth() {
        return giftGrowth;
    }

    /**
     * 赠送的成长值
     */
    public void setGiftGrowth(Integer giftGrowth) {
        this.giftGrowth = giftGrowth;
    }

    /**
     * 赠送的积分
     */
    public Integer getGiftPoint() {
        return giftPoint;
    }

    /**
     * 赠送的积分
     */
    public void setGiftPoint(Integer giftPoint) {
        this.giftPoint = giftPoint;
    }

    /**
     * 限制使用的积分数
     */
    public Integer getUsePointLimit() {
        return usePointLimit;
    }

    /**
     * 限制使用的积分数
     */
    public void setUsePointLimit(Integer usePointLimit) {
        this.usePointLimit = usePointLimit;
    }

    /**
     * 副标题
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * 副标题
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    /**
     * 商品描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 商品描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 市场价
     */
    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    /**
     * 市场价
     */
    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    /**
     * 库存
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * 库存
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * 库存预警值
     */
    public Integer getLowStock() {
        return lowStock;
    }

    /**
     * 库存预警值
     */
    public void setLowStock(Integer lowStock) {
        this.lowStock = lowStock;
    }

    /**
     * 单位
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 单位
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * 商品重量，默认为克
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * 商品重量，默认为克
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * 是否为预告商品：0->不是；1->是
     */
    public Integer getPreviewStatus() {
        return previewStatus;
    }

    /**
     * 是否为预告商品：0->不是；1->是
     */
    public void setPreviewStatus(Integer previewStatus) {
        this.previewStatus = previewStatus;
    }

    /**
     * 以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮
     */
    public String getServiceIds() {
        return serviceIds;
    }

    /**
     * 以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮
     */
    public void setServiceIds(String serviceIds) {
        this.serviceIds = serviceIds;
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
     * 
     */
    public String getNote() {
        return note;
    }

    /**
     * 
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * 画册图片，连产品图片限制为5张，以逗号分割
     */
    public String getAlbumPics() {
        return albumPics;
    }

    /**
     * 画册图片，连产品图片限制为5张，以逗号分割
     */
    public void setAlbumPics(String albumPics) {
        this.albumPics = albumPics;
    }

    /**
     * 
     */
    public String getDetailTitle() {
        return detailTitle;
    }

    /**
     * 
     */
    public void setDetailTitle(String detailTitle) {
        this.detailTitle = detailTitle;
    }

    /**
     * 
     */
    public String getDetailDesc() {
        return detailDesc;
    }

    /**
     * 
     */
    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
    }

    /**
     * 产品详情网页内容
     */
    public String getDetailHtml() {
        return detailHtml;
    }

    /**
     * 产品详情网页内容
     */
    public void setDetailHtml(String detailHtml) {
        this.detailHtml = detailHtml;
    }

    /**
     * 移动端网页详情
     */
    public String getDetailMobileHtml() {
        return detailMobileHtml;
    }

    /**
     * 移动端网页详情
     */
    public void setDetailMobileHtml(String detailMobileHtml) {
        this.detailMobileHtml = detailMobileHtml;
    }

    /**
     * 促销开始时间
     */
    public Date getPromotionStartTime() {
        return promotionStartTime;
    }

    /**
     * 促销开始时间
     */
    public void setPromotionStartTime(Date promotionStartTime) {
        this.promotionStartTime = promotionStartTime;
    }

    /**
     * 促销结束时间
     */
    public Date getPromotionEndTime() {
        return promotionEndTime;
    }

    /**
     * 促销结束时间
     */
    public void setPromotionEndTime(Date promotionEndTime) {
        this.promotionEndTime = promotionEndTime;
    }

    /**
     * 活动限购数量
     */
    public Integer getPromotionPerLimit() {
        return promotionPerLimit;
    }

    /**
     * 活动限购数量
     */
    public void setPromotionPerLimit(Integer promotionPerLimit) {
        this.promotionPerLimit = promotionPerLimit;
    }

    /**
     * 促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购
     */
    public Integer getPromotionType() {
        return promotionType;
    }

    /**
     * 促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购
     */
    public void setPromotionType(Integer promotionType) {
        this.promotionType = promotionType;
    }

    /**
     * 品牌名称
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * 品牌名称
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * 商品分类名称
     */
    public String getProductCategoryName() {
        return productCategoryName;
    }

    /**
     * 商品分类名称
     */
    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
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
        Product other = (Product) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBrandId() == null ? other.getBrandId() == null : this.getBrandId().equals(other.getBrandId()))
            && (this.getProductCategoryId() == null ? other.getProductCategoryId() == null : this.getProductCategoryId().equals(other.getProductCategoryId()))
            && (this.getFeightTemplateId() == null ? other.getFeightTemplateId() == null : this.getFeightTemplateId().equals(other.getFeightTemplateId()))
            && (this.getProductAttributeCategoryId() == null ? other.getProductAttributeCategoryId() == null : this.getProductAttributeCategoryId().equals(other.getProductAttributeCategoryId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPic() == null ? other.getPic() == null : this.getPic().equals(other.getPic()))
            && (this.getProductSn() == null ? other.getProductSn() == null : this.getProductSn().equals(other.getProductSn()))
            && (this.getDeleteStatus() == null ? other.getDeleteStatus() == null : this.getDeleteStatus().equals(other.getDeleteStatus()))
            && (this.getPublishStatus() == null ? other.getPublishStatus() == null : this.getPublishStatus().equals(other.getPublishStatus()))
            && (this.getNewStatus() == null ? other.getNewStatus() == null : this.getNewStatus().equals(other.getNewStatus()))
            && (this.getRecommandStatus() == null ? other.getRecommandStatus() == null : this.getRecommandStatus().equals(other.getRecommandStatus()))
            && (this.getVerifyStatus() == null ? other.getVerifyStatus() == null : this.getVerifyStatus().equals(other.getVerifyStatus()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getSale() == null ? other.getSale() == null : this.getSale().equals(other.getSale()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getPromotionPrice() == null ? other.getPromotionPrice() == null : this.getPromotionPrice().equals(other.getPromotionPrice()))
            && (this.getGiftGrowth() == null ? other.getGiftGrowth() == null : this.getGiftGrowth().equals(other.getGiftGrowth()))
            && (this.getGiftPoint() == null ? other.getGiftPoint() == null : this.getGiftPoint().equals(other.getGiftPoint()))
            && (this.getUsePointLimit() == null ? other.getUsePointLimit() == null : this.getUsePointLimit().equals(other.getUsePointLimit()))
            && (this.getSubTitle() == null ? other.getSubTitle() == null : this.getSubTitle().equals(other.getSubTitle()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getOriginalPrice() == null ? other.getOriginalPrice() == null : this.getOriginalPrice().equals(other.getOriginalPrice()))
            && (this.getStock() == null ? other.getStock() == null : this.getStock().equals(other.getStock()))
            && (this.getLowStock() == null ? other.getLowStock() == null : this.getLowStock().equals(other.getLowStock()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getPreviewStatus() == null ? other.getPreviewStatus() == null : this.getPreviewStatus().equals(other.getPreviewStatus()))
            && (this.getServiceIds() == null ? other.getServiceIds() == null : this.getServiceIds().equals(other.getServiceIds()))
            && (this.getKeywords() == null ? other.getKeywords() == null : this.getKeywords().equals(other.getKeywords()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
            && (this.getAlbumPics() == null ? other.getAlbumPics() == null : this.getAlbumPics().equals(other.getAlbumPics()))
            && (this.getDetailTitle() == null ? other.getDetailTitle() == null : this.getDetailTitle().equals(other.getDetailTitle()))
            && (this.getDetailDesc() == null ? other.getDetailDesc() == null : this.getDetailDesc().equals(other.getDetailDesc()))
            && (this.getDetailHtml() == null ? other.getDetailHtml() == null : this.getDetailHtml().equals(other.getDetailHtml()))
            && (this.getDetailMobileHtml() == null ? other.getDetailMobileHtml() == null : this.getDetailMobileHtml().equals(other.getDetailMobileHtml()))
            && (this.getPromotionStartTime() == null ? other.getPromotionStartTime() == null : this.getPromotionStartTime().equals(other.getPromotionStartTime()))
            && (this.getPromotionEndTime() == null ? other.getPromotionEndTime() == null : this.getPromotionEndTime().equals(other.getPromotionEndTime()))
            && (this.getPromotionPerLimit() == null ? other.getPromotionPerLimit() == null : this.getPromotionPerLimit().equals(other.getPromotionPerLimit()))
            && (this.getPromotionType() == null ? other.getPromotionType() == null : this.getPromotionType().equals(other.getPromotionType()))
            && (this.getBrandName() == null ? other.getBrandName() == null : this.getBrandName().equals(other.getBrandName()))
            && (this.getProductCategoryName() == null ? other.getProductCategoryName() == null : this.getProductCategoryName().equals(other.getProductCategoryName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBrandId() == null) ? 0 : getBrandId().hashCode());
        result = prime * result + ((getProductCategoryId() == null) ? 0 : getProductCategoryId().hashCode());
        result = prime * result + ((getFeightTemplateId() == null) ? 0 : getFeightTemplateId().hashCode());
        result = prime * result + ((getProductAttributeCategoryId() == null) ? 0 : getProductAttributeCategoryId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPic() == null) ? 0 : getPic().hashCode());
        result = prime * result + ((getProductSn() == null) ? 0 : getProductSn().hashCode());
        result = prime * result + ((getDeleteStatus() == null) ? 0 : getDeleteStatus().hashCode());
        result = prime * result + ((getPublishStatus() == null) ? 0 : getPublishStatus().hashCode());
        result = prime * result + ((getNewStatus() == null) ? 0 : getNewStatus().hashCode());
        result = prime * result + ((getRecommandStatus() == null) ? 0 : getRecommandStatus().hashCode());
        result = prime * result + ((getVerifyStatus() == null) ? 0 : getVerifyStatus().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getSale() == null) ? 0 : getSale().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getPromotionPrice() == null) ? 0 : getPromotionPrice().hashCode());
        result = prime * result + ((getGiftGrowth() == null) ? 0 : getGiftGrowth().hashCode());
        result = prime * result + ((getGiftPoint() == null) ? 0 : getGiftPoint().hashCode());
        result = prime * result + ((getUsePointLimit() == null) ? 0 : getUsePointLimit().hashCode());
        result = prime * result + ((getSubTitle() == null) ? 0 : getSubTitle().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getOriginalPrice() == null) ? 0 : getOriginalPrice().hashCode());
        result = prime * result + ((getStock() == null) ? 0 : getStock().hashCode());
        result = prime * result + ((getLowStock() == null) ? 0 : getLowStock().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getPreviewStatus() == null) ? 0 : getPreviewStatus().hashCode());
        result = prime * result + ((getServiceIds() == null) ? 0 : getServiceIds().hashCode());
        result = prime * result + ((getKeywords() == null) ? 0 : getKeywords().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        result = prime * result + ((getAlbumPics() == null) ? 0 : getAlbumPics().hashCode());
        result = prime * result + ((getDetailTitle() == null) ? 0 : getDetailTitle().hashCode());
        result = prime * result + ((getDetailDesc() == null) ? 0 : getDetailDesc().hashCode());
        result = prime * result + ((getDetailHtml() == null) ? 0 : getDetailHtml().hashCode());
        result = prime * result + ((getDetailMobileHtml() == null) ? 0 : getDetailMobileHtml().hashCode());
        result = prime * result + ((getPromotionStartTime() == null) ? 0 : getPromotionStartTime().hashCode());
        result = prime * result + ((getPromotionEndTime() == null) ? 0 : getPromotionEndTime().hashCode());
        result = prime * result + ((getPromotionPerLimit() == null) ? 0 : getPromotionPerLimit().hashCode());
        result = prime * result + ((getPromotionType() == null) ? 0 : getPromotionType().hashCode());
        result = prime * result + ((getBrandName() == null) ? 0 : getBrandName().hashCode());
        result = prime * result + ((getProductCategoryName() == null) ? 0 : getProductCategoryName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", brandId=").append(brandId);
        sb.append(", productCategoryId=").append(productCategoryId);
        sb.append(", feightTemplateId=").append(feightTemplateId);
        sb.append(", productAttributeCategoryId=").append(productAttributeCategoryId);
        sb.append(", name=").append(name);
        sb.append(", pic=").append(pic);
        sb.append(", productSn=").append(productSn);
        sb.append(", deleteStatus=").append(deleteStatus);
        sb.append(", publishStatus=").append(publishStatus);
        sb.append(", newStatus=").append(newStatus);
        sb.append(", recommandStatus=").append(recommandStatus);
        sb.append(", verifyStatus=").append(verifyStatus);
        sb.append(", sort=").append(sort);
        sb.append(", sale=").append(sale);
        sb.append(", price=").append(price);
        sb.append(", promotionPrice=").append(promotionPrice);
        sb.append(", giftGrowth=").append(giftGrowth);
        sb.append(", giftPoint=").append(giftPoint);
        sb.append(", usePointLimit=").append(usePointLimit);
        sb.append(", subTitle=").append(subTitle);
        sb.append(", description=").append(description);
        sb.append(", originalPrice=").append(originalPrice);
        sb.append(", stock=").append(stock);
        sb.append(", lowStock=").append(lowStock);
        sb.append(", unit=").append(unit);
        sb.append(", weight=").append(weight);
        sb.append(", previewStatus=").append(previewStatus);
        sb.append(", serviceIds=").append(serviceIds);
        sb.append(", keywords=").append(keywords);
        sb.append(", note=").append(note);
        sb.append(", albumPics=").append(albumPics);
        sb.append(", detailTitle=").append(detailTitle);
        sb.append(", detailDesc=").append(detailDesc);
        sb.append(", detailHtml=").append(detailHtml);
        sb.append(", detailMobileHtml=").append(detailMobileHtml);
        sb.append(", promotionStartTime=").append(promotionStartTime);
        sb.append(", promotionEndTime=").append(promotionEndTime);
        sb.append(", promotionPerLimit=").append(promotionPerLimit);
        sb.append(", promotionType=").append(promotionType);
        sb.append(", brandName=").append(brandName);
        sb.append(", productCategoryName=").append(productCategoryName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}