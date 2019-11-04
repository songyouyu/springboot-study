package com.imooc.web.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author youyu.song
 * @date 2019/7/13 15:35
 */
@SpringBootApplication(scanBasePackages = "com.imooc.web")
public class SpringBootViewBootstrap {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootViewBootstrap.class, args);
	}

}
