<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
//request, response에 선언없이 접근가능
String mainmenu = request.getParameter("main_menu");
String sidemenu = request.getParameter("side_menu");
String drinkmenu = request.getParameter("drink_menu");
//int값은 따로 선언
//저장된  속성 가져오기
//다운캐스팅,업캐스팅 공부
int sum = (int) request.getAttribute("sum");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메뉴주문</title>
<style>
span#mainmenu {
	color: navy;
	font-size: 2em;
}

span#sidemenu {
	color: indigo;
	font-size: 1.5em;
}

span#drinkmenu {
	color: yellowgreen;
}

span#sum {
	color: maroon;
	font-size: 2.5em;
}
</style>
</head>
<body>
	<h1>감사합니다</h1>
	<span id="mainmenu"><%=mainmenu%>,</span>
	<span id="sidemenu"><%=sidemenu%>,</span>
	<span id="drinkment"><%=drinkmenu%></span>을주문하셨습니다.
	<br> 총 결제금액은
	<span id="sum"><%=sum%></span>원입니다.

</body>
</html>