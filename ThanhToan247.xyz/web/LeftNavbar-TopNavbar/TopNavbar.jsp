<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html lang="en" dir="ltr">
    <head>
        <style>
            .dropbtn {
                color: white;
                display: inline-block;
                border-radius: 30px;
                background-color: #112c39;
                opacity: 1;
                padding: 8px 15px;
            }

            .dropdown {
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
            
        </style>
        <link rel="stylesheet" href="../css/TopNavbar.css">

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
            <c:if test="${sessionScope.user!=null}">
                <div class="dropdown" >
                    <div>   
                        <div class="dropbtn"><img class="img-avatar" src="${sessionScope.user.avatar}" alt=""><span style="margin-left: 5px;">${sessionScope.user.username}</span></div>
                    </div>
                    <div class="dropdown-content">
                        <span class="square"></span>
                        <a href="profile"><span><img src="https://img.icons8.com/ios-glyphs/30/000000/user--v1.png" style="margin-bottom: -9px;">Profile</span></a>
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