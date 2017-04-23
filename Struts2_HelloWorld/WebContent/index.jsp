<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<p>${pageContext.request.contextPath}</p>
	<a href="${pageContext.request.contextPath}/helloworld.action">请点击这里</a>
	<br>
	<a href="${pageContext.request.contextPath}/myaction/hello.action">测试hello.action</a>
	<br>
	<h2>以下为动态方法调用</h2>
	<a href="${pageContext.request.contextPath}/customer/customer_add.action">新增用户</a>
		<br>
	<a href="${pageContext.request.contextPath}/customer/customer_update.action">修改用户</a>
		<br>
	<a href="${pageContext.request.contextPath}/customer/customer_delete.action">删除用户</a>
</body>
</html>