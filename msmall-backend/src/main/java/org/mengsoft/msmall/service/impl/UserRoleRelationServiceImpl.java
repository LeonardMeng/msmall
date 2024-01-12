package org.mengsoft.msmall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.mengsoft.msmall.entity.UserRoleRelation;
import org.mengsoft.msmall.service.UserRoleRelationService;
import org.mengsoft.msmall.mapper.UserRoleRelationMapper;
import org.springframework.stereotype.Service;

/**
* @author menglingjun
* @description 针对表【user_role_relation(后台用户和角色关系表)】的数据库操作Service实现
* @createDate 2024-01-12 16:02:18
*/
@Service
public class UserRoleRelationServiceImpl extends ServiceImpl<UserRoleRelationMapper, UserRoleRelation>
    implements UserRoleRelationService{

}




