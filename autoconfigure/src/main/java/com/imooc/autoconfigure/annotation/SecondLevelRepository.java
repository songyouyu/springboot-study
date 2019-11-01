package com.imooc.autoconfigure.annotation;

import java.lang.annotation.*;

/**
 * 层次性
 *
 * @author youyu.song
 * @date 2019/6/8
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@FirstLevelRepository
public @interface SecondLevelRepository {

    String value() default "";

}
