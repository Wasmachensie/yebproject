package com.nuyoah.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nuyoah.server.pojo.Role;
import com.nuyoah.server.service.RoleService;
import com.nuyoah.server.mapper.RoleMapper;
import org.springframework.stereotype.Service;

/**
* @author 12240
* @description 针对表【t_role】的数据库操作Service实现
* @createDate 2022-04-15 19:37:23
*/
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role>
    implements RoleService{

}




