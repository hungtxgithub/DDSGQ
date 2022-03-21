
<%-- 
    Document   : department
    Created on : Jan 19, 2022, 12:19:38 PM
    Author     : hungt
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Order</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
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


        </style>
    </head>

    <body>
    <center>
        <div>
            <div class="container">
                <div class="table-responsive">
                    <div class="table-wrapper">
                        <table class="table table-striped table-hover">
                            <thead>
                                <tr>
                                    <th>STT</th>
                                    <th>MÃ GD</th>
                                    <th>SẢN PHẨM</th>
                                    <th style="text-align: center">SỐ LƯỢNG</th>
                                    <th>GIÁ</th>
                                    <th>THỜI GIAN</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    request.setAttribute("i", 1);
                                %>
                                <c:forEach items="${order}" var="o">
                                    <tr>
                                        <td>${i}</td>
                                        <%
                                            int i = Integer.parseInt(request.getAttribute("i").toString());
                                            request.setAttribute("i", i + 1);
                                        %>
                                        <td><a href="orderdetails?id=${o.orderID}">${o.orderCode}</a></td>
                                        <td><a href="orderdetails?id=${o.orderID}">THẺ ${o.price.supplier.supplierName} <span class="menhgiathe">${o.price.price}</span></a></td> 
                                        <td style="text-align: center">${o.quantity}</td> 
                                        <td class="priceOrder">${o.priceOrder}</td> 
                                        <td>${o.time}</td> 
                                    </tr>
                                </c:forEach>



                            </tbody>

                        </table>
                        <ul class="pagination" style="float: right">
                            <li class="page-item"><a class="page-link" href="?page=${page=='1'?"1":page-1}">Previous</a></li>
                                <c:forEach begin="1" end="${totalPage}" var="i">
                                <li class="page-item ${page == i?"active":""}"><a class="page-link" href="?page=${i}">${i}</a></li>
                                </c:forEach>
                            <li class="page-item"><a class="page-link" href="?page=${page==totalPage?totalPage:page+1}">Next</a></li>
                        </ul>

                    </div>
                </div>
            </div>
        </div>
    </center>
    <script>
        var priceOrder = document.getElementsByClassName('priceOrder');
        var menhgiathe = document.getElementsByClassName('menhgiathe');
        for (var i = 0; i < priceOrder.length; i++) {
            priceOrder[i].innerHTML = new Intl.NumberFormat('vi-VN', {style: 'currency', currency: 'VND'}).format(priceOrder[i].innerHTML * 1)
            menhgiathe[i].innerHTML = new Intl.NumberFormat('vi-VN', {style: 'currency', currency: 'VND'}).format(menhgiathe[i].innerHTML * 1)
        }
    </script>
</body>

</html>

