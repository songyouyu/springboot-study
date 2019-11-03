package com.imooc.web.servlet.support;

import com.imooc.web.config.DispatcherServletConfiguration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author youyu.song
 * @date 2019/6/30 15:45
 */
public class DefaultAnnotationConfigDispatcherServletInitializer
		extends AbstractAnnotationConfigDispatcherServletInitializer {

	/**
	 * web.xml
	 * @return
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[0];
	}

	/**
	 * DispatcherServlet
	 * @return
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{DispatcherServletConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}
}
