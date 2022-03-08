package org.apache.jsp.Login_002dSignUp_002dForgotPass;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SignupSendCode_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Home</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/Login.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../LeftNavbar-TopNavbar/LeftNavbar.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"home-content\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../LeftNavbar-TopNavbar/TopNavbar.jsp", out, false);
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <div class=\"container sign-up-mode\">\n");
      out.write("                            <div class=\"forms-container\">\n");
      out.write("                                <div class=\"signin-signup\">\n");
      out.write("                                    <form action=\"login\" method=\"post\" class=\"sign-in-form\">\n");
      out.write("                                        <h2 class=\"title\">Sign in</h2>\n");
      out.write("                                        <div class=\"input-field\">\n");
      out.write("                                            <i class=\"fas fa-user\"></i>\n");
      out.write("                                            <input type=\"text\" name=\"username\" placeholder=\"Username\" />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"input-field\">\n");
      out.write("                                            <i class=\"fas fa-lock\"></i>\n");
      out.write("                                            <input type=\"password\" name=\"password\" placeholder=\"Password\" />\n");
      out.write("                                        </div>\n");
      out.write("                                        <input type=\"submit\" value=\"Login\" class=\"btn solid\" />\n");
      out.write("                                                                                <a class=\"a-forget-password\" href='recover'>Forgot password</a>\n");
      out.write("\n");
      out.write("                                    <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errorLogin != null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                        <p class=\"social-text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errorLogin}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                    </c:if>\n");
      out.write("\n");
      out.write("                                    <div class=\"social-media\">\n");
      out.write("                                        <a href=\"#\" class=\"social-icon\">\n");
      out.write("                                            <i class=\"fab fa-facebook-f\"></i>\n");
      out.write("                                        </a>\n");
      out.write("                                        <a href=\"#\" class=\"social-icon\">\n");
      out.write("                                            <i class=\"fab fa-twitter\"></i>\n");
      out.write("                                        </a>\n");
      out.write("                                        <a href=\"#\" class=\"social-icon\">\n");
      out.write("                                            <i class=\"fab fa-google\"></i>\n");
      out.write("                                        </a>\n");
      out.write("                                        <a href=\"#\" class=\"social-icon\">\n");
      out.write("                                            <i class=\"fab fa-linkedin-in\"></i>\n");
      out.write("                                        </a>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                                <form action=\"signupcode\" method=\"post\" class=\"sign-up-form\">\n");
      out.write("                                    <p class=\"title\" style=\"text-align: center;font-weight: 500;font-size: 1.0rem;\">Please enter the code in your mailbox ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                    <div class=\"input-field\">\n");
      out.write("                                        <i class=\"fas fa-user\"></i>\n");
      out.write("                                        <input type=\"text\" name=\"code\" placeholder=\"Enter code\" />\n");
      out.write("                                    </div>\n");
      out.write("                                  \n");
      out.write("                                    \n");
      out.write("                                    <input type=\"submit\" class=\"btn\" value=\"Send code\" />\n");
      out.write("                                    <p style=\"text-align:center;\" class=\"social-text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errorSendCode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                    \n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"panels-container\">\n");
      out.write("                            <div class=\"panel left-panel\">\n");
      out.write("                                <div class=\"content\">\n");
      out.write("                                    <h3>No account?</h3>\n");
      out.write("                                    <p>\n");
      out.write("                                        Click here to create a new account!\n");
      out.write("                                    </p>\n");
      out.write("                                    <button class=\"btn transparent\" id=\"sign-up-btn\">\n");
      out.write("                                        Sign up\n");
      out.write("                                    </button>\n");
      out.write("                                </div>\n");
      out.write("                                <img src=\"../img/log.svg\" class=\"image\" alt=\"\" />\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"panel right-panel\">\n");
      out.write("                                <div class=\"content\">\n");
      out.write("                                    <h3>You already have an account</h3>\n");
      out.write("                                    <p>\n");
      out.write("                                        Click here to login!\n");
      out.write("                                    </p>\n");
      out.write("                                    <button class=\"btn transparent\" id=\"sign-in-btn\">\n");
      out.write("                                        Sign in\n");
      out.write("                                    </button>\n");
      out.write("                                </div>\n");
      out.write("                                <img src=\"../img/register.svg\" class=\"image\" alt=\"\" />\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("    <script src=\"../js/login.js\"></script>\n");
      out.write("    <script src=\"https://kit.fontawesome.com/64d58efce2.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("</html>\n");
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
}
