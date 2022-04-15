package com.nuyoah.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: 8Nuyoah
 * @Date: 2022/04/15/18:06
 * @Description:
 */
@SpringBootApplication
@MapperScan("com.nuyoah.server.mapper")
public class YebApplication {
    public static void main(String[] args) {
        SpringApplication.run(YebApplication.class, args);
    }
}
