<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登入訊息</title>
</head>
<body>
	<%if (session.getAttribute("user")==null){ %>
	<h1>登入失敗!</h1>	
	<%}else{%>
	<h1>登入成功!</h1>
	<%} %>
</body>
</html>