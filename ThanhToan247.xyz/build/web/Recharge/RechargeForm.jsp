<%-- 
    Document   : RechargeForm.jsp
    Created on : Feb 12, 2022, 10:51:25 PM
    Author     : hungt
--%>

<%@page import="java.util.List"%>
<%@page import="models.HistoryRecharge"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="models.User"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

        <!-- Font Awesome JS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

        <style>
            .tab-pane{
                margin: 0 auto;
            }
            .navbardiv a:hover{
                color: white;
                text-decoration: none;
            }

            .rounded-lg{
                box-shadow: rgba(0, 0, 0, 0.3) 0px 19px 38px, rgba(0, 0, 0, 0.22) 0px 15px 12px;
            }

            .rounded {
                border-radius: 1rem;
            }
        </style>

    </head>

    <body>

        <!-- FOR DEMO PURPOSE -->
        <div class="container py-5">

            <div class="row">
                <div class="col-lg-12 mx-auto">
                    <div class="bg-white rounded-lg p-5">
                        <!-- Credit card form tabs -->
                        <ul role="tablist" class="nav bg-light nav-pills rounded-pill nav-fill mb-3">
                            <li class="nav-item">
                                <a data-toggle="pill" href="#nav-tab-card" class="nav-link active rounded-pill">
                                    <i class="fa fa-credit-card"></i> NẠP QUA THẺ CÀO TỰ ĐỘNG
                                </a>
                            </li>
                            <li class="nav-item">
                                <a data-toggle="pill" href="#nav-tab-paypal" class="nav-link rounded-pill">
                                    <i class="fa fa-paypal"></i> NẠP QUA MOMO TỰ ĐỘNG
                                </a>
                            </li>
                            <li class="nav-item">
                                <a data-toggle="pill" href="#nav-tab-bank" class="nav-link rounded-pill">
                                    <i class="fa fa-university"></i> NẠP QUA NGÂN HÀNG

                                </a>
                            </li><li class="nav-item">
                                <a data-toggle="pill" href="#nav-tab-transaction" class="nav-link rounded-pill">
                                    <i class="fa fa-university"></i> LỊCH SỦ NẠP TIỀN
                                </a>
                            </li>
                        </ul><hr>
                        <!-- End -->
                        <!-- Credit card form content -->
                        <div class="row tab-content">
                            <!-- credit card info-->
                            <div id="nav-tab-card" class="col-lg-6 tab-pane fade show active">                
                                <form action="addemployee" method="post">
                                    <div class="modal-header">
                                        <h4 class="modal-title">NẠP THẺ TỰ ĐỘNG</h4>
                                    </div>
                                    <div class="modal-body">
                                        <select name="sex" class="form-control" required="">
                                            <option>Chọn loại thẻ *</option>
                                            <option>Viettel</option>
                                            <option>Vinaphone</option>
                                            <option>Mobifone</option>
                                            <option>Vietnamobile</option>
                                        </select><br>
                                        <select name="sex" class="form-control" required="">
                                            <option>Chọn mệnh giá *</option>
                                            <option>10.000</option>
                                            <option>20.000</option>
                                            <option>30.000</option>
                                            <option>50.000</option>
                                            <option>100.000</option>
                                            <option>200.000</option>
                                            <option>300.000</option>
                                            <option>500.000</option>
                                            <option>1.000.000</option>
                                        </select><br>
                                        <input type="text" class="form-control" placeholder=" Nhập seri thẻ"><br>
                                        <input type="text" class="form-control" placeholder=" Nhập mã thẻ">
                                    </div>
                                    <div class="modal-footer">
                                        <input type="submit" class="btn btn-success" value="Nạp ngay">
                                    </div>
                                </form>
                            </div>
                            <!-- End -->
                            <!-- Paypal info -->
                            <div id="nav-tab-paypal" class="tab-pane fade">
                                <form action="addemployee" method="post">
                                    <div class="modal-header">
                                        <h4 class="modal-title">NẠP TIỀN QUA MOMO TỰ ĐỘNG</h4>
                                    </div>
                                    <div class="modal-body">
                                        <table class="">
                                            <tr>
                                                <td>Số Điện Thoại:</td>
                                                <td class="font-weight-bold text-primary">0395090937</td>
                                            </tr>
                                            <tr>
                                                <td>Chủ Tài Khoản:&nbsp&nbsp&nbsp</td>
                                                <td class="font-weight-bold">Nguyễn Trọng Hùng</td>
                                            </tr>
                                            <tr>
                                                <td>Nội dung:</td>
                                                <td class="font-weight-bold text-danger">TT247m123</td>
                                            </tr>
                                        </table>
                                    </div>
                                    <div class="modal-footer">
                                    </div>
                                </form>
                            </div>
                            <!-- End -->
                            <!-- bank transfer info -->
                            <div id="nav-tab-bank" class="tab-pane fade">
                                <form action="addemployee" method="post">
                                    <div class="modal-header">
                                        <h4 class="modal-title">NẠP TIỀN QUA NGÂN HÀNG TỰ ĐỘNG</h4>
                                    </div>
                                    <div class="modal-body">
                                        <table class="">
                                            <tr>
                                                <td>Ngân hàng:</td>
                                                <td class="font-weight-bold text-primary">Vietcombank</td>
                                            </tr>
                                            <tr>
                                                <td>Số Tài khoản:</td>
                                                <td class="font-weight-bold text-primary">0291000350547</td>
                                            </tr>
                                            <tr>
                                                <td>Chủ Tài Khoản:&nbsp&nbsp&nbsp</td>
                                                <td class="font-weight-bold">Nguyễn Trọng Hùng</td>
                                            </tr>
                                            <tr>
                                                <td>Nội dung:</td>
                                                <td class="font-weight-bold text-danger">TT247${user.userID}</td>
                                            </tr>
                                        </table>
                                    </div>
                                    <div class="modal-footer">
                                    </div>
                                </form>
                            </div>
                            <div id="nav-tab-transaction" class="tab-pane fade">
                                <span>
                                    <span>Show</span>

                                    <select onchange="location = this.value" class="form-control" style="display: inline-block;width: 70px;">
                                        <option value="employee?show=5&amp;page=1">5</option>
                                        <option value="employee?show=10&amp;page=1">10</option>
                                        <option value="employee?show=20&amp;page=1">20</option>
                                        <option value="employee?show=50&amp;page=1">50</option>
                                    </select>
                                    <span>entries</span>
                                </span>
                                <table class="table table-striped table-hover">
                                    <thead>
                                        <tr>
                                            <th>STT</th>
                                            <th>Mã giao dịch</th>
                                            <th>Số tiền nhận được</th>
                                            <th>Thời gian</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <% List<HistoryRecharge> list = (List<HistoryRecharge>) request.getAttribute("historyRecharge");
                                            for (int i = 0; i < list.size(); i++) {
                                        %>
                                        <tr>
                                            <td><%= i%></td>
                                            <td><%= list.get(i).getTransactionID()%></td>
                                            <td>+ <%=new DecimalFormat("###,###,###").format(list.get(i).getMoney())%>đ</td>
                                            <td><%= list.get(i).getTime()%></td>
                                        </tr>
                                        <%
                                            }

                                        %>



                                    </tbody>
                                </table>
                                <ul class="pagination" style="float: right">
                                    <li class="page-item"><a href="employee?show=&amp;page=1" class="page-link">Previous</a></li>

                                    <li class="page-item active"><a href="employee?show=5&amp;page=1" class="page-link">1</a></li>

                                    <li class="page-item "><a href="employee?show=5&amp;page=2" class="page-link">2</a></li>

                                    <li class="page-item "><a href="employee?show=5&amp;page=3" class="page-link">3</a></li>

                                    <li class="page-item "><a href="employee?show=5&amp;page=4" class="page-link">4</a></li>

                                    <li class="page-item"><a href="employee?show=&amp;page=1" class="page-link">Next</a></li>
                                </ul>


                            </div>
                            <!-- End -->
                        </div>
                        <!-- End -->
                    </div>
                </div>
            </div>
        </div>

    </body>

</html>