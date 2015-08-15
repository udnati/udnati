package com.udanti.common.servicehandler;

import java.util.Map;

public interface CustomerServiceHandler {

	Map<String,Object> saveCustomer(final Map<String,Object> customerUIMap);
}
