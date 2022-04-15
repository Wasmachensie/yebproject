package com.nuyoah.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nuyoah.server.pojo.Department;
import com.nuyoah.server.service.DepartmentService;
import com.nuyoah.server.mapper.DepartmentMapper;
import org.springframework.stereotype.Service;

/**
* @author 12240
* @description 针对表【t_department】的数据库操作Service实现
* @createDate 2022-04-15 19:37:23
*/
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department>
    implements DepartmentService{

}




