package com.imooc.autoconfigure.bootstrap;

import com.imooc.autoconfigure.repository.MyFirstLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author youyu.song
 * @date 2019/6/8
 */
@ComponentScan(basePackages = "com.imooc.autoconfigure.repository")
public class RepositoryBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(RepositoryBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        MyFirstLevelRepository myFirstLevelRepository = context.getBean("myFirstLevelRepository", MyFirstLevelRepository.class);
        System.out.println("myFirstLevelRepository Bean : "+myFirstLevelRepository);

        //关闭上下文
        context.close();

    }

}
