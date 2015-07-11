/**
 * 
 */
package com.udanti.sales.handlerImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.udanti.sales.handler.SalesHandler;
import com.udanti.sales.serviceHandler.SalesServiceHandler;

/**
 * @author hp
 * 
 */
@Service
public class SalesHandlerImpl implements SalesHandler {

	
	@Autowired
	private SalesServiceHandler salesServiceHandler ;
	
	@Override
	public Map<String, Object> SubmitQuotationData(
			final Map<String, Object> quotationUIMap) {
		return salesServiceHandler.saveQuotationData(quotationUIMap);
	}

}
