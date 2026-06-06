<%@page import="com.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Welcome to Dashboard</h1>

	<table border="1" width="300" height="50">

		<tr>
		    <th>Id</th>
			<th>Username</th>
			<th>Password</th>
			<th>City</th>
	        <th>Update</th>
	        <th>Delete</th>
	        
	     </tr>

		<%
			List<Employee> list = (List<Employee>) request.getAttribute("employeeList");
		%>

		

			<%
				for (Employee emp : list) {
			%>
          <tr>
            <td><%=emp.getId()%></td>
			<td><%=emp.getUsername()%></td>
			<td><%=emp.getPassword()%></td>
			<td><%=emp.getCity()%></td>

		</tr>
		
					<%
				}
			%>


	</table>

</body>
</html>