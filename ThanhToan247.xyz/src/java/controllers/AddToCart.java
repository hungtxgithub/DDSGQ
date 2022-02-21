/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.CartDAO;
import daos.ProductDAO;
import daos.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.User;

/**
 *
 * @author hungt
 */
@WebServlet(name = "AddToCart", urlPatterns = {"/addtocart"})
public class AddToCart extends HttpServlet {

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
        HttpSession session = request.getSession();
        response.setContentType("text/html;charset=UTF-8");
        UserDAO userDao = new UserDAO();
        ProductDAO dao = new ProductDAO();
        CartDAO cartDao = new CartDAO();
        String phoneCard = request.getParameter("phoneCard");
        int supplierID = Integer.parseInt(request.getParameter("supplierID"));
        float price = Float.parseFloat(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        int totalProduct = dao.getToalProductAvailable(supplierID, price);
        int priceID = dao.getPriceIDBySupplierIDAndPrice(supplierID, price);
        List<Integer> listProduct = dao.getProductIDByPriceID(priceID);
        int userID = ((User) session.getAttribute("user")).getUserID();
        System.out.println(userID);
        if (totalProduct >= quantity) {
            for (int i = 0; i < quantity; i++) {
                cartDao.insertCart(listProduct.get(i), 1, userID);
            }
        } else {
            session.setAttribute("notEnoughProduct", "Số lượng sản phẩm không đủ! Hiện còn: " + totalProduct);
        }
        
        response.sendRedirect(phoneCard + "?SupplierID=" + supplierID);
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
