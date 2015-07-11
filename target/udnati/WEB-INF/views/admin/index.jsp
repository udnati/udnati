<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>Udnati</title>
  <link rel="stylesheet"  href="<%=request.getContextPath()%>/resources/css/AdminIndexCss.css" />



</head>
<body>
<div id="topheader">Udnati</div>
<div style="margin-top:50px;">
<div id="containerr" align="center"  >
    <form:form method="post" action="loginCheck" >
            <div><label>Username: </label> <input type="text" name="uName" value="" /></div>
            <div><label>Password: </label><input type="password" name="password" value="" /></div>
		<div><input id="go" type="submit" value="Go" /></div>
	</form:form>
</div>
</div>
<a href="../billing/test">Billing Controller</a></br>
<a href="../delivery/deliveryController">Delivery Controller</a></br>
<a href="../finance/financeController">Finance Controller</a></br>
<a href="../inventory/inventoryController">Inventory Controller</a></br>
<a href="../sales/salesController">Sales Controller</a></br>
<a href="../shipment/shipmentController">Shipment Controller</a></br>
</body>
</html>
