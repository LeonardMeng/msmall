package org.mengsoft.msmall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.mengsoft.msmall.entity.ProductCategory;
import org.mengsoft.msmall.service.ProductCategoryService;
import org.mengsoft.msmall.mapper.ProductCategoryMapper;
import org.springframework.stereotype.Service;

/**
* @author menglingjun
* @description 针对表【product_category(产品分类)】的数据库操作Service实现
* @createDate 2024-01-12 16:02:18
*/
@Service
public class ProductCategoryServiceImpl extends ServiceImpl<ProductCategoryMapper, ProductCategory>
    implements ProductCategoryService{

}




