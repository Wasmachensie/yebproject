package com.nuyoah.server.mapper;

import com.nuyoah.server.pojo.Admin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
* @author 12240
* @description 针对表【t_admin】的数据库操作Mapper
* @createDate 2022-04-15 19:37:22
* @Entity com.nuyoah.server.pojo.Admin
*/
/*添加此注解可以解决找不到mapper的问题
* 可以让AdminServiceImpl中装配adminMapper不爆红，
* 但是爆红也没事*/
@Repository
public interface AdminMapper extends BaseMapper<Admin> {

}




