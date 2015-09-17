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
       if(i.value==i.defaultValue){ i.value=""; i.style.color="#000"; }
    }
    function inputBlur(i){
        if(i.value==""){ i.value=i.defaultValue; i.style.color="#848484"; }
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
                        	prefferedName: item.custId,
                        // following property gets entered in the textbox
                        //value: item.name,
                        // following property is added for our own use
                        //tag_url: "http://" + window.location.host + "/sales/" + item.Id + "/" + item.name
                    };
                    autoFocus: true ;
                }));
            });
        },
    /*     select: function( event, ui ) {
        	 //alert("selected!");
        	 //$("#" + tagQuery).val(ui.item.label);
             //$("#" + tagQuery).val(ui.item.value);
          },
          open: function() {
              $( this ).removeClass( "ui-corner-all" ).addClass( "ui-corner-top" );
            },
            close: function() {
              $( this ).removeClass( "ui-corner-top" ).addClass( "ui-corner-all" );
            },
            messages: {
                noResults: '',
                results: function() {}
            } */
        //define select handler
          select : function(event, ui) {
            if (ui.item) {
                //event.preventDefault();
               // $("#selected_tags span").append('<a href=" + ui.item.tag_url + " target="_blank">'+ ui.item.label +'</a>');
                //$("#tagQuery").value = $("#tagQuery").defaultValue
                //var defValue = $("#tagQuery").prop('defaultValue');
                $("#tagQuery").val(ui.item.label);
                $("#prefferedName").val(ui.item.prefferedName);
                $("#tagQuery").blur();
                return false;
            }
        }  
    });
});
</script>
</head>
<body>
<h1>Create Supply Order</h1>
<form:form action="../sales/createSO"  name="soCreation"  id="soCreation" method="get">
<label>Customer Name</label>
<input id="tagQuery" type="text" name="tagQuery" value="" 
onFocus="inputFocus(this.value)" onBlur="inputBlur(this.value)">
<!-- <label>Customer Name</label><input type="text" name="name" id="name" value=""  onkeyup="showData(this.value);" ></input> -->
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