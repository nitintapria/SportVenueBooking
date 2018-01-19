
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">  
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" type="image/png" href="user/assets/images/favicon.png">

        <title>Sort Venue Booking</title>

        <link href="user/assets/css/bootstrap-grid.css" rel="stylesheet">
        <link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
        <link href="user/assets/css/swiper.css" rel="stylesheet">
        <link href="user/assets/css/swipebox.css" rel="stylesheet">
        <link href="user/assets/css/zoomslider.css" rel="stylesheet">
        <link href="user/assets/css/style.css?03" rel="stylesheet">
        <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">

        <link href="https://fonts.googleapis.com/css?family=Fira+Sans+Condensed:700,800%7COpen+Sans:400,600,700" rel="stylesheet"> 

        <script type="text/javascript" src="user/assets/js/modernizr-2.6.2.min.js"></script>
    </head>
    <body>
        <div class="nav-wrapper" id="nav-wrapper">
            <nav class="navbar navbar-static navbar-affix" data-spy="affix">
                <div class="container">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar top-bar"></span>
                            <span class="icon-bar middle-bar"></span>
                            <span class="icon-bar bottom-bar"></span>
                        </button>
                        <a class="logo">Sport Venue Booking</a>
                    </div>
                    <div id="navbar" class="navbar-collapse collapse">
                        <button type="button" class="navbar-toggle collapsed">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar top-bar"></span>
                            <span class="icon-bar middle-bar"></span>
                            <span class="icon-bar bottom-bar"></span>
                        </button>
                        <ul class="nav navbar-nav">
                            <li>
                                <a href="userhome.htm">Home</a>
                            </li>
                            <li>
                                <a href="preregister.htm">Register</a>
                            </li>
                            <li>
                                <a href="prelogin.htm">Login</a>
                            </li>
                            <li>
                                <a href="#">Contact Us</a>
                            </li>
                    </div>				
                </div>
            </nav>
        </div>

        <header class="page-header" style="background-image: url(assets/images/_inner-bg.jpg);">
            <div class="container">		
                <h1>Available Venues</h1>
            </div>
        </header>
        <%
            List<Object[]> ls = (List<Object[]>)request.getAttribute("search");
        %>
        <div class="inner gallery-page gallery-3">
            <div class="container">
                <div class="row">
                    <%
                    for(Object[] o :ls)
                    {
                    %>
                    <div class="col-lg-4 col-md-4 col-sm-6 col-ms-6">
                        <div class="item matchHeight">
                            <a href="showvenuedetails.htm?venueId=<%=o[0]%>" class="swipebox photo"><img src="image/<%=o[4]%>" class="full-width rounded" alt="Gallery"></a>
                            <div class="descr">
                                <div class="row">
                                    <div class="col-lg-12">
                                        <h5><%=o[1]%></h5>
                                    </div>
                                    <div class="col-lg-12">
                                        <ul>
                                            <li class="icon-fav"><a href="showvenuedetails.htm?venueId=<%=o[0]%>"><span class=" fa fa-heart"></span><%=o[3]%></a></li>
                                            <li class="icon-comments"><a href="showvenuedetails.htm?venueId=<%=o[0]%>"><span class=" fa fa-commenting"></span><%=o[12]%></a></li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <%
                        }
                    %>
                </div>
            </div>
        </div>
                
    <section id="block-footer">
        <div class="container">
            <div class="row">
                <div class="col-lg-4 col-md-6 col-sm-6 col-xs-12 col-ms-6">
                    <h4>About us</h4>
                    <p>We are adding new sports venue to our arsenal everyday. Hope you find the venue of your choice!</p>

                    <div class="social-small social-yellow">
                        <a href="#" class="fa fa-twitter"></a>
                        <a href="#" class="fa fa-facebook"></a>
                        <a href="#" class="fa fa-instagram"></a>
                        <a href="#" class="fa fa-google-plus"></a>
                        <a href="#" class="fa fa-pinterest"></a>
                    </div>					
                </div>
                <div class="col-lg-5 col-md-5 hidden-md hidden-sm hidden-xs hidden-ms">					
                    <h4>Explore</h4>
                    <div class="row">
                        <div class="col-md-5">
                            <ul class="nav navbar-nav">
                                <li><a href="#">Our Motto</a></li>
                                <li><a href="#">Services</a></li>
                                <li><a href="#">Features</a></li>
                                <li><a href="#">Application</a></li>
                            </ul>						
                        </div>
                        <div class="col-md-5">
                            <ul class="nav navbar-nav">
                                <li><a href="#">Query</a></li>
                                <li><a href="#">Testimonials</a></li>
                                <li><a href="#">Contacts</a></li>
                                <li><a href="#">Pages</a></li>
                            </ul>						
                        </div>						
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 col-sm-6 col-ms-6">					
                    <h4>Contact us</h4>
                    <p><span class="yellow">Address:</span> Ypsilon IT Solutions Pvt Ltd, LG-1 , J.V. Complex, Race Course Road , Indore (M.P.)</p>

                    <ul class="address">
                        <li><span class="fa fa-phone"></span>8821045000</li>
                        <li><span class="fa fa-envelope"></span><a href="#">info@ypsilonit.com</a></li>
                    </ul>					
                </div>		
            </div>
        </div>
    </section>

    <footer>
        <div class="container">
                <a href="http://like-themes.com">Ypsilon</a> 2017 © All Rights Reserved <a href="#">Terms of use</a>
                <a href="#" class="go-top hidden-xs hidden-ms"></a>
        </div>
    </footer>

    <script>var base_href = '/';</script>
    <script type="text/javascript" src="user/assets/js/jquery.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>	

    <script type="text/javascript" src="user/assets/js/plugins.min.js"></script>		

    <script src="user/assets/js/map-style.js"></script>
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCTRSHf8sjMCfK9PHPJxjJkwrCIo5asIzE"></script>	
    <script type="text/javascript" src="user/assets/js/scripts.js"></script>

    <script>
        (function (i, s, o, g, r, a, m) {
            i['GoogleAnalyticsObject'] = r;
            i[r] = i[r] || function () {
                (i[r].q = i[r].q || []).push(arguments)
            }, i[r].l = 1 * new Date();
            a = s.createElement(o),
                    m = s.getElementsByTagName(o)[0];
            a.async = 1;
            a.src = g;
            m.parentNode.insertBefore(a, m)
        })(window, document, 'script', 'https://www.google-analytics.com/analytics.js', 'ga');

        ga('create', 'UA-91006724-1', 'auto');
        ga('send', 'pageview');
    </script>
  </body>
</html>	