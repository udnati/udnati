package com.udanti.sales.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.udanti.common.dao.Customer;
import com.udanti.sales.handler.SalesHandler;

@Controller
@RequestMapping("sales")
public class SalesController extends MultiActionController {
	@RequestMapping(value = "/salesController", method = RequestMethod.GET)
	public String test() {
		System.out.println("===================>Sales Controller");
		return "/sales/quotation/quotation";
	}

	@Autowired
	private SalesHandler salesHandler;

	@RequestMapping(value = "/salesController", method = RequestMethod.POST)
	public String submitQuotation(HttpServletRequest request, Model model) {

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
		String jspName = "/sales/quotation/quotationSave";

		return jspName;

	}
	
	@RequestMapping(value = "/createSO", method = RequestMethod.GET)
	public String createSO(){
		
		
		String jspName = "/sales/so/soCreation";
		return jspName;
	}
	@ResponseBody
	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, value="/searchCustomerName" , method=RequestMethod.GET)
	public   List getCustomerNameList(@RequestParam("term") String query) {

		String autoHint = "";
		String jsp="";
		StringBuilder sb = new StringBuilder();
		boolean namesAdded = false;
		Map<String, Object> autoCustomerUIMap = new HashMap<String, Object>();
		Map<String, Object> autoCustomerDBMap = new HashMap<String, Object>();	
		List<Customer> customerNameList = new ArrayList<Customer>();
			/*if (request.getParameter("query") != null) {
				autoHint = (request.getParameter("query"));
			}*/
			System.out.println("value of autohint is "+autoHint);
			autoCustomerUIMap.put("autoHint", query);
			
			customerNameList = salesHandler.getCustomerNameList(autoCustomerUIMap);
			
			System.out.println("size of list"+customerNameList.size());
			  return customerNameList;
		
		//jsp = "responseForCustomerName";

		//return new ModelAndView(jsp, "map", autoCustomerDBMap);
	}

}
