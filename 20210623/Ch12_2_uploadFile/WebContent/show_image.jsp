<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>圖庫</title>
</head>
<body>
	<!-- 顯示圖片 -->
	<%List<String> imageList = (List)request.getAttribute("imageList"); %>
	<%for(String im : imageList) {%>
	
	<img width="20%" height="20%" 
	alt="<%=im%>" src="/<%=application.getInitParameter("imageContextPath")%>/<%=im%>"></br>
		
	<%} %>
</body>
</html>