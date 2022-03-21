<%-- 
    Document   : newjsp
    Created on : Jan 7, 2022, 10:34:49 PM
    Author     : hungt
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Home</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <style>
            .table-responsive{
                padding: 50px;
                box-shadow: rgb(0 0 0 / 20%) 0px 20px 30px;
            }
            .show-entries{
                margin-bottom: 10px;
                float:left;
            }
            .pagination{
                float: right;
            }
            a:hover {
                color: white; 
                text-decoration: none; 
            }
            tr td a{
                font-weight: 600;
            }
            td a:hover {
                color: blue;
                text-decoration: none;
            }

            @media (min-width: 1200px){
                .container, .container-lg, .container-md, .container-sm, .container-xl {
                    max-width: 1450px;
                }
            }

        </style>
    </head>
    <body>
        <jsp:include page="../LeftNavbar-TopNavbar/LeftNavbar.jsp"></jsp:include>
            <div class="home-content">
            <jsp:include page="../LeftNavbar-TopNavbar/TopNavbar.jsp"></jsp:include>
            <div><jsp:include page="ManageForm.jsp"></jsp:include>
                    <div class="container">
                        <div class="table-responsive">
                            <div class="table-wrapper">
                                <table class="table table-striped table-hover">
                                    <thead>
                                        <tr>
                                            <th>UserID</th>
                                            <th>Username</th>
                                            <th>Email</th>
                                            <th>RemainingMoney</th>
                                            <th>TotalMoneyLoaded</th>
                                            <th>Discount</th>
                                            <th>Role</th>
                                            <th>Status</th>
                                            <th>Action</th>
                                        </tr>
                                    </thead>
                                    <tbody>

                                    <c:forEach items="${users}" var="u">
                                        <tr>
                                            <td>${u.userID}</td>
                                            <td>${u.username}</td>
                                            <td>${u.email}</td>
                                            <td>${u.remainingMoney}</td>
                                            <td>${u.totalMoneyLoaded}</td>
                                            <td>${u.discount}</td>
                                            <td>${u.role}</td>
                                            <td>${u.status}</td>
                                            <td></td>
                                        </tr>
                                    </c:forEach>





                                </tbody>

                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>


<!-- Button trigger modal -->

        <script>
            document.getElementById('nav6-animation').style.display = 'block'
        </script>
    </body>
</html>