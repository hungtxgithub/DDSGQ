
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
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/style.css">
        <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>
        <title>Document</title>

    </head>
    <body>
        <jsp:include page="../LeftNavbar-TopNavbar/LeftNavbar.jsp"></jsp:include>

            <div class="home-content">
            <jsp:include page="../LeftNavbar-TopNavbar/TopNavbar.jsp"></jsp:include>
            <div>
                <img style="position: absolute;width: 100%;z-index: -1;" src="https://cdn-www.vinid.net/2019/11/H%C6%B0%E1%BB%9Bng-d%E1%BA%ABn-n%E1%BA%A1p-ti%E1%BB%81n-%C4%91i%E1%BB%87n-tho%E1%BA%A1i-tr%C3%AAn-VinID.jpg" alt="">
            </div>

        </div>

        <script src="js/javascript.js"></script>
        <script>
            document.getElementById('nav2-animation').style.display = 'block'
        </script>
    </body>
</html>