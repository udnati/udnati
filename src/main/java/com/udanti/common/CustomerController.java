package com.udanti.common;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.udanti.common.CommonConstant;
import com.udanti.common.handler.CustomerHandler;

@Controller
@RequestMapping("customer")
public class CustomerController {
	
	@Autowired
	CustomerHandler customerHandler;
	
	@RequestMapping(value = "/saveCustomer", method = RequestMethod.GET)
	public String test() {
		return CommonConstant.CUSTOMER_MASTER+"customer";
	}

	@RequestMapping(value = "/saveCustomer", method = RequestMethod.POST)
	public String saveCustomer(HttpServletRequest request, Model model) {
		final Map<String, Object> customerUIMap = new HashMap<String, Object>();
		 String name="";
		 String prefferedName="";
		 String city="";
		 String postalCode="";
		 String region="";
		 String telephone="";
		 String address="";
		 String company="";
		 if (StringUtils.isNotBlank(request.getParameter("name"))) {
			 name = request.getParameter("name");
			}
		 if (StringUtils.isNotBlank(request.getParameter("prefferedName"))) {
			 prefferedName = request.getParameter("prefferedName");
			}
		 if (StringUtils.isNotBlank(request.getParameter("city"))) {
			 city = request.getParameter("city");
			}
		 if (StringUtils.isNotBlank(request.getParameter("postalCode"))) {
			 postalCode = request.getParameter("postalCode");
			}
		 if (StringUtils.isNotBlank(request.getParameter("region"))) {
			 region = request.getParameter("region");
			}
		 if (StringUtils.isNotBlank(request.getParameter("telephone"))) {
			 telephone = request.getParameter("telephone");
			}
		 if (StringUtils.isNotBlank(request.getParameter("address"))) {
			 address = request.getParameter("address");
			}
		 if (StringUtils.isNotBlank(request.getParameter("company"))) {
			 company = request.getParameter("company");
			}
		 customerUIMap.put("name", name);
		 customerUIMap.put("prefferedName", prefferedName);
		 customerUIMap.put("city", city);
		 customerUIMap.put("postalCode", postalCode);
		 customerUIMap.put("region", region);
		 customerUIMap.put("telephone", telephone);
		 customerUIMap.put("address", address);
		 customerUIMap.put("company", company);
			System.out.println("=============>"+name);
		 final Map<String, Object> customerDBMap = customerHandler
					.saveCustomer(customerUIMap);
		 
		 return CommonConstant.CUSTOMER_MASTER+"customer";
	}
}
