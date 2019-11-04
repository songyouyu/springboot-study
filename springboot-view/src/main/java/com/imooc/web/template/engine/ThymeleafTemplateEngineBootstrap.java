package com.imooc.web.template.engine;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author youyu.song
 * @date 2019/7/13 15:10
 */
public class ThymeleafTemplateEngineBootstrap {

	public static void main(String[] args) throws IOException {
		// 构建引擎
		SpringTemplateEngine templateEngine = new SpringTemplateEngine();
		// 创建渲染上下文
		Context context = new Context();
		context.setVariable("message", "Hello World!");

		ResourceLoader resourceLoader = new DefaultResourceLoader();
		Resource resource = resourceLoader.getResource("classpath:/templates/thymeleaf/hello-world.html");
		File file = resource.getFile();
		FileInputStream fileInputStream = new FileInputStream(file);
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		IOUtils.copy(fileInputStream, outputStream);

		fileInputStream.close();

		// 模版的内容
		//String content = "<p th:text=\"${message}\">!!!</p>";
		String content = outputStream.toString("UTF-8");
		// 渲染(处理)结果
		String result = templateEngine.process(content, context);
		System.out.println(result);
	}

}
