/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.44
 * Generated at: 2021-04-08 12:19:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import board.model.vo.BoardComment;
import java.util.List;
import board.model.vo.Board;
import member.model.service.MemberService;
import member.model.vo.Member;

public final class boardView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1617609408415L));
    _jspx_dependants.put("/WEB-INF/views/common/footer.jsp", Long.valueOf(1616656744264L));
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
    _jspx_imports_classes.add("board.model.vo.BoardComment");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String msg = (String)session.getAttribute("msg");
	if(msg != null) session.removeAttribute("msg");
	
	String loc = (String)request.getAttribute("loc");
	Member loginMember = (Member)session.getAttribute("loginMember");
	
	//사용자 쿠키처리
	String saveId = null;
	Cookie[] cookies = request.getCookies();
	if(cookies != null){
		for(Cookie c : cookies){
			String name = c.getName();
			String value = c.getValue();
			System.out.println(name + " : " + value);
			if("saveId".equals(name))
				saveId = value;
		}
	}
	

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Hello MVC</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath() );
      out.write("/css/style.css\" />\r\n");
      out.write("<script src=\"");
      out.print( request.getContextPath() );
      out.write("/js/jquery-3.6.0.js\"></script>\r\n");
      out.write("<script>\r\n");
 if(msg != null) { 
      out.write(" \r\n");
      out.write("\talert(\"");
      out.print( msg );
      out.write("\"); \r\n");
 } 
      out.write("\r\n");
      out.write("\r\n");
 if(loc != null) { 
      out.write("\r\n");
      out.write("\tlocation.href = \"");
      out.print( loc );
      out.write("\";\r\n");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("$(function(){\r\n");
      out.write("\t/**\r\n");
      out.write("\t* 로그인 폼 유효성 검사 \r\n");
      out.write("\t*/\r\n");
      out.write("\t$(\"#loginFrm\").submit(function(){\r\n");
      out.write("\t\tvar $memberId = $(memberId);\r\n");
      out.write("\t\tvar $password = $(password);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(/^.{4,}$/.test($memberId.val()) == false){\r\n");
      out.write("\t\t\talert(\"유효한 아이디를 입력하세요.\");\r\n");
      out.write("\t\t\t$memberId.select();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(/^.{4,}$/.test($password.val()) == false){\r\n");
      out.write("\t\t\talert(\"유효한 비밀번호를 입력하세요.\");\r\n");
      out.write("\t\t\t$password.select();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"container\">\r\n");
      out.write("\t\t<header>\r\n");
      out.write("\t\t\t<h1>Hello MVC</h1>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"login-container\">\r\n");
      out.write("\t\t\t");
 if(loginMember == null) { 
      out.write("\r\n");
      out.write("\t\t\t\t<!-- 로그인폼 시작 -->\r\n");
      out.write("\t\t\t\t<form id=\"loginFrm\" action=\"");
      out.print( request.getContextPath() );
      out.write("/member/login\" method=\"POST\">\r\n");
      out.write("\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input \r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"text\" name=\"memberId\" id=\"memberId\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"아이디\" tabindex=\"1\" value=\"");
      out.print( saveId != null ? saveId : "" );
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"submit\" value=\"로그인\" tabindex=\"3\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"password\" name=\"password\" id=\"password\" placeholder=\"비밀번호\" tabindex=\"2\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"saveId\" id=\"saveId\" ");
      out.print( saveId != null ? "checked" : "");
      out.write("/>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"saveId\">아이디저장</label>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"button\" value=\"회원가입\" onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/member/memberEnroll';\">\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t<!-- 로그인폼 끝-->\r\n");
      out.write("\t\t\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t<table id=\"login\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print( loginMember.getMemberName() );
      out.write("님, 안녕하세요.</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td> \r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" value=\"내정보보기\" \r\n");
      out.write("\t\t\t\t\t\t\t\tonclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/member/memberView';\" />\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" value=\"로그아웃\" \r\n");
      out.write("\t\t\t\t\t\t\t\tonclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/member/logout';\" />\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t");
 } 
      out.write("\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- 메인메뉴 시작 -->\r\n");
      out.write("\t\t\t<nav>\r\n");
      out.write("\t\t\t\t<ul class=\"main-nav\">\r\n");
      out.write("\t\t\t\t\t<li class=\"home\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"notice\"><a href=\"#\">공지사항</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"board\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/board/boardList\">게시판</a></li>\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 if(loginMember != null && MemberService.ADMIN_ROLE.equals(loginMember.getMemberRole())){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<li class=\"members\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/admin/memberList\">회원관리</a></li>\r\n");
      out.write("\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t\t\t<!-- 메인메뉴 끝-->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<section id=\"content\">");
      out.write('\r');
      out.write('\n');

	Board board = (Board)request.getAttribute("board");
	boolean editable = 
			loginMember != null && 
			(
			  loginMember.getMemberId().equals(board.getWriter())
			  || MemberService.ADMIN_ROLE.equals(loginMember.getMemberRole())
			);
	
	List<BoardComment> commentList = (List<BoardComment>) request.getAttribute("commentList"); 

      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/board.css\" />\r\n");
      out.write("<section id=\"board-container\">\r\n");
      out.write("\t<h2>게시판</h2>\r\n");
      out.write("\t<table id=\"tbl-board-view\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>글번호</th>\r\n");
      out.write("\t\t\t<td>");
      out.print( board.getNo() );
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>제 목</th>\r\n");
      out.write("\t\t\t<td>");
      out.print( board.getTitle() );
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>작성자</th>\r\n");
      out.write("\t\t\t<td>");
      out.print( board.getWriter() );
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>조회수</th>\r\n");
      out.write("\t\t\t<td>");
      out.print( board.getReadCount() );
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>첨부파일</th>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t");
 	if(board.getAttach() != null){ 
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t<img alt=\"첨부파일\" src=\"");
      out.print(request.getContextPath() );
      out.write("/images/file.png\" width=16px>\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print( request.getContextPath() );
      out.write("/board/fileDownload?no=");
      out.print( board.getNo() );
      out.write('"');
      out.write('>');
      out.print( board.getAttach().getOriginalFileName() );
      out.write("</a>\r\n");
      out.write("\t\t\t\t");
 	} 
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>내 용</th>\r\n");
      out.write("\t\t\t<td>");
      out.print( board.getContent() );
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");
 	if(editable){ 
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t<th colspan=\"2\">\r\n");
      out.write("\t\t\t\t<input type=\"button\" value=\"수정하기\" onclick=\"updateBoard()\">\r\n");
      out.write("\t\t\t\t<input type=\"button\" value=\"삭제하기\" onclick=\"deleteBoard()\">\r\n");
      out.write("\t\t\t</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
 	} 
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
      out.write("\t<hr style=\"margin-top:30px;\" />\t\r\n");
      out.write("    \r\n");
      out.write("\t<div class=\"comment-container\">\r\n");
      out.write("        <div class=\"comment-editor\">\r\n");
      out.write("            <form action=\"");
      out.print(request.getContextPath());
      out.write("/board/boardCommentInsert\" method=\"post\" name=\"boardCommentFrm\">\r\n");
      out.write("                <input type=\"hidden\" name=\"boardNo\" value=\"");
      out.print( board.getNo() );
      out.write("\" />\r\n");
      out.write("                <input type=\"hidden\" name=\"writer\" value=\"");
      out.print( loginMember != null ? loginMember.getMemberId() : "" );
      out.write("\" />\r\n");
      out.write("                <input type=\"hidden\" name=\"commentLevel\" value=\"1\" />\r\n");
      out.write("                <input type=\"hidden\" name=\"commentRef\" value=\"0\" />    \r\n");
      out.write("\t\t\t\t<textarea name=\"content\" cols=\"60\" rows=\"3\"></textarea>\r\n");
      out.write("                <button type=\"submit\" id=\"btn-insert\">등록</button>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("\t\t<!--table#tbl-comment-->\r\n");
      out.write("\t\t");
 if(commentList != null && !commentList.isEmpty()){ 
      out.write("\r\n");
      out.write("\t\t<table id=\"tbl-comment\">\r\n");
      out.write("\t\t");
 
			for(BoardComment bc : commentList){ 
				boolean removable = 
						loginMember != null && 
						(
						  loginMember.getMemberId().equals(bc.getWriter())
						  || MemberService.ADMIN_ROLE.equals(loginMember.getMemberRole())
						);
				if(bc.getCommentLevel() == 1){
				//댓글
		
      out.write("\r\n");
      out.write("\t\t\t<tr class=\"level1\">\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<sub class=\"comment-writer\">");
      out.print( bc.getWriter() );
      out.write("</sub>\r\n");
      out.write("\t\t\t\t\t<sub class=\"comment-date\">");
      out.print( bc.getRegDate() );
      out.write("</sub>\r\n");
      out.write("\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t");
      out.print( bc.getContent() );
      out.write("\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<button class=\"btn-reply\" value=\"");
      out.print( bc.getNo() );
      out.write("\">답글</button>\r\n");
      out.write("\t\t\t\t\t");
 if(removable){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<button class=\"btn-delete\" value=\"");
      out.print( bc.getNo() );
      out.write("\">삭제</button>\r\n");
      out.write("\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t");
   
				} else { 
				//대댓글
		
      out.write("\r\n");
      out.write("\t\t\t<tr class=\"level2\">\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<sub class=\"comment-writer\">");
      out.print( bc.getWriter() );
      out.write("</sub>\r\n");
      out.write("\t\t\t\t\t<sub class=\"comment-date\">");
      out.print( bc.getRegDate() );
      out.write("</sub>\r\n");
      out.write("\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t");
      out.print( bc.getContent() );
      out.write("\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t");
 if(removable){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<button class=\"btn-delete\" value=\"");
      out.print( bc.getNo() );
      out.write("\">삭제</button>\r\n");
      out.write("\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
 	 
				} 
			}
		
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t");
 } 
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
 	if(editable){ 
      out.write("\r\n");
      out.write("<form \r\n");
      out.write("\taction=\"");
      out.print( request.getContextPath() );
      out.write("/board/boardDelete\" \r\n");
      out.write("\tname=\"boardDelFrm\"\r\n");
      out.write("\tmethod=\"POST\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"no\" value=\"");
      out.print( board.getNo() );
      out.write("\" />\r\n");
      out.write("</form>\r\n");
      out.write("<script>\r\n");
      out.write("function updateBoard(){\r\n");
      out.write("\tlocation.href = \"");
      out.print( request.getContextPath() );
      out.write("/board/boardUpdate?no=");
      out.print( board.getNo() );
      out.write("\";\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function deleteBoard(){\r\n");
      out.write("\tif(confirm(\"게시글을 정말 삭제하시겠습니까?\")){\r\n");
      out.write("\t\t$(document.boardDelFrm).submit();\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
 } 
      out.write("\r\n");
      out.write("<form \r\n");
      out.write("\taction=\"");
      out.print( request.getContextPath() );
      out.write("/board/boardCommentDelete\" \r\n");
      out.write("\tname=\"boardCommentDelFrm\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"no\" />\r\n");
      out.write("\t<input type=\"hidden\" name=\"boardNo\" value=\"");
      out.print( board.getNo() );
      out.write("\"/>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("$(\".btn-delete\").click(function(){\r\n");
      out.write("\tif(confirm(\"해당 댓글을 삭제하시겠습니까?\")){\r\n");
      out.write("\t\tvar $frm = $(document.boardCommentDelFrm);\r\n");
      out.write("\t\tvar boardCommentNo = $(this).val();\r\n");
      out.write("\t\t$frm.find(\"[name=no]\").val(boardCommentNo);\r\n");
      out.write("\t\t$frm.submit();\r\n");
      out.write("\t}\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("$(\".btn-reply\").click(function(){\r\n");
      out.write("\t");
 if(loginMember == null){ 
      out.write("\r\n");
      out.write("\tloginAlert();\r\n");
      out.write("\treturn;\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t//대댓글 작성폼 동적 생성\r\n");
      out.write("\tvar html = \"<tr>\";\r\n");
      out.write("\thtml += \"<td colspan='2' style='display:none; text-align:left;'>\";\r\n");
      out.write("\thtml += '<form action=\"");
      out.print(request.getContextPath());
      out.write("/board/boardCommentInsert\" method=\"post\" name=\"boardCommentFrm\">';\r\n");
      out.write("\thtml += '<input type=\"hidden\" name=\"boardNo\" value=\"");
      out.print( board.getNo() );
      out.write("\" />';\r\n");
      out.write("\thtml += '<input type=\"hidden\" name=\"writer\" value=\"");
      out.print( loginMember != null ? loginMember.getMemberId() : "" );
      out.write("\" />';\r\n");
      out.write("\thtml += '<input type=\"hidden\" name=\"commentLevel\" value=\"2\" />';\r\n");
      out.write("\thtml += '<input type=\"hidden\" name=\"commentRef\" value=\"' + $(this).val() + '\" />';    \r\n");
      out.write("\thtml += '<textarea name=\"content\" cols=\"60\" rows=\"2\"></textarea>';\r\n");
      out.write("\thtml += '<button type=\"submit\" class=\"btn-insert-reply\">등록</button>';\r\n");
      out.write("\thtml += '</form>';\r\n");
      out.write("\thtml += \"</td>\";\r\n");
      out.write("\thtml += \"</tr>\";\r\n");
      out.write("\t\r\n");
      out.write("\tvar $trOfBtn = $(this).parent().parent();\r\n");
      out.write("\t$(html)\r\n");
      out.write("\t\t.insertAfter($trOfBtn)\r\n");
      out.write("\t\t.children(\"td\")\r\n");
      out.write("\t\t.slideDown(800);\r\n");
      out.write("\t\t\r\n");
      out.write("\t//버튼은 1회용처리\r\n");
      out.write("\t$(this).off(\"click\");\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("$(\"[name=content]\").focus(function(){\r\n");
      out.write("\t//로그인 여부 검사\r\n");
      out.write("\t");
 if(loginMember == null){ 
      out.write("\r\n");
      out.write("\tloginAlert();\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("$(document).on('submit', '[name=boardCommentFrm]', function(e){\r\n");
      out.write("//$(document.boardCommentFrm).submit(function(){\r\n");
      out.write("\t");
 if(loginMember == null){ 
      out.write("\r\n");
      out.write("\tloginAlert();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t//댓글내용\r\n");
      out.write("\tvar $content = $(\"[name=content]\", e.target);\r\n");
      out.write("\tif(/^(.|\\n)+$/.test($content.val()) == false){\r\n");
      out.write("\t\talert(\"댓글 내용을 작성하세요.\");\r\n");
      out.write("\t\t$content.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function loginAlert(){\r\n");
      out.write("\talert(\"로그인 이후 이용하실수 있습니다.\");\r\n");
      out.write("\t$(\"#memberId\").focus();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t<footer>\r\n");
      out.write("\t\t\t<p>&lt;Copyright 1998-2021 <strong>KH정보교육원</strong>. All rights reserved.&gt;</p>\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
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
