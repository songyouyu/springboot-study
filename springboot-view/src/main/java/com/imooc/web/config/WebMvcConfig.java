package com.imooc.web.config;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;

/**
 * @author youyu.song
 * @date 2019/6/30 14:40
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

	@Bean
	public ViewResolver myViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/jsp/");
		viewResolver.setSuffix(".jsp");
    	// 设置优先级比 Thymeleaf 高.
		viewResolver.setOrder(Ordered.LOWEST_PRECEDENCE - 10);
		viewResolver.setContentType("text/xml;charset=UTF-8");
		return viewResolver;
	}

	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new HandlerInterceptor() {
			public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
				System.out.println("拦截中...");

				return true;
			}
		});
	}

	@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
		configurer.favorParameter(true)
				.favorPathExtension(true);
	}


	@Bean
	public WebServerFactoryCustomizer<TomcatServletWebServerFactory> customizer() {
		return (factory) -> {
			factory.addContextCustomizers((context) -> {
				String relativePath = "springboot-view/src/main/webapp";
				// 相对于 user.dir = F:/IdeaWorkspace/Imoocwork/dive-in-spring-boot
				File docBaseFile = new File(relativePath);
				if (docBaseFile.exists()) {
					context.setDocBase(docBaseFile.getAbsolutePath());
				}
			});
		};
	}

}
