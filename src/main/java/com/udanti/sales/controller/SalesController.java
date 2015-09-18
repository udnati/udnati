package com.udanti.sales.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import org.xml.sax.SAXException;

import com.udanti.common.CommonConstant;
import com.udanti.common.dao.Customer;
import com.udanti.common.utils.ConfigUtil;
import com.udanti.sales.constant.SalesConstant;
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
	public String createSaelesOrder(final HttpServletRequest request,
			final Model model) throws ParserConfigurationException, SAXException, IOException {

		final Map<String, Object> salesHdrMap = new HashMap<String, Object>();
		final Map<String, Object> salesDtlMap = new HashMap<String, Object>();
		final Map<String, Map<String, Object>> salesData = new HashMap<String, Map<String, Object>>();

		final String[] salesHdrCol = ConfigUtil.getConfigUtil()
				.getPropertVal(SalesConstant.SALES_HDR)
				.split(CommonConstant.COLON);
		
		final String[] salesDtlCol = ConfigUtil.getConfigUtil()
				.getPropertVal(SalesConstant.SALES_DTL)
				.split(CommonConstant.COLON);

		for(String col : salesHdrCol){
			salesHdrMap.put(col, getPropFromRequest(request,col));
		}
		
		for(String col : salesDtlCol){
			salesDtlMap.put(col, getPropFromRequest(request,col));
		}
		salesData.put(SalesConstant.SALES_HDR, salesHdrMap);
		salesData.put(SalesConstant.SALES_DTL, salesDtlMap);

		final boolean salesOrderMap = salesHandler
				.createSalesOrder(salesData);
//		System.out.println("return cust ID : "
//				+ salesOrderMap.get("customerId").toString());
		model.addAttribute("quotationDBMap", salesOrderMap);
		String jspName = "/sales/quotation/quotationSave";

		return jspName;

	}

	@RequestMapping(value = "/createSO", method = RequestMethod.GET)
	public String createSO() {

		String jspName = "/sales/so/soCreation";
		return jspName;
	}

	@ResponseBody
	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/searchCustomerName", method = RequestMethod.GET)
	public List getCustomerNameList(@RequestParam("term") String query) {

		String autoHint = "";
		String jsp = "";
		StringBuilder sb = new StringBuilder();
		boolean namesAdded = false;
		Map<String, Object> autoCustomerUIMap = new HashMap<String, Object>();
		Map<String, Object> autoCustomerDBMap = new HashMap<String, Object>();
		List<Customer> customerNameList = new ArrayList<Customer>();
		/*
		 * if (request.getParameter("query") != null) { autoHint =
		 * (request.getParameter("query")); }
		 */
		System.out.println("value of autohint is " + autoHint);
		autoCustomerUIMap.put("autoHint", query);

		customerNameList = salesHandler.getCustomerNameList(autoCustomerUIMap);

		System.out.println("size of list" + customerNameList.size());
		return customerNameList;

		// jsp = "responseForCustomerName";

		// return new ModelAndView(jsp, "map", autoCustomerDBMap);
	}
final String getPropFromRequest(final HttpServletRequest request , final String prop ){
	if (StringUtils.isNotBlank(request.getParameter(prop))) {
		return String.valueOf(request.getParameter(prop));
	}
	return StringUtils.EMPTY;
}
}
