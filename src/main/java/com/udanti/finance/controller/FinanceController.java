package com.udanti.finance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("finance")
public class FinanceController {
	@RequestMapping(value="/financeController",method=RequestMethod.GET)
	public String test(){
		System.out.println("===================>Finance Controller");
		return "/admin/index";
	}

}
