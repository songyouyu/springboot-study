package com.imooc.autoconfigure.repository;

import com.imooc.autoconfigure.annotation.FirstLevelRepository;
import com.imooc.autoconfigure.annotation.SecondLevelRepository;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author youyu.song
 * @date 2019/6/8
 */
//@FirstLevelRepository(value = "myFirstLevelRepository")
//@Component(value = "myFirstLevelRepository")
@SecondLevelRepository(value = "myFirstLevelRepository")
public class MyFirstLevelRepository {



}
