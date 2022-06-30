<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri = "http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>조인(Join) 정보 출력</title>
</head>
<body>

<center>
	<h2>조인(Join) 정보 출력</h2>
	<hr>
	<table border="1" width="600" cellspacing="0" cellpadding="0">
	<tr>
		<td>EMPLOYEE_ID</td>
		<td>FIRST_NAME</td>
		<td>LAST_NAME</td>
		<td>EMAIL</td>
		<td>PHONE_NUMBER</td>
		<td>HIRE_DATE	</td>
		<td>JOB_ID</td>
		<td>SALARY</td>
		<td>COMMISSION_PCT</td>
		<td>MANAGER_ID</td>
		<td>DEPARTMENT_ID</td>
		<td>DEPARTMENT_NAME</td>
		<td>LOCATION_ID</td>
		<td>STREET_ADDRESS</td>
		<td>POSTAL_CODE</td>
		<td>CITY</td>
		<td>STATE_PROVINCE</td>
		<td>COUNTRY_ID</td>
		<td>START_DATE</td>
		<td>END_DATE</td>
	</tr>
	
	<!-- LOOP 시작 -->
	<c:forEach items="${joinList }" var="join">
	<tr>
		<td>${join.empsVO.employee_id }</td>
		<td>${join.empsVO.first_name }</td>
		<td>${join.empsVO.last_name }</td>
		<td>${join.empsVO.email }</td>
		<td>${join.empsVO.phone_number }</td>
		<td>${join.empsVO.hire_date }</td>
		<td>${join.empsVO.job_id }</td>
		<td>${join.empsVO.salary }</td>
		<td>${join.empsVO.commission_pct }</td>
		<td>${join.empsVO.manager_id }</td>
		<td>${join.empsVO.department_id }</td>
		<td>${join.detpsVO.department_name }</td>
		<td>${join.detpsVO.location_id }</td>
		<td>${join.locVO.street_address }</td>
		<td>${join.locVO.postal_code }</td>
		<td>${join.locVO.city }</td>
		<td>${join.locVO.state_province }</td>
		<td>${join.locVO.country_id }</td>
		<td>${join.jobhVO.start_date }</td>
		<td>${join.jobhVO.end_date }</td>
	</tr>
	
	</c:forEach>
	
	
	</table>


</center>

</body>
</html>