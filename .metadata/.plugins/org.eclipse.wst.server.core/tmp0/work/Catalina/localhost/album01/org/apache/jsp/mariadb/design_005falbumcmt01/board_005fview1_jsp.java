/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.74
 * Generated at: 2023-06-02 01:16:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.mariadb.design_005falbumcmt01;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class board_005fview1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/board_view.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<!-- 상단 디자인 -->\r\n");
      out.write("<div class=\"contents1\"> \r\n");
      out.write("	<div class=\"con_title\"> \r\n");
      out.write("		<p style=\"margin: 0px; text-align: right\">\r\n");
      out.write("			<img style=\"vertical-align: middle\" alt=\"\" src=\"../../images/home_icon.gif\" /> &gt; 커뮤니티 &gt; <strong>여행지리뷰</strong>\r\n");
      out.write("		</p>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"contents_sub\">	\r\n");
      out.write("	<!--게시판-->\r\n");
      out.write("		<div class=\"board_view\">\r\n");
      out.write("			<table>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th width=\"10%\">제목</th>\r\n");
      out.write("				<td width=\"60%\">제주 올레길 좋아요(000.000.000.000)</td>\r\n");
      out.write("				<th width=\"10%\">등록일</th>\r\n");
      out.write("				<td width=\"20%\">2016.03.02 21:11</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th>글쓴이</th>\r\n");
      out.write("				<td>여행자</td>\r\n");
      out.write("				<th>조회</th>\r\n");
      out.write("				<td>345</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th>위치정보</th>\r\n");
      out.write("				<td>\r\n");
      out.write("					위도 : (000.00000) / 경도 : (000.00000)\r\n");
      out.write("				</td>\r\n");
      out.write("				<th></th>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td colspan=\"4\" height=\"200\" valign=\"top\" style=\"padding:20px; line-height:160%\">\r\n");
      out.write("					<div id=\"bbs_file_wrap\">\r\n");
      out.write("						<div>\r\n");
      out.write("							<img src=\"../../upload/607927_1.jpg\" width=\"900\" onerror=\"\" /><br />\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					시간이 되면 또 걷고 싶은 길이네요\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>			\r\n");
      out.write("			</table>\r\n");
      out.write("			\r\n");
      out.write("			<table>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td class=\"coment_re\" width=\"20%\">\r\n");
      out.write("					<strong>54545</strong> (2016.09.19 02:00)\r\n");
      out.write("					<div class=\"coment_re_txt\">\r\n");
      out.write("						Test\r\n");
      out.write("					</div>\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td class=\"coment_re\" width=\"20%\">\r\n");
      out.write("					<strong>하오리</strong> (2016.09.19 07:54)\r\n");
      out.write("					<div class=\"coment_re_txt\">\r\n");
      out.write("						우리는 민족 중흥의 역사적 사명을 띄고 이 땅에 태어났다. 조상의 빛난 얼을 오늘에 되살려\r\n");
      out.write("					</div>\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			</table>\r\n");
      out.write("\r\n");
      out.write("			<form action=\"\" method=\"post\" name=\"cfrm\">\r\n");
      out.write("			<table>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td width=\"94%\" class=\"coment_re\">\r\n");
      out.write("					글쓴이 <input type=\"text\" name=\"cwriter\" maxlength=\"5\" class=\"coment_input\" />&nbsp;&nbsp;\r\n");
      out.write("					비밀번호 <input type=\"password\" name=\"cpassword\" class=\"coment_input pR10\" />&nbsp;&nbsp;\r\n");
      out.write("				</td>\r\n");
      out.write("				<td width=\"6%\" class=\"bg01\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td class=\"bg01\">\r\n");
      out.write("					<textarea name=\"ccontent\" cols=\"\" rows=\"\" class=\"coment_input_text\"></textarea>\r\n");
      out.write("				</td>\r\n");
      out.write("				<td align=\"right\" class=\"bg01\">\r\n");
      out.write("					<input type=\"button\" value=\"댓글등록\" class=\"btn_re btn_txt01\" />\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			</table>\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"btn_area\">\r\n");
      out.write("			<div class=\"align_left\">			\r\n");
      out.write("				<input type=\"button\" value=\"목록\" class=\"btn_list btn_txt02\" style=\"cursor: pointer;\" onclick=\"location.href='board_list1.jsp'\" />\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"align_right\">\r\n");
      out.write("				<input type=\"button\" value=\"수정\" class=\"btn_list btn_txt02\" style=\"cursor: pointer;\" onclick=\"location.href='board_modify1.jsp'\" />\r\n");
      out.write("				<input type=\"button\" value=\"삭제\" class=\"btn_list btn_txt02\" style=\"cursor: pointer;\" onclick=\"location.href='board_delete1.jsp'\" />\r\n");
      out.write("				<input type=\"button\" value=\"쓰기\" class=\"btn_write btn_txt01\" style=\"cursor: pointer;\" onclick=\"location.href='board_write1.jsp'\" />\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<!--//게시판-->\r\n");
      out.write("	</div>\r\n");
      out.write("<!-- 하단 디자인 -->\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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
