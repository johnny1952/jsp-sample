<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.text.*,java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>First JSP页面</title>
</head>
<body>
今天的日期是：
<font color="blue">
<%
	SimpleDateFormat sdf=new SimpleDateFormat("yy-MM-dd");
	out.println(sdf.format(new Date()));

%>
</font>
</body>
</html>