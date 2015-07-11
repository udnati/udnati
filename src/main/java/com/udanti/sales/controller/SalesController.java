package com.udanti.sales.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.udanti.sales.handler.SalesHandler;

@Controller
@RequestMapping("sales")
public class SalesController {
	@RequestMapping(value = "/salesController", method = RequestMethod.GET)
	public String test() {
		System.out.println("===================>Sales Controller");
		return "/sales/quotation/quotation";
	}

	@Autowired
	private SalesHandler salesHandler;

	@RequestMapping(value = "/salesController", method = RequestMethod.POST)
	public Model submitQuotation(HttpServletRequest request,Model model) {

		final Map<String, Object> quotationUIMap = new HashMap<String, Object>();

		int customerId = 0;
		String customerName = "";
		System.out.println("i m in");

		if (StringUtils.isNotBlank(request.getParameter("custId"))) {
			customerId = Integer.valueOf(request.getParameter("custId"));
			System.out.println("CUST iD :" + customerId);
		}
		if (StringUtils.isNotBlank(request.getParameter("custName"))) {
			customerName = request.getParameter("custName");
		}
		System.out.println("customer NAME: " + customerName);

		/*
		 * if (StringUtils.isNotBlank(request.getParameter("date"))) { date
		 * =(Calendar)request.getParameter("date"); }
		 */

		quotationUIMap.put("customerId", customerId);
		quotationUIMap.put("customerName", customerName);

		final Map<String, Object> quotationDBMap = salesHandler
				.SubmitQuotationData(quotationUIMap);
		System.out.println("return cust ID : "
				+ quotationDBMap.get("customerId").toString());
		model.addAttribute("quotationDBMap", quotationDBMap);
		String jspName = "/sales/quotation/quotation";
		
		return model;

	}
}
