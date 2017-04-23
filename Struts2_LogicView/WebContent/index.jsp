<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>${pageContext.request.contextPath}</p>
	<a href="${pageContext.request.contextPath}/demo1.action">调用局部视图</a>
	<br>
	<a href="${pageContext.request.contextPath}/demo2.action">用demo2转到全局视图demo2</a>
	<br>
	<a href="${pageContext.request.contextPath}/demo3.action">用demo3转到全局视图demo2</a>
</body>
</html>