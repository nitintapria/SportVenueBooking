package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>Sport Venu Booking</title>\n");
      out.write("\n");
      out.write("    <link href=\"assets/css/bootstrap-grid.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"assets/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"assets/css/swiper.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"assets/css/swipebox.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"assets/css/zoomslider.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"assets/css/style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css\">\n");
      out.write("\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Fira+Sans+Condensed:700,800%7COpen+Sans:400,600,700\" rel=\"stylesheet\"> \n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\" src=\"user/assets/js/modernizr-2.6.2.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"navbar-dark-transparent\">\t\n");
      out.write("        <div class=\"nav-wrapper\" id=\"nav-wrapper\">\n");
      out.write("            <nav class=\"navbar navbar-static navbar-affix\" data-spy=\"affix\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle collapsed\">\n");
      out.write("                                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                                <span class=\"icon-bar top-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar middle-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar bottom-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <a class=\"logo\">Sport Venue Booking</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle collapsed\">\n");
      out.write("                            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                            <span class=\"icon-bar top-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar middle-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar bottom-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <ul class=\"nav navbar-nav\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Home</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"preregister.htm\">Register</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"prelogin.htm\">Login</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Contact Us</a>\n");
      out.write("                            </li>\n");
      out.write("                    </div>\t\t\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div id=\"homepage-block-2\" class=\"bgMove\" style=\"background-image: url(assets/images/_homepage-1-bg.jpg);\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h2>Book Sports Venue Online</h2>\n");
      out.write("            ");
      out.write("\n");
      out.write("                <div class=\"row forms\">\n");
      out.write("                    <div class=\"col-md-5ths\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                           ");
      out.write("\n");
      out.write("                                ");
      out.write("\n");
      out.write("                           ");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-5ths\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            ");
      out.write("\n");
      out.write("                                ");
      out.write("\n");
      out.write("                           ");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-5ths\">\n");
      out.write("                        <!--<div class=\"form-group\">-->\n");
      out.write("                            <!--<input type=\"text\" value=\"\" name=\"date\" placeholder=\"Select Date\" class=\"ajaxField\">-->\n");
      out.write("                        <!--</div>-->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <input type=\"submit\" class=\"btn btn-yellow btn-bg-dark btn-lg\" value=\"Search\">\n");
      out.write("            ");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <section id=\"testimonials\">\n");
      out.write("        <hr class=\"lg\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h4 class=\"yellow\">Happy Client's</h4>\n");
      out.write("            <h2 class=\"h1\">Testimonials</h2>\n");
      out.write("\n");
      out.write("            <div class=\"swiper-container row\" id=\"testimonials-slider\">\n");
      out.write("                <div class=\"swiper-wrapper\">\n");
      out.write("                    <div class=\"col-md-4 col-sm-6 swiper-slide\">\n");
      out.write("                        <div class=\"inner matchHeight\">\n");
      out.write("                            <div class=\"text\">\n");
      out.write("                                <p>Superb website. Makes booking a aport venue so easy</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"quote\">\n");
      out.write("                                    <span class=\"fa fa-quote-left\"></span>\n");
      out.write("                                    <div class=\"name\">Rahul Jain</div>\n");
      out.write("                                    <img src=\"assets/images/_client-1.jpg\" alt=\"Client\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4 col-sm-6 swiper-slide\">\n");
      out.write("                        <div class=\"inner matchHeight\">\n");
      out.write("                            <div class=\"text\">\n");
      out.write("                                <p>Thanks to SportVenueBooking, we managed to book venue at the last moment</p>\n");
      out.write("                            </div>\t\t\t\t\n");
      out.write("                            <div class=\"quote\">\t\t\n");
      out.write("                                <span class=\"fa fa-quote-left\"></span>\n");
      out.write("                                <div class=\"name\">Raju Khanna</div>\n");
      out.write("                                <img src=\"assets/images/_client-4.jpg\" alt=\"Client\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\t\n");
      out.write("                    <div class=\"col-md-4 col-sm-6 swiper-slide\">\n");
      out.write("                        <div class=\"inner matchHeight\">\n");
      out.write("                            <div class=\"text\">\n");
      out.write("                                <p>This website has made my life easier</p>\n");
      out.write("                            </div>\t\t\t\n");
      out.write("                            <div class=\"quote\">\t\t\t\n");
      out.write("                                <span class=\"fa fa-quote-left\"></span>\n");
      out.write("                                <div class=\"name\">Patrick James</div>\n");
      out.write("                                <img src=\"assets/images/_client-5.jpg\" alt=\"Venue Owner\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4 col-sm-6 swiper-slide\">\n");
      out.write("                        <div class=\"inner matchHeight\">\n");
      out.write("                            <div class=\"text\">\n");
      out.write("                                <p>Awesome work</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"quote\">\n");
      out.write("                                <span class=\"fa fa-quote-left\"></span>\n");
      out.write("                                <div class=\"name\">Emma Watson</div>\n");
      out.write("                                <img src=\"assets/images/_client-1.jpg\" alt=\"Client\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4 col-sm-6 swiper-slide\">\n");
      out.write("                        <div class=\"inner matchHeight\">\n");
      out.write("                            <div class=\"text\">\n");
      out.write("                                <p>Stupendous!</p>\n");
      out.write("                            </div>\t\t\t\t\n");
      out.write("                            <div class=\"quote\">\t\t\n");
      out.write("                                <span class=\"fa fa-quote-left\"></span>\n");
      out.write("                                <div class=\"name\">Ramesh Rashford</div>\n");
      out.write("                                <img src=\"assets/images/_client-4.jpg\" alt=\"Client\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\t\t\t\t\t\t\n");
      out.write("                </div>\n");
      out.write("                <div class=\"arrows\">\n");
      out.write("                        <a href=\"#\" class=\"arrow-left fa fa-caret-left\"></a>\n");
      out.write("                        <a href=\"#\" class=\"arrow-right fa fa-caret-right\"></a>\n");
      out.write("                </div>\t\t\t\t\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\t\t\n");
      out.write("\n");
      out.write("    <section id=\"partners\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3 col-sm-12\">\n");
      out.write("                    <h4 class=\"black margin-0\">Our partners</h4>\n");
      out.write("                    <h2 class=\"white margin-0\">and clients</h2>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-9 col-sm-12\">\n");
      out.write("                    <div class=\"row items\">\n");
      out.write("                        <div class=\"col-md-5ths col-sm-3 col-ms-4 col-xs-6\"><a href=\"#\"><img src=\"assets/images/_partner-1.png\" alt=\"Partner\"></a></div>\n");
      out.write("                        <div class=\"col-md-5ths col-sm-3 col-ms-4 col-xs-6\"><a href=\"#\"><img src=\"assets/images/_partner-2.png\" alt=\"Partner\"></a></div>\n");
      out.write("                        <div class=\"col-md-5ths col-sm-3 col-ms-4 col-xs-6\"><a href=\"#\"><img src=\"assets/images/_partner-3.png\" alt=\"Partner\"></a></div>\n");
      out.write("                        <div class=\"col-md-5ths col-sm-3 col-ms-4 col-xs-6\"><a href=\"#\"><img src=\"assets/images/_partner-4.png\" alt=\"Partner\"></a></div>\n");
      out.write("                        <div class=\"col-md-5ths col-sm-3 col-ms-4 col-xs-6\"><a href=\"#\"><img src=\"assets/images/_partner-5.png\" alt=\"Partner\"></a></div>\n");
      out.write("                    </div>\t\t\t\t\n");
      out.write("                </div>\t\t\t\t\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <script>\n");
      out.write("            /**\n");
      out.write("             *  RECOMMENDED CONFIGURATION VARIABLES: EDIT AND UNCOMMENT THE SECTION BELOW TO INSERT DYNAMIC VALUES FROM YOUR PLATFORM OR CMS.\n");
      out.write("             *  LEARN WHY DEFINING THESE VARIABLES IS IMPORTANT: https://disqus.com/admin/universalcode/#configuration-variables\n");
      out.write("             */\n");
      out.write("            /*\n");
      out.write("            var disqus_config = function () {\n");
      out.write("                this.page.url = PAGE_URL;  // Replace PAGE_URL with your page's canonical URL variable\n");
      out.write("                this.page.identifier = PAGE_IDENTIFIER; // Replace PAGE_IDENTIFIER with your page's unique identifier variable\n");
      out.write("            };\n");
      out.write("            */\n");
      out.write("            (function() {  // DON'T EDIT BELOW THIS LINE\n");
      out.write("                var d = document, s = d.createElement('script');\n");
      out.write("\n");
      out.write("                s.src = 'https://www-manojsahu.disqus.com/embed.js';\n");
      out.write("\n");
      out.write("                s.setAttribute('data-timestamp', +new Date());\n");
      out.write("                (d.head || d.body).appendChild(s);\n");
      out.write("            })();\n");
      out.write("            </script>\n");
      out.write("            <noscript>Please enable JavaScript to view the <a href=\"https://disqus.com/?ref_noscript\" rel=\"nofollow\">comments powered by Disqus.</a></noscript>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <section id=\"block-footer\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-4 col-md-6 col-sm-6 col-xs-12 col-ms-6\">\n");
      out.write("                    <h4>About us</h4>\n");
      out.write("                    <p>Nullam orci dui, dictum et magna sollicitudin, tempor blandit erat. Maecenas suscipit tellus sit amet augue placerat fringilla a id lacus. Fusce tincidunt in leo lacinia condimentum. </p>\n");
      out.write("\n");
      out.write("                    <div class=\"social-small social-yellow\">\n");
      out.write("                        <a href=\"#\" class=\"fa fa-twitter\"></a>\n");
      out.write("                        <a href=\"#\" class=\"fa fa-facebook\"></a>\n");
      out.write("                        <a href=\"#\" class=\"fa fa-instagram\"></a>\n");
      out.write("                        <a href=\"#\" class=\"fa fa-google-plus\"></a>\n");
      out.write("                        <a href=\"#\" class=\"fa fa-pinterest\"></a>\n");
      out.write("                    </div>\t\t\t\t\t\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-5 col-md-5 hidden-md hidden-sm hidden-xs hidden-ms\">\t\t\t\t\t\n");
      out.write("                    <h4>Explore</h4>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-5\">\n");
      out.write("                            <ul class=\"nav navbar-nav\">\n");
      out.write("                                <li class=\"active\"><a href=\"#\">Get Taxi</a></li>\n");
      out.write("                                <li><a href=\"#\">Services</a></li>\n");
      out.write("                                <li><a href=\"#\">Tariffs</a></li>\n");
      out.write("                                <li><a href=\"#\">Application</a></li>\n");
      out.write("                            </ul>\t\t\t\t\t\t\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-5\">\n");
      out.write("                            <ul class=\"nav navbar-nav\">\n");
      out.write("                                <li><a href=\"#\">Become a driver</a></li>\n");
      out.write("                                <li><a href=\"#\">Testimonials</a></li>\n");
      out.write("                                <li><a href=\"#\">Contacts</a></li>\n");
      out.write("                                <li><a href=\"#\">Pages</a></li>\n");
      out.write("                            </ul>\t\t\t\t\t\t\n");
      out.write("                        </div>\t\t\t\t\t\t\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-6 col-sm-6 col-ms-6\">\t\t\t\t\t\n");
      out.write("                    <h4>Contact us</h4>\n");
      out.write("                    <p><span class=\"yellow\">Address:</span> 43 2-nd Avenue,  New York, NY 29004-7153</p>\n");
      out.write("\n");
      out.write("                    <ul class=\"address\">\n");
      out.write("                        <li><span class=\"fa fa-phone\"></span>800-5-800</li>\n");
      out.write("                        <li><span class=\"fa fa-envelope\"></span><a href=\"#\">gettaxi@taxipark.co.uk</a></li>\n");
      out.write("                        <li><span class=\"fa fa-skype\"></span>gettaxipark</li>\n");
      out.write("                    </ul>\t\t\t\t\t\n");
      out.write("                </div>\t\t\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <footer>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                    <a href=\"http://like-themes.com\">Like-themes</a> 2017 © All Rights Reserved <a href=\"#\">Terms of use</a>\n");
      out.write("                    <a href=\"#\" class=\"go-top hidden-xs hidden-ms\"></a>\n");
      out.write("            </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("    <script>var base_href = '/';</script>\n");
      out.write("    <script type=\"text/javascript\" src=\"user/assets/js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js\"></script>\t\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\" src=\"user/assets/js/plugins.min.js\"></script>\t\t\n");
      out.write("\n");
      out.write("    <script src=\"user/assets/js/map-style.js\"></script>\n");
      out.write("    <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyCTRSHf8sjMCfK9PHPJxjJkwrCIo5asIzE\"></script>\t\n");
      out.write("    <script type=\"text/javascript\" src=\"user/assets/js/scripts.js\"></script>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("      (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){\n");
      out.write("      (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),\n");
      out.write("      m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)\n");
      out.write("      })(window,document,'script','https://www.google-analytics.com/analytics.js','ga');\n");
      out.write("\n");
      out.write("      ga('create', 'UA-91006724-1', 'auto');\n");
      out.write("      ga('send', 'pageview');\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</body>\n");
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