package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class browse_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

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
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>The Open Library</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div>\n");
      out.write("            <ul class=\"menu\">\n");
      out.write("                <li style=\"float: right;\"><a href=\"#contact\">Contact</a></li>\n");
      out.write("                <li style=\"float: right;\"><a href=\"#blog\">Blog</a></li>\n");
      out.write("                <li style=\"float: right;\"><a href=\"browse.jsp\">Browse</a></li>\n");
      out.write("                <li style=\"float: right;\"><a href=\"home.jsp\">Home</a></li>\n");
      out.write("               \n");
      out.write("                <li style=\"float: left;\"><a href=\"buy.jsp\">Buy</a></li>\n");
      out.write("                <li style=\"float: left;\"><a href=\"sell.jsp\">Sell</a></li>\n");
      out.write("                <li style=\"float: left;\"><a href=\"borrow.jsp\">Borrow</a></li>\n");
      out.write("                <li style=\"float: left;\"><a href=\"donate.jsp\">Donate</a></li>\n");
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Browse</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2 style=\"margin-left:5%;\">Week's Special: </h2>\n");
      out.write("        <h5 style=\"margin-left:5%;\">To browse more, click on buy/borrow.</h5>\n");
      out.write("        <div style=\"height: 500px; padding: 4%;margin-right: 10%;margin-left: 10%;text-align: center;\">\n");
      out.write("        ");

            String q="select title, imgurl,id from book_collection";
            ResultSet rs=jdbc.DAOLayer.selectData(q);
            while(rs.next())
            {
        
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <div class=\"w3-animate-bottom\" style=\"height: 300px; width: 40%;float: left;\">\n");
      out.write("            <img src=\"");
      out.print(rs.getString(2));
      out.write("\" style=\"border: 1px solid blue; height:150px; width: 110px;\"/>\n");
      out.write("            <br><br><span>");
      out.print(rs.getString(1));
      out.write("</span>\n");
      out.write("            ");
String url="viewBook.jsp?id="+rs.getString(3);
      out.write("\n");
      out.write("            <br><br><button><a href=\"");
      out.print(url);
      out.write("\">View More</a></button>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        ");
if(rs.next()){
      out.write("\n");
      out.write("        <div class=\"w3-animate-bottom\" style=\"height: 300px;width: 40%;float: right;\">\n");
      out.write("            <img src=\"");
      out.print(rs.getString(2));
      out.write("\" style=\"border: 1px solid blue; height:150px; width: 110px;\"/>\n");
      out.write("            <br><br><span>");
      out.print(rs.getString(1));
      out.write("</span>\n");
      out.write("            ");
url="viewBook.jsp?id="+rs.getString(3);
      out.write("\n");
      out.write("            <br><br><button><a href=\"");
      out.print(url);
      out.write("\">View More</a></button>\n");
      out.write("        </div>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        <br>\n");
      out.write("        ");

        }
        
      out.write("\n");
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
}
