package org.mengsoft.msmall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.mengsoft.msmall.entity.Role;
import org.mengsoft.msmall.service.RoleService;
import org.mengsoft.msmall.mapper.RoleMapper;
import org.springframework.stereotype.Service;

/**
* @author menglingjun
* @description 针对表【role(后台用户角色表)】的数据库操作Service实现
* @createDate 2024-01-12 16:02:18
*/
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role>
    implements RoleService{

}




