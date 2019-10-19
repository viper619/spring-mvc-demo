package com.viper.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("myapp")
public class HelloWorldController
{
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "helloworld-response";
	}
	
	@RequestMapping("/processFormv2")
	public String letsShout(@RequestParam("studentName") String name, Model model)
	{
		name = name.toUpperCase();
		
		String result = "Welcome " + name + ". Go nuts!";
		
		model.addAttribute("message", result);
		
		return "helloworld-response";
	}
}
