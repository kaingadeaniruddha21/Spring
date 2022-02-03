<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
      <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer List</title>
</head>
<body>
	<h2>Customer Details</h2>
	<h2>${Customers.customers}</h2>
	<!-- <div align="center">
	<table border="1" cellpadding = "5">
		<caption><h2>List of Customer</h2></caption>
		<tr>
			<th>CustomerId </th>
			<th>CustomerName </th>
			<th></th>
		</tr> -->
		<c:forEach items = "${Customers.customers}" var="cust" >
		<h2>======</h2>
		<h2><c:out value= "${cust}" /></h2>
		<%-- <tr>
			<td><c:out value= "${cust.customerId}" /></td>
			<td><c:out value= "${cust.customerName}" /></td>
			<td><c:out value= "${cust.customerValue}" /> </td>
		</tr> --%>
		</c:forEach>
<!-- 	</table> -->
		
</div>
</body>
</html>