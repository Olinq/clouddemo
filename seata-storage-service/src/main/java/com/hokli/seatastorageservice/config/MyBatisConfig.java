package com.hokli.seatastorageservice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.hokli.seatastorageservice.dao"})
public class MyBatisConfig {
}
