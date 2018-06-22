
<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.Session"%>
<%@page import="tables.book_collection"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="addBook.jsp">
            <fieldset>
                <legend>Enter book details: </legend>
                ID: <input type="number" name="id"><br> 
                Title: <input type="text" name="title"><br>
                Author: <input type="text" name="author"><br> 
                Price: <input type="number" name="price"><br> 
                Genre: <input type="text" name="genre"><br>
                Category: <input type="text" name="category"><br> 
                Condition(old/new): <input type="text" name="cond"><br>
                Release Year: <input type="text" name="releaseYear"><br>
                Image Url:<input type="text" name="imgUrl"><br>
                <input type="checkbox" name="check"> Details Verified
                <input type="submit" value="Add Book">                
            </fieldset>
        </form>
        <%
            
        %>
        
        <jsp:declaration>
            String s=request.getParameter("check");
        </jsp:declaration>
            <h1>${s}</h1>
        <core:if test="${s ne null}">
            <h1>Input recieved</h1>
            <jsp:useBean class="tables.book_collection" id="book"/>
            <jsp:setProperty name="tables.book_collection" property="*"/>  
            <%
            Session sess= hib.DAOLayer.getSession();
            Transaction t= sess.beginTransaction();
            sess.save(book);
            t.commit();
        %>
        </core:if>
        
        
    </body>
</html>
