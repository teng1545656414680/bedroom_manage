package com.bedroom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("{pageName}")
	public String pageName(@PathVariable("pageName")String pageName) {
		return pageName;
	}
}
