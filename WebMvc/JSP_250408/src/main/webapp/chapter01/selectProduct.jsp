<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>selectProduct.jsp</title>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");

	//사용자가 입력한 이름 세션에 저장
	String username = (String) request.getParameter("username");
	if (username == null) {
		//request 영역에서 받아오지 못하면 이미 로그인시 저장해둔 세션에서 직접 가져오겠다.
		username = (String) session.getAttribute("username");
	}
	session.setAttribute("username", username);
	%>

	<div align="center">
		<h2>상품 선택</h2>
		<p>
			<strong><%=session.getAttribute("username")%></strong>
		</p>
		<form action="addProduct.jsp" method="get">
			<label>원하는 상품을 선택하세요. : </label> 
			<select name="product">
				<option value="사과">사과</option>
				<option value="귤">귤</option>
				<option value="파인애플">파인애플</option>
				<option value="복숭아">복숭아</option>
				<option value="자몽">자몽</option>
			</select><br>
			<p />
			<input type="submit" value="추가" />
		</form>
		<hr />
		<a href="viewCart.jsp"> 장바구니 확인 </a>
	</div>
</body>
</html>