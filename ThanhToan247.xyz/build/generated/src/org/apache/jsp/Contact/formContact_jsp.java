package org.apache.jsp.Contact;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class formContact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>complete responsive real estate website design tutorial</title>\n");
      out.write("\n");
      out.write("    <!-- font awesome cdn link  -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/styleContact.css\">\n");
      out.write("<!--    <style>\n");
      out.write("          .header__cart-icon {\n");
      out.write("                font-size: 4.2rem;\n");
      out.write("            }\n");
      out.write("    </style>-->\n");
      out.write("    <!-- custom css file link  -->\n");
      out.write("    \n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <!-- header section starts  -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- agents section ends -->\n");
      out.write("\n");
      out.write("    <!-- contact section starts  -->\n");
      out.write("\n");
      out.write("    <section class=\"contact\" id=\"contact\">\n");
      out.write("\n");
      out.write("        <h1 class=\"heading\"> <span>Contact</span> us </h1>\n");
      out.write("\n");
      out.write("        <div class=\"icons-container\">\n");
      out.write("\n");
      out.write("            <div class=\"icons\">\n");
      out.write("                <img src=\"img/icon-1.png\" alt=\"\">\n");
      out.write("                <h3>Phone number</h3>\n");
      out.write("                <p>0395090937</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"icons\">\n");
      out.write("                <img src=\"img/icon-2.png\" alt=\"\">\n");
      out.write("                <h3>Email address</h3>\n");
      out.write("                <p>hungnthe153039@fpt.edu.vn</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"icons\">\n");
      out.write("                <img src=\"img/icon-3.png\" alt=\"\">\n");
      out.write("                <h3>Office address</h3>\n");
      out.write("                <p>Thạch Hoà, Thạch Thất, Hà Nội 10000</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("\n");
      out.write("            <form action=\"\">\n");
      out.write("                <div class=\"inputBox\">\n");
      out.write("                    <input type=\"text\" placeholder=\"Name\">\n");
      out.write("                    <input type=\"number\" placeholder=\"Phone number\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"inputBox\">\n");
      out.write("                    <input type=\"email\" placeholder=\"Email\">\n");
      out.write("                    <input type=\"text\" placeholder=\"Subject\">\n");
      out.write("                </div>\n");
      out.write("                <textarea name=\"\" placeholder=\"Message\" id=\"\" cols=\"30\" rows=\"10\"></textarea>\n");
      out.write("                <input type=\"submit\" value=\"Send message\" class=\"btn\">\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            <iframe class=\"map\" src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d6400.941267903413!2d105.52453798269198!3d21.01397968987736!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x31345b465a4e65fb%3A0xaae6040cfabe8fe!2sFPT%20University!5e0!3m2!1sen!2s!4v1641989120763!5m2!1sen!2s\"\n");
      out.write("                allowfullscreen=\"\" loading=\"lazy\"></iframe>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <!-- contact section ends -->\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
}
