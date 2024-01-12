package org.mengsoft.msmall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.mengsoft.msmall.entity.User;
import org.mengsoft.msmall.service.UserService;
import org.mengsoft.msmall.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author menglingjun
* @description 针对表【user(后台用户表)】的数据库操作Service实现
* @createDate 2024-01-12 16:02:18
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




