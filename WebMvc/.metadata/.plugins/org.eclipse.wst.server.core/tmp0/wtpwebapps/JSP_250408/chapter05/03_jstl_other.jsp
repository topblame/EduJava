<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor = "#FFFFcc">
<center>
<h3>&lt;c:import&gt;</h3>
</center>
<hr />

<center><h3>import:www.daum.net</h3></center>
<c:import url = "https://www.daum.net/" var = "myurl"/>
<c:out value = "${myurl }" escapeXml = "true" />
<hr />

</body>
</html>