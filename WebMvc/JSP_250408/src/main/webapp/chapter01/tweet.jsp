<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Tweet</title>
<link rel = "stylesheet" type = "text/css" href = "../css/twitter.css">
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");

//로그인 정보 가져오기(session)
String id = (String)session.getAttribute("id");
//트윗 메세지 가져오기(request)
String msg = request.getParameter("msg");

//msgs==null 일때 msgs 를 만들어서 application에 저장
ArrayList<String> msgs = (ArrayList<String>) application.getAttribute("msgs");
if(msgs == null){
	msgs = new ArrayList<String>();
	application.setAttribute("msgs", msgs);
}
//msgs에 메세지 추가
msgs.add(id + ": " + msg);
//tweet_list 페이지로 이동
response.sendRedirect("twitter_list.jsp");
%>
</body>
</html>