package com.udanti.inventory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("inventory")
public class InventoryController {
	@RequestMapping(value="/inventoryController",method=RequestMethod.GET)
	public String test(){
		System.out.println("===================>Inventory Controller");
		return "/admin/index";
	}
}
