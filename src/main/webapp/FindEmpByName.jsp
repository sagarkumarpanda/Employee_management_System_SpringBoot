<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <jsp:include page="header.jsp"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2 align="center">Find Employee By Name</h2>
<div align="center"> 
<form action="employeeByname">
<h2>Enter name <input type="text" name="empName"></h2>
<input type="submit" size="120px" value="Search">
</form>
</div>

</body>
</html>
<jsp:include page="footer.jsp"/>