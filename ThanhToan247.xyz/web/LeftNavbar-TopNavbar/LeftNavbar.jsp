<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%-- 
    Document   : newjsp
    Created on : Jan 7, 2022, 10:34:49 PM
    Author     : hungt
--%>


<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <link rel="stylesheet" href="../css/LeftNavbar.css">
        <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>
        <title>Document</title>

    </head>
    <body>
        <div class="sidebar">
            <div class="logo_content">
                <div class="logo">
                    <i class='bx bxl-firebase'></i>
                    <div class="thanhtoan247" onclick="window.location = 'home';">
                        <img src="../img/thanhtoan247.png" alt="">
                    </div>
                </div>
                <i class='bx bx-menu' id="btn"></i>
            </div>
            <ul class="nav_list">
                <li>
                    <i class='bx bx-search' ></i>
                    <input type="text" placeholder="Search...">
                </li>
                <li>
                    <a href="home">
                        <i class='bx bxs-home'></i>
                        <span class="links_name">Trang chủ</span>
                    </a> 
                    <!-- Tooltip -->

                    <span class="tooltip">Trang chủ</span>
                </li>
                <li>
                    <a href="phonecard">
                        <i class='bx bxs-card'></i>
                        <span class="links_name">Thẻ điện thoại</span>
                    </a>
                    <!-- Tooltip -->

                    <span class="tooltip">Thẻ điện thoại</span>
                </li>
                <li>
                    <a href="#">
                        <i class='bx bxs-phone-call'></i>
                        <span class="links_name">Nạp điện thoại</span>
                    </a>
                    <!-- Tooltip -->

                    <span class="tooltip">Nạp điện thoại</span>
                </li>
                <li>
                    <a href="gamecard">
                        <i class='bx bxs-game' ></i>
                        <span class="links_name">Thẻ game</span>
                    </a>
                    <!-- Tooltip -->

                    <span class="tooltip">Thẻ game</span>
                </li>

                <li>
                    <a href="#">
                        <i class='bx bx-folder-open' ></i>
                        <span class="links_name">Nạp 3G, 4G</span>
                    </a>
                    <!-- Tooltip -->

                    <span class="tooltip">Nạp 3G, 4G</span>
                </li>
                <li>
                    <a href="#">
                        <i class='bx bxs-heart' ></i>
                        <span class="links_name">Thanh toán điện nước</span>
                    </a>
                    <!-- Tooltip -->

                    <span class="tooltip">Điện, nước</span>
                </li>
                <li>
                    <a href="#">
                        <i class='bx bxs-cog' ></i>
                        <span class="links_name">Settings</span>
                    </a>
                    <!-- Tooltip -->

                    <span class="tooltip">Settings</span>
                </li>
            </ul>

            <div class="profile-content">
                <div class="profile">
                    <div class="profile-details">
                        <c:if test="${user.avatar!=null}">
                            <img src="${user.avatar}" alt="">
                        </c:if>
                            <c:if test="${user.avatar==null}">
                            <img src="https://media.wired.com/photos/5b17381815b2c744cb650b5f/master/pass/GettyImages-134367495.jpg" alt="">
                        </c:if>
                        <div class="name-job">
                            <div class="name">${user.username}</div>
                            <div class="job">ThanhToan247.xyz</div>
                        </div>
                    </div>
                    <i style="cursor: pointer" onclick="window.location.href = 'logout'" class='bx bx-log-out' id="log-out"></i>
                </div>
            </div>
        </div>
        <script src="../js/leftnavbar.js"></script>
    </body>
</html>
