package com.imooc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author youyu.song
 * @date 2019/6/29 15:55
 */
@Controller
public class HelloWorldController {

	@RequestMapping("")
	public String index(@RequestParam int value, Model model) {
	    //model.addAttribute("message", "hello, world");
		return "index";
	}

}
