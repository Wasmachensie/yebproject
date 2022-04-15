package com.nuyoah.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nuyoah.server.pojo.Nation;
import com.nuyoah.server.service.NationService;
import com.nuyoah.server.mapper.NationMapper;
import org.springframework.stereotype.Service;

/**
* @author 12240
* @description 针对表【t_nation】的数据库操作Service实现
* @createDate 2022-04-15 19:37:23
*/
@Service
public class NationServiceImpl extends ServiceImpl<NationMapper, Nation>
    implements NationService{

}




