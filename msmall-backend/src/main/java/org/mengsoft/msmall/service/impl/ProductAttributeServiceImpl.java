package org.mengsoft.msmall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.mengsoft.msmall.entity.ProductAttribute;
import org.mengsoft.msmall.service.ProductAttributeService;
import org.mengsoft.msmall.mapper.ProductAttributeMapper;
import org.springframework.stereotype.Service;

/**
* @author menglingjun
* @description 针对表【product_attribute(商品属性参数表)】的数据库操作Service实现
* @createDate 2024-01-12 16:02:18
*/
@Service
public class ProductAttributeServiceImpl extends ServiceImpl<ProductAttributeMapper, ProductAttribute>
    implements ProductAttributeService{

}




