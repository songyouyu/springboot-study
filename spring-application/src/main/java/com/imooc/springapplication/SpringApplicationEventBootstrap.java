package com.imooc.springapplication;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author youyu.song
 * @date 2019/6/16
 */
public class SpringApplicationEventBootstrap {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext();

        configApplicationContext.addApplicationListener(event -> {
            System.out.println("监听到事件 ：" + event);
        });

        // 启动上下文
        configApplicationContext.refresh();

        // 发送事件
        configApplicationContext.publishEvent("HelloWorld");
        configApplicationContext.publishEvent("2019");
        configApplicationContext.publishEvent(new ApplicationEvent("imooc") {

        });

        // 关闭上下文
        configApplicationContext.close();
    }

}
