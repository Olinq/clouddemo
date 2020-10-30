package com.hokli.seataaccountservice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@MapperScan({"com.hokli.seataaccountservice.dao"})
public class MyBatisConfig {
}
