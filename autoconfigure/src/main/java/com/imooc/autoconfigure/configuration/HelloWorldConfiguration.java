package com.imooc.autoconfigure.configuration;

import org.springframework.context.annotation.Bean;

/**
 * @author youyu.song
 * @date 2019/6/8
 */
public class HelloWorldConfiguration {

    // 方法名即 Bean 名称
    @Bean
    public String helloWorld() {
        return "Hello, World 2019";
    }

}
