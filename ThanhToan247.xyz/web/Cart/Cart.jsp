<%-- 
    Document   : newjsp
    Created on : Jan 7, 2022, 10:34:49 PM
    Author     : hungt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Home</title>
        <style>
            .cart-products{
                box-shadow: rgba(0, 0, 0, 0.35) 0px 5px 15px;
                width: 80%;
                border: 1px solid;
                margin: 50px auto;
                padding-top: 50px;
                padding: 0 20px;
            }
            .cart-image-div{
                width: 110px;
            }
            .cart-product{
                margin: 25px 0;
                display: flex;
                justify-content: space-evenly;
                align-items: center;

            }
            .cart-card{
                width: 150px;
            }
            .cart-price-div{
                width: 200px;
            }

            .cart-image{
                box-shadow: rgb(0 0 0 / 16%) 0px 3px 6px, rgb(0 0 0 / 23%) 0px 3px 6px;
                width: 75px;
                border: 1px solid rgb(184, 160, 160);
                border-radius: 8px;margin: 5px 15px;
                transform: scale(1)
            }
            .cart-price{
                text-decoration: line-through
            }
            .quantity-card{
                width: 200px;
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
                width: 20%;
                text-align: center;
                font-weight: bold;
                border: 1px solid #97a0af8c;
            }

            .quantity-card .btn-quan:hover {
                background-color: yellowgreen;
                cursor: pointer;
            }

            .cart-total-price{
                font-weight: 600;
                width: 200px;
                color: #ee4d2d;
            }

            .cart-delete{
                cursor: pointer;
            }
            .cart-delete:hover{
                color: tomato;
                font-weight: 600;
                transform: scale(1.1);
            }
            .Buy {
                display: inline-block;
                border: 1px solid rgb(141, 54, 54);
                padding: 15px;
            }
            .Buy:hover {
                background-color: #a07969;
                cursor: pointer;
            }

            .Buy {
                background-color: #ee4d2d;
                color: white;
            }
            .payment{
                display: flex;
                justify-content: right;
                align-items: center;
                border-top: 2px solid #ee4d2d;
                padding-top: 40px;
            }

            .total-payment{
                margin: 8px 36px;
                color: #ee4d2d;
            }

            .discount-price-payment{
                display: flex;
                justify-content: right;
            }

            .total-price-payment{
                display: flex;
                justify-content: right;
            }

            .buy-div{
                padding: 35px;
                display: flex;
                justify-content: right;
            }
        </style>
    </head>
    <body>
        <jsp:include page="../LeftNavbar-TopNavbar/LeftNavbar.jsp"></jsp:include>
            <div class="home-content">
            <jsp:include page="../LeftNavbar-TopNavbar/TopNavbar.jsp"></jsp:include>
                <div>
                <jsp:include page="ContentCart.jsp"></jsp:include>
            </div>
        </div>
        <script>
            var cartTotalPrice = document.getElementsByClassName('cart-total-price');
            var cartPrice = document.getElementsByClassName('cart-price');
            var unitPrice = document.getElementsByClassName('unit-price');
            var inpQuan = document.getElementsByClassName('inp-quan');

            document.getElementById('nav1-animation').style.display = 'block'
            function increaseCount(a, b) {
                var input = b.previousElementSibling;
                var value = parseInt(input.value, 10);
                value = isNaN(value) ? 0 : value;
                value++;
                input.value = value;
                for (var i = 0; i < unitPrice.length; i++) {
                    cartTotalPrice[i].innerHTML = new Intl.NumberFormat('vi-VN', {style: 'currency', currency: 'VND'}).format((unitPrice[i].innerHTML).replace(/&nbsp;₫|\./gm, '') * inpQuan[i].value)
                }
                a = 0;
                for (var i = 0; i < cartTotalPrice.length; i++) {
                    a += (cartTotalPrice[i].innerHTML).replace(/&nbsp;₫|\./gm, '') * 1;
                    document.getElementById('tongTien').innerHTML = new Intl.NumberFormat('vi-VN', {style: 'currency', currency: 'VND'}).format(a);
                }
                document.getElementById('tongTienThanhToan').innerHTML = new Intl.NumberFormat('vi-VN', {style: 'currency', currency: 'VND'}).format(document.getElementById('tongTien').innerHTML.replace(/&nbsp;₫|\./gm, '') - document.getElementById('tongTien').innerHTML.replace(/&nbsp;₫|\./gm, '') / document.getElementById('giamGia').innerHTML)


            }

            function decreaseCount(a, b) {
                var input = b.nextElementSibling;
                var value = parseInt(input.value, 10);
                if (value > 1) {
                    value = isNaN(value) ? 0 : value;
                    value--;
                    input.value = value;
                }
                for (var i = 0; i < unitPrice.length; i++) {
                    cartTotalPrice[i].innerHTML = new Intl.NumberFormat('vi-VN', {style: 'currency', currency: 'VND'}).format((unitPrice[i].innerHTML).replace(/&nbsp;₫|\./gm, '') * inpQuan[i].value)
                }
                a = 0;
                for (var i = 0; i < cartTotalPrice.length; i++) {
                    a += (cartTotalPrice[i].innerHTML).replace(/&nbsp;₫|\./gm, '') * 1;
                    document.getElementById('tongTien').innerHTML = new Intl.NumberFormat('vi-VN', {style: 'currency', currency: 'VND'}).format(a);
                }
                document.getElementById('tongTienThanhToan').innerHTML = new Intl.NumberFormat('vi-VN', {style: 'currency', currency: 'VND'}).format(document.getElementById('tongTien').innerHTML.replace(/&nbsp;₫|\./gm, '') - document.getElementById('tongTien').innerHTML.replace(/&nbsp;₫|\./gm, '') / document.getElementById('giamGia').innerHTML)


            }


            for (var i = 0; i < cartTotalPrice.length; i++) {
                cartTotalPrice[i].innerHTML = unitPrice[i].innerHTML * inpQuan[i].value
                cartTotalPrice[i].innerHTML = new Intl.NumberFormat('vi-VN', {style: 'currency', currency: 'VND'}).format(cartTotalPrice[i].innerHTML)
            }

            for (var i = 0; i < cartPrice.length; i++) {
                cartPrice[i].innerHTML = new Intl.NumberFormat('vi-VN', {style: 'currency', currency: 'VND'}).format(cartPrice[i].innerHTML)
            }

            for (var i = 0; i < unitPrice.length; i++) {
                unitPrice[i].innerHTML = new Intl.NumberFormat('vi-VN', {style: 'currency', currency: 'VND'}).format(unitPrice[i].innerHTML)
            }

            //PAYMENT PRICE
            a = 0;
            for (var i = 0; i < cartTotalPrice.length; i++) {
                a += (cartTotalPrice[i].innerHTML).replace(/&nbsp;₫|\./gm, '') * 1;
                document.getElementById('tongTien').innerHTML = new Intl.NumberFormat('vi-VN', {style: 'currency', currency: 'VND'}).format(a);
            }

            //TongTienThanhToan
            document.getElementById('tongTienThanhToan').innerHTML = new Intl.NumberFormat('vi-VN', {style: 'currency', currency: 'VND'}).format(document.getElementById('tongTien').innerHTML.replace(/&nbsp;₫|\./gm, '') - document.getElementById('tongTien').innerHTML.replace(/&nbsp;₫|\./gm, '') / document.getElementById('giamGia').innerHTML)


        </script>
    </body>
</html>