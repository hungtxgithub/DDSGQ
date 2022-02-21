<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html lang="en" dir="ltr">
    <head>
        <link rel="stylesheet" href="../css/TopNavbar.css">

        <style>
            .div-login{
                margin: 0;
            }
            .navbardiv{
                padding: 10px 0;
                display: flex;
            }
            .navdiv{
                width: 70%;
                text-align: center;
                padding: 0;
            }
            .container-icon{
                text-align: center;
                width: 9%;
                align-items: center;
                margin-top: 8px;
            }

            .dropbtn {
                color: white;
                display: inline-block;
                border-radius: 30px;
                background-color: #112c39;
                opacity: 1;
                padding: 8px 15px;
            }

            .dropdown {
                margin-top: 6px;
                cursor: pointer;
                position: relative;
                display: inline-block;
            }

            .dropdown-content {
                box-shadow: 0 2px 3px 0 rgba(0, 0, 0, .1);
                width: 100%;
                display: none;
                position: absolute;
                background-color: #f1f1f1;
                z-index: 1;
            }

            .dropdown-content a {
                color: black;
                padding: 12px 16px;
                text-decoration: none;
                display: block;
            }

            .dropdown-content a:hover {background-color: #ddd;}

            .dropdown:hover .dropdown-content {display: block;}

            .dropdown:hover .dropbtn {background-color: #134c68;}

            .square {
                width: 20px;
                height: 20px;
                -moz-transform: rotate(45deg);
                -o-transform: rotate(45deg);
                -ms-transform: rotate(45deg);
                -webkit-transform: rotate(
                    45deg
                    );
                transform: rotate(
                    45deg
                    );
                border-radius: 4px;
                -moz-border-radius: 4px;
                -o-border-radius: 4px;
                -webkit-border-radius: 4px;
                -ms-webkit-radius: 4px;
                zoom: 1;
                position: absolute;
                top: -7px;
                left: calc(50% - 9px);
                background: #fff;
            }
            .icon-cart{
                color: white;
                font-size: xx-large;
            }
            .header__cart {
                display: inline-block;
                margin-top: 6px;
                margin-right: 10px;
                /* position: relative; */
            }

            .header__cart-warp {
                position: relative;
                display: inline-block;
                padding: 0 16px;
            }

            .header__cart-warp:hover .cart__list {
                margin: 8px;
                display: block;
                /* cursor: pointer; */
            }

            .header__cart-icon {
                font-size: 2.4rem;
                color: #fff;
            }

            .cart__list {
                position: absolute;
                display: none;
                top: 34px;
                right: -10px;
                background-color: #fff;
                box-shadow: 0 2px 10px #ccc;
                border-radius: 4px;
                animation: fadeIn ease-in 0.2s;
                /* cursor: default; */
                z-index: 1;
            }

            .header__cart-warp:hover .cart__list {
                display: block;
                /* cursor: pointer; */
            }

            .cart__list::after {
                content: "";
                cursor: pointer;
                /* display: none; */
                position: absolute;
                right: 4px;
                top: -32px;
                border-width: 23px 32px;
                border-style: solid;
                border-color: transparent transparent #fff transparent;
            }

            .cart__list img {
                width: 400px;
                height: 150px;
            }

            .no-cart-msg {
                text-align: center;
                color: rgb(61, 61, 61);
            }

            .no-cart {
                padding: 24px 0px;
            }

            .header__cart-notice{
                position: absolute;
                padding: 0px 11px;
                background-color: white;
                border-radius: 11px;
                color: black;
                font-size: smaller;
                top: 0;
                right: 5px;
                border: 1px solid;
                transform: scale(0.9);
            }
            .navbardiv{
                box-shadow: 3px 3px 10px 1px #423631;
                background: #11101d;
                position: relative;
                z-index: 10;
                padding: 10px 0;
                display: flex;
            }
        </style>
        <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>

    </head>

    <body>

        <div class="navbardiv">
            <div class="navdiv">
                <div class="navdiv2">
                    <nav>
                        <a href="home">Trang chủ</a>
                        <a href="recharge">Nạp tiền</a>
                        <a href="order">Đơn hàng</a>
                        <a href="notification">Thông báo</a>
                        <a href="contact">Liên hệ</a>
                        <div class="animation start-home"></div>
                        <div id='nav1-animation' ${displayBlock}></div>
                        <div id='nav2-animation'></div>
                        <div id='nav3-animation'></div>
                        <div id='nav4-animation'></div>
                        <div id='nav5-animation'></div>
                    </nav>
                </div>
            </div>
            <div class="header__cart" onclick="window.location = 'cart'">
                <div class="header__cart-warp">
                    <i class='header__cart-icon icon-cart bx bxs-cart'></i>
                    <span class="header__cart-notice">0</span>
                    <!-- No cart :  no-cart -->
                    <div class="cart__list no-cart">
                        <img src="https://taphoa.cz/static/media/cart-empty-img.8b677cb3.png" alt="" class="no-cart-img">
                        <div class="no-cart-msg">
                            Chưa có sản phẩm
                        </div>
                    </div>
                </div>
            </div>

            <c:if test="${sessionScope.user!=null}">
                <div class="dropdown" >
                    <div>   
                        <div class="dropbtn"><img class="img-avatar" src="${sessionScope.user.avatar}" alt=""><span style="margin-left: 5px;">${sessionScope.user.username}</span></div>
                    </div>
                    <div class="dropdown-content">
                        <span class="square"></span>
                        <a href="profile"><span><img class="img-cart" src="https://img.icons8.com/ios-glyphs/30/000000/user--v1.png" style="margin-bottom: -9px;">Profile</span></a>
                        <a href="logout"><span><img src="https://img.icons8.com/external-dreamstale-lineal-dreamstale/32/000000/external-logout-ui-dreamstale-lineal-dreamstale.png" style="margin-bottom: -9px;"/>Logout</span></a>
                    </div>

                </div>
            </c:if>


            <c:if test="${sessionScope.user==null}">

                <div class="div-login" onclick="window.location.href = '/login'"><button class="btn-login">LOGIN</button></div>
            </c:if>

        </div>

        <script src="../js/topnavbar.js"></script>
    </body>

</html>