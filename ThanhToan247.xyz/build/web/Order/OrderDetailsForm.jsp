
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
            .container label span{
                color: red; font-weight: 600;
            }
            a:hover {
                color: white; 
                text-decoration: none; 
            }
        </style>
    </head>

    <body>

        <div>
            <div class="container">
                <div class="table-responsive">
                    <div class="table-wrapper">
                        <div class="form-group purple-border">
                            <h2>Chi tiết đơn hàng #321WV1SJF</h2><br>
                            <label for="exampleFormControlTextarea4">● Sản phẩm: <span>THẺ ${orderdetails.order.price.supplier.supplierName} <span class="priceod">${orderdetails.order.price.price}</span></span></label><br>
                            <label for="exampleFormControlTextarea4">● Số lượng: <span>${orderdetails.order.quantity}</span></label><br>
                            <label for="exampleFormControlTextarea4">● Thời gian thanh toán: <span>${orderdetails.order.time}</span></label><br>
                            <label><span style="color: blue; ">Định dạng:  &ensp;Seri|Mã thẻ</span></label><br>
                            <!--<textarea readonly="" class="form-control" id="exampleFormControlTextarea4" rows="12">31482402042|456341946353</textarea>-->
                            <textarea readonly="" class="form-control" id="exampleFormControlTextarea4" rows="12"><c:forEach items="${orderdetails.products}" var="p">${p.seriCode}|${p.pinCode}
</c:forEach></textarea>
                        </div>

                    </div>
                </div>
            </div>
        </div>
        <script>
            var priceod = document.getElementsByClassName('priceod');
            priceod[0].innerHTML = new Intl.NumberFormat('vi-VN', {style: 'currency', currency: 'VND'}).format(priceod[0].innerHTML * 1)
        </script>
    </body>

</html>

