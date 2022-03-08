package org.apache.jsp.Home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Home</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../LeftNavbar-TopNavbar/LeftNavbar.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"home-content\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../LeftNavbar-TopNavbar/TopNavbar.jsp", out, false);
      out.write("\n");
      out.write("            <div><div class=\"divflex1\">\n");
      out.write("                    <div onclick=\"window.location.href = 'gamecard'\" class=\"div-img-home\">\n");
      out.write("                        <img src=\"../img/02-57-00-09-07-2020-game.png\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div onclick=\"window.location.href = 'phonecard'\" class=\"div-img-home\">\n");
      out.write("                        <img src=\"../img/08-10-47-15-09-2021-napthedt.png\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"divflex2\">\n");
      out.write("                    <div onclick=\"window.location.href = '#3'\" class=\"div-img-home\">\n");
      out.write("                        <img src=\"../img/08-11-15-15-09-2021-naptiendt.png\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div onclick=\"window.location.href = '#4'\" class=\"div-img-home\">\n");
      out.write("                        <img src=\"../img/08-52-59-15-01-2021-banner-digo-02.png\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                </div></div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            document.getElementById('nav1-animation').style.display = 'block'\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
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
}
