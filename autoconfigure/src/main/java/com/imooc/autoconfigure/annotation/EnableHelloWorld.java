package com.imooc.autoconfigure.annotation;

import com.imooc.autoconfigure.configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author youyu.song
 * @date 2019/6/8
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(HelloWorldConfiguration.class)
//@Import(HelloWorldImportSelector.class)
public @interface EnableHelloWorld {
}
