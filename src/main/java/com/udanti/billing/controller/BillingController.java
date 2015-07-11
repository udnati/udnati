package com.udanti.billing.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping("billing")
public class BillingController {
	@RequestMapping(value="",method=RequestMethod.GET)
	public String show(){
		System.out.println("===============>show jsp");
		return "/admin/index";

	}
@RequestMapping(value="/test",method=RequestMethod.GET)
	public String test(){
		System.out.println("===================>Billing Controller");
		return "/admin/index";
	}
}
