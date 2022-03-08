<%-- 
    Document   : newjsp
    Created on : Jan 7, 2022, 10:34:49 PM
    Author     : hungt
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Home</title>
        <link rel="stylesheet" href="../css/Login.css">

    </head>
    <body>
        <jsp:include page="../LeftNavbar-TopNavbar/LeftNavbar.jsp"></jsp:include>
            <div class="home-content">
            <jsp:include page="../LeftNavbar-TopNavbar/TopNavbar.jsp"></jsp:include>
                <div>
                    <div class="container ${signupmode}">
                    <div class="forms-container">
                        <div class="signin-signup">
                            <form action="login" method="post" class="sign-in-form">
                                <h2 class="title">Sign in</h2>
                                <div class="input-field">
                                    <i class="fas fa-user"></i>
                                    <input type="text" name="username" placeholder="Username" />
                                </div>
                                <div class="input-field">
                                    <i class="fas fa-lock"></i>
                                    <input type="password" name="password" placeholder="Password" />
                                </div>
                                <input type="submit" value="Login" class="btn solid" />
                                <a class="a-forget-password" href='forgotpassword'>Forgot password</a>

                                <c:if test="${errorLogin != null}">
                                    <p class="social-text">${errorLogin}</p>
                                </c:if>

                                <div class="social-media">
                                    <a href="#" class="social-icon">
                                        <i class="fab fa-facebook-f"></i>
                                    </a>
                                    <a href="#" class="social-icon">
                                        <i class="fab fa-twitter"></i>
                                    </a>
                                    <a href="#" class="social-icon">
                                        <i class="fab fa-google"></i>
                                    </a>
                                    <a href="#" class="social-icon">
                                        <i class="fab fa-linkedin-in"></i>
                                    </a>
                                </div>
                            </form>
                            <c:if test="${sendCodeForgotSuccess==null}">
                                <c:if test="${forgotSuccess==null}">
                                    <form action="forgotpassword" method="post" class="sign-up-form">
                                        <h2 class="title">Forgot Password</h2>
                                        <div class="input-field">
                                            <i class="fas fa-user"></i>
                                            <input type="text" name="username" placeholder="Username" />
                                        </div>
                                        <input type="submit" class="btn" value="Continue" />
                                        <p class="social-text">${errorSendCode}</p>
                                    </form>
                                </c:if>
                                <c:if test="${forgotSuccess!=null}">
                                    <form action="codeveriforgot" method="post" class="sign-up-form">
                                        <p class="title" style="text-align: center;font-weight: 500;font-size: 1.0rem;">Please enter the code in your mailbox ${email}</p>
                                        <div class="input-field">
                                            <i class="fas fa-user"></i>
                                            <input type="text" name="code" placeholder="Enter code" />
                                        </div>
                                        <input type="submit" class="btn" value="Send code" />
                                        <p style="text-align:center;" class="social-text">${errorSendCode}</p>
                                    </form>
                                </c:if>
                            </c:if>
                            <c:if test="${sendCodeForgotSuccess!=null}">
                                 <form action="changepassword" method="post" class="sign-up-form">
                                        <p class="title" style="text-align: center;font-weight: 500;font-size: 1.0rem;">Change the password for your username</p>
                                        <div class="input-field">
                                            <i class="fas fa-lock"></i>
                                            <input type="password" name="password" placeholder="Password" />
                                        </div>
                                        <div class="input-field">
                                            <i class="fas fa-lock"></i>
                                            <input type="password" name="rePassword" placeholder="Re-password" />
                                        </div>
                                        <input type="submit" class="btn" value="Change" />
                                        <p style="text-align:center;" class="social-text">${errorSendCode}</p>
                                    </form>
                            </c:if>


                        </div>
                    </div>

                    <div class="panels-container">
                        <div class="panel left-panel">
                            <div class="content">
                                <h3>No account?</h3>
                                <p>
                                    Click here to create a new account!
                                </p>
                                <button class="btn transparent" id="sign-up-btn">
                                    Sign up
                                </button>
                            </div>
                            <img src="../img/log.svg" class="image" alt="" />
                        </div>
                        <div class="panel right-panel">
                            <div class="content">
                                <h3>You already have an account</h3>
                                <p>
                                    Click here to login!
                                </p>
                                <button class="btn transparent" id="sign-in-btn">
                                    Sign in
                                </button>
                            </div>
                            <img src="img/register.svg" class="image" alt="" />
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
    <script>setTimeout(function () {
            document.getElementById('sign-up-btn').click()
        }, 5);</script>
    <script src="../js/login.js"></script>
    <script src="https://kit.fontawesome.com/64d58efce2.js" crossorigin="anonymous"></script>
</html>