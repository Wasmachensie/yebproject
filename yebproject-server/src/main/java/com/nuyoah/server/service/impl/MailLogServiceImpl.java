package com.nuyoah.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nuyoah.server.pojo.MailLog;
import com.nuyoah.server.service.MailLogService;
import com.nuyoah.server.mapper.MailLogMapper;
import org.springframework.stereotype.Service;

/**
* @author 12240
* @description 针对表【t_mail_log】的数据库操作Service实现
* @createDate 2022-04-15 19:37:23
*/
@Service
public class MailLogServiceImpl extends ServiceImpl<MailLogMapper, MailLog>
    implements MailLogService{

}




