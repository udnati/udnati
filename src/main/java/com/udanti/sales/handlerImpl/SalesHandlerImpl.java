/**
 * 
 */
package com.udanti.sales.handlerImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udanti.common.dao.Customer;
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

	@Override
	public List<Customer> getCustomerNameList(
			final Map<String, Object> autoCustomerUIMap) {
		return salesServiceHandler.populateCustomerNameList(autoCustomerUIMap);
	}

}
