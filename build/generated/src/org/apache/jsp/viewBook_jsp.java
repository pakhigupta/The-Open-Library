package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class viewBook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
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
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"res/w3.css\">\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            span{\n");
      out.write("                font: bolder;\n");
      out.write("                font-size: 16px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Book Details</title>\n");
      out.write("    </head>\n");
      out.write("    <body align=\"center\">\n");
      out.write("        <br><br><br>\n");
      out.write("        ");

            
            String bid1=(String)request.getParameter("id");
            int bid=Integer.parseInt(bid1);
            request.setAttribute("id",bid);
            String q="select * from book_collection where id="+bid;
            ResultSet rs=jdbc.DAOLayer.selectData(q);
            rs.next();
        
      out.write("\n");
      out.write("        \n");
      out.write("        <h2>Book: ");
      out.print(rs.getString(9));
      out.write("</h2>\n");
      out.write("        <div style=\"border: 1px solid black; padding: 3%\">\n");
      out.write("           \n");
      out.write("            <img src=\"");
      out.print(rs.getString(6));
      out.write("\" style=\"border: 1px solid gray;padding:2px;height:175px; width:120px\"><br><br>\n");
      out.write("            \n");
      out.write("            <span class=\"w3-card-4\">Author: </span>");
      out.print(rs.getString(2));
      out.write("<br>\n");
      out.write("            <span class=\"w3-card-4\">Price: </span>");
      out.print("&#8377;"+rs.getString(7));
      out.write("<br>\n");
      out.write("            <span class=\"w3-card-4\">Genre: </span>");
      out.print(rs.getString(5));
      out.write("<br>\n");
      out.write("            <span class=\"w3-card-4\">Category: </span>");
      out.print(rs.getString(3));
      out.write("<br>\n");
      out.write("            <span class=\"w3-card-4\">Release Year: </span>");
      out.print(rs.getString(8));
      out.write("<br>\n");
      out.write("        </div>\n");
      out.write("        <button class=\"w3-border-grey\"><a href=\"addCartServ\">Add to Cart</a></button>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            .fa {\n");
      out.write("                padding: 20px;\n");
      out.write("                font-size: 30px;\n");
      out.write("                width: 30px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("                border-radius: 50%;\n");
      out.write("            }\n");
      out.write("            .fa:hover {\n");
      out.write("               opacity: 0.7;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Footer</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: lightgrey; float: bottom;\">\n");
      out.write("        <br>\n");
      out.write("        <hr>\n");
      out.write("        <div style=\"height: 100px;width: 100%;\">\n");
      out.write("            <div style=\"height: 100px;width: 45%;float: left;\">\n");
      out.write("                <h3>Made with &#9749 and &#9834 by Pakhi Gupta</h3>\n");
      out.write("            </div>\n");
      out.write("            <div style=\" height: 100px;width: 45%;float: right;\">\n");
      out.write("                \n");
      out.write("                <span style=\"font-family: sans-serif;font-size: 20px;\"><strong>Connect with us :</strong></span>\n");
      out.write("                <a href=\"https://www.facebook.com/\" class=\"fa fa-facebook\"></a>\n");
      out.write("                <a href=\"https://twitter.com/\" class=\"fa fa-twitter\"></a>\n");
      out.write("                <a href=\"https://www.instagram.com/\" class=\"fa fa-instagram\"></a>\n");
      out.write("                <br><span style=\"font-family: sans-serif;font-size: 15px; color: black;\">\n");
      out.write("                        <a href=\"#\">About Us</a> \n");
      out.write("                        &#9829;\n");
      out.write("                        <a href=\"#\">Feedback</a>\n");
      out.write("                </span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
