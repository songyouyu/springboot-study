package com.imooc.autoconfigure.configuration;

import com.imooc.autoconfigure.annotation.EnableHelloWorld;
import com.imooc.autoconfigure.condition.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Configuration;

/**
 * @author youyu.song
 * @date 2019/6/8
 */
// Spring 模式注解装配
@Configuration
// Spring @Enable 模块装配
@EnableHelloWorld
// 条件装配
@ConditionalOnSystemProperty(name = "user.name", value = "songy")
public class HelloWorldAutoConfiguration {



}
