<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Quotation</title>
</head>
<body>
<h1>Create a Customer</h1>
<form:form action="../customer/saveCustomer"  name="customer"  id="customer" method="post">
<label>Customer Name</label><input type="text" name="name" id="name" value="" ></input>
<label>Customer Preffered Name</label><input type="text" name="prefferedName" id="prefferedName" value="" ></input>
<div class="clear"></div>
<label>City</label><input type="text" name="city" id="city" value=""></input>
<label>Postal Code </label><input type="text" name="postalCode" id="postalCode" value=""></input>
<div class="clear"></div>
<label>Region</label><input type="text" name ="region" id="region" value="">
<label>Telephone</label><input type="text" name="telephone" id="telephone" value="">
<div class="clear"></div>
<label>Address</label><input type="text" name="address" id="address" value="">
<label>Company</label><input type="text" name="company" id="company" value="">
<div class="clear"></div>

<input type="submit" value="Submit" />
</form:form>

</body>
</html>