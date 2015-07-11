package com.udanti.shipment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("shipment")
public class ShipmentController {
	@RequestMapping(value="/shipmentController",method=RequestMethod.GET)
	public String test(){
		System.out.println("===================>Shipment Controller");
		return "/admin/index";
	}
}
