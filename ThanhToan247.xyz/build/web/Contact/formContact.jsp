<%-- 
    Document   : Contact
    Created on : Jan 12, 2022, 7:18:32 PM
    Author     : hungt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>complete responsive real estate website design tutorial</title>

        <!-- font awesome cdn link  -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
        <link rel="stylesheet" href="../css/styleContact.css">
        <style>
            .header__cart-wrap{
                margin-top: 18px;
                transform: scale(1.5);
            }

            .header__cart-list {
                right: -4px;
                width: 267px;
            }

        </style>
        <!-- custom css file link  -->


    </head>

    <body>

        <!-- header section starts  -->


        <!-- agents section ends -->

        <!-- contact section starts  -->

        <section class="contact" id="contact">

            <h1 class="heading"> <span>Contact</span> us </h1>

            <div class="icons-container">

                <div class="icons">
                    <img src="img/icon-1.png" alt="">
                    <h3>Phone number</h3>
                    <p>0395090937</p>
                </div>

                <div class="icons">
                    <img src="img/icon-2.png" alt="">
                    <h3>Email address</h3>
                    <p>hungnthe153039@fpt.edu.vn</p>
                </div>

                <div class="icons">
                    <img src="img/icon-3.png" alt="">
                    <h3>Office address</h3>
                    <p>Thạch Hoà, Thạch Thất, Hà Nội 10000</p>
                </div>

            </div>

            <div class="row">

                <form action="">
                    <div class="inputBox">
                        <input type="text" placeholder="Name">
                        <input type="number" placeholder="Phone number">
                    </div>
                    <div class="inputBox">
                        <input type="email" placeholder="Email">
                        <input type="text" placeholder="Subject">
                    </div>
                    <textarea name="" placeholder="Message" id="" cols="30" rows="10"></textarea>
                    <input type="submit" value="Send message" class="btn">
                </form>

                <iframe class="map" src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d6400.941267903413!2d105.52453798269198!3d21.01397968987736!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x31345b465a4e65fb%3A0xaae6040cfabe8fe!2sFPT%20University!5e0!3m2!1sen!2s!4v1641989120763!5m2!1sen!2s"
                        allowfullscreen="" loading="lazy"></iframe>

            </div>

        </section>

        <!-- contact section ends -->


    </body>

</html>