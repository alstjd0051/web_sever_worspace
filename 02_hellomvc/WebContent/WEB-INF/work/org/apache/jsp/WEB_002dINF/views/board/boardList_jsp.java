/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.44
 * Generated at: 2021-04-16 10:33:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import board.model.vo.BoardCommentCount;
import board.model.vo.Board;
import java.util.List;
import member.model.service.MemberService;
import member.model.vo.Member;

public final class boardList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1617952724000L));
    _jspx_dependants.put("/WEB-INF/views/common/footer.jsp", Long.valueOf(1616656753000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.model.service.MemberService");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("board.model.vo.BoardCommentCount");
    _jspx_imports_classes.add("member.model.vo.Member");
    _jspx_imports_classes.add("board.model.vo.Board");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("   ");

   	String msg = (String)session.getAttribute("msg");
   	if(msg != null) session.removeAttribute("msg"); //1?????? ?????????
   	
   	String signupMsg = (String)session.getAttribute("signupMsg");
   	if(signupMsg != null) session.removeAttribute("signupMsg");
   	
   	String updateMsg = (String)session.getAttribute("updateMsg");
   	if(updateMsg != null) session.removeAttribute("updateMsg");
   	
   	String deleteMsg = (String)session.getAttribute("deleteMsg");
   	if(deleteMsg != null) session.removeAttribute("deleteMsg");
   	
   	String loc = (String)request.getAttribute("loc");
   	//Member loginMember = (Member)request.getAttribute("loginMember");
   	Member loginMember = (Member)session.getAttribute("loginMember");
   	//????????? ?????? ????????? ????????? ?????????, ????????? ???????????? member = null??? ??? ???
   			
	//????????? ????????????
	String saveId = null;
	Cookie[] cookies = request.getCookies();
   	if(cookies != null){
   		for(Cookie c : cookies){
   			String name = c.getName();
   			String value = c.getValue();
   			System.out.println("coockies name, value @header.jsp=" + name + " : " + value);
   			if("saveId".equals(name)) saveId = value;
   		}
   	}
	
	
   
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Hello MVC</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/style.css\" />\n");
      out.write("<script src=\"");
      out.print( request.getContextPath() );
      out.write("/js/jquery-3.6.0.js\"></script>\n");
      out.write("<script>\n");
 if(msg != null) {
      out.write("\n");
      out.write("\talert(\"");
      out.print( msg );
      out.write("\");\n");
 } 
      out.write('\n');
      out.write('\n');
 if(loc != null){ 
      out.write("\n");
      out.write("\tlocation.href = \"");
      out.print( loc );
      out.write('"');
      out.write(';');
      out.write('\n');
 } 
      out.write('\n');
      out.write('\n');
 System.out.println("signupMsg@header=" + signupMsg); 
      out.write('\n');
 if(signupMsg != null) {
      out.write("\n");
      out.write("\talert(\"");
      out.print( signupMsg );
      out.write("\");\n");
 } 
      out.write('\n');
      out.write('\n');
 if(updateMsg != null) {
      out.write("\n");
      out.write("\talert(\"");
      out.print( updateMsg );
      out.write("\");\n");
 } 
      out.write('\n');
      out.write('\n');
 if(deleteMsg != null) {
      out.write("\n");
      out.write("\talert(\"");
      out.print( deleteMsg );
      out.write("\");\n");
 } 
      out.write("\n");
      out.write("\t$(function(){\n");
      out.write("\t\t/*\n");
      out.write("\t\t* ????????? ??? ????????? ??????\n");
      out.write("\t\t*/\n");
      out.write("\t\t$('#loginFrm').submit(function(){\n");
      out.write("\t\t\tvar $memberId = $(memberId);\n");
      out.write("\t\t\tvar $password = $(password);\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tif(/^.{4,}$/.test($memberId.val()) == false){\n");
      out.write("\t\t\t\talert(\"????????? ???????????? ???????????????.\");\n");
      out.write("\t\t\t\t$memberId.select();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tif(/^.{4,}$/.test($password.val()) == false){\n");
      out.write("\t\t\t\talert(\"????????? ??????????????? ???????????????.\");\n");
      out.write("\t\t\t\t$password.select();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t/* \n");
      out.write("\t\t???????????? ??? ????????? ????????? ????????? ????????? ????????? ???.\n");
      out.write("\t\t<memberEnroll.jsp?????? ??????>\n");
      out.write("\t\t*/\n");
      out.write("\t/* \t$('[name=\"memberEnrollFrm\"]').submit(function(){\n");
      out.write("\t\t\t//id 4?????????\n");
      out.write("\t\t\tvar $memberId_ = $(\"#memberId_\");\n");
      out.write("\t\t\tif(/^.{4,}$/.test($memberId_.val()) == false){\n");
      out.write("\t\t\t\talert(\"???????????? 4??? ??????????????? ?????????.\");\n");
      out.write("\t\t\t\t$memberId_.select();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t//???????????? -??????\n");
      out.write("\t\t\tvar $phone = $(\"#phone\");\n");
      out.write("\t\t\tif(/^[0-9]{10,11}/.test($phone.val()) == false){\n");
      out.write("\t\t\t\talert(\"??????????????? ???????????? ??????????????????.\");\n");
      out.write("\t\t\t\t$phone.select();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t}); */\n");
      out.write("\t\t\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div id=\"container\">\n");
      out.write("\t\t<header>\n");
      out.write("\t\t\t<h1>Hello MVC</h1>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t<div class=\"login-container\">\n");
      out.write("\t\t\t\t");
 if(loginMember == null) { 
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<!-- ???????????? ?????? -->\n");
      out.write("\t\t\t\t\t<form id=\"loginFrm\" action=\"");
      out.print(request.getContextPath() );
      out.write("/member/login\" method=\"POST\">\n");
      out.write("\t\t\t\t\t\t<table>\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"memberId\" id=\"memberId\" placeholder=\"?????????\" tabindex=\"1\" value=\"");
      out.print( saveId != null ? saveId : "" );
      out.write("\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"submit\" value=\"?????????\" tabindex=\"3\"></td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"password\" name=\"password\" id=\"password\"\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"????????????\" tabindex=\"2\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=\"2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"saveId\" id=\"saveId\" ");
      out.print( saveId != null? "checked" : "" );
      out.write("/>\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"saveId\">???????????????</label>&nbsp;&nbsp;\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"button\" value=\"????????????\" onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/member/memberEnroll'\">\n");
      out.write("\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t<!-- ???????????? ???-->\n");
      out.write("\t\t\t\t\t");
 } else{ 
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t<table id=\"login\">\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print( loginMember.getMemberName() );
      out.write(" ???, ???????????????.</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"button\" value=\"???????????????\" onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/member/memberView';\" />\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"button\" value=\"????????????\"\n");
      out.write("\t\t\t\t\t\t\t\t\tonclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/member/logout';\" />\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t");
 } 
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- ???????????? ?????? -->\n");
      out.write("\t\t\t\t<nav>\n");
      out.write("\t\t\t\t\t<ul class=\"main-nav\">\n");
      out.write("\t\t\t\t\t\t<li class=\"home\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"notice\"><a href=\"#\">????????????</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"board\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/board/boardList\">?????????</a></li>\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
 if(loginMember!=null && MemberService.ADMIN_ROLE.equals(loginMember.getMemberRole())){ 
      out.write("\n");
      out.write("\t\t\t\t\t\t<li class=\"members\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/admin/memberlist\">????????????</a></li>\n");
      out.write("\t\t\t\t\t\t");
 } 
      out.write("\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\t\t\t<!-- ???????????? ???-->\n");
      out.write("\t\t</header>\n");
      out.write("\t\t\n");
      out.write("\t\t<section id=\"content\">");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/board.css\" />\r\n");

	List<BoardCommentCount> list = (List<BoardCommentCount>)request.getAttribute("list");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<section id=\"board-container\">\r\n");
      out.write("\t<h2>????????? </h2>\r\n");
      out.write("\t");
 if(loginMember != null){ 
      out.write("\r\n");
      out.write("\t<input type=\"button\" value=\"?????????\" id=\"btn-add\" onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/board/boardForm';\" />\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("\t<table id=\"tbl-board\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>??????</th>\r\n");
      out.write("\t\t\t<th>??????</th>\r\n");
      out.write("\t\t\t<th>?????????</th>\r\n");
      out.write("\t\t\t<th>?????????</th>\r\n");
      out.write("\t\t\t<th>????????????</th>");
      out.write("\r\n");
      out.write("\t\t\t<th>?????????</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tbody>\r\n");
      out.write("\t\t\t");
 if(list == null || list.isEmpty()){ 
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan =\"6\" style=\"text-align:center\">????????? ???????????? ????????????.</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");

				}else{
					for(BoardCommentCount b : list){
			
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print( b.getNo() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td><a href=\"");
      out.print( request.getContextPath() );
      out.write("/board/boardView?no=");
      out.print( b.getNo() );
      out.write('"');
      out.write('>');
      out.print( b.getTitle() );
      out.write(' ');
      out.write('(');
      out.print( b.getBoardCommentCount() );
      out.write(")</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print( b.getWriter() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print( b.getRegDate() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t");
 if(b.getAttach() != null){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"");
      out.print( request.getContextPath() );
      out.write("/images/file.png\" width=\"16px\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print( b.getReadCount() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");

					}
				}
			
      out.write("\r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\t</table>\r\n");
      out.write("\r\n");
      out.write("\t<div id='pageBar'>\r\n");
      out.write("\t\t");
      out.print( request.getAttribute("pageBar") );
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</section>\r\n");
      out.write("\n");
      out.write("\t\t</section>\n");
      out.write("\n");
      out.write("\t\t<footer>\n");
      out.write("\t\t\t<p>&lt;Copyright 1998-2021 <strong>KH???????????????</strong>. All rights reserved.&gt;</p>\n");
      out.write("\t\t</footer>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
