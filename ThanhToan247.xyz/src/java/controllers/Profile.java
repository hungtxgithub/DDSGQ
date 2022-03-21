/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

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
@WebServlet(name = "Profile", urlPatterns = {"/profile"})
public class Profile extends HttpServlet {

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
        try {
            HttpSession session = request.getSession();
            session.setAttribute("user", new UserDAO().getUserByUsername(((User) session.getAttribute("user")).getUsername()));
            request.getRequestDispatcher("Profile/Profile.jsp").forward(request, response);
        } catch (Exception e) {
            request.setAttribute("errorLogin", "Vui lòng đăng nhập!");
            request.getRequestDispatcher("Login-SignUp-ForgotPass/Login.jsp").forward(request, response);
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
        response.setContentType("text/html;charset=UTF-8");
        if (request.getParameter("email") != null) {
            String email = request.getParameter("email");
            String cfPassword = request.getParameter("cfPassword");
            String passwordUser = ((User) request.getSession().getAttribute("user")).getPassword();
            if(!email.matches("^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$")){
                request.setAttribute("message", "Email không hợp lệ!");
            }
            else if (cfPassword.equals(passwordUser)) {
                System.out.println(email);
                System.out.println(((User) request.getSession().getAttribute("user")).getUsername());
                new UserDAO().updateEmailByUsername(email, ((User) request.getSession().getAttribute("user")).getUsername());
                request.setAttribute("message", "Thay đổi email thành công!");
            } else {
                request.setAttribute("message", "Mật khẩu không chính xác!");
            }
        } else {
            String oldpassword = request.getParameter("oldpassword");
            String newpassword = request.getParameter("newpassword");
            String renewpassword = request.getParameter("re-newpassword");
            String username = ((User) request.getSession().getAttribute("user")).getUsername();
            String passwordUser = ((User) request.getSession().getAttribute("user")).getPassword();
            if (oldpassword.equals(passwordUser) && newpassword.endsWith(renewpassword)) {
                System.out.println("Bạn đã thay đổi mật khẩu thành công!");
                UserDAO dao = new UserDAO();
                System.out.println(username);
                System.out.println(newpassword);
                dao.updatePassword(username, newpassword);
                request.setAttribute("message", "Bạn đã thay đổi mật khẩu thành công!");
            } else if (!oldpassword.equals(passwordUser)) {
                System.out.println("Mật khẩu cũ không chính xác!");
                request.setAttribute("message", "Mật khẩu cũ không chính xác!");
            } else {
                System.out.println("Vui lòng nhập 2 mật khẩu giống nhau!");
                request.setAttribute("message", "Vui lòng nhập 2 mật khẩu giống nhau!");
            }
        }

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
