package org.apache.jsp.Profile;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormat;
import models.User;

public final class ProfileForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang='en'>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset='UTF-8'>\n");
      out.write("    <meta http-equiv='X-UA-Compatible' content='IE=edge'>\n");
      out.write("    <meta name='viewport' content='width=device-width, initial-scale=1.0'>\n");
      out.write("    <title>Document</title>\n");
      out.write("    <style>\n");
      out.write("        .div-profile,\n");
      out.write("        .container-update-change {\n");
      out.write("            box-shadow: rgba(0, 0, 0, 0.3) 0px 19px 38px, rgba(0, 0, 0, 0.22) 0px 15px 12px;\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .div-profile {\n");
      out.write("            margin: 20px auto;\n");
      out.write("            width: 98%;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .imgclass {\n");
      out.write("            border-radius: 8px;\n");
      out.write("            width: 110px;\n");
      out.write("        }\n");
      out.write("        .div-2 span {\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        .div-1,\n");
      out.write("        .container-update-change {\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("        .div-1{\n");
      out.write("            justify-content: center;\n");
      out.write("        }\n");
      out.write("        .container-update-change {\n");
      out.write("            justify-content: space-between;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .div-2 {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .div-2 img {\n");
      out.write("            width: 50px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .right-div {\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .right-div img {\n");
      out.write("            width: 25px;\n");
      out.write("            margin-left: 15px;\n");
      out.write("            margin-right: 5px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .icon-div2 {\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .icon-div2 img {\n");
      out.write("            margin-right: 15px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .change-ava {\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("        /*===== GOOGLE FONTS =====*/\n");
      out.write("        \n");
      out.write("        @import url(\"https://fonts.googleapis.com/css2?family=Roboto:wght@400;500&display=swap\");\n");
      out.write("        /*===== VARIABLES CSS =====*/\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        *,\n");
      out.write("         ::before,\n");
      out.write("         ::after {\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        body {\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            font-family: 'Roboto', sans-serif;\n");
      out.write("            font-size: 1rem;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        h1 {\n");
      out.write("            margin: 0;\n");
      out.write("        }\n");
      out.write("        /*===== FORM =====*/\n");
      out.write("        \n");
      out.write("        .l-form {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            height: 100vh;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .form {\n");
      out.write("            margin: 5px;\n");
      out.write("            width: 48%;\n");
      out.write("            padding: 2rem 2rem;\n");
      out.write("            border-radius: 1rem;\n");
      out.write("            box-shadow: 0 10px 25px rgba(92, 99, 105, .2);\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .form__title {\n");
      out.write("            font-weight: 400;\n");
      out.write("            margin-bottom: 3rem;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .form__div {\n");
      out.write("            position: relative;\n");
      out.write("            height: 48px;\n");
      out.write("            margin-bottom: 1.5rem;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .form__input {\n");
      out.write("            position: absolute;\n");
      out.write("            top: 0;\n");
      out.write("            left: 0;\n");
      out.write("            width: 100%;\n");
      out.write("            height: 100%;\n");
      out.write("            font-size: 1rem;\n");
      out.write("            border: 1px solid #DADCE0;\n");
      out.write("            border-radius: .5rem;\n");
      out.write("            outline: none;\n");
      out.write("            padding: 1rem;\n");
      out.write("            background: none;\n");
      out.write("            z-index: 1;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .form__label {\n");
      out.write("            position: absolute;\n");
      out.write("            left: 1rem;\n");
      out.write("            top: 1rem;\n");
      out.write("            padding: 0 .25rem;\n");
      out.write("            background-color: #fff;\n");
      out.write("            color: #80868B;\n");
      out.write("            font-size: 1rem;\n");
      out.write("            transition: .3s;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .form__button {\n");
      out.write("            display: block;\n");
      out.write("            margin-left: auto;\n");
      out.write("            padding: .75rem 2rem;\n");
      out.write("            outline: none;\n");
      out.write("            border: none;\n");
      out.write("            background-color: #1A73E8;\n");
      out.write("            color: #fff;\n");
      out.write("            font-size: 1rem;\n");
      out.write("            border-radius: .5rem;\n");
      out.write("            cursor: pointer;\n");
      out.write("            transition: .3s;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .form__button:hover {\n");
      out.write("            box-shadow: 0 10px 36px rgba(0, 0, 0, .15);\n");
      out.write("        }\n");
      out.write("        /*Input focus move up label*/\n");
      out.write("        \n");
      out.write("        .form__input:focus+.form__label {\n");
      out.write("            top: -.5rem;\n");
      out.write("            left: .8rem;\n");
      out.write("            color: #1A73E8;\n");
      out.write("            font-size: .75rem;\n");
      out.write("            font-weight: 500;\n");
      out.write("            z-index: 10;\n");
      out.write("        }\n");
      out.write("        /*Input focus sticky top label*/\n");
      out.write("        \n");
      out.write("        .form__input:not(:placeholder-shown).form__input:not(:focus)+.form__label {\n");
      out.write("            top: -.5rem;\n");
      out.write("            left: .8rem;\n");
      out.write("            font-size: .75rem;\n");
      out.write("            font-weight: 500;\n");
      out.write("            z-index: 10;\n");
      out.write("        }\n");
      out.write("        /*Input focus*/\n");
      out.write("        \n");
      out.write("        .form__input:focus {\n");
      out.write("            border: 1.5px solid #1A73E8;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class='div-profile'>\n");
      out.write("        <div class='div-1'>\n");
      out.write("            <div class='left-div'>\n");
      out.write("                <img class='imgclass' src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.avatar}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"image\">\n");
      out.write("            </div>\n");
      out.write("            <div class='right-div'>\n");
      out.write("                <img class='imgclass' src=\"../img/email.png\" alt=\"image\"> <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                <img class='imgclass' src=\"../img/handshake.png\" alt=\"image\">\n");
      out.write("                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("        <div class='div-2'>\n");
      out.write("            <span class='icon-div2'><img src=\"../img/piggy-bank.png\" alt=\"\"><span>Số Dư: ");
      out.print(new DecimalFormat("###,###,###").format(((User) session.getAttribute("user")).getAccountBalance()) + " VNĐ");
      out.write("</span></span>\n");
      out.write("            <span class='icon-div2'><img src=\"../img/diagram.png\" alt=\"\"><span>Đã Nạp: ");
      out.print(new DecimalFormat("###,###,###").format(((User)session.getAttribute("user")).getTotalMoney())+" VNĐ" );
      out.write("</span></span>\n");
      out.write("            <span class='icon-div2'><img src=\"../img/giftbox.png\" alt=\"\"><span>Chiết khấu: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.discount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("%</span></span>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <br>\n");
      out.write("\n");
      out.write("    <br>\n");
      out.write("    <div style=\"display: flex; justify-content: center;\">\n");
      out.write("        <form action=\"\" class=\"form\">\n");
      out.write("            <h3 style=\"margin: 0;\">Cập nhật thông tin</h3>\n");
      out.write("            <hr>\n");
      out.write("            <div style=\"display: flex; align-items: center;\">\n");
      out.write("                <img style=\" border-radius: 8px;width: 180px;height: 180px; margin-right: 15px;\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.avatar}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"\"><br>\n");
      out.write("                <button>ChangeImage</button>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"form__div\">\n");
      out.write("                <input style=\"background-color: rgb(0 0 0 / 6%);\" value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("' class=\"form__input\" placeholder=\" \" disabled>\n");
      out.write("                <label for=\"\" class=\"form__label\">Tài khoản</label>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form__div\">\n");
      out.write("                <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" class=\"form__input\" placeholder=\" \">\n");
      out.write("                <label for=\"\" class=\"form__label\" >Email</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form__div\">\n");
      out.write("                <input type=\"password\" class=\"form__input\" placeholder=\" \">\n");
      out.write("                <label for=\"\" class=\"form__label\">Xác nhận mật khẩu</label>\n");
      out.write("            </div>\n");
      out.write("            <input type=\"submit\" class=\"form__button\" value=\"Cập nhật\">\n");
      out.write("        </form>\n");
      out.write("        <form action=\"\" class=\"form\">\n");
      out.write("            <h3 style=\"margin: 0;\">Thay đổi mật khẩu</h3>\n");
      out.write("            <hr>\n");
      out.write("            <img style=\"display: flex;margin: 0 auto;width: 180px;height: 180px;\" src=\"../img/secure.png\" alt=\"\"><br>\n");
      out.write("\n");
      out.write("            <div class=\"form__div\">\n");
      out.write("                <input type=\"password\" class=\"form__input\" placeholder=\" \">\n");
      out.write("                <label for=\"\" class=\"form__label\">Mật khẩu cũ</label>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form__div\">\n");
      out.write("                <input type=\"password\" class=\"form__input\" placeholder=\" \">\n");
      out.write("                <label for=\"\" class=\"form__label\">Mật khẩu mới</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form__div\">\n");
      out.write("                <input type=\"password\" class=\"form__input\" placeholder=\" \">\n");
      out.write("                <label for=\"\" class=\"form__label\">Xác nhận mật khẩu</label>\n");
      out.write("            </div>\n");
      out.write("            <input type=\"submit\" class=\"form__button\" value=\"Thay đổi\">\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.role==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <span>Quản trị viên</span>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.role==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <span>Cộng tác viên</span>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
