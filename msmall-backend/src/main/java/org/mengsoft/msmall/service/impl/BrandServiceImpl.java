package org.mengsoft.msmall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.mengsoft.msmall.entity.Brand;
import org.mengsoft.msmall.service.BrandService;
import org.mengsoft.msmall.mapper.BrandMapper;
import org.springframework.stereotype.Service;

/**
* @author menglingjun
* @description 针对表【brand(品牌表)】的数据库操作Service实现
* @createDate 2024-01-12 16:02:17
*/
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand>
    implements BrandService{

}




