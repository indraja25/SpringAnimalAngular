/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-08-03 00:35:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Animal list</title>\r\n");
      out.write("        \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\r\n");
      out.write("     <link href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\"></link>\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body ng-app=\"myApp\" class=\"ng-cloak\">\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"generic-container\" ng-controller=\"AnimalController as ctrl\">\r\n");
      out.write("    \t<div class=\"panel panel-default\">\r\n");
      out.write("              <div class=\"panel-heading\"><span class=\"lead\">User Registration Form </span></div>\r\n");
      out.write("              <div class=\"formcontainer\">\r\n");
      out.write("                  <form ng-submit=\"ctrl.submit()\" name=\"myForm\" class=\"form-horizontal\">\r\n");
      out.write("                      <input type=\"hidden\" ng-model=\"ctrl.animal.id\" />\r\n");
      out.write("                      <div class=\"row\">\r\n");
      out.write("                          <div class=\"form-group col-md-12\">\r\n");
      out.write("                              <label class=\"col-md-2 control-lable\" for=\"file\">Type</label>\r\n");
      out.write("                              <div class=\"col-md-7\">\r\n");
      out.write("                                  <input type=\"text\" ng-model=\"ctrl.animal.type\" name=\"animal\" class=\"animal form-control input-sm\" placeholder=\"Enter model type\" />\r\n");
      out.write("  \t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                          </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                        \r\n");
      out.write("                      \r\n");
      out.write("                      <div class=\"row\">\r\n");
      out.write("                          <div class=\"form-group col-md-12\">\r\n");
      out.write("                              <label class=\"col-md-2 control-lable\" for=\"file\">Health</label>\r\n");
      out.write("                              <div class=\"col-md-7\">\r\n");
      out.write("                                  <input type=\"text\" ng-model=\"ctrl.animal.health\" class=\"form-control input-sm\" placeholder=\"Enter Heath\"/>\r\n");
      out.write("                              </div>\r\n");
      out.write("                          </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"row\">\r\n");
      out.write("                          <div class=\"form-actions floatRight\">\r\n");
      out.write("                              <input type=\"submit\"  value=\"Add\" class=\"btn btn-primary btn-sm\"/>\r\n");
      out.write("                              <button type=\"button\" ng-click=\"ctrl.reset()\" class=\"btn btn-warning btn-sm\" >Reset Form</button>\r\n");
      out.write("                          </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                  </form>\r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t\t<div class=\"panel panel-default\">\r\n");
      out.write("                <!-- Default panel contents -->\r\n");
      out.write("              <div class=\"panel-heading\"><span class=\"lead\">List of Animals </span></div>\r\n");
      out.write("              <div class=\"tablecontainer\">\r\n");
      out.write("                  <table class=\"table table-hover\">\r\n");
      out.write("                      <thead>\r\n");
      out.write("                          <tr>\r\n");
      out.write("                              <th>ID.</th>\r\n");
      out.write("                              <th>Type</th>\r\n");
      out.write("                              <th>Health</th>\r\n");
      out.write("                              \r\n");
      out.write("                              <th width=\"20%\"></th>\r\n");
      out.write("                          </tr>\r\n");
      out.write("                      </thead>\r\n");
      out.write("                      <tbody>\r\n");
      out.write("                          <tr ng-repeat=\"animal in ctrl.animals\">\r\n");
      out.write("                              <td><span ng-bind=\"animal.id\"></span></td>\r\n");
      out.write("                              <td><span ng-bind=\"animal.type\"></span></td>\r\n");
      out.write("                              <td><span ng-bind=\"animal.health\"></span></td>\r\n");
      out.write("                              <td>\r\n");
      out.write("                              <button type=\"button\" ng-click=\"ctrl.edit(animal.id)\" class=\"btn btn-success custom-width\">Edit</button>  <button type=\"button\" ng-click=\"ctrl.remove(animal.id)\" class=\"btn btn-danger custom-width\">Remove</button>\r\n");
      out.write("                              </td>\r\n");
      out.write("                          </tr>\r\n");
      out.write("                      </tbody>\r\n");
      out.write("                  </table>\r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t\t\r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("    \t<div align=\"center\">\r\n");
      out.write("\t        \r\n");
      out.write("\t        <h3><a href=\"newAnimal\">For New Animal click here</a></h3>\r\n");
      out.write("\t        <table border=\"1\">\r\n");
      out.write("\t        \t<th>No</th>\r\n");
      out.write("\t        \t<th>Type</th>\r\n");
      out.write("\t        \t<th>Health</th>\r\n");
      out.write("\t        \t\r\n");
      out.write("\t        \t<th>Action</th>\r\n");
      out.write("\t        \t \r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\t        \t\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("    \t </div>\r\n");
      out.write("          </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      <script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js\"></script>\r\n");
      out.write("      <script src=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("      <script src=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("      <script src=\"");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("  \r\n");
      out.write("      \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/views/list.jsp(12,17) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/static/css/app.css");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/list.jsp(93,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("animal");
    // /WEB-INF/views/list.jsp(93,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/list.jsp(93,4) '${listAnimal}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${listAnimal}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/list.jsp(93,4) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t        \t<tr>\r\n");
          out.write("\t        \t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${animal.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${animal.type}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${animal.health}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t\t<a href=\"editAnimal?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${animal.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">Edit</a>\r\n");
          out.write("\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t\t\t\t\t<a href=\"deleteAnimal?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${animal.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">Delete</a>\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\r\n");
          out.write("\t        \t</tr>\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent(null);
    // /WEB-INF/views/list.jsp(112,19) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/static/js/app.js");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f2.setParent(null);
    // /WEB-INF/views/list.jsp(113,19) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setValue("/static/js/service/animal_service.js");
    int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
    if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f3.setParent(null);
    // /WEB-INF/views/list.jsp(114,19) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f3.setValue("/static/js/controller/animal_controller.js");
    int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
    if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
    return false;
  }
}
