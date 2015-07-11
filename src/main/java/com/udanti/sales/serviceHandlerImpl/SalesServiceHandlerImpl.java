/**
 * 
 */
package com.udanti.sales.serviceHandlerImpl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.udanti.sales.serviceHandler.SalesServiceHandler;

/**
 * @author hp
 * 
 */
@Service
public class SalesServiceHandlerImpl implements SalesServiceHandler {

	@Override
	public Map<String, Object> saveQuotationData(
			Map<String, Object> quotationUIMap) {
		
	System.out.println("map value "+quotationUIMap.get("customerId"));

		final Map<String, Object> quotationDBMap = quotationUIMap;
		return quotationDBMap;
	}

}
