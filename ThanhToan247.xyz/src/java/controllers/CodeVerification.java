/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.DAO;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hungt
 */
@WebServlet(name = "CodeVerification", urlPatterns = {"/codeverification"})
public class CodeVerification extends HttpServlet {

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
        request.setAttribute("email", session.getAttribute("email-signup"));
        request.setAttribute("signupSuccess", "signupSuccess");
        request.setAttribute("signupmode", "sign-up-mode");
        request.getRequestDispatcher("Login-SignUp-ForgotPass/Login.jsp").forward(request, response);
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
        String code = request.getParameter("code-signup");
        HttpSession session = request.getSession();
        String codeRandom = session.getAttribute("codeRandom").toString();
        if (code.equals(codeRandom)) {
            DAO dao = new DAO();
            dao.insertUser(session.getAttribute("username-signup").toString(), session.getAttribute("password-signup").toString(), session.getAttribute("email-signup").toString(), 0, 0, 0, "https://cdn.icon-icons.com/icons2/2438/PNG/512/boy_avatar_icon_148455.png", 0, 1, new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
            request.setAttribute("signUpSuccess", "Dang ki thanh cong, vui long dang nhap!");
            request.getRequestDispatcher("Login-SignUp-ForgotPass/Login.jsp").forward(request, response);
        } else {
            request.setAttribute("errorSignUp", "Ma code khong chinh xac, vui long nhap lai!");
            processRequest(request, response);
        }
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
