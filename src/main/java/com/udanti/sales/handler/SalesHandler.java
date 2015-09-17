/**
 * 
 */
package com.udanti.sales.handler;

import java.util.List;
import java.util.Map;

import com.udanti.common.dao.Customer;

/**
 * @author hp
 *
 */
public interface SalesHandler {

	Map<String,Object> SubmitQuotationData(final Map<String,Object> quotationUIMap);
	
	List<Customer> getCustomerNameList(final Map<String,Object> autoCustomerUIMap);
}
