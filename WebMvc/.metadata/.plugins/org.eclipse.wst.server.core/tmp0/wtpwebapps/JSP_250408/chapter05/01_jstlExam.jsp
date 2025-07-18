<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSTL</title> <!-- java-server standard tag lib -->
</head>
<body bgcolor = "#ffffcc">
<h3>&lt; c:remove&gt;</h3>
<hr />
<!-- java code: var msg = "free" -->
<c:set var ="msg" value = "free"/>
before msg: ${msg }
<br />
<c:remove var = "msg"/>
after msg: ${msg }
<p></p>	

<!-- c:catch java code: try catch  -->
<h3>&lt;c:catch&gt;</h3>
<hr />
<c:catch var ="errMsg">
<%= 9/0 %>
</c:catch>
ERROR Message: ${errMsg}
<p></p>
<hr />


<h3>&lt;c:if&gt;</h3>
<c:set var="ifMsg" value = "user1"/>
ifMsg: ${ifMsg }
<br />

<!-- c:if => java code: if(ifMsg="user1") -->
<c:if test ="${ifMsg == 'user1' }" var = "result">
result: ${result }
</c:if>
<p></p>

<c:set var="name" value = "나세종"/>
이름: ${name }
<br />
<c:if test ="${name eq '나세종'}">
<p>나세종입니다.</p>
</c:if>
<p></p>
<hr />

<h3>&lt;c:choose&gt;</h3>
<c:set var="age" value ="26" />

<c:choose>
	<c:when test = "${age >= 20 }">
		<p>성인입니다.</p>
	</c:when> 
	<c:otherwise>
		<p>미성년자입니다.</p>
	</c:otherwise>
</c:choose>
<p></p>

<c:set var = "role" value = "user"/>
<c:choose>
	<c:when test="${role == 'admin' }">
		<p>Welcome, Admin ! You have full access</p>
	</c:when>
	<c:when test="${role == 'user' }">
		<p>Welcome, user ! You have limited access</p>
	</c:when>
	<c:otherwise>
			<p>Unknown role, access denied</p>
	</c:otherwise>
</c:choose>
<hr />


<!-- c: forEach 태그 / JAVA : for(int i = 1; i <= 5; i++)-->
<c:forEach var = "i" begin = "1" end = "5">
	<p>번호: ${i}</p>
</c:forEach>

</body>
</html>
<!--JSTL(JavaServer Pages Standard Tag Library): JSP에서 자주 사용되는 자바 코드를 태그방식으로 지원 -->