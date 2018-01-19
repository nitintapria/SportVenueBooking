<%@page import="dto.Venue"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <meta name="description" content="">
    <meta name="author" content="">
    <title>Administrator - Edit Venue</title>

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
            <h2>Tax</h2>
            <!-- Modal -->
            <div class="modal fade" id="myModal" role="dialog">
                <div class="modal-dialog">
                    <%@taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
                    <!-- Modal content-->
                    <div class="modal-content">
                        <div class="modal-header">
                            <h4 class="modal-title">Edit Venue</h4>
                        </div>
                        <%
                             List<Venue> venue = (List<Venue>)request.getAttribute("vl");
                        %>
                        <div class="modal-body">
                            <spr:form action="updatevenue.htm" commandName="venue">
                            <div class="form-group">
                                <spr:hidden path="venueId"></spr:hidden>
                                <spr:hidden path="venueStatus"></spr:hidden>
                                 <label>Name</label>
                                <spr:input path="venueName" value="<%=venue.get(0).getVenueName()%>" class="form-control"></spr:input>
                                <label>Address</label>
                                <spr:input path="venueAddress" value="<%=venue.get(0).getVenueAddress()%>" class="form-control"></spr:input>
                                 <label>City</label>
                                <spr:input path="citySport" value="<%=venue.get(0).getCitySport()%>" class="form-control"></spr:input>
                                <label>Image 1</label>
                                <spr:input path="img1" value="<%=venue.get(0).getImg1()%>" class="form-control"></spr:input>
                                <label>Image 2</label>
                                <spr:input path="img2" value="<%=venue.get(0).getImg2()%>" class="form-control"></spr:input>
                                <label>Image 3</label>
                                <spr:input path="img3" value="<%=venue.get(0).getImg3()%>" class="form-control"></spr:input>
                                 <label>Area</label>
                                <spr:input path="area" value="<%=venue.get(0).getArea()%>" class="form-control"></spr:input>
                                <label>Capacity</label>
                                <spr:input path="capacity" value="<%=venue.get(0).getCapacity()%>" class="form-control"></spr:input>
                                <label>Price Per Hour</label>
                                <spr:input path="price" value="<%=venue.get(0).getPrice()%>" class="form-control"></spr:input>
                                <label>Description</label>
                                <spr:input path="venueDescription" value="<%=venue.get(0).getVenueDescription()%>" class="form-control"></spr:input>
                            </div>
                            <button type="submit" class="btn btn-default">Submit</button>
                            </spr:form>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" ><a href="viewvenue.htm" style="text-decoration: none; color:black;">Close</a></button>
                        </div>
                    </div>
                </div>
                <!--End of Modal -->
            </div>
        </div>
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

    <script>
    $(document).ready(function(){
        $('#myModal').modal('show');
    }); 
    </script>
</body>
</html>
