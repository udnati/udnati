/**
 * 
 */
package com.udanti.sales.handlerImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udanti.common.dao.Customer;
import com.udanti.common.dao.Material;
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
	public boolean createSalesOrder(
			final Map<String, Map<String, Object>> salesData) {
		return salesServiceHandler.saveSalesOrder(salesData);
	}

	@Override
	public List<Customer> getCustomerNameList(
			final Map<String, Object> autoCustomerUIMap) {
		return salesServiceHandler.populateCustomerNameList(autoCustomerUIMap);
	}

	@Override
	public List<Material> getMaterialList(String query) {
		return salesServiceHandler.getMaterialList(query);
	}
}
