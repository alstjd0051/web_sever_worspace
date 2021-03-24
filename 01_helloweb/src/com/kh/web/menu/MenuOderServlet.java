package com.kh.web.menu;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MenuOderServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//1. 사용자 입력값 처리
		String main_menu = request.getParameter("main_menu");
		String side_menu = request.getParameter("side_menu");
		String drink_menu = request.getParameter("drink_menu");
		
		//추력식으로 확인
		
		//2 합계계산 switch문
		int price = 0;
		switch(main_menu) {
		case "한국버거" : price += 5000; break;
		case "밥버거" : price += 4500; break;
		case "치즈버거" : price += 4000; break;
		}
		switch(side_menu) {
		case "감자튀김" : price += 1500; break;
		case "어니언링" : price += 1700; break;
		}
		switch(drink_menu) {
		case "콜라" :
		case "사이다" : price += 1000; break; //switch fall-through
		case "커피" : price += 1500; break;
		case "밀크쉐이크" : price += 2500; break;
		}
		
		request.setAttribute("price", price);
		//3 jsp위임 처리
		// /menu/menuOrder.jsp
		RequestDispatcher reqDispatcher
		=request.getRequestDispatcher("/menu/menuOrder.jsp");
		reqDispatcher.forward(request, response);
	}

}
