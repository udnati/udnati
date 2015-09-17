<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import= "com.udanti.common.dao.Customer"%>
<%
Map<String,Object> autoCustomerDBMap = new HashMap<String,Object>();
List customerNameList = new ArrayList();

if (request.getAttribute("autoCustomerDBMap") != null) {
	autoCustomerDBMap = (Map<String,Object>) request.getAttribute("autoCustomerDBMap");

}
if(autoCustomerDBMap.get("customerNameList") != null){
	customerNameList = (List)autoCustomerDBMap.get("customerNameList");
}
%>

<ul>
	<%	if(customerNameList.size() >0){
		for (Iterator iterator = customerNameList.iterator(); iterator.hasNext();) {
			Customer customerNames = (Customer) iterator.next();
		    String customerName = customerNames.getName();
		   System.out.println("Customer Name is "+customerName);
%>
	<li style="width: auto;"><%=customerName%></li>
	<%}}else{%>
	<li>----------No Items found-------------</li>
	<%} %>
</ul>
</body>
</html>