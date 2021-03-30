/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.44
 * Generated at: 2021-03-29 12:24:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkIdDuplicate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

      out.write('\r');
      out.write('\n');

	String memberId = request.getParameter("memberId");
	boolean available = (boolean)request.getAttribute("available");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>아이디중복검사</title>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery-3.6.0.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("div#checkId-container{text-align:center; padding-top:50px;}\r\n");
      out.write("span#duplicated{color:red; font-weight:bold;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"checkId-container\">\r\n");
      out.write("\t");
 if(available){ 
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t<p>[");
      out.print( memberId );
      out.write("]는 사용가능합니다.</p>\r\n");
      out.write("\t\t<input type=\"button\" value=\"사용하기\" onclick=\"setMemberId();\"/>\r\n");
      out.write("\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t<p>[<span id=\"duplicated\">");
      out.print( memberId );
      out.write("</span>]는 이미 사용중입니다.</p>\r\n");
      out.write("\t\t<form name=\"checkIdDuplicateFrm\">\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"memberId\" placeholder=\"아이디를 입력하세요.\" />\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"중복검사\" onclick=\"checkIdDuplicate();\" />\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("<script>\r\n");
      out.write("/**\r\n");
      out.write(" * 사용가능한 아이디를 찾은 경우\r\n");
      out.write(" * 1. 아이디를 부모윈도우의 #memberId_대입\r\n");
      out.write(" * 2. #idValid값을 1로 변경\r\n");
      out.write(" */\r\n");
      out.write("function setMemberId(){\r\n");
      out.write("\t//부모윈도우 opener \r\n");
      out.write("\tvar $frm = $(opener.document.memberEnrollFrm);\r\n");
      out.write("\t$frm.find(\"#memberId_\").val('");
      out.print( memberId );
      out.write("');\r\n");
      out.write("\t$frm.find(\"#idValid\").val(1);\r\n");
      out.write("\tself.close();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/**\r\n");
      out.write(" * 아이디 중복 검사함수\r\n");
      out.write(" */\r\n");
      out.write("function checkIdDuplicate(){\r\n");
      out.write("\tvar $memberId = $(\"[name=memberId]\");\r\n");
      out.write("\tif(/^[a-zA-Z0-9_]{4,}$/.test($memberId.val()) == false){\r\n");
      out.write("\t\talert(\"유효한 아이디를 입력해주세요.\");\r\n");
      out.write("\t\t$memberId.select();\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t$frm = $(document.checkIdDuplicateFrm);\r\n");
      out.write("\t\r\n");
      out.write("\t$frm.attr(\"action\", \"");
      out.print( request.getContextPath() );
      out.write("/member/checkIdDuplicate\")\r\n");
      out.write("\t\t.attr(\"method\", \"POST\")\r\n");
      out.write("\t\t.submit();\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
