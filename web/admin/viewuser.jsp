<%-- 
    Document   : viewuser
    Created on : Aug 12, 2017, 1:30:14 PM
    Author     : Nitin
--%>

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
    <title>Administrator - View Users</title>

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
                    <i class="fa fa-user"></i> Users
                </div>
                <div class="card-block">
                    <div class="table-responsive">
                        <table class="table table-bordered" width="100%" id="dataTable" cellspacing="0">
                            <thead>
                                <tr>
                                    <th>Login Id</th>
                                    <th>User Name</th>
                                    <th>Gender</th>
                                    <th>City</th>
                                    <th>Address</th>
                                    <th>Zipcode</th>
                                    <th>Email</th>
                                    <th>Contact</th>    
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    List<Users> userList = (List<Users>)request.getAttribute("user");
                                    List<Object> userCityList = (List<Object>) request.getAttribute("city");
                                    String gender = "";
                                    int i = 0;
                                    //o[5] city
                                    for(Users u : userList)
                                    {
                                        if(u.isGender()) {
                                            gender = "Male";
                                        } else {
                                            gender = "Female";
                                        }
                                      %>
                                <tr>
                                    <td><%= u.getLoginId() %></td>
                                    <td><%= u.getUname() %></td>
                                    <td><%= gender %></td>
                                    <td><%= userCityList.get(i)%></td>
                                    <td><%= u.getAddress() %></td>
                                    <td><%= u.getZipcode() %></td>
                                    <td><%= u.getEmail() %></td>
                                    <td><%= u.getContact() %></td>
                                </tr>
                               <%
                                   i++;
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

