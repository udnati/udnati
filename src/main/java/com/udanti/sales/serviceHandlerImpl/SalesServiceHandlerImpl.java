/**
 * 
 */
package com.udanti.sales.serviceHandlerImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.udanti.common.dao.Customer;
import com.udanti.sales.serviceHandler.SalesServiceHandler;

/**
 * @author hp
 * 
 */
@Service
@Transactional
public class SalesServiceHandlerImpl implements SalesServiceHandler {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public Map<String, Object> saveQuotationData(
			Map<String, Object> quotationUIMap) {
		
	System.out.println("map value "+quotationUIMap.get("customerId"));

		final Map<String, Object> quotationDBMap = quotationUIMap;
		return quotationDBMap;
	}
	
	@Override
	public List<Customer> populateCustomerNameList(
			Map<String, Object> autoCustomerUIMap) {
		
	System.out.println("map value "+autoCustomerUIMap.get("autoHint"));

	List<Customer> customerNameList = new ArrayList<Customer>();
	Map<String, Object> map = new HashMap<String, Object>();
		String str = autoCustomerUIMap.get("autoHint") + "%";
	
		try{
		Session session = sessionFactory.getCurrentSession();
		
		Criteria crit = session.createCriteria(Customer.class)
							.add(Restrictions.ilike("name", str));
		crit.setFirstResult(0);
		crit.setMaxResults(10);
		customerNameList=crit.list();
	
		System.out.println("Size of Customer List"+customerNameList.size());
		} catch (Exception e) {

		e.printStackTrace();
	}
	return customerNameList;

	}

}
