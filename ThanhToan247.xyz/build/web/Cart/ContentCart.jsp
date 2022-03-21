<%@page import="models.User"%>
<%@page import="java.util.List"%>
<%@page import="models.Cart"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="cart-products">
    <%
        float sum = 0;
        List<Cart> list = ((List<Cart>) session.getAttribute("cart"));
        User user = (User) session.getAttribute("user");
        for (int i = 0; i < list.size(); i++) {
            sum += ((list.get(i).getPrice().getPrice()) - (list.get(i).getPrice().getPrice() * list.get(i).getPrice().getDiscount() / 100)) * list.get(i).getQuantity();
        }
        sum = sum - sum * user.getDiscount() / 100;
    %>
    <c:forEach items="${cart}" var="c">
        <div class="cart-product">
            <div class='cart-image-div'>
                <img class="cart-image" src="${c.price.supplier.image}" alt="">
            </div>
            <div class="cart-card"><b>Thẻ ${c.price.supplier.supplierName}</b></div>
            <div class="cart-price-div"><span class="cart-price">${c.price.price}</span> <span class="unit-price">${c.price.price-(c.price.price*c.price.discount/100)}</span></div>
            <div class="quantity-card">
                <input onclick="location.href = 'updatequantitycart?action=giam&cartID=${c.cartID}&quantity=${c.quantity==1?c.quantity:c.quantity-1}'" onClick='decreaseCount(event, this)' class="btn-quan" type="button" value="-">
                <input  name="quantity" class="inp-quan" type="text" value="${c.quantity}">
                <input onclick="location.href = 'updatequantitycart?action=tang&cartID=${c.cartID}&quantity=${c.quantity+1}'" onClick='increaseCount(event, this)' class="btn-quan" type="button" value="+">
            </div>
            <div class="cart-total-price"">${(c.price.price-(c.price.price*c.price.discount/100))*c.quantity}</div>
            <div class="cart-delete" onclick="location.href = 'cart?deleteid=${c.cartID}'">Xóa</div>
        </div>
    </c:forEach>

    <div class='payment'>
        <span class="total-payment"><b><span style="color:black">Tổng tiền: &nbsp&nbsp&nbsp</span><span id="tongTien">100,000đ</span></b></span>
    </div>
    <div class='discount-price-payment'>
        <span class="total-payment"><b><span style="color:black">Giảm giá: &nbsp&nbsp&nbsp</span><span id="giamGia">${user.discount}</span>%</b></span>
    </div>
    <div class='total-price-payment'>
        <span class="total-payment"><b><span style="color:black">Tổng tiền thanh toán: &nbsp&nbsp&nbsp</span><span id="tongTienThanhToan">100,000đ</span></b></span>
    </div>
    <div class="buy-div">
        <input onclick="window.location = 'addorder?${cart}&sum=<%=sum%>'" class='Buy' type='button' value='Mua Hàng'>
    </div>
    <c:if test="${moneyNotEnough!=null}">
        <script>
                alert('Số dư tài khoản không đủ vui lòng nạp thêm!');
        </script>
    </c:if>
    
</div>




