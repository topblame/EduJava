<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>application_result</title>
</head>
<body>
<div align = "center">
<h2>Application 영역</h2>
<hr />
1. 서버정보: <%=application.getServerInfo() %> <br/>
2. 서블릿 API 버전정보: <%=application.getMajorVersion() %>
3. 06_application_result.jsp 파일 실제 경로 <%=application.getRealPath("06_application_result.jsp") %>
<hr />
<%
application.setAttribute("username", "김민석");
//개발 중 디버깅 용도로 기록
application.log("user login : username = 김민석");
application.log("Debug: 현재 세션 상태 = " + session.getAttribute("state"));
application.setAttribute("count", 0);
%>

<a href = "application_result.jsp">확인하기</a>
</div>
</body>
</html>