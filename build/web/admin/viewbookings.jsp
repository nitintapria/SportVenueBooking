<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.Format"%>
<%@page import="java.util.Date"%>
<%@page import="dto.Booking"%>
<%@page import="java.util.List"%>
<%@page import="dto.Users"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <meta name="description" content="">
    <meta name="author" content="">
    <title>Administrator - View Bookings</title>

    <link href="admin/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="admin/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="admin/vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">
    <link href="admin/css/sb-admin.css" rel="stylesheet">
</head>

<body id="page-top">
    <!-- Navigation -->
    <nav id="mainNav" class="navbar static-top navbar-toggleable-md navbar-inverse bg-inverse">
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarExample" aria-controls="navbarExample" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <a class="navbar-brand" href="#">Sport Venue Booking</a>
        <div class="collapse navbar-collapse" id="navbarExample">
            <%@include file="navmenu.jsp" %>
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link" href="#"><i class="fa fa-fw fa-sign-out"></i> Logout</a>
                </li>
            </ul>
        </div>
    </nav>

    <div class="content-wrapper py-3">
        <div class="container-fluid">
            <div class="card mb-3">
                <div class="card-header">
                    <i class="fa fa-ticket"></i> Bookings
                </div>
                <div class="card-block">
                    <div class="table-responsive">
                        <table class="table table-bordered" width="100%" id="dataTable" cellspacing="0">
                            <thead>
                                <tr>
                                    <th>Date</th>
                                    <th>Start Time</th>
                                    <th>End Time</th>
                                    <th>Amount</th>
                                    <th>Transaction ID</th>
                                    <th>User ID</th>
                                    <th>Venue Sport ID</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    List<Booking> bookingList = (List<Booking>)request.getAttribute("booking");
                                    Format format = new SimpleDateFormat("HH:mm");
                                    for(Booking b : bookingList)
                                    {
                                      %>
                                <tr>
                                    <td><%=b.getBookingDate()%></td>
                                    <td><%=format.format(b.getStartsTime())%></td>
                                    <td><%=format.format(b.getEndsTime())%></td>
                                    <td><%=b.getTotalPrice() %></td>
                                    <td><%=b.getTransactionId() %></td>
                                    <td>a</td>
                                    <td>a</td>
                                </tr>
                               <%
                               }
                               %>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>

        </div>
        <!-- /.container-fluid -->

    </div>
    <!-- /.content-wrapper -->

    <script src="admin/vendor/jquery/jquery.min.js"></script>
    <script src="admin/vendor/tether/tether.min.js"></script>
    <script src="admin/vendor/bootstrap/js/bootstrap.min.js"></script>
    <script src="admin/vendor/jquery-easing/jquery.easing.min.js"></script>
    <script src="admin/vendor/chart.js/Chart.min.js"></script>
    <script src="admin/vendor/datatables/jquery.dataTables.js"></script>
    <script src="admin/vendor/datatables/dataTables.bootstrap4.js"></script>
    <script src="admin/js/sb-admin.min.js"></script>

</body>

</html>
