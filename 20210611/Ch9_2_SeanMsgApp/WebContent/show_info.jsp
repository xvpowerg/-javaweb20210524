<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<%=request.getAttribute("info") %> <br/>
	<a href="<%=request.getAttribute("url") %>">繼續</a>
</body>
</html>