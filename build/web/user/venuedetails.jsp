
<%@page import="dto.Venue"%>
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

        <title>TaxiPark</title>

        <link href="user/assets/css/bootstrap-grid.css" rel="stylesheet">
        <link href="user/assets/css/font-awesome.css" rel="stylesheet">
        <link href="user/assets/css/swiper.css" rel="stylesheet">
        <link href="user/assets/css/swipebox.css" rel="stylesheet">
        <link href="user/assets/css/zoomslider.css" rel="stylesheet">
        <link href="user/assets/css/style.css?03" rel="stylesheet">
        <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">

        <link href="https://fonts.googleapis.com/css?family=Fira+Sans+Condensed:700,800%7COpen+Sans:400,600,700" rel="stylesheet"> 

        <script type="text/javascript" src="user/assets/js/modernizr-2.6.2.min.js"></script>
    </head>
    <body>

        <div id="top-bar">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6 col-md-9">
                        <div class="contacts">
                            <div><span class="fa fa-phone"></span> 800-5-800</div>
                            <div class="hidden-xs hidden-ms"><span class="fa fa-skype"></span> GETTAXIPARK</div>
                            <div class="hidden-xs hidden-ms"><span class="fa fa-phone"></span> 43 2-nd Avenue,  New York,  29004-7153</div>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-3">
                        <div class="social social-small visible-lg">
                            <a href="#" class="fa fa-twitter"></a>
                            <a href="#" class="fa fa-facebook"></a>
                            <a href="#" class="fa fa-instagram"></a>
                            <a href="#" class="fa fa-google-plus"></a>
                            <a href="#" class="fa fa-pinterest"></a>
                        </div>
                        <a href="get_taxi.html" class="btn btn-xs btn-black-bordered pull-right">Get taxi online</a>
                    </div>
                </div>
            </div>
        </div>
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
                        <a class="logo" href="index.html"><img src="assets/images/logo-inner.png" alt="TaxiPark"></a>
                    </div>
                    <div id="navbar" class="navbar-collapse collapse">
                        <button type="button" class="navbar-toggle collapsed">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar top-bar"></span>
                            <span class="icon-bar middle-bar"></span>
                            <span class="icon-bar bottom-bar"></span>
                        </button>
                        <ul class="nav navbar-nav">
                            <li class="hasSub">
                                <a href="#">Home</a>
                                <ul class="sub-menu"><li><a href="index.html">Homepage 1</a></li><li><a href="homepage-2.html">Homepage 2</a></li><li><a href="homepage-3.html">Homepage 3</a></li></ul>
                            </li><li><a href="get_taxi.html">Get Taxi</a></li><li><a href="services.html">Services</a></li><li class="hasSub">
                                <a href="#">Our blog</a>
                                <ul class="sub-menu"><li><a href="blog.html">Classic Blog</a></li><li><a href="blog-3.html">Blog without Sidebar</a></li><li><a href="post.html">Blog Post</a></li></ul>
                            </li><li class="hasSub current_page_item">
                                <a href="#">Gallery</a>
                                <ul class="sub-menu"><li><a href="gallery-2.html">Gallery 2-columns</a></li><li class="current_page_item"><a href="gallery-3.html">Gallery 3-columns</a></li><li><a href="gallery-4.html">Gallery 4-columns</a></li></ul>
                            </li><li><a href="testimonials.html">Testimonials</a></li><li><a href="contacts.html">Contacts</a></li><li class="hasSub">
                                <a href="#">Pages</a>
                                <ul class="sub-menu"><li><a href="typo.html">Typography</a></li><li><a href="shortcodes.html">Shortcodes</a></li></ul>
                            </li>					</ul>
                    </div>		
                </div>
            </nav>
        </div>

        <header class="page-header" style="background-image: url(assets/images/_inner-bg.jpg);">
            <div class="container">
                <ol class="bread">
                    <li>
                        <a href="index.html"><span>Home</span></a>
                    </li>
                    <li class="divider"><span>//</span></li>
                    <li>
                        <span>Gallery 3-columns</span>
                    </li>
                </ol>		
                <h1>Gallery 3-columns</h1>
            </div>
        </header>
        <%
            List<Venue> ls = (List<Venue>)request.getAttribute("venuelist");
            Venue v = ls.get(0);
        %>
        <div class="inner gallery-page gallery-3">
            <div class="container">
                <div class="row">
                    <%
                    
                    %>
                    <div class="col-lg-4 col-md-4 col-sm-6 col-ms-6">
                        <div class="item matchHeight">
                            <a href="assets/images/_gallery-1.jpg" class="swipebox photo"><img src="assets/images/_gallery-1.jpg" class="full-width rounded" alt="Gallery"></a>
                            <div class="descr">
                                <div class="row">
                                    <div class="col-lg-12">
                                        <h5><%= v.getVenueName() %></h5>
                                    </div>
                                    <div class="col-lg-12">
                                        <ul>
                                            <li><span class="fa fa-clock-o"></span><%= v.getCapacity() %></li>
                                            <li class="icon-fav"><a href=""><span class=" fa fa-heart"></span><%= v.getPrice() %></a></li>
                                            <li class="icon-comments"><a href=""><span class=" fa fa-commenting"></span><%= v.getVenueAddress() %></a></li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
             <%
        String paypal_url="https://www.sandbox.paypal.com/cgi-bin/webscr"; // Test Paypal API URL
        String paypal_id="sportvenuemerchant@gmail.com"; // Business email ID
