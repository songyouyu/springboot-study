package com.imooc.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author youyu.song
 * @date 2019/11/4 18:57
 */
@RestController
public class HelloWorldRestController {

    @GetMapping(value = "/hello-world")
    public String helloWorld(@RequestParam String message) {
        return "Hello, World " + message;
    }

}
