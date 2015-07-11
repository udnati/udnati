package com.udanti.delivery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("delivery")
public class DeliveryController {
@RequestMapping(value="/deliveryController",method=RequestMethod.GET)
public String test(){
	System.out.println("===================>Delivery Controller");
	return "/admin/index";
}

}
