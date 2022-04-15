package com.nuyoah.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nuyoah.server.pojo.Admin;
import com.nuyoah.server.service.AdminService;
import com.nuyoah.server.mapper.AdminMapper;
import org.springframework.stereotype.Service;

/**
* @author 12240
* @description 针对表【t_admin】的数据库操作Service实现
* @createDate 2022-04-15 19:37:22
*/
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin>
    implements AdminService{

}




