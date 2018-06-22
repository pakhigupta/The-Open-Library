
<%@page import="java.sql.ResultSet"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<%@include file="header_secured.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            #myBtn {
                display: none; /* Hidden by default */
                position: fixed; /* Fixed/sticky position */
                bottom: 20px; /* Place the button at the bottom of the page */
                right: 30px; /* Place the button 30px from the right */
                z-index: 99; /* Make sure it does not overlap */
                border: none; /* Remove borders */
                outline: none; /* Remove outline */
                background-color: darkslategray; /* Set a background color */
                color: white; /* Text color */
                cursor: pointer; /* Add a mouse pointer on hover */
                padding: 15px; /* Some padding */
                border-radius: 10px; /* Rounded corners */
            }

            #myBtn:hover {
                background-color: #555; /* Add a dark-grey background on hover */
            }
        </style>
        <link rel="stylesheet" href="res/w3css-1.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Browse</title>
    </head>
    <body>
        <button onclick="topFunction()" id="myBtn" title="Go to top">Top</button>
        <form action="searchBook.jsp" align=center>
            <input type="text" name="search" placeholder="Search by Title/Author"/>
            <button type="submit" class="btn btn-default">
            <span class="glyphicon glyphicon-search"></span> Search
            </button>
        </form>
       
        <h2 style="margin-left:5%;">Our Book Store: </h2>
        <h3 style="margin-left:5%;"></h3>
        <div style="height: 500px; padding: 4%;margin-right: 10%;margin-left: 10%;text-align: center;">
        <%
            String q="select title, imgurl,id from book_collection where cond='new'";
            ResultSet rs=jdbc.DAOLayer.selectData(q);
            while(rs.next())
            {
        %>
        <br>
        <div class="w3-animate-bottom" style="height: 300px; width: 40%;float: left;">
            <img src="<%=rs.getString(2)%>" style="border: 1px solid blue; height:150px; width: 110px;"/>
            <br><br><span><%=rs.getString(1)%></span>
            <%String url="viewBook.jsp?id="+rs.getString(3);%>
            <br><br><button><a href="<%=url%>">View More</a></button>
        </div>
        
        <%if(rs.next()){%>
        <div class="w3-animate-bottom" style="height: 300px;width: 40%;float: right;">
            <img src="<%=rs.getString(2)%>" style="border: 1px solid blue; height:150px; width: 110px;"/>
            <br><br><span><%=rs.getString(1)%></span>
            <%url="viewBook.jsp?id="+rs.getString(3);%>
            <br><br><button><a href="<%=url%>">View More</a></button>
        </div>
        <%}%>
        <br>
        <%
        }
        %>
        </div>
        <script>
            // When the user scrolls down 20px from the top of the document, show the button
            window.onscroll = function() {scrollFunction()};

            function scrollFunction() {
                if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
                    document.getElementById("myBtn").style.display = "block";
                } else {
                    document.getElementById("myBtn").style.display = "none";
                }
            }

            // When the user clicks on the button, scroll to the top of the document
            function topFunction() {
                document.body.scrollTop = 0; // For Chrome, Safari and Opera 
                document.documentElement.scrollTop = 0; // For IE and Firefox
            }
        </script>
    </body>
</html>
<%@include file="footer.jsp" %>