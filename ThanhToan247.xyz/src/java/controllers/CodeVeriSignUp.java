/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.UserDAO;
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
public class CodeVeriSignUp extends HttpServlet {

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
        request.setAttribute("email", session.getAttribute("email-signup"));
        request.setAttribute("signupSuccess", "signupSuccess");
        String codeRandom = session.getAttribute("codeRandom").toString();
        if (code.equals(codeRandom)) {
            UserDAO dao = new UserDAO();
            dao.insertUser(session.getAttribute("username-signup").toString(), session.getAttribute("password-signup").toString(), session.getAttribute("email-signup").toString(), 0, 0, 0, "https://cdn.icon-icons.com/icons2/2438/PNG/512/boy_avatar_icon_148455.png", 0, 1, new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
            request.setAttribute("signUpSuccess", "Dang ki thanh cong, vui long dang nhap!");
            request.getRequestDispatcher("Login-SignUp-ForgotPass/Login.jsp").forward(request, response);
        } else {
            request.setAttribute("signupmode", "sign-up-mode");
            request.setAttribute("errorSignUp", "Ma code khong chinh xac, vui long nhap lai!");
            request.getRequestDispatcher("Login-SignUp-ForgotPass/Login.jsp").forward(request, response);
        }
    }

}
