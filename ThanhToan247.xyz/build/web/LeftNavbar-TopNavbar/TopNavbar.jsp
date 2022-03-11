<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html lang="en" dir="ltr">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Document</title>
        <link href="https://fonts.googleapis.com/css?family=Roboto&display=swap" rel="stylesheet" />
        <link rel="stylesheet" href="fontawesome.css" />
        <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>
        <style>
            /* Base----------------------------------------------------------Base */

            :root {
                --primary-color: #ee4d2d;
                --white-color: #fff;
                --black-color: #000;
                --text-color: #333;
                --border-color: #dbdbdb;
                --start-gold-color: #FFCE3e;
                --header-height: 120px;
                --navbar-height: 34px;
                --header-with-search-height: calc( var(--header-height) - var(--navbar-height));
                --header-sort-bar-height: 46px;
            }

            * {
                box-sizing: inherit;
            }

            html {
                line-height: 1.6rem;
                font-family: "Roboto", sans-serif;
                box-sizing: border-box;
            }
            /* Animation */

            @keyframes fadeIn {
                0% {
                    opacity: 0;
                }
                100% {
                    opacity: 1;
                }
            }

            @keyframes growth {
                from {
                    transform: scale(var(--growth-from));
                }
                to {
                    transform: scale(var(--growth-to));
                }
            }
            /* Modal */

            .modal {
                position: fixed;
                top: 0;
                bottom: 0;
                right: 0;
                left: 0;
                display: flex;
                animation: fadeIn linear 0.1s;
            }

            .modal__overlay {
                position: absolute;
                width: 100%;
                height: 100%;
                background-color: rgba(0, 0, 0, 0.4);
            }

            .modal__body {
                --growth-from: 0.7s;
                --growth-to: 1s;
                margin: auto;
                position: relative;
                z-index: 1;
                animation: growth linear 0.1s;
            }

            /* NavBarHeader --------------------------------------------------------------------------------------------------------------NavBarHeader */

            nav {
                position: relative;
                border-radius: 8px;
                font-size: 0;
                box-shadow: 0 2px 3px 0 rgba(0, 0, 0, .1);
            }

            nav a {
                font-size: 17px;
                text-transform: uppercase;
                color: white;
                text-decoration: none;
                line-height: 50px;
                position: relative;
                z-index: 1;
                display: inline-block;
                text-align: center;
            }

            nav .animation {
                position: absolute;
                height: 100%;
                height: 5px;
                /*top: 0;*/
                bottom: 0;
                z-index: 0;
                background: whitesmoke;
                border-radius: 8px;
                transition: all .5s ease 0s;
            }

            nav a:nth-child(1) {
                width: 100px;
            }

            nav a:nth-child(1):hover~.animation {
                width: 100px;
                left: 0;
            }

            nav a:nth-child(2) {
                width: 110px;
            }

            nav a:nth-child(2):hover~.animation {
                width: 110px;
                left: 100px;
            }

            nav a:nth-child(3) {
                width: 100px;
            }

            nav a:nth-child(3):hover~.animation {
                width: 100px;
                left: 210px;
            }

            nav a:nth-child(4) {
                width: 160px;
            }

            nav a:nth-child(4):hover~.animation {
                width: 160px;
                left: 310px;
            }

            nav a:nth-child(5) {
                width: 120px;
            }

            nav a:nth-child(5):hover~.animation {
                width: 120px;
                left: 470px;
            }

            .navdiv2 {
                display: inline-block;
            }

            .btn-login {
                background: whitesmoke;
                border: 1px solid black;
                border-radius: 10px;
                padding: 10px 30px;
                text-align: center;
                margin: 4px auto;
                cursor: pointer;
                font-size: 17px;
            }

            .div-login {
                text-align: center;
            }

            #nav1-animation {
                display: none;
                border-radius: 8px;
                height: 5px;
                width: 100px;
                background-color: white;
                position: absolute;
                margin-top: -5px;
            }

            #nav2-animation {
                display: none;
                border-radius: 8px;
                height: 5px;
                width: 110px;
                margin-left: 100px;
                background-color: white;
                position: absolute;
                margin-top: -5px;
            }

            #nav3-animation {
                display: none;
                border-radius: 8px;
                height: 5px;
                width: 100px;
                margin-left: 210px;
                background-color: white;
                position: absolute;
                margin-top: -5px;
            }

            #nav4-animation {
                display: none;
                border-radius: 8px;
                height: 5px;
                width: 160px;
                margin-left: 310px;
                background-color: white;
                position: absolute;
                margin-top: -5px;
            }

            #nav5-animation {
                display: none;
                border-radius: 8px;
                height: 5px;
                width: 120px;
                margin-left: 470px;
                background-color: white;
                position: absolute;
                margin-top: -5px;
            }

            .img-avatar {
                margin: -13px 0px;
                height: 38px;
                border-radius: 12px;
                margin-left: -15px;
            }

            .navbardiv {
                box-shadow: 3px 3px 10px 1px #423631;
                background: #11101d;
                position: relative;
                z-index: 10;
                padding: 10px 0;
                display: flex;
            }

            .navdiv {
                width: 75%;
                text-align: center;
            }

            .container-icon {
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

            .dropdown-content a:hover {
                background-color: #ddd;
            }

            .dropdown:hover .dropdown-content {
                display: block;
            }

            .dropdown:hover .dropbtn {
                background-color: #134c68;
            }

            .square {
                width: 20px;
                height: 20px;
                -moz-transform: rotate(45deg);
                -o-transform: rotate(45deg);
                -ms-transform: rotate(45deg);
                -webkit-transform: rotate( 45deg);
                transform: rotate( 45deg);
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
            /* Header-Cart-Item -------------------------------------------------------------------------------------- Header-Cart-Item*/

            .header__cart {
                width: 150px;
                text-align: center;
            }

            .header__cart-wrap {
                margin-top: 11px;
                position: relative;
                display: inline-block;
                padding: 0 12px;
                -webkit-tap-highlight-color: transparent;
                user-select: none;
                -webkit-user-select: none;
                cursor: pointer;
            }

            .header__cart-wrap:hover .header__cart-list {
                cursor: pointer;
                display: block;
            }

            .header__cart-icon {
                color: var(--white-color);
                font-size: 2.5rem;
                margin-top: 6px 0;
            }

            .header__cart-list {
                position: absolute;
                z-index: 1;
                top: calc(100% + 10px);
                right: 3px;
                background-color: var(--white-color);
                width: 400px;
                border-radius: 2px;
                box-shadow: 0 1px 10px rgba(0, 0, 0, 0.2);
                display: none;
                animation: fadeIn ease-in 0.2s;
                cursor: default;
            }

            .header__cart-list::after {
                content: "";
                border-width: 20px 26px;
                border-style: solid;
                border-color: transparent transparent var(--white-color) transparent;
                position: absolute;
                right: 0px;
                top: -29px;
                cursor: pointer;
            }

            .header__cart-list--no-cart {
                padding: 24px 0;
            }

            .header__cart-no-cart-img {
                width: 100%;
            }

            .header__cart-list-no-cart-msg {
                font-weight: 600;
                padding-bottom: 25px;
                font-size: 1rem;
                margin-top: 14px;
                color: var(--text-color);
            }

            .header__cart-list--no-cart .header__cart-no-cart-img,
            .header__cart-list--no-cart .header__cart-list-no-cart-msg {
                display: block;
                margin-left: auto;
                margin-right: auto;
            }

            .header__cart-notice {
                position: absolute;
                padding: 1px 7px;
                right: -4px;
                font-size: 1rem;
                line-height: 1rem;
                border-radius: 10px;
                border: 2px solid #000000;
                color: var(--primary-color);
                background-color: var(--white-color);
                user-select: none;
                -webkit-user-select: none;
            }

            .header__cart-heading {
                text-align: left;
                margin: 8px 0 8px 12px;
                font-size: 1rem;
                color: #999;
                font-weight: 400;
            }

            .header__cart-list-item {
                padding-left: 0;
                list-style: none;
                max-height: 56vh;
                overflow-y: auto;
            }

            .header__cart-item {
                display: flex;
                align-items: center;
            }

            .header__cart-item:hover {
                cursor: pointer;
                background-color: #f8f8f8;
            }

            .header__cart-img {
                width: 42px;
                height: 42px;
                margin: 12px;
                border: 1px solid var(--border-color);
            }

            .header__cart-item-info {
                width: 100%;
                margin-right: 12px;
            }

            .header__cart-item-head {
                display: flex;
                align-items: center;
                justify-content: space-between;
            }

            .header__cart-item-name {
                font-size: 1rem;
                font-weight: 600;
                line-height: 2rem;
                overflow: hidden;
                flex: 1;
                padding-right: 16px;
                max-height: 4rem;
                color: var(--text-color);
                margin: 0;
                display: -webkit-box;
                -webkit-box-orient: vertical;
                -webkit-line-clamp: 2;
                text-align: left;
            }

            .header__cart-item-price {
                font-size: 1rem;
                font-weight: 400;
                color: var(--primary-color);
            }

            .header__cart-item-multiply {
                font-size: 1rem;
                margin: 0 4px;
                color: #757575;
            }

            .header__cart-item-qnt {
                font-size: 1rem;
                color: #757575;
            }

            .header__cart-item-body {
                display: flex;
                justify-content: space-between;
            }

            .header__cart-item-description {
                color: #757575;
                font-size: 1.2rem;
                font-weight: 300;
            }

            .header__cart-item-remove {
                color: var(--text-color);
                font-size: 1rem;
            }

            .header__cart-item-remove:hover {
                color: var(--primary-color);
                cursor: pointer;
            }

            .header__cart-view-cart {
                background-color: var(--primary-color);
                min-width: 124px;
                height: 34px;
                text-decoration: none;
                border: none;
                border-radius: 2px;
                padding: 0 12px;
                outline: none;
                cursor: pointer;
                color: white;
                display: inline-flex;
                justify-content: center;
                align-items: center;
                line-height: 1.6rem;
                font-size: 1rem;
                float: right;
                margin: 10px 12px 20px 0;
            }

            .header__cart-view-cart:hover {
                cursor: pointer;
                background-color: #f05d41;
            }
        </style>

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
                        <div id='nav1-animation' ${displayBlock1}></div>
                        <div id='nav2-animation' ${displayBlock2}></div>
                        <div id='nav3-animation' ${displayBlock3}></div>
                        <div id='nav4-animation' ${displayBlock4}></div>
                        <div id='nav5-animation' ${displayBlock5}></div>
                    </nav>
                </div>
            </div>
            <!-- Cart layout -->
            <div class="header__cart">
                <div class="header__cart-wrap">
                    <i class='header__cart-icon icon-cart bx bxs-cart'></i>
                    <span class="header__cart-notice">${cart==null?"0":cart.size()}</span>
                    <!-- No cart : header__cart-list--no-cart -->
                    <div class="header__cart-list ">


                        <!--Nocart--> 
                        <c:if test="${cart==null}">
                            <img src="https://taphoa.cz/static/media/cart-empty-img.8b677cb3.png" alt="No Cart" class="header__cart-no-cart-img" />
                            <div class="header__cart-list-no-cart-msg">
                                Chưa có sản phẩm
                            </div>
                        </c:if>
                        <!--Nocart--> 


                        <!--HaveCart-->
                        <c:if test="${cart!=null}">
                            <h4 class="header__cart-heading">Sản phẩm đã thêm</h4>
                            <!--Cart item--> 
                            <ul class="header__cart-list-item">
                                <c:forEach items="${cart}" var="c">
                                    <li class="header__cart-item">
                                        <img src="${c.price.supplier.image}" alt="" class="header__cart-img" />
                                        <div class="header__cart-item-info">
                                            <div class="header__cart-item-head">
                                                <h5 class="header__cart-item-name">
                                                    Thẻ ${c.price.supplier.supplierName}
                                                </h5>
                                                <div class="header__cart-item-price-wrap">
                                                    <span class="header__cart-item-price">${c.price.price}</span>
                                                    <span class="header__cart-item-multiply">x</span>
                                                    <span class="header__cart-item-qnt">${c.quantity}</span>
                                                </div>
                                            </div>
                                            <div class="header__cart-item-body">
                                                <span class="header__cart-item-description"></span>
                                            </div>
                                        </div>
                                    </li>
                                </c:forEach>
                            </ul>
                            <a href="cart" class="header__cart-view-cart btn-cart btn--primary">Xem giỏ hàng</a>

                        </c:if>
                        <!--HaveCart-->
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