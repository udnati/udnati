<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Generate Supply Order</title>
 <script type="text/javascript" src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="http://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
<script src="js/jquery/jquery.ui.core.min.js"></script>
<script src="js/jquery/jquery.ui.widget.min.js"></script>
<script src="js/jquery/jquery.ui.position.min.js"></script>
<script src="js/jquery/jquery.ui.autocomplete.min.js"></script>
<script src="http://code.jquery.com/ui/1.11.1/jquery-ui.min.js"></script>

<link rel="stylesheet" href="js/jquery/smoothness/jquery-ui-1.8.16.custom.css"/>


<script type="text/javascript">
    function inputFocus(i){
     //  if(i.value==i.defaultValue){ i.value=""; i.style.color="#000"; }
    }
    function inputBlur(i){
       // if(i.value==""){ i.value=i.defaultValue; i.style.color="#848484"; }
    }
</script>
<script>


$(document).ready(function() {
    //attach autocomplete
    $('#tagQuery').autocomplete({
        minLength: 1,
        delay: 500,
        //define callback to format results
        source: function (request, response) {
            $.getJSON("/udnati/sales/searchCustomerName", request, function(result) {
                response($.map(result, function(item) {
                    return {
                        // following property gets displayed in drop down
                        	label: item.name,
                        	custId: item.custId,
                        	city: item.city,
                        	telephone: item.telephone,
                        	address: item.address,
                        	balanceType: item.balanceType,
                        	balance: item.balance,
                    };
                    autoFocus: true ;
                }));
            });
        },
   
        //define select handler
          select : function(event, ui) {
            if (ui.item) {
                $("#tagQuery").val(ui.item.label);
                $("#custId").val(ui.item.custId);
                $("#custCity").val(ui.item.city);
                $("#telephone").val(ui.item.telephone);
                $("#custAddress").val(ui.item.address);
                $("#creditDebit").val(ui.item.balanceType);
                $("#balance").val(ui.item.balance);
                $("#tagQuery").blur();
                return false;
            }
        }  
    });
    
     //Added By Sandeep for displaying Material List
    $('#material').autocomplete({
        minLength: 1,
        delay: 500,
        //define callback to format results
        source: function (request, response) {
            $.getJSON("/udnati/sales/searchMaterial", request, function(result) {
                response($.map(result, function(item) {
                    return {
                        // following property gets displayed in drop down
                        	label: item.materialName,
                        	materialId: item.materialId,
                        	price: item.rate,
                        	
                    };
                    autoFocus: true ;
                }));
            });
        },
   
        //define select handler
          select : function(event, ui) {
            if (ui.item) {
                $("#material").val(ui.item.label);
                $("#materialId").val(ui.item.materialId);
                $("#materialPrice").val(ui.item.price);
                $("#material").blur();
                return false;
            }
        }  
    });  
});
</script>
</head>
<style>
table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
}
th, td {
    padding: 3px;
}
</style>
<body>
<h1>Create Supply Order</h1>
<form:form action="../sales/createSO"  name="soCreation"  id="soCreation" method="POST">
<label>Customer Id</label>
<input type="text" name="custId" id="custId" value=""></input>

<label>Customer Name</label>
<input id="tagQuery" type="text" name="customerName" value="" 
onFocus="inputFocus(this.value)" onBlur="inputBlur(this.value)">

<label>Expected Date</label>
<input type="text" name="deliveryDate" id="deliveryDate" value=""></input>

<div class="clear"></div>
<label>Customer City</label>
<input type="text" name="custCity" id="custCity" value=""></input>

<label>Telephone</label>
<input type="text" name="telephone" id="telephone" value="">

<label>Transport </label>
<input type="text" name="transport" id="transport" value=""></input>

<div class="clear"></div>

<label>Customer Address</label>
<textarea rows="2" cols="25" name="custAddress" id="custAddress"></textarea>

<label>Delivery Address</label>
<textarea rows="2" cols="25" name="deliveryAddress" id="deliveryAddress"></textarea>

<div class="clear"></div>

<label>Contact Person </label>
<input type="text" name="contPerson" id="contPerson" value=""></input>

<label>Credit/Debit </label>
<input type="text" name="creditDebit" id="creditDebit" value=""></input>

<label>Balance </label>
<input type="text" name="balance" id="balance" value=""></input>

<div class="clear"></div>
<input type="button" value="Add Row" id="addCF"/>
<div class="clear"></div>
<table id="customFields">
<tr>
	<th>Material</th>
	<th>Material Id</th>
	<th>Material Price</th>
	<th>Material Qty</th>
	<th>Amount</th>
</tr>
<tr>
	<td><input type="text" name="material" id="material" value="${i}"></input></td>
	<td><input type="text" name="materialId" id="materialId" value=""></input></td>
	<td><input type="text" name="materialPrice" id="materialPrice" value=""></input></td>
	<td><input type="text" name="materialQty" id="materialQty" value=""></input></td>
	<td><input type="text" name="amount" id="amount" value=""></input></td>
</tr>
<tr>
	<td><input type="text" name="material" id="material" value="${i}"></input></td>
	<td><input type="text" name="materialId" id="materialId" value=""></input></td>
	<td><input type="text" name="materialPrice" id="materialPrice" value=""></input></td>
	<td><input type="text" name="materialQty" id="materialQty" value=""></input></td>
	<td><input type="text" name="amount" id="amount" value=""></input></td>
</tr>
<tr>
	<td><input type="text" name="material" id="material" value="${i}"></input></td>
	<td><input type="text" name="materialId" id="materialId" value=""></input></td>
	<td><input type="text" name="materialPrice" id="materialPrice" value=""></input></td>
	<td><input type="text" name="materialQty" id="materialQty" value=""></input></td>
	<td><input type="text" name="amount" id="amount" value=""></input></td>
</tr>
<tr>
	<td><input type="text" name="material" id="material" value="${i}"></input></td>
	<td><input type="text" name="materialId" id="materialId" value=""></input></td>
	<td><input type="text" name="materialPrice" id="materialPrice" value=""></input></td>
	<td><input type="text" name="materialQty" id="materialQty" value=""></input></td>
	<td><input type="text" name="amount" id="amount" value=""></input></td>
</tr>
</table>



<div class="clear"></div>
<input type="submit" value="Submit" />
</form:form>

</body>
<script>
$(document).ready(function(){
    $("#addCF").click(function(){
        $("#customFields").append('<tr valign="top"><td><input type="text" id="material1" name="material1" value=""/> </td> <td><input type="text"  id="materialId" name="materialId" value="" /></td> <td><input type="text"  id="materialPrice" name="materialPrice" value="" /></td> <td><input type="text"  id="materialQty" name="materialQty" value="" /></td> <td><input type="text"  id="amount" name="amount" value="" /></td> <td><a href="javascript:void(0);" class="remCF">Remove</a></td></tr>');
    });
    $("#customFields").on('click','.remCF',function(){
        $(this).parent().parent().remove();
    });
});


 
</script>
</html>