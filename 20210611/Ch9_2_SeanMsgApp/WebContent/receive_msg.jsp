<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
　<script>

	var x = 10;	
	console.log(x);
	//每2秒重新整理頁面一次
	setInterval(() => {
		// 重複呼叫的動作
		//重新整理頁面
		location.reload(true);
		//單位毫秒 
	}, 2000);
	
 </script>
</head>
<body>
<%	
	String msg = (String)application.getAttribute("msg");	
%>
<!-- 會呼叫out 不用加上; -->
<%=msg==null?"無訊息":msg%>
</body>
</html>