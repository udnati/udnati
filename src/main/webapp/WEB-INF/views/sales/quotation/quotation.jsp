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
<form:form action="../sales/salesController"  name="quotation"  id="quotation" method="post">
<label>Customer Id</label><input type="text" name="custId" id="custId" value="" ></input>
<label>Customer Name</label><input type="text" name="custName" id="custName" value="" ></input>
<label>Date</label><input type="text" name="date" id="date" value=""></input>
<div class="clear"></div>
<label>Item No.</label><input type="text" name="itemNo" id="itemNo" value=""></input>
<label>Item Name</label><input type="text" name ="itemName" id="itemName" value="">
<label>Quantity</label><input type="text" name="quantity" id="quantity" value="">
<div class="clear"></div>
<label>Expected Delivery Date</label><input type="text" name="expDelvDate" id="expDelvDate" value="">
<label>Phone No.</label><input type="text" name="phNo" id="phNo" value="">
<label>Payment Mode</label><input type="text" name="paymentMode" id="paymentMode" value="">
<div class="clear"></div>
<input type="submit" value="Submit" />
</form:form>

</body>
</html>