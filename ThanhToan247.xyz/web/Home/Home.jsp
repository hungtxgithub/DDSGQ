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
    </head>
    <body>
        <jsp:include page="../LeftNavbar-TopNavbar/LeftNavbar.jsp"></jsp:include>
            <div class="home-content">
            <jsp:include page="../LeftNavbar-TopNavbar/TopNavbar.jsp"></jsp:include>
            <div><div class="divflex1">
                    <div onclick="window.location.href = 'gamecard'" class="div-img-home">
                        <img src="../img/02-57-00-09-07-2020-game.png" alt="">
                    </div>
                    <div onclick="window.location.href = 'phonecard'" class="div-img-home">
                        <img src="../img/08-10-47-15-09-2021-napthedt.png" alt="">
                    </div>
                </div>
                <div class="divflex2">
                    <div onclick="window.location.href = '#3'" class="div-img-home">
                        <img src="../img/08-11-15-15-09-2021-naptiendt.png" alt="">
                    </div>
                    <div onclick="window.location.href = '#4'" class="div-img-home">
                        <img src="../img/08-52-59-15-01-2021-banner-digo-02.png" alt="">
                    </div>
                </div></div>
        </div>
    </body>
</html>