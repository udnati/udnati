/**
 * 
 */
package com.udanti.sales.handler;

import java.util.List;
import java.util.Map;

import com.udanti.common.dao.Customer;
import com.udanti.common.dao.Material;

/**
 * @author hp
 *
 */
public interface SalesHandler {

	public boolean createSalesOrder(final Map<String,Map<String, Object>> quotationUIMap);
	
	List<Customer> getCustomerNameList(final Map<String,Object> autoCustomerUIMap);
	
	List<Material>getMaterialList(String query);
}
