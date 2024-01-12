package org.mengsoft.msmall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.mengsoft.msmall.entity.Permission;
import org.mengsoft.msmall.service.PermissionService;
import org.mengsoft.msmall.mapper.PermissionMapper;
import org.springframework.stereotype.Service;

/**
* @author menglingjun
* @description 针对表【permission(后台用户权限表)】的数据库操作Service实现
* @createDate 2024-01-12 16:02:18
*/
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission>
    implements PermissionService{

}




