/**
 * 
 */
package com.udanti.sales.serviceHandler;

import java.util.List;
import java.util.Map;

import com.udanti.common.dao.Customer;

/**
 * @author hp
 *
 */
public interface SalesServiceHandler {
	
	Map <String, Object> saveQuotationData(final Map<String,Object> quotationUIMap);
	
	List<Customer> populateCustomerNameList(final Map<String,Object> autoCustomerUIMap);

}
