<%@page import="dto.TaxMaster"%>
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
    <title>Administrator - View Tax</title>

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
        <div class="container">
            <!-- Trigger the modal with a button -->
            <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal" style="margin-bottom: 10px;">Add Tax</button>
            <!-- Modal -->
            <div class="modal fade" id="myModal" role="dialog">
                <div class="modal-dialog">
                    <%@taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
                    <!-- Modal content-->
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <h4 class="modal-title">Add Tax</h4>
                        </div>
                        <div class="modal-body">
                            <spr:form action="addtax.htm" commandName="taxMaster">
                            <div class="form-group">
                                <label>Tax</label>
                                <spr:input path="taxPrice" class="form-control"></spr:input>
                            </div>
                            <button type="submit" class="btn btn-default">Submit</button>
                            </spr:form>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        </div>
                    </div>
                </div>
            </div>
            <!--End of Model-->
        </div>

        <div class="container-fluid">
            <div class="card mb-3">
                <div class="card-header">
                    <i class="fa fa-inr"></i> Tax
                </div>
                <div class="card-block">
                    <div class="table-responsive">
                        <table class="table table-bordered" width="100%" id="dataTable" cellspacing="0">
                            <thead>
                                <tr>
                                    <th>Tax Id</th>
                                    <th>Price</th>
                                    <th>Edit</th>
                                    <th>Delete</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    List<TaxMaster> l = (List<TaxMaster>)request.getAttribute("tax");
                                    for(TaxMaster t : l)
                                    {
                                      %>
                                <tr>
                                    <td><%=t.getTaxId() %></td>
                                    <td><%=t.getTaxPrice() %></td>
                                    <td><a href="edittax.htm?taxId=<%=t.getTaxId()%>">Edit</a></td>
                                    <td><a href="deletetax.htm?taxId=<%=t.getTaxId()%>" onclick="return confirm('Do you want to delete this tax entry')">Delete</a></td>
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
