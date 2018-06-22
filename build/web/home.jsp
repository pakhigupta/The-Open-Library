<%@include file="header.jsp" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="res/w3.css">
        <link rel="stylesheet" href="res/Site.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <style>
            body{
                background-color:lightgrey;
                width: 100%;
                align-content: center;
                text-align: center;
            }
            * {box-sizing:border-box}

            /* Slideshow container */
            .slideshow-container {
              max-width: 1000px;
              position: relative;
              margin: auto;
            }

            .mySlides {
                display: none;
            }

            /* Next & previous buttons */
            .prev, .next {
              cursor: pointer;
              position: absolute;
              top: 50%;
              width: auto;
              margin-top: -22px;
              padding: 16px;
              color: white;
              font-weight: bold;
              font-size: 18px;
              transition: 0.6s ease;
              border-radius: 0 3px 3px 0;
            }

            /* Position the "next button" to the right */
            .next {
              right: 0;
              border-radius: 3px 0 0 3px;
            }

            /* On hover, add a black background color with a little bit see-through */
            .prev:hover, .next:hover {
              background-color: rgba(0,0,0,0.8);
            }

            /* Caption text */
            .text {
              color: #f2f2f2;
              font-size: 15px;
              padding: 8px 12px;
              position: absolute;
              bottom: 8px;
              width: 100%;
              text-align: center;
            }

            /* Number text (1/3 etc) */
            .numbertext {
              color: #f2f2f2;
              font-size: 12px;
              padding: 8px 12px;
              position: absolute;
              top: 0;
            }

            /* The dots/bullets/indicators */
            .dot {
              cursor:pointer;
              height: 13px;
              width: 13px;
              margin: 0 2px;
              background-color: #bbb;
              border-radius: 50%;
              display: inline-block;
              transition: background-color 0.6s ease;
            }

            .active, .dot:hover {
              background-color: #717171;
            }

            /* Fading animation */
            .fade {
              -webkit-animation-name: fade;
              -webkit-animation-duration: 1.5s;
              animation-name: fade;
              animation-duration: 1.5s;
            }

            @-webkit-keyframes fade {
              from {opacity: .4} 
              to {opacity: 1}
            }

            @keyframes fade {
              from {opacity: .4} 
              to {opacity: 1}
            }
        </style>
    </head>
    <body>
        <div style="background-image: url('res/book-wallpaper.jpg');height:300px; ">
            <br>
            <h1 class="w3-text-amber" style="font-size:60px;">The Open Library</h1>
            <h1 class="w3-amber" style="font-size:35px">Buy &#9830 Sell &#9830 Donate &#9830 Borrow</h1>
            <h1 class="w3-text-white">Final Stoppage to all your book needs!</h1>
        </div>
        
        <div style="height: 200px;align-content: center;padding-top:5%;padding-bottom:5%; ">
            <h2>Do you have a long Reading list?</h2>
            <h3>Regardless of what genre you are interested in, we have a solution to all your book needs.</h3>
            <h3></h3>
        </div>

        <div class="slideshow-container">
            <div class="mySlides fade">
              <img src="res/slide-1.jpg" style="width:100%; height: 350px;">
            </div>

            <div class="mySlides fade">
              <img src="res/slide-2.jpg" style="width:100%;height: 350px;">
            </div>

            <div class="mySlides fade">
              <img src="res/slide-3.jpg" style="width:100%;height: 350px;">
            </div>
        </div>
        <br>

        <div style="text-align:center">
          <span class="dot" onclick="currentSlide(1)"></span> 
          <span class="dot" onclick="currentSlide(2)"></span> 
          <span class="dot" onclick="currentSlide(3)"></span> 
        </div>
        <br>
        <div>
            <h3>Click Here to Login or Sign up, and Explore More>></h3>
            <br><br>
            <button class="btn btn-primary btn-md"><a href="login.jsp">Login </a></button>
            <button class="btn btn-primary btn-md"><a href="sign.jsp">Sign up</a></button>
        </div>
        
        
        
        <script>
            var slideIndex = 0;
            showSlides();

            function showSlides() {
                var i;
                var slides = document.getElementsByClassName("mySlides");
                for (i = 0; i < slides.length; i++) {
                    slides[i].style.display = "none"; 
                }
                slideIndex++;
                if (slideIndex> slides.length) {slideIndex = 1} 
                slides[slideIndex-1].style.display = "block"; 
                setTimeout(showSlides, 2000); // Change image every 2 seconds
            }
        </script>
        
    </body>
</html>
<%@include file="footer.jsp" %>