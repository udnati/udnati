/**
 * 
 */
package com.udanti.sales.serviceHandler;

import java.util.Map;

/**
 * @author hp
 *
 */
public interface SalesServiceHandler {
	
	Map <String, Object> saveQuotationData(final Map<String,Object> quotationUIMap);

}
