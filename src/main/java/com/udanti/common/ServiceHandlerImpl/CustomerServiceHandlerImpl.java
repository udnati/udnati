package com.udanti.common.ServiceHandlerImpl;

import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.udanti.common.dao.Customer;
import com.udanti.common.servicehandler.CustomerServiceHandler;

@Service
@Transactional
public class CustomerServiceHandlerImpl implements CustomerServiceHandler {

	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public Map<String, Object> saveCustomer(Map<String, Object> customerUIMap) {
		String name="";
		 String prefferedName="";
		 String city="";
		 String postalCode="";
		 String region="";
		 String telephone="";
		 String address="";
		 String company="";
		 
		if(customerUIMap.get("name")!=null){
			name=(String)customerUIMap.get("name");
		}
		if(customerUIMap.get("prefferedName")!=null){
			prefferedName=(String)customerUIMap.get("prefferedName");
		}
		if(customerUIMap.get("city")!=null){
			city=(String)customerUIMap.get("city");
		}
		if(customerUIMap.get("postalCode")!=null){
			postalCode=(String)customerUIMap.get("postalCode");
		}
		if(customerUIMap.get("region")!=null){
			region=(String)customerUIMap.get("region");
		}
		if(customerUIMap.get("telephone")!=null){
			telephone=(String)customerUIMap.get("telephone");
		}
		if(customerUIMap.get("address")!=null){
			address=(String)customerUIMap.get("address");
		}
		if(customerUIMap.get("company")!=null){
			company=(String)customerUIMap.get("company");
		}
	Customer customer=new Customer();
		customer.setName(name);
		customer.setPrefferedName(prefferedName);
		customer.setCity(city);
		customer.setPostalCode(postalCode);
		customer.setRegion(region);
		customer.setTelephone(telephone);
		customer.setAddress(address);
		customer.setCompany(company);
		sessionFactory.getCurrentSession().save(customer);
		
		return customerUIMap;
	}

}
