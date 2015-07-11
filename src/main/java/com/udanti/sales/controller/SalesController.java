package com.udanti.sales.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("sales")
public class SalesController {
	@RequestMapping(value="/salesController",method=RequestMethod.GET)
	public String test(){
		System.out.println("===================>Sales Controller");
		return "/admin/index";
	}
}
