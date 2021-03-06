/**
 * 
 */
package com.udanti.sales.serviceHandler;

import java.util.List;
import java.util.Map;

import com.udanti.common.dao.Customer;
import com.udanti.common.dao.Material;

/**
 * @author hp
 *
 */
public interface SalesServiceHandler {
	
	public boolean saveSalesOrder(final Map<String,Map<String, Object>> quotationUIMap);
	
	List<Customer> populateCustomerNameList(final Map<String,Object> autoCustomerUIMap);
	
	List<Material>getMaterialList(String query);


}
