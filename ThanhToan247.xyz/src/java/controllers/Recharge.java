/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.ProductDAO;
import daos.RechargeDAO;
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
 * @author hungt
 */
@WebServlet(name = "Recharge", urlPatterns = {"/recharge"})
public class Recharge extends HttpServlet {

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
        if (session.getAttribute("user") != null) {
            int userID = ((User) session.getAttribute("user")).getUserID();
            int totalProduct = new RechargeDAO().getTotalRechargeByUserID(userID);
            
            request.setAttribute("totalPage", (totalProduct % 10) != 0 ? totalProduct / 10 + 1 : totalProduct / 10);
            if (request.getParameter("page") != null) {
                int page = Integer.parseInt(request.getParameter("page"));
                request.setAttribute("page", request.getParameter("page"));
                request.setAttribute("showactive", "show active");
                request.setAttribute("active", "active");
                request.setAttribute("historyRecharge", new RechargeDAO().paggingRechargeByUserID(page, 10, userID));
            } else {
                request.setAttribute("page", 1);
                request.setAttribute("historyRecharge", new RechargeDAO().paggingRechargeByUserID(1, 10, userID));
            }
            request.getRequestDispatcher("Recharge/Recharge.jsp").forward(request, response);
        } else {
            request.setAttribute("errorLogin", "Vui lòng đăng nhập!");
            request.getRequestDispatcher("Login-SignUp-ForgotPass/Login.jsp").forward(request, response);
        }
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
        String email = request.getParameter("email");
        if (email.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$")) {

        }
        request.getRequestDispatcher("Recharge/Recharge.jsp").forward(request, response);

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
