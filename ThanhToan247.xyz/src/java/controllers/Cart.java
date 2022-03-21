/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.CartDAO;
import daos.ProductDAO;
import java.io.IOException;
import java.util.ArrayList;
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
 * @author HungNT
 */
@WebServlet(name = "Cart", urlPatterns = {"/cart"})
public class Cart extends HttpServlet {

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
        request.getRequestDispatcher("Cart/Cart.jsp").forward(request, response);
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
        HttpSession session = request.getSession();
        CartDAO dao = new CartDAO();

        //Add to cart
        if (request.getParameter("priceID") != null) {
            try {
                int priceID = Integer.parseInt(request.getParameter("priceID"));
                int quantity = Integer.parseInt(request.getParameter("quantity"));
                int quantityStock = new ProductDAO().getProductIDByPriceID(priceID).size();

                if (quantity > quantityStock) {
                    session.setAttribute("notEnoughProduct", "Số lượng sản phẩm không đủ! Hiện còn: " + quantityStock);
                    response.sendRedirect(session.getAttribute("urlCurrent").toString() + "?supplierID=" + request.getParameter("supplierID") + "&priceID=" + priceID);
                } else {
                    if (quantity <= quantityStock) {
                        List<models.Cart> cartByUserID = dao.displayCartByUserID(((User) session.getAttribute("user")).getUserID());
                        List<Integer> list = new ArrayList<>();
                        for (models.Cart cart : cartByUserID) {
                            list.add(cart.getPrice().getPriceID());
                        }
                        if (list.contains(priceID)) {
                            dao.updateQuantityByPriceID(quantity+dao.getQuantityByPriceID(priceID), priceID);
                        } else {
                            dao.insertCart(priceID, quantity, ((User) session.getAttribute("user")).getUserID());
                        }
                        session.setAttribute("cart", dao.displayCartByUserID(((User) session.getAttribute("user")).getUserID()));
                    }
                    response.sendRedirect(session.getAttribute("urlCurrent").toString() + "?supplierID=" + request.getParameter("supplierID") + "&priceID=" + priceID);
                }
            } catch (Exception e) {
                response.sendRedirect(session.getAttribute("urlCurrent").toString() + "?supplierID=" + request.getParameter("supplierID"));
            }

        } //Delete cart by cartID
        else if (request.getParameter("deleteid") != null) {
            dao.deleteCart(Integer.parseInt(request.getParameter("deleteid")));
            session.setAttribute("cart", dao.displayCartByUserID(((User) session.getAttribute("user")).getUserID()));
            response.sendRedirect("cart");
        } else {
            request.getRequestDispatcher("Cart/Cart.jsp").forward(request, response);
        }
        session.setAttribute("moneyNotEnough", null);
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
