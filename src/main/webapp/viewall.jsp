<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="header.jsp"/>
<h3 class="center-align">All Employees</h3><br><br><br>
<div class="container">
<table class="striped">
<thead>
          <tr>
              <th>Employee ID</th>
              <th>Employee Name</th>
              <th>Date of Birth</th>
              <th>Basic Salary</th>
              <th colspan="2">Delete/Update</th>
          </tr>
        </thead>
  <c:forEach items="${list}" var="emp">
    <tr>
      <td>${emp.empId}</td>
      <td>${emp.empName}</td>
      <td>${emp.dob}</td>
      <td>${emp.salary}</td>
      <td><a href='DeleteEmployee?empId=${emp.empId}'>Delete</a></td>
      <td><a href='updater?empId=${emp.empId}'>Update</a></td>
      </tr>
  </c:forEach>
</table>
</div>
<jsp:include page="footer.jsp"/>