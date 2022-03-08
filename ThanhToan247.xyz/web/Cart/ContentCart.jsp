<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="cart-products">
    <form action="test" method="get">
        <c:forEach items="${cart}" var="c">
            <div class="cart-product">
                <div class='cart-image-div'>
                    <img class="cart-image" onclick="window.location = '?SupplierID=3';" src="${c.product.price.supplier.image}" alt="">
                </div>
                <div class="cart-card"><b>Thẻ ${c.product.price.supplier.supplierName}</b></div>
                <div class="cart-price-div"><span class="cart-price">${c.product.price.price}</span> <span class="unit-price">${c.product.price.price-(c.product.price.price*c.product.price.discount/100)}</span></div>
                <div class="quantity-card">
                    <input onClick='decreaseCount(event, this)' class="btn-quan" type="button" value="-">
                    <input name="quantity" class="inp-quan" type="text" value="${c.quantity}">
                    <input onClick='increaseCount(event, this)' class="btn-quan" type="button" value="+">
                </div>
                <div class="cart-total-price"">₫60.000</div>
                <div class="cart-delete" onclick="location.href = '#delete'">Xóa</div>
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
            <input class='Buy' type='submit' value='Mua Hàng'>
        </div>

    </form>

</div>




