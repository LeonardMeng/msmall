package org.mengsoft.msmall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.mengsoft.msmall.entity.ProductAttributeValue;
import org.mengsoft.msmall.service.ProductAttributeValueService;
import org.mengsoft.msmall.mapper.ProductAttributeValueMapper;
import org.springframework.stereotype.Service;

/**
* @author menglingjun
* @description 针对表【product_attribute_value(存储产品参数信息的表)】的数据库操作Service实现
* @createDate 2024-01-12 16:02:18
*/
@Service
public class ProductAttributeValueServiceImpl extends ServiceImpl<ProductAttributeValueMapper, ProductAttributeValue>
    implements ProductAttributeValueService{

}




