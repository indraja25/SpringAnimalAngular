/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-08-10 03:39:08 UTC
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

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
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
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Animal list</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\"></link>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body ng-app=\"myApp\" class=\"ng-cloak\">\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"generic-container\" ng-controller=\"AnimalController as ctrl\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t<span class=\"lead\">New Animal Form </span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"formcontainer\">\r\n");
      out.write("\t\t\t\t<form ng-submit=\"ctrl.submit()\" name=\"myForm\"\r\n");
      out.write("\t\t\t\t\tclass=\"form-horizontal\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" ng-model=\"ctrl.animal.id\" />\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"col-md-2 control-lable\" for=\"file\">Type</label>\r\n");
      out.write("\t\t\t\t\t\t\t<!--  <input type=\"text\" name=\"Type\" class=\"form-control\" ng-model=\"myform.name\" required> -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<!-- <p ng-show=\"myform.name.$invalid && !myform.name.$pristine\" class=\"help-block\">Type is required.</p> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!--   <label class=\"col-md-2 control-lable\" for=\"file\">Type</label>-->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-7\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" ng-model=\"ctrl.animal.type\" name=\"animal\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"animal form-control input-sm\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Enter model type\" required>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- <li ng-repeat=\"result in results\" md-highlight-text=\"Add\">\r\n");
      out.write("                                      {{result.text}}\r\n");
      out.write("                                       </li>\r\n");
      out.write("                                  -->\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"col-md-2 control-lable\" for=\"file\">Health</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-7\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" ng-model=\"ctrl.animal.health\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"form-control input-sm\" placeholder=\"Enter Heath\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\trequired>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"col-md-2 control-lable\" for=\"file\">Name</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-7\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<select name=\"singleSelect\" ng-model=\"ctrl.animal.animalName\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\trequired>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"\">None</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"Lion\">Lion</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"Eagle\">Eagle</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-actions floatRight\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"{{!ctrl.user.id ? 'Add' : 'Update'}}\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"btn btn-primary btn-sm\" />\r\n");
      out.write("\t\t\t\t\t\t\t<!--  <button type=\"button\" ng-click=\"ctrl.reset()\" class=\"btn btn-warning btn-sm\" >Reset Form</button>-->\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- <p ng-show=\"myForm.name.$invalid && !myForm.name.$pristine\" class=\"help-block\">You type is required.</p> -->\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t<!-- Default panel contents -->\r\n");
      out.write("\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t<span class=\"lead\">List of Animals </span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"tablecontainer\">\r\n");
      out.write("\t\t\t\t<table class=\"table table-hover\">\r\n");
      out.write("\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th>ID.</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>Type</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>Health</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>Animal Name</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th width=\"20%\"></th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t<tr ng-repeat=\"animal in ctrl.animals\">\r\n");
      out.write("\t\t\t\t\t\t\t<td><span ng-bind=\"animal.id\"></span></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><span ng-bind=\"animal.type\"></span></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><span ng-bind=\"animal.health\"></span></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><span ng-bind=\"animal.animalName\"></span></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" ng-click=\"ctrl.edit(animal.id)\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"btn btn-success custom-width\">Edit</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" ng-click=\"ctrl.remove(animal.id)\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"btn btn-danger custom-width\">Remove</button>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js\"></script>\r\n");
      out.write("\t<script src=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\t<script src=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
    // /WEB-INF/views/list.jsp(13,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/static/css/app.css");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
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
    // /WEB-INF/views/list.jsp(126,14) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/views/list.jsp(127,14) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/views/list.jsp(129,7) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
