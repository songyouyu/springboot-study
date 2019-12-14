package com.imooc.web.config;

import com.imooc.web.converter.PropertiesHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * @author youyu.song
 * @date 2019/12/14 15:34
 */
@Configuration
public class RestWebMvcConfigurer implements WebMvcConfigurer {

    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        // 不建议添加到 converters 的末尾
        //converters.add(new PropertiesHttpMessageConverter());
        // 添加到集合首位
        converters.set(0, new PropertiesHttpMessageConverter());
    }

}
