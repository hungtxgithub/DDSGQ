/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.CartDAO;
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
 * @author hungt
 */
@WebServlet(name = "Login", urlPatterns = {"/login"})
public class Login extends HttpServlet {

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
        request.getRequestDispatcher("Login-SignUp-ForgotPass/Login.jsp").forward(request, response);
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
        response.setContentType("text/html");
        try {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            if (new UserDAO().checkLogin(username, password)) {
                HttpSession session = request.getSession();
                session.setAttribute("user", new UserDAO().getUserByUsername(username));
                session.setAttribute("cart", new CartDAO().displayCartByUserID(((User)session.getAttribute("user")).getUserID()));
                session.setMaxInactiveInterval(60*10);  
                response.sendRedirect("home");
            } else {
                request.setAttribute("errorLogin", "Username or password incorrect!");
            }
            request.getRequestDispatcher("Login-SignUp-ForgotPass/Login.jsp").forward(request, response);
        } catch (Exception e) {
        }
    }
  
}
