
package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomePage extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        out.print("<head>");
        out.print("<style>");
        out.print("body{text-align:center;}");
        out.print(".block {height:100%;width:100%;padding:0;overflow:hidden;border: 1px black solid;}");
        out.print("#menu {list-style-type: none;margin: 1;padding: 0;overflow: hidden;background-color: pink; float: right;}");
        
        out.print("li a {display: block;color: black;text-align: center;padding: 20px;text-decoration: none;}");
        out.print("li a:hover {background-color:grey;}");
        out.print("</style>");
        out.print("</head>");
        //menu bar
        out.print("<body>");
        out.print("<div style='float: right;'>");
        out.print("<ul style='border:1px black solid;' id='menu'>");
        out.print("<li><a href='#home'>Home</a></li>");
        //-------------login link
        out.print("<li><a href='#'>Login</a></li>");
        out.print("<li><a href='#browse'>Browse</a></li>");
        out.print("<li><a href='#blog'>Blog</a></li>");
        out.print("<li><a href='#contact'>Contact us</a></li>");
        out.print("</ul>");
        out.print("</div>");
        
        
        //home
        out.print("<div id='home' class='block'>");
        out.print("<h2>The Open Library</h2>");    
        out.print("<p>The final stop for all your book needs!</p>");
        out.print("<p>We, at the Open Library understand the passion of our fellow readers. Hence we brough you a platform where you can:</p>");
        out.print("<br>");
        out.print("<ul>");
        out.print("<li>buy and show off your book collection</li>");
        out.print("<li>Donate and help us expand our Open Library.</li>");
        out.print("<li>Sell your almost new books too.</li>");
        out.print("<li>Or, Borrow books from us.</li>");
        out.print("</ul>");
        out.print("</div>");
        
        //browse
        //put random books from your database(atleast 5)
        out.print("<div id='browse' class='block'>");
        out.print("<h4>Sample Books: </h4>");
        out.print("<ul>");
        out.print("<li>The Kite Runner- Khaleid Hosseni</li>");
        out.print("<li>Cormoran Series- Robert Galbreith</li>");
        out.print("<li>13 Reasons Why- Jay Asher</li>");
        out.print("</ul>");
        out.print("</div>");
        
        //blog
        //add blog links(If nothing then add some from goodreads)
        out.print("<div id='blog' class='block'>");
        out.print("Follow our blog, or create your own to share book reviews.");
        out.print("</div>");
        
        //contact us
        out.print("<div id='contact' class='block'>");
        out.print("</div>");
        
        out.print("</body>");
    
       
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
