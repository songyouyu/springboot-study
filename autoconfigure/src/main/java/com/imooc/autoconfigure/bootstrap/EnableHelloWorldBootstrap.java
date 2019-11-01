package com.imooc.autoconfigure.bootstrap;

import com.imooc.autoconfigure.annotation.EnableHelloWorld;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author youyu.song
 * @date 2019/6/8
 */
@EnableHelloWorld
public class EnableHelloWorldBootstrap {

    /*
    @Enable 模块装配
    具备相同领域的功能组件的集合，组合所形成的一个独立的单元
    注解方式、编程方式
     */
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableHelloWorldBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        String helloWorld = context.getBean("helloWorld", String.class);
        System.out.println("helloWorld Bean : " + helloWorld);

        // 关闭上下文
        context.close();
    }

}
