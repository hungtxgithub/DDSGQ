<%-- 
    Document   : Notification
    Created on : Jan 13, 2022, 1:14:38 PM
    Author     : hungt
--%>

<!--<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <img src="img/—Pngtree—flash sale promotion big sale_5493156.png" alt="">

    </body>
</html>-->


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
                <img style="width: 100%;z-index: -1;margin-top: 55px;" src="img/Untitled.png" alt="">
            </div>

        </div>

        <script src="js/javascript.js"></script>
        <script>
            document.getElementById('nav3-animation').style.display = 'block'
        </script>
    </body>
</html>