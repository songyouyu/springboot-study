package com.imooc.web.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot rest 引导类
 * @author youyu.song
 * @date 2019/11/4 18:54
 */
@SpringBootApplication(scanBasePackages = {"com.imooc.web.controller", "com.imooc.web.config"})
public class SpringBootRestBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestBootstrap.class, args);
    }

}
