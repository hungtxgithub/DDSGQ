<%-- 
    Document   : Product
    Created on : Jan 23, 2022, 5:43:49 PM
    Author     : hungt
--%>

<%@page import="models.Supplier"%>
<%@page import="java.util.List"%>
<%@page import="models.Price"%>
<%@page import="java.text.DecimalFormat"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang='en'>

    <head>
        <style>
            .cncc img {
                box-shadow: rgb(0 0 0 / 16%) 0px 3px 6px, rgb(0 0 0 / 23%) 0px 3px 6px;
                width: 135px;
                border: 1px solid rgb(184, 160, 160);
                border-radius: 8px;
                margin: 5px 15px;
                transform: scale(1);
                transition: 0.5 ease-in-out;
            }

            .cncc img:hover {
                border: 1px solid rgb(187, 224, 84);
                cursor: pointer;
                transform: scale(1.2);
            }


            .cncc h2{
                color: #f44336;
                margin-bottom: 15px
            }


            .cmg .cmg-gia {
                margin: 3px;
                width: 155px;
                border: 1px solid rgb(104, 93, 93);
                border-radius: 8px;
                display: inline-block;
                text-align: center;
                padding: 15px;
                cursor: pointer;
            }
            .cmg .cmg-gia:hover {
                border: 1px solid rgb(76, 97, 20);
                cursor: pointer;
                transform: scale(1.08);
                box-shadow: rgba(0, 0, 0, 0.24) 0px 3px 8px;
                background-color: #f7f7e6;
            }



            .quantity-card h3 {
                display: inline-block;
            }
            .cmg {
                margin-top: 50px;
            }
            .cmg h2{
                color: #f44336;

                margin-bottom:  15px;
            }
            .quantity-card .btn-quan {
                padding: 3px 12px;
                background-color: white;
                border: 1px solid #97a0af8c;
                font-weight: bold;
                margin: 0;
            }

            .quantity-card .inp-quan {
                margin: -5px;
                padding: 3px;
                width: 5%;
                text-align: center;
                font-weight: bold;
                border: 1px solid #97a0af8c;
            }

            .quantity-card .btn-quan:hover {
                background-color: yellowgreen;
                cursor: pointer;
            }

            .add-Product .Add,
            .add-Product .Buy {
                display: inline-block;
                border: 1px solid rgb(141, 54, 54);
                padding: 15px;
            }

            .add-Product {
                display: flex;
                justify-content: center;
            }

            .add-Product .Add {
                margin-right: 15px;
                background-color: #ffeee8;
                color: rgb(92, 116, 44);
            }

            .add-Product .Add img {
                margin-right: 8px;
            }

            .add-Product .Add:hover {
                background-color: #e0cec7;
                cursor: pointer;
            }

            .add-Product .Buy:hover {
                background-color: #a07969;
                cursor: pointer;
            }

            .add-Product .Buy {
                background-color: #ee4d2d;
                color: white;
            }

            .div-gia1 {
                font-weight: bold;
            }

            .div-gia2 {
                color: #b47a37;
            }
            .product-container{
                padding: 20px 0 50px 0;
                box-shadow: rgba(0, 0, 0, 0.25) 0px 14px 28px, rgba(0, 0, 0, 0.22) 0px 10px 10px;
                margin: 35px;
                text-align: center;
            }

            .quantity-card h3{
                margin: 25px;
            }
            .h1_title{
                text-align: left;
                text-transform: uppercase;
                background: url(https://banthe24h.vn/images/new_index/bg_title.png) left bottom/contain no-repeat;
                padding: 0 40px 5px;
                font-size: 20px;
                line-height: 30px;
                color: #358daf;
                margin: 0 0 21px;
                font-weight: 700;
            }
        </style>

    </head>

    <body>


        <div class="product-container">
            <h1 class="h1_title">Mua thẻ game</h1>
            <div class="cncc">
                <h2>Chọn nhà cung cấp: </h2>
                <c:forEach items="${supplier}" var="o">
                    <img <c:if test="${o.supplierID==SupplierID}">${active}</c:if> onclick="window.location = '?SupplierID=${o.supplierID}';" src="${o.image}" alt=''>
                </c:forEach>
            </div>
            <form action="ordertest" method="get">
                <input style="display: none" name='supplierID' value='${SupplierID}'>
                <div class="cmg" <c:if test="${SupplierID==null}">
                     style="display: none;"
                    </c:if>><hr><br>
                    <h2>Chọn mệnh giá: </h2>
                    <%  List<Price> listPrice = (List<Price>) request.getAttribute("price");
                        if (listPrice != null) {
                            for (int i = 0; i < listPrice.size(); i++) {%>
                    <div class='cmg-gia'>
                        <input class='div-gia1-none' style='display: none' class='div-gia1' value='<%=listPrice.get(i).getPrice()%>'>
                        <input class='div-gia2-none' style='display: none' class='div-gia2' value='<%=(listPrice.get(i).getPrice() - listPrice.get(i).getPrice() * (listPrice.get(i).getDiscount()) / 100)%>'>
                        <div class='div-gia1' ><%=new DecimalFormat("###,###,###").format(listPrice.get(i).getPrice())%>đ</div>
                        <div class='div-gia2'>Giá: <%=new DecimalFormat("###,###,###").format(listPrice.get(i).getPrice() - listPrice.get(i).getPrice() * (listPrice.get(i).getDiscount()) / 100)%>đ</div>
                    </div><%
                            }
                        }

                    %>



                    <br>
                    <div class="quantity-card">
                        <h3>Số lượng thẻ</h3>
                        <input onClick='decreaseCount(event, this)' class="btn-quan" type="button" value="-">
                        <input class="inp-quan" type="text" value="1">
                        <input onClick='increaseCount(event, this)' class="btn-quan" type="button" value="+">
                    </div>
                    <div class='add-Product'>
                        <div 
                            class='Add'><img src="https://img.icons8.com/office/16/000000/add-shopping-cart.png" />Thêm vào giỏ hàng</div>
                        <input type='submit' class='Buy' value='Mua Ngay'>
                    </div>

                </div>
            </form>
        </div>

        <script type="text/javascript">
            let cmg = document.getElementsByClassName('cmg-gia');
            for (let i = 0; i < cmg.length; i++) {
                cmg[i].addEventListener('click', function () {
                    for (let j = 0; j < cmg.length; j++) {
                        cmg[j].style.cssText = 'transform: scale(1.00)'
                    }
                    cmg[i].style.cssText = ' border: 1px solid rgb(76, 97, 20);cursor: pointer;transform: scale(1.08);box-shadow: rgba(0, 0, 0, 0.24) 0px 3px 8px;background-color: #f7f7e6;';

                    for (let j = 0; j < cmg.length; j++) {
                        document.getElementsByClassName('div-gia1-none')[j].name = '';
                        document.getElementsByClassName('div-gia2-none')[j].name = '';
                    }
                    document.getElementsByClassName('div-gia1-none')[i].name = 'price';
                    document.getElementsByClassName('div-gia2-none')[i].name = 'priceDiscount';
                })
            }

            function increaseCount(a, b) {
                var input = b.previousElementSibling;
                var value = parseInt(input.value, 10);
                value = isNaN(value) ? 0 : value;
                value++;
                input.value = value;
            }

            function decreaseCount(a, b) {
                var input = b.nextElementSibling;
                var value = parseInt(input.value, 10);
                if (value > 1) {
                    value = isNaN(value) ? 0 : value;
                    value--;
                    input.value = value;
                }
            }


        </script>
    </body>


</html>
