/**
 * 
 */
package com.udanti.sales.handler;

import java.util.Map;

/**
 * @author hp
 *
 */
public interface SalesHandler {

	Map<String,Object> SubmitQuotationData(final Map<String,Object> quotationUIMap);
}
