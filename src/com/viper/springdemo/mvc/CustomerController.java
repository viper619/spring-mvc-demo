package com.viper.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.viper.springdemo.mvc.modal.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController
{

	//	to trim all the strings to remove blank spaces
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder)
	{
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model model)
	{
		model.addAttribute("customer", new Customer());
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String showForm(@Valid 
													 @ModelAttribute("customer")  Customer customer, BindingResult bindingResult)
	{
		System.out.println(bindingResult);
		if(bindingResult.hasErrors()) return "customer-form";
		return "customer-confirmation";
	}
}
