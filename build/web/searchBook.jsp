<%@include file="header.jsp" %>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search</title>
    </head>
    <body align="center">
        <form action="searchBook.jsp" align=center>
            <input type="text" name="search"  placeholder="Search by Title/Author" />
            <button type="submit" class="btn btn-default">
            <span class="glyphicon glyphicon-search"></span> Search
            </button>
        </form>
        <br><br>
        <!--<form action="searchBook.jsp" align="center">
            <input type="radio" name="sort" value="title">Sort by Title
            <input type="radio" name="sort" value="author">Sort by Author
            <input type="submit" value="Sort">
        </form>-->
        
        <%
            String search=request.getParameter("search");
            
            String q="";
            if(search!=null)
            {
                if(request.getParameter("sort")!=null){
                    RequestDispatcher rd=request.getRequestDispatcher("searchBook.jsp");
                    rd.include(request, response);
                    if(request.getParameter("sort").equals("title")){
                        q="select * from book_collection where title like '%"+search+"%' or author like '%"+search+"%' order by title";
                    }
                    else if(request.getParameter("sort").equals("author")){
                        q="select * from book_collection where title like '%"+search+"%' or author like '%"+search+"%' order by author";
                    }

                }
                else{
                    q="select * from book_collection where title like '%"+search+"%' or author like '%"+search+"%'";
                }
                ResultSet rs=jdbc.DAOLayer.selectData(q);
                while(rs.next())
                {
            %>
            <div class="w3-animate-bottom" style="height: 300px; width: 40%;">
                <img src="<%=rs.getString(6)%>" style="border: 1px solid blue; height:150px; width: 110px;"/>
                <br><br><span>Title:<%=rs.getString(9)%></span>
                <br><span>Author:<%=rs.getString(2)%></span>
                <br><span>Available in:
                    <% if(rs.getString(2).equals("old")){%>
                        Library 
                    <% } else{ %> 
                        Store <%}%></span>
                <%String url="viewBook.jsp?id="+rs.getString(1);%>
                <br><br><button><a href="<%=url%>">View More</a></button>
            </div>
            <%}%>
            <hr><br>
            <% } %>
    </body>
</html>
<%@include file="footer.jsp" %>