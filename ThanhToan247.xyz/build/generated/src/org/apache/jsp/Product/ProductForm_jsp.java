package org.apache.jsp.Product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ProductForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang='en'>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            .cncc img {\n");
      out.write("                box-shadow: rgb(0 0 0 / 16%) 0px 3px 6px, rgb(0 0 0 / 23%) 0px 3px 6px;\n");
      out.write("                width: 135px;\n");
      out.write("                border: 1px solid rgb(184, 160, 160);\n");
      out.write("                border-radius: 8px;\n");
      out.write("                margin: 3px;\n");
      out.write("                transform: scale(1);\n");
      out.write("                transition: 0.5 ease-in-out;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .cncc h2{\n");
      out.write("                color: #f44336;\n");
      out.write("                margin-bottom: 15px\n");
      out.write("            }\n");
      out.write("            .cncc img:hover {\n");
      out.write("                border: 1px solid rgb(187, 224, 84);\n");
      out.write("                cursor: pointer;\n");
      out.write("                transform: scale(1.08);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .cmg .cmg-gia {\n");
      out.write("                margin: 3px;\n");
      out.write("                width: 120px;\n");
      out.write("                border: 1px solid rgb(104, 93, 93);\n");
      out.write("                border-radius: 8px;\n");
      out.write("                display: inline-block;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 15px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .cmg .cmg-gia:hover {\n");
      out.write("                border: 1px solid rgb(76, 97, 20);\n");
      out.write("                cursor: pointer;\n");
      out.write("                transform: scale(1.08);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .quantity-card h3 {\n");
      out.write("                display: inline-block;\n");
      out.write("            }\n");
      out.write("            .cmg {\n");
      out.write("                margin-top: 50px;\n");
      out.write("            }\n");
      out.write("            .cmg h2{\n");
      out.write("                color: #f44336;\n");
      out.write("\n");
      out.write("                margin-bottom:  15px;\n");
      out.write("            }\n");
      out.write("            .quantity-card .btn-quan {\n");
      out.write("                padding: 3px 12px;\n");
      out.write("                background-color: white;\n");
      out.write("                border: 1px solid #97a0af8c;\n");
      out.write("                font-weight: bold;\n");
      out.write("                margin: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .quantity-card .inp-quan {\n");
      out.write("                margin: -5px;\n");
      out.write("                padding: 3px;\n");
      out.write("                width: 5%;\n");
      out.write("                text-align: center;\n");
      out.write("                font-weight: bold;\n");
      out.write("                border: 1px solid #97a0af8c;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .quantity-card .btn-quan:hover {\n");
      out.write("                background-color: yellowgreen;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .add-Product .Add,\n");
      out.write("            .add-Product .Buy {\n");
      out.write("                display: inline-block;\n");
      out.write("                border: 1px solid rgb(141, 54, 54);\n");
      out.write("                padding: 15px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .add-Product {\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .add-Product .Add {\n");
      out.write("                margin-right: 15px;\n");
      out.write("                background-color: #ffeee8;\n");
      out.write("                color: rgb(92, 116, 44);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .add-Product .Add img {\n");
      out.write("                margin-right: 8px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .add-Product .Add:hover {\n");
      out.write("                background-color: #e0cec7;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .add-Product .Buy:hover {\n");
      out.write("                background-color: #a07969;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .add-Product .Buy {\n");
      out.write("                background-color: #ee4d2d;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .div-gia1 {\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .div-gia2 {\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            .product-container{\n");
      out.write("                padding: 20px 0 50px 0;\n");
      out.write("                box-shadow: rgba(0, 0, 0, 0.25) 0px 14px 28px, rgba(0, 0, 0, 0.22) 0px 10px 10px;\n");
      out.write("                margin: 35px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .quantity-card h3{\n");
      out.write("                margin: 25px;\n");
      out.write("            }\n");
      out.write("            .h1_title{\n");
      out.write("                text-align: left;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                background: url(https://banthe24h.vn/images/new_index/bg_title.png) left bottom/contain no-repeat;\n");
      out.write("                padding: 0 40px 5px;\n");
      out.write("                font-size: 20px;\n");
      out.write("                line-height: 30px;\n");
      out.write("                color: #358daf;\n");
      out.write("                margin: 0 0 21px;\n");
      out.write("                font-weight: 700;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("                        \n");
      out.write("\n");
      out.write("        <div class=\"product-container\">\n");
      out.write("            <h1 class=\"h1_title\">Mua thẻ điện thoại</h1>\n");
      out.write("            <div class=\"cncc\">\n");
      out.write("                <h2>Chọn nhà cung cấp: </h2>\n");
      out.write("                <img src=\"https://hqpay.vn/storage/images/wD3OAX53sQ_1625037689.png\" alt=''>\n");
      out.write("                <img src=\"https://hqpay.vn/storage/images/5oBfqagH5V_1619539822.png\" alt=\"\">\n");
      out.write("                <img src=\"https://hqpay.vn/storage/images/iFMbkulr4w_1619540012.png\" alt=\"\">\n");
      out.write("                <img src=\"https://hqpay.vn/storage/images/EJf2KN04b6_1626426501.png\" alt=\"\">\n");
      out.write("                <img src=\"https://hqpay.vn/storage/images/KWPSKsgxdG_1626426621.png\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"cmg\" ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("><hr><br>\n");
      out.write("                <h2>Chọn mệnh giá: </h2>\n");
      out.write("                <div class='cmg-gia'>\n");
      out.write("                    <div class='div-gia1'>10,000đ</div>\n");
      out.write("                    <div class='div-gia2'>Giá: 9,750đ</div>\n");
      out.write("                </div>\n");
      out.write("                <div class='cmg-gia'>\n");
      out.write("                    <div class='div-gia1'>10,000đ</div>\n");
      out.write("                    <div class='div-gia2'>Giá: 9,750đ</div>\n");
      out.write("                </div>\n");
      out.write("                <div class='cmg-gia'>\n");
      out.write("                    <div class='div-gia1'>10,000đ</div>\n");
      out.write("                    <div class='div-gia2'>Giá: 9,750đ</div>\n");
      out.write("                </div>\n");
      out.write("                <div class='cmg-gia'>\n");
      out.write("                    <div class='div-gia1'>10,000đ</div>\n");
      out.write("                    <div class='div-gia2'>Giá: 9,750đ</div>\n");
      out.write("                </div>\n");
      out.write("                <div class='cmg-gia'>\n");
      out.write("                    <div class='div-gia1'>10,000đ</div>\n");
      out.write("                    <div class='div-gia2'>Giá: 9,750đ</div>\n");
      out.write("                </div>\n");
      out.write("                <div class='cmg-gia'>\n");
      out.write("                    <div class='div-gia1'>10,000đ</div>\n");
      out.write("                    <div class='div-gia2'>Giá: 9,750đ</div>\n");
      out.write("                </div>\n");
      out.write("                <div class='cmg-gia'>\n");
      out.write("                    <div class='div-gia1'>10,000đ</div>\n");
      out.write("                    <div class='div-gia2'>Giá: 9,750đ</div>\n");
      out.write("                </div>\n");
      out.write("                <div class='cmg-gia'>\n");
      out.write("                    <div class='div-gia1'>10,000đ</div>\n");
      out.write("                    <div class='div-gia2'>Giá: 9,750đ</div>\n");
      out.write("                </div>\n");
      out.write("                <div class='cmg-gia'>\n");
      out.write("                    <div class='div-gia1'>10,000đ</div>\n");
      out.write("                    <div class='div-gia2'>Giá: 9,750đ</div>\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"quantity-card\">\n");
      out.write("                    <h3>Số lượng thẻ</h3>\n");
      out.write("                    <input onClick='decreaseCount(event, this)' class=\"btn-quan\" type=\"button\" value=\"-\">\n");
      out.write("                    <input class=\"inp-quan\" type=\"text\" value=\"1\">\n");
      out.write("                    <input onClick='increaseCount(event, this)' class=\"btn-quan\" type=\"button\" value=\"+\">\n");
      out.write("                </div>\n");
      out.write("                <div class='add-Product'>\n");
      out.write("                    <div class='Add'><img src=\"https://img.icons8.com/office/16/000000/add-shopping-cart.png\" />Thêm vào giỏ hàng\n");
      out.write("                    </div>\n");
      out.write("                    <div class='Buy'>Mua Ngay</div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function increaseCount(a, b) {\n");
      out.write("                var input = b.previousElementSibling;\n");
      out.write("                var value = parseInt(input.value, 10);\n");
      out.write("                value = isNaN(value) ? 0 : value;\n");
      out.write("                value++;\n");
      out.write("                input.value = value;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function decreaseCount(a, b) {\n");
      out.write("                var input = b.nextElementSibling;\n");
      out.write("                var value = parseInt(input.value, 10);\n");
      out.write("                if (value > 1) {\n");
      out.write("                    value = isNaN(value) ? 0 : value;\n");
      out.write("                    value--;\n");
      out.write("                    input.value = value;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ChooseSuccess!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                 style=\"display: none;\"\n");
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
}
