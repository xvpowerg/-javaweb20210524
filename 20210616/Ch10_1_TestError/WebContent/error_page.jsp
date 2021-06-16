<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<H1>錯誤頁面</H1>
		<img alt="error" width="50%" height="50%" src="images/<%=request.getAttribute("error_image")%>"/>
		<H3><%=request.getAttribute("error_msg") %></H3>
</body>
</html>