package com.udanti.common.handlerImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.udanti.common.handler.CustomerHandler;
import com.udanti.common.servicehandler.CustomerServiceHandler;


@Service
public class CustomerHandlerImpl implements CustomerHandler {

	@Autowired
	CustomerServiceHandler customerServiceHandler;
	
	@Override
	public Map<String, Object> saveCustomer(Map<String, Object> customerUIMap) {
		return customerServiceHandler.saveCustomer(customerUIMap);
		
	}

}
