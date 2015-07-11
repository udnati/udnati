package com.udanti.sales.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("sales")
public class SalesController {
	@RequestMapping(value = "/salesController", method = RequestMethod.GET)
	public String test() {
		System.out.println("===================>Sales Controller");
		return "/sales/quotation/quotation";
	}

	@RequestMapping(value = "/salesController", method = RequestMethod.POST)
	public String showQuotationJsp(HttpServletRequest request) {

		Map<String,Object> quotationMap = new HashMap<String,Object>();
		int customerId = 0;
		String customerName = "";
		Calendar date =null ;
		System.out.println("i m in");

		if (StringUtils.isNotBlank(request.getParameter("custId"))) {
			customerId = Integer.valueOf(request.getParameter("custId"));
			System.out.println("CUST iD :" + customerId);
		}
		if (StringUtils.isNotBlank(request.getParameter("custName"))) {
			customerName = request.getParameter("custName");
		}
		System.out.println("customer NAME: " + customerName);
		
		/*if (StringUtils.isNotBlank(request.getParameter("date"))) {
			date =(Calendar)request.getParameter("date");
		}*/
		
		quotationMap.put("customerId", customerId);
		quotationMap.put("customerName",customerName);
		
		
		return "/sales/quotation/quotation";
	}
}