%>
<h4>Welcome, Guest</h4>
 
<div class="product">            
    <div class="image">
        
    </div>
    <div class="name">
        
    </div>
    <div class="price">
       <%= v.getPrice() %>
    </div>
    <div class="btn">
    <form action="<%=paypal_url%>" method="post" name="frmPayPal1">
    <input type="hidden" name="business" value="<%= paypal_id %>">
    <input type="hidden" name="cmd" value="_xclick">
    <input type="hidden" name="item_name" value="<%= v.getVenueName() %>">
    <input type="hidden" name="item_number" value="1">
    <input type="hidden" name="credits" value="510">
    <input type="hidden" name="userid" value="1">
    <input type="hidden" name="amount" value="<%= v.getPrice() %>">
    <input type="hidden" name="cpp_header_image" value="">
    <input type="hidden" name="no_shipping" value="1">
    <input type="hidden" name="currency_code" value="USD">
    <input type="hidden" name="handling" value="0">
    <input type="hidden" name="cancel_return" value="http://localhost:8080/SportVenueBooking/bookcancel.htm">
    <input type="hidden" name="return" value="http://localhost:8080/SportVenueBooking/booksuccess.htm?venueId=<%= v.getVenueId() %>">
    <input type="image" src="https://www.sandbox.paypal.com/en_US/i/btn/btn_buynowCC_LG.gif" name="submit" alt="PayPal - The safer, easier way to pay online!">
    <img alt="" border="0" src="https://www.sandbox.paypal.com/en_US/i/scr/pixel.gif" width="1" height="1">
    </form>
    </div>
</div>
        </div>
           

                <section id="block-footer">
                    <div class="container">
                        <div class="row">
                            <div class="col-lg-4 col-md-6 col-sm-6 col-xs-12 col-ms-6">
                                <h4>About us</h4>
                                <p>Nullam orci dui, dictum et magna sollicitudin, tempor blandit erat. Maecenas suscipit tellus sit amet augue placerat fringilla a id lacus. Fusce tincidunt in leo lacinia condimentum. </p>

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
                                            <li class="active"><a href="#">Get Taxi</a></li>
                                            <li><a href="#">Services</a></li>
                                            <li><a href="#">Tariffs</a></li>
                                            <li><a href="#">Application</a></li>

                                        </ul>						
                                    </div>
                                    <div class="col-md-5">
                                        <ul class="nav navbar-nav">
                                            <li><a href="#">Become a driver</a></li>
                                            <li><a href="#">Testimonials</a></li>
                                            <li><a href="#">Contacts</a></li>
                                            <li><a href="#">Pages</a></li>
                                        </ul>						
                                    </div>						
                                </div>

                            </div>
                            <div class="col-lg-3 col-md-6 col-sm-6 col-ms-6">					
                                <h4>Contact us</h4>
                                <p><span class="yellow">Address:</span> 43 2-nd Avenue,  New York, NY 29004-7153</p>

                                <ul class="address">
                                    <li><span class="fa fa-phone"></span>800-5-800</li>
                                    <li><span class="fa fa-envelope"></span><a href="#">gettaxi@taxipark.co.uk</a></li>
                                    <li><span class="fa fa-skype"></span>gettaxipark</li>
                                </ul>					
                            </div>		
                        </div>
                    </div>
                </section>

                <footer>
                    <div class="container">
                        <a href="http://like-themes.com">Like-themes</a> 2017 © All Rights Reserved <a href="#">Terms of use</a>
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