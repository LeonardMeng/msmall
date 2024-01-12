package org.mengsoft.msmall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.mengsoft.msmall.entity.ProductAttributeCategory;
import org.mengsoft.msmall.service.ProductAttributeCategoryService;
import org.mengsoft.msmall.mapper.ProductAttributeCategoryMapper;
import org.springframework.stereotype.Service;

/**
* @author menglingjun
* @description 针对表【product_attribute_category(产品属性分类表)】的数据库操作Service实现
* @createDate 2024-01-12 16:02:18
*/
@Service
public class ProductAttributeCategoryServiceImpl extends ServiceImpl<ProductAttributeCategoryMapper, ProductAttributeCategory>
    implements ProductAttributeCategoryService{

}




