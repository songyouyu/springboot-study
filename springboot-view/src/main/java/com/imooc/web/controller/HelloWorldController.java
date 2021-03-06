package com.imooc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author youyu.song
 * @date 2019/7/13 15:37
 */
@Controller
public class HelloWorldController {

	@RequestMapping("")
	public String index(@RequestParam(required = false, defaultValue = "0") int value, Model model) {
		return "index";
	}

}
