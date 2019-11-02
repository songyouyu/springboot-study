package com.imooc.springapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashSet;
import java.util.Set;

public class Application {

    /*
    配置 springboot bean 源
     */
    public static void main(String[] args) {
        // 启动类需要用 @SpringBootApplication 标注，那么它就是一个合法 bean
        //SpringApplication.run(SpringApplicationConfiguration.class, args);

        Set<String> sources = new HashSet<>();
        // 配置 class 名称
        sources.add(SpringApplicationConfiguration.class.getName());

        SpringApplication springApplication = new SpringApplication();
        springApplication.setSources(sources);
        ConfigurableApplicationContext context = springApplication.run(args);
        System.out.println("Bean : " + context.getBean(SpringApplicationConfiguration.class));

    }

    @SpringBootApplication
    public static class SpringApplicationConfiguration {

    }

}
