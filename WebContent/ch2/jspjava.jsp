<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ÔÚjspÖÐÇ±Èëjava´úÂë</title>
</head>
<body>
<%
	Random rand=new Random();
	for(int i=0;i<10;i++)
	{
		out.println(rand.nextInt(10000));
	}
%>
</body>
</html>