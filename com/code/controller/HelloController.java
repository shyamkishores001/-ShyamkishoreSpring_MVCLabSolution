package com.code.controller;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@ComponentScan
@Controller
public class HelloController {
	@RequestMapping("/")
	public String showMainPage() {
		return "demo";
	}
}
