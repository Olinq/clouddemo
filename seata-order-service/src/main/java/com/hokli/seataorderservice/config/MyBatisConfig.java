package com.hokli.seataorderservice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@MapperScan({"com.hokli.seataorderservice.dao"})
public class MyBatisConfig {
}
