/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.50
 * Generated at: 2023-04-22 03:15:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class join_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/eGovFrame-4.0.0/workspace.edu/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/SpringMVC06/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1612850415545L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
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
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <title>Bootstrap Example</title>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("  \t$(document).ready(function () {\r\n");
      out.write("  \t\t// 실패할경우 \r\n");
      out.write("\t\tif(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty msgType}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(") {\r\n");
      out.write("\t\t\t$(\"#messageType\").attr(\"class\", \"modal-content panel-warning\");\r\n");
      out.write("\t\t\t$(\"#myMessage\").modal(\"show\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("  \t\r\n");
      out.write("  \tfunction registerCheck() {\r\n");
      out.write("\t\tvar memID=$(\"#memID\").val();\r\n");
      out.write("  \t\t$.ajax({\r\n");
      out.write("\t\t\turl: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/memRegisterCheck.do\",\r\n");
      out.write("\t\t\ttype: \"get\",\r\n");
      out.write("\t\t\tdata: {\"memID\" : memID},\r\n");
      out.write("\t\t\tsuccess: function (result) {\r\n");
      out.write("\t\t\t\t// 중복유무 출력(result=1 : 사용할 수 있는 아이디, 0: 사용할 수 없는 아이디)\r\n");
      out.write("\t\t\t\talert(result);\r\n");
      out.write("\t\t\t\tif (result == 1) {\r\n");
      out.write("\t\t\t\t\t$(\"#checkMessage\").html(\"사용할 수 있는 아이디입니다.\");\r\n");
      out.write("\t\t\t\t\t$(\"#checkType\").attr(\"class\", \"modal-content panel-success\");\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t$(\"#checkMessage\").html(\"사용할 수 없는 아이디입니다.\");\r\n");
      out.write("\t\t\t\t\t$(\"checkType\").attr(\"class\", \"modal-content panel-warning\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t// modal창을 보여준다.\r\n");
      out.write("\t\t\t\t$(\"#myModal\").modal(\"show\");\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror: function () {\r\n");
      out.write("\t\t\t\talert(\"error\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("  \t\r\n");
      out.write("  \tfunction passwordCheck() {\r\n");
      out.write("\t\tvar memPassword1 = $(\"#memPassword1\").val();\r\n");
      out.write("\t\tvar memPassword2 = $(\"#memPassword2\").val();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(memPassword1 != memPassword2) {\r\n");
      out.write("\t\t\t$(\"#passMessage\").html(\"비밀번호가 서로 일치하지 않습니다.\");\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\t$(\"#passMessage\").html(\"\");\r\n");
      out.write("\t\t\t// 비밀번호가 일치할경우 hidden에 memPassword를 집어 넣음.\r\n");
      out.write("\t\t\t$(\"#memPassword\").val(memPassword1);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("  \t\r\n");
      out.write("  \tfunction goInsert() {\r\n");
      out.write("\t\tvar memAge = $(\"#memAge\").val();\r\n");
      out.write("\t\tif(memAge == null || memAge==\"\" || memAge == 0) {\r\n");
      out.write("\t\t\talert(\"나이를 입력하세요\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tdocument.frm.submit();\t// 전송\r\n");
      out.write("\t}\r\n");
      out.write("  </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/header.jsp", out, false);
      out.write("\r\n");
      out.write("  <h2>Spring MVC06</h2>\r\n");
      out.write("  <div class=\"panel panel-default\">\r\n");
      out.write("    <div class=\"panel-heading\">회원가입</div>\r\n");
      out.write("    <div class=\"panel-body\">\r\n");
      out.write("    <!-- 수정 -->\r\n");
      out.write("    \t<form name=\"frm\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/memRegister.do\" method=\"post\">\r\n");
      out.write("    \t\t<input type=\"hidden\" id=\"memPassword\" name=\"memPassword\" value=\"\">\r\n");
      out.write("    \t\t<table class=\"table table-bordered\" style=\"text-align: center; border: 1px solid #dddddd;\">\r\n");
      out.write("    \t\t\t<tr>\r\n");
      out.write("    \t\t\t\t<td style=\"width: 110px; vertical-align: middle;\">아이디</td>\r\n");
      out.write("    \t\t\t\t<td><input id=\"memID\" name=\"memID\" class=\"form-control\" type=\"text\" maxlength=\"20\" placeholder=\"아이디를 입력하세요.\" /></td>\r\n");
      out.write("    \t\t\t\t<td style=\"width: 110px;\" ><button type=\"button\" class=\"btn btn-primary btn-sm\" onclick=\"registerCheck()\">중복확인</button></td>\r\n");
      out.write("    \t\t\t</tr>\r\n");
      out.write("    \t\t\t<tr>\r\n");
      out.write("    \t\t\t\t<td style=\"width: 110px; vertical-align: middle;\">비밀번호</td>\r\n");
      out.write("    \t\t\t\t<!-- onkeyup - 키보드를 눌렀다가 땠을때 패스워드 두개가 같은지 다른지를 체크 -->\r\n");
      out.write("    \t\t\t\t<td colspan=\"2\"><input id=\"memPassword1\" name=\"memPassword1\" onkeyup=\"passwordCheck()\" class=\"form-control\" type=\"password\" maxlength=\"20\" placeholder=\"비밀번호를 입력하세요.\" /></td>\r\n");
      out.write("    \t\t\t</tr>\r\n");
      out.write("    \t\t\t<tr>\r\n");
      out.write("    \t\t\t\t<td style=\"width: 110px; vertical-align: middle;\">비밀번호확인</td>\r\n");
      out.write("    \t\t\t\t<td colspan=\"2\"><input id=\"memPassword2\" name=\"memPassword2\" onkeyup=\"passwordCheck()\" class=\"form-control\" type=\"password\" maxlength=\"20\" placeholder=\"비밀번호를 확인하세요.\" /></td>\r\n");
      out.write("    \t\t\t</tr>\r\n");
      out.write("    \t\t\t<tr>\r\n");
      out.write("    \t\t\t\t<td style=\"width: 110px; vertical-align: middle;\">사용자 이름</td>\r\n");
      out.write("    \t\t\t\t<td colspan=\"2\"><input id=\"memName\" name=\"memName\" class=\"form-control\" type=\"text\" maxlength=\"20\" placeholder=\"이름을 입력하세요.\" /></td>\r\n");
      out.write("    \t\t\t</tr>\r\n");
      out.write("    \t\t\t<tr>\r\n");
      out.write("    \t\t\t\t<td style=\"width: 110px; vertical-align: middle;\">나이</td>\r\n");
      out.write("    \t\t\t\t<td colspan=\"2\"><input id=\"memAge\" name=\"memAge\" class=\"form-control\" type=\"number\" maxlength=\"20\" placeholder=\"나이를 입력하세요.\"  /></td>\r\n");
      out.write("    \t\t\t</tr>\r\n");
      out.write("    \t\t\t<tr>\r\n");
      out.write("    \t\t\t\t<td style=\"width: 110px; vertical-align: middle;\">성별</td>\r\n");
      out.write("    \t\t\t\t<td colspan=\"2\">\r\n");
      out.write("    \t\t\t\t\t<div class=\"form-group\" style=\"text-align: center; margin: 0 auto;\">\r\n");
      out.write("    \t\t\t\t\t\t<div class=\"btn-group\" data-toggle=\"buttons\">\r\n");
      out.write("    \t\t\t\t\t\t\t<label class=\"btn btn-primary active\">\r\n");
      out.write("    \t\t\t\t\t\t\t\t<input type=\"radio\" id=\"memGender\" name=\"memGender\" autocomplete=\"off\" value=\"남자\" checked />남자\r\n");
      out.write("    \t\t\t\t\t\t\t</label>\r\n");
      out.write("    \t\t\t\t\t\t\t<label class=\"btn btn-primary\">\r\n");
      out.write("    \t\t\t\t\t\t\t\t<input type=\"radio\" id=\"memGender\" name=\"memGender\" autocomplete=\"off\" value=\"여자\" />여자\r\n");
      out.write("    \t\t\t\t\t\t\t</label>\r\n");
      out.write("    \t\t\t\t\t\t</div>\r\n");
      out.write("    \t\t\t\t\t</div>\r\n");
      out.write("    \t\t\t\t</td>\r\n");
      out.write("    \t\t\t</tr>\r\n");
      out.write("    \t\t\t<tr>\r\n");
      out.write("    \t\t\t\t<td style=\"width: 110px; vertical-align: middle;\">이메일</td>\r\n");
      out.write("    \t\t\t\t<td colspan=\"2\"><input id=\"memEmail\" name=\"memEmail\" class=\"form-control\" type=\"text\" maxlength=\"20\" placeholder=\"이메일을 확인하세요.\" /></td>\r\n");
      out.write("    \t\t\t</tr>\r\n");
      out.write("    \t\t\t<!-- 권한체크박스추가 -->\r\n");
      out.write("    \t\t\t<tr>\r\n");
      out.write("    \t\t\t\t<td style=\"width: 110px; vertical-align: middle;\">사용자 권한</td>\r\n");
      out.write("    \t\t\t\t<td colspan=\"2\">\r\n");
      out.write("    \t\t\t\t\t<!-- authList[0]번에 auth 속성이 들어간다. -->\r\n");
      out.write("    \t\t\t\t\t<input type=\"checkbox\" name=\"authList[0].auth\" value=\"ROLE_USER\"/> ROLE_USER\r\n");
      out.write("    \t\t\t\t\t<input type=\"checkbox\" name=\"authList[1].auth\" value=\"ROLE_MANAGER\"/> ROLE_MANAGER\r\n");
      out.write("    \t\t\t\t\t<input type=\"checkbox\" name=\"authList[2].auth\" value=\"ROLE_ADMIN\"/> ROLE_ADMIN\r\n");
      out.write("    \t\t\t\t</td>\r\n");
      out.write("    \t\t\t</tr>\r\n");
      out.write("    \t\t\t<tr>\r\n");
      out.write("    \t\t\t\t<td colspan=\"3\" style=\"text-align: left;\">\r\n");
      out.write("    \t\t\t\t\t<span id=\"passMessage\" style=\"color: red;\"></span><input type=\"button\" class=\"btn btn-primary btn-sm pull-right\" value=\"등록\" onclick=\"goInsert()\" />\r\n");
      out.write("    \t\t\t\t</td>\r\n");
      out.write("    \t\t\t</tr>\r\n");
      out.write("    \t\t</table>\r\n");
      out.write("    \t\t<input type=\"hidden\" name=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.parameterName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("    \t</form>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- 다이얼로그창(모달) -->\r\n");
      out.write("\t<div id=\"myModal\" class=\"modal fade\" role=\"dialog\">\r\n");
      out.write("\t  <div class=\"modal-dialog\">\r\n");
      out.write("\t    <!-- Modal content-->\r\n");
      out.write("\t    <div id=\"checkType\" class=\"modal-content panel-info\">\r\n");
      out.write("\t      <div class=\"modal-header panel-heading\">\r\n");
      out.write("\t        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("\t        <h4 class=\"modal-title\">메세지 확인</h4>\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t      <div class=\"modal-body\">\r\n");
      out.write("\t        <p id=\"checkMessage\"></p>\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t      <div class=\"modal-footer\">\r\n");
      out.write("\t        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 실패 메시지를 출력(Modal) -->\r\n");
      out.write("\t<div id=\"myMessage\" class=\"modal fade\" role=\"dialog\">\r\n");
      out.write("\t  <div class=\"modal-dialog\">\r\n");
      out.write("\t    <!-- Modal content-->\r\n");
      out.write("\t    <div id=\"messageType\" class=\"modal-content panel-info\">\r\n");
      out.write("\t      <div class=\"modal-header panel-heading\">\r\n");
      out.write("\t        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("\t        <h4 class=\"modal-title\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msgType }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h4>\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t      <div class=\"modal-body\">\r\n");
      out.write("\t        <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t      <div class=\"modal-footer\">\r\n");
      out.write("\t        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("    <div class=\"panel-footer\">스프1탄_인프런(김민석)</div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /WEB-INF/views/member/join.jsp(4,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("contextPath");
      // /WEB-INF/views/member/join.jsp(4,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/member/join.jsp(4,0) '${pageContext.request.contextPath }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }
}
