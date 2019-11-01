package com.imooc.autoconfigure.annotation;

import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

/**
 * "派生"性
 *
 * @author youyu.song
 * @date 2019/6/8
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repository
public @interface FirstLevelRepository {

    String value() default "";

}
