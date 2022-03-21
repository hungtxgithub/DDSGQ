<%-- 
    Document   : ManageForm
    Created on : Mar 21, 2022, 1:53:38 AM
    Author     : HungNT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            * {
                margin: 0;
                padding: 0;
                list-style-type: none;
            }

            .ul-manage{
                background-color: #7ee8fa;
                background-image: linear-gradient(315deg, #7ee8fa 0%, #80ff72 74%);
                box-shadow: rgb(6 24 44 / 40%) 0px 0px 0px 2px, rgb(6 24 44 / 65%) 0px 4px 6px -1px, rgb(255 255 255 / 8%) 0px 1px 0px inset;
                display: flex;
                text-align: center;
                margin: 10px;
            }
            .li-manage {
                padding: 1rem 2rem 1.15rem;
                text-transform: uppercase;
                cursor: pointer;
                color: black;
                min-width: 80px;
                margin: auto;
            }

            .li-manage:hover {
                background-image: url('https://scottyzen.sirv.com/Images/v/button.png');
                background-size: 100% 100%;
                color: #27262c;
                animation: spring 300ms ease-out;
                text-shadow: 0 -1px 0 #ef816c;
                font-weight: bold;
            }
            .li-manage:active {
                transform: translateY(4px);
            }

            @keyframes spring {
                15% {
                    -webkit-transform-origin: center center;
                    -webkit-transform: scale(1.2, 1.1);
                }
                40% {
                    -webkit-transform-origin: center center;
                    -webkit-transform: scale(0.95, 0.95);
                }
                75% {
                    -webkit-transform-origin: center center;
                    -webkit-transform: scale(1.05, 1);
                }
                100% {
                    -webkit-transform-origin: center center;
                    -webkit-transform: scale(1, 1);
                }
            }
            .active-manage{
                background-image: url(https://scottyzen.sirv.com/Images/v/button.png);
                background-size: 100% 100%;
                color: #27262c;
                animation: spring 300ms ease-out;
                text-shadow: 0 -1px 0 #ef816c;
                font-weight: bold;
            }

        </style>
    </head>
    <body>
        <ul class="ul-manage">
            <li class="li-manage ${accountmanagement}" onclick="window.location = 'accountmanagement'">Quản lý tài khoản</li>
            <li class="li-manage ${rechargemanagement}" onclick="window.location = 'rechargemanagement'">Quản lý nạp tiền</li>
            <li class="li-manage ${productmanagement}" onclick="window.location = 'productmanagement'">Quản lý sản phẩm</li>
            <li class="li-manage ${transactionmanagement}" onclick="window.location = 'transactionmanagement'">Quản lý giao dịch</li>
            <li class="li-manage ${contactmanagement}" onclick="window.location = 'contactmanagement'">Quản lý liên hệ</li>
        </ul>

    </body>
</html>
