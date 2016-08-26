<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>影院首页</title>
<style type="text/css">
body {
	color: #000;
	font-size: 30px;
	margin: 20px auto;
}
#message {
	text-align: center;
}
</style>
</head>
<body>		
	<div id="message">	
		<br/>
		<font size=20px>影院首页</font> <br />	
		<br /> <br />
		<br /> <a href="<%=request.getContextPath()%>/jsp/show.jsp">显示界面</a>
		<br />
		<br /> <a href="<%=request.getContextPath()%>/jsp/insert.jsp">新增界面</a>
		<br />
		<br /> <a href="<%=request.getContextPath()%>/jsp/login.jsp">登录界面</a>
	</div>
</body>
</html>