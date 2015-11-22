package com.udanti.sales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletInputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.udanti.sales.constant.SalesConstant;
import com.udanti.sales.controller.SalesController;
import com.udanti.sales.handlerImpl.SalesHandlerImpl;

public class TestApp {

	static int counter = 100;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SalesHandlerImpl salesHandler = new SalesHandlerImpl();
		final Map<String, Object> salesHdrMap = new HashMap<String, Object>();
		final Map<String, Object> salesDtlMap = new HashMap<String, Object>();
		final Map<String, Map<String, Object>> salesData = new HashMap<String, Map<String, Object>>();

		// final String[] salesHdrCol = ConfigUtil.getConfigUtil()
		// .getPropertVal(SalesConstant.SALES_HDR)
		// .split(CommonConstant.COLON);

		final String[] salesHdrCol = { "custId", "custName", "date",
				"quantity", "expDelvDate", "phNo", "paymentMode" };
		// final String[] salesDtlCol = ConfigUtil.getConfigUtil()
		// .getPropertVal(SalesConstant.SALES_DTL)
		// .split(CommonConstant.COLON);
		final String[] salesDtlCol = { "itemNo", "itenName" };

		for (String col : salesHdrCol) {
			salesHdrMap.put(col, "");
		}

		for (String col : salesDtlCol) {
			salesDtlMap.put(col, counter++);
		}
		salesData.put(SalesConstant.SALES_HDR, salesHdrMap);
		salesData.put(SalesConstant.SALES_DTL, salesDtlMap);

		final boolean salesOrderMap = salesHandler.createSalesOrder(salesData);

	}

}
