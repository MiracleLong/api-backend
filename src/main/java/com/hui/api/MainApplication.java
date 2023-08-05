package com.hui.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author dagong
 */
// todo 如果要开启Redistribution，则需移除 exclude 中的内容
@SpringBootApplication(exclude = {RedisAutoConfiguration.class})
@MapperScan("com.hui.api.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true,exposeProxy = true)
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

}
