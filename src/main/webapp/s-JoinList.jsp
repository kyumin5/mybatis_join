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
	<table border="1" width="900" cellspacing="0" cellpadding="0">
	<tr>
		<td>EMPNO</td>
		<td>ENAME</td>
		<td>SALARY</td>
		<td>DNO</td>
		<td>DEPTNO</td>
		<td>LOC</td>
	</tr>
	
	<!-- LOOP 시작 -->
	<c:forEach items="${joinList }" var="join">
	<tr>
		<td>${join.spring_emp.empno }</td>
		<td>${join.spring_emp.ename }</td>
		<td>${join.spring_emp.sal }</td>
		<td>${join.spring_dept.deptno }</td>
		<td>${join.spring_dept.dname }</td>
		<td>${join.spring_dept.loc }</td>
	</tr>
	
	</c:forEach>
	
	
	</table>


</center>

</body>
</html>