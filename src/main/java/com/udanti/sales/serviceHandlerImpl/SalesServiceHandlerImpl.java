/**
 * 
 */
package com.udanti.sales.serviceHandlerImpl;

import java.util.ArrayList;
import java.util.Date;
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
import com.udanti.common.dao.Material;
import com.udanti.sales.constant.SalesConstant;
import com.udanti.sales.dao.SalesHeader;
import com.udanti.sales.dao.SalesItem;
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
	public boolean saveSalesOrder(
			final Map<String, Map<String, Object>> salesData) {
		
	System.out.println("map value "+salesData.get("customerId"));
	
	final Map<String, Object> salesHdrMap = salesData.get(SalesConstant.SALES_HDR);
	final Map<String, Object> salesDtlMap = salesData.get(SalesConstant.SALES_DTL);
	
	final SalesHeader salesHeader = new SalesHeader();
	salesHeader.setCustomerId(new Customer(Integer.parseInt(String.valueOf(salesHdrMap.get("custId")))));
	salesHeader.setPropDate(new Date());
	salesHeader.setTelephone(String.valueOf(salesHdrMap.get("telephone")));
	salesHeader.setPaymentMethods(String.valueOf(salesHdrMap.get("creditDebit")));
	salesHeader.setName(String.valueOf(salesHdrMap.get("contPerson")));
	
	final SalesItem salesItem = new SalesItem();
	//salesItem.setSalesHeader(salesHeader);
	
   sessionFactory.getCurrentSession().save(salesHeader);
   
   salesItem.setSalesHeader(salesHeader);
	//salesItem.setSalesHeader(new SalesHeader(salesHeader.getSalesNumber()));
	sessionFactory.getCurrentSession().save(salesItem);
	
	return true;
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
	@Override
	public List<Material> getMaterialList(String query) {
		Session session = sessionFactory.getCurrentSession();
		List<Material> materialList = new ArrayList<Material>();
		try{
		String str = query + "%";
		
		Criteria crit = session.createCriteria(Material.class)
				.add(Restrictions.ilike("materialName", str));
		crit.setFirstResult(0);
		crit.setMaxResults(10);
		materialList=crit.list();
		}catch(Exception e){
			e.printStackTrace();
		}
		return materialList;
	}
}
