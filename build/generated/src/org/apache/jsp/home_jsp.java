package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header2.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_core_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_core_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_core_if_test.release();
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"res/w3.css\">\n");
      out.write("        <style>\n");
      out.write("            .menu {\n");
      out.write("                list-style-type: none;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                overflow: hidden;\n");
      out.write("                background-color: lightgray;\n");
      out.write("                \n");
      out.write("                font-weight: bold;\n");
      out.write("                font-size: 18px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("                \n");
      out.write("\n");
      out.write("            li a {\n");
      out.write("                font-family: cursive;\n");
      out.write("                display: block;\n");
      out.write("                color: #4d4d4d;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 20px;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            li a:hover {\n");
      out.write("                background-color: #111111;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            body{\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>The Open Library</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            ");
      if (_jspx_meth_core_if_0(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <ul class=\"menu\">\n");
      out.write("                <li style=\"float: right;\"><a href=\"#contact\">Contact</a></li>\n");
      out.write("                <li style=\"float: right;\"><a href=\"#blog\">Blog</a></li>\n");
      out.write("                <li style=\"float: right;\"><a href=\"#browse\">Browse</a></li>\n");
      out.write("                <li style=\"float: right;\"><a href=\"#home\">Home</a></li>\n");
      out.write("               \n");
      out.write("                <li style=\"float: left;\"><a href=\"#\">Buy</a></li>\n");
      out.write("                <li style=\"float: left;\"><a href=\"#\">Sell</a></li>\n");
      out.write("                <li style=\"float: left;\"><a href=\"#\">Borrow</a></li>\n");
      out.write("                <li style=\"float: left;\"><a href=\"#\">Donate</a></li>\n");
      out.write("                \n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"res/w3.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"res/Site.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-color:lightgrey;\n");
      out.write("                width: 100%;\n");
      out.write("                align-content: center;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div style=\"background-image: url('res/book-wallpaper.jpg');height:400px; \">\n");
      out.write("            <h1 class=\"w3-text-amber\" style=\"font-size:60px\">The Open Library</h1>\n");
      out.write("            <h1 class=\"w3-amber\" style=\"font-size:35px\">Buy &#9830 Sell &#9830 Donate &#9830 Borrow</h1>\n");
      out.write("            <h1 class=\"w3-text-white\">Final Stoppage to all your book needs!</h1>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div style=\"height: 200px;align-content: center;padding-top:5%;padding-bottom:5%; \">\n");
      out.write("            <h2>Do you have a long Reading list?</h2>\n");
      out.write("            <h3>Regardless of what genre you are interested in, we have a solution to all your book needs.</h3>\n");
      out.write("            <h3></h3>\n");
      out.write("        </div>   \n");
      out.write("        <div>\n");
      out.write("             \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_core_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  core:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_core_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_core_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_core_if_0.setPageContext(_jspx_page_context);
    _jspx_th_core_if_0.setParent(null);
    _jspx_th_core_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.mid eq null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_core_if_0 = _jspx_th_core_if_0.doStartTag();
    if (_jspx_eval_core_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                ");
        if (true) {
          _jspx_page_context.forward("login.jsp");
          return true;
        }
        out.write("\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_core_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_core_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_core_if_test.reuse(_jspx_th_core_if_0);
      return true;
    }
    _jspx_tagPool_core_if_test.reuse(_jspx_th_core_if_0);
    return false;
  }
}
