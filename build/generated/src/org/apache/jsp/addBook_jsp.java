package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.hibernate.Transaction;
import org.hibernate.Session;
import tables.book_collection;

public final class addBook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"addBook.jsp\">\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Enter book details: </legend>\n");
      out.write("                ID: <input type=\"number\" name=\"id\"><br> \n");
      out.write("                Title: <input type=\"text\" name=\"title\"><br>\n");
      out.write("                Author: <input type=\"text\" name=\"author\"><br> \n");
      out.write("                Price: <input type=\"number\" name=\"price\"><br> \n");
      out.write("                Genre: <input type=\"text\" name=\"genre\"><br>\n");
      out.write("                Category: <input type=\"text\" name=\"category\"><br> \n");
      out.write("                Condition(old/new): <input type=\"text\" name=\"cond\"><br>\n");
      out.write("                Release Year: <input type=\"text\" name=\"releaseYear\"><br>\n");
      out.write("                Image Url:<input type=\"text\" name=\"imgUrl\"><br>\n");
      out.write("                <input type=\"checkbox\" name=\"check\"> Details Verified\n");
      out.write("                <input type=\"submit\" value=\"Add Book\">                \n");
      out.write("            </fieldset>\n");
      out.write("        </form>\n");
      out.write("        ");

            String s=request.getParameter("check");
            
        
      out.write("\n");
      out.write("        ");
      //  core:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_core_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_core_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_core_if_0.setPageContext(_jspx_page_context);
      _jspx_th_core_if_0.setParent(null);
      _jspx_th_core_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s ne null}}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_core_if_0 = _jspx_th_core_if_0.doStartTag();
      if (_jspx_eval_core_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            ");
          tables.book_collection book = null;
          synchronized (_jspx_page_context) {
            book = (tables.book_collection) _jspx_page_context.getAttribute("book", PageContext.PAGE_SCOPE);
            if (book == null){
              book = new tables.book_collection();
              _jspx_page_context.setAttribute("book", book, PageContext.PAGE_SCOPE);
            }
          }
          out.write("\n");
          out.write("            ");
          org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("book"), request);
          out.write("            \n");
          out.write("        ");

            Session sess= hib.DAOLayer.getSession();
            Transaction t= sess.beginTransaction();
            sess.save(book);
            t.commit();
        
          out.write("\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_core_if_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_core_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_core_if_test.reuse(_jspx_th_core_if_0);
        return;
      }
      _jspx_tagPool_core_if_test.reuse(_jspx_th_core_if_0);
      out.write("\n");
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
