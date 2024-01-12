package org.mengsoft.msmall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.mengsoft.msmall.entity.Product;
import org.mengsoft.msmall.service.ProductService;
import org.mengsoft.msmall.mapper.ProductMapper;
import org.springframework.stereotype.Service;

/**
* @author menglingjun
* @description 针对表【product(商品信息)】的数据库操作Service实现
* @createDate 2024-01-12 16:02:18
*/
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product>
    implements ProductService{

}




