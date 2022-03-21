/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.CartDAO;
import daos.OrderDAO;
import daos.ProductDAO;
import daos.UserDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.User;

/**
 *
 * @author HungNT
 */
@WebServlet(name = "AddOrder", urlPatterns = {"/addorder"})
public class AddOrder extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        CartDAO cartDAO = new CartDAO();
        HttpSession session = request.getSession();
        int userID = ((User) session.getAttribute("user")).getUserID();
        float discountByUser = ((User) session.getAttribute("user")).getDiscount();
        float remainMoney = ((User) session.getAttribute("user")).getRemainingMoney();
        float sumMoneyCart = Float.parseFloat(request.getParameter("sum"));
        if (remainMoney >= sumMoneyCart) {
            new OrderDAO().insertOrderByCart(new CartDAO().displayCartByUserID(userID), discountByUser);
            new OrderDAO().insertOrderDetailsByOrderID(new OrderDAO().getOrderIDByUserID(userID));
            cartDAO.deleteCart();
            new ProductDAO().updateStatusByProductID(0, new ProductDAO().getProductIDByOrderID(new OrderDAO().getOrderIDByUserID(userID)));
            new UserDAO().updateRemainingMoney(userID, remainMoney - Float.parseFloat(request.getParameter("sum")));
            session.setAttribute("cart", cartDAO.displayCartByUserID(((User) session.getAttribute("user")).getUserID()));
            response.sendRedirect("order");
        }else{
            session.setAttribute("moneyNotEnough", "Số dư tài khoản không đủ vui lòng nạp thêm!");
            session.setAttribute("cart", cartDAO.displayCartByUserID(((User) session.getAttribute("user")).getUserID()));
            response.sendRedirect("cart");
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
