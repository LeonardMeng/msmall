package org.mengsoft.msmall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.mengsoft.msmall.entity.UserPermissionRelation;
import org.mengsoft.msmall.service.UserPermissionRelationService;
import org.mengsoft.msmall.mapper.UserPermissionRelationMapper;
import org.springframework.stereotype.Service;

/**
* @author menglingjun
* @description 针对表【user_permission_relation(后台用户和权限关系表(除角色中定义的权限以外的加减权限))】的数据库操作Service实现
* @createDate 2024-01-12 16:02:18
*/
@Service
public class UserPermissionRelationServiceImpl extends ServiceImpl<UserPermissionRelationMapper, UserPermissionRelation>
    implements UserPermissionRelationService{

}




