/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
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
@WebServlet(name = "SignUp", urlPatterns = {"/signup"})
public class SignUp extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
        try {
            request.setAttribute("signupmode", "sign-up-mode");
            String username = request.getParameter("username");
            String email = request.getParameter("email");
            request.setAttribute("email", email);
            String password = request.getParameter("password");
            String confirmpPassword = request.getParameter("confirm-password");
            DAO dao = new DAO();
            if (username.equals("") || email.equals("") || password.equals("") || confirmpPassword.equals("")) {
                request.setAttribute("errorSignUp", "Vui long nhap day du thong tin!");
            } else if (dao.checkUsername(username)) {
                request.setAttribute("errorSignUp", "Username da co nguoi dang ki!");
            } else if (!email.matches("^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$")) {
                request.setAttribute("errorSignUp", "Email khong hop le!");
            } else if (!password.equals(confirmpPassword)) {
                request.setAttribute("errorSignUp", "Vui long nhap mat khau giong nhau!");
            } else {
                request.setAttribute("signupSuccess", "signupSuccess");
                HttpSession session = request.getSession();
                Random random = new Random();
                int codeRandom = (100000 + new Random().nextInt(900000));
                session.setAttribute("codeRandom", codeRandom);
                session.setAttribute("username-signup", username);
                session.setAttribute("password-signup", password);
                session.setAttribute("email-signup", email);
                SendMail.send(email, "Code signup Thanhtoan247.xyz", "Your signup confirmation code is: " + codeRandom, "hungnthe153039@fpt.edu.vn", "Nthhldhfuhll1@");
                request.getRequestDispatcher("Login-SignUp-ForgotPass/Login.jsp").forward(request, response);
            }
            request.getRequestDispatcher("Login-SignUp-ForgotPass/Login.jsp").forward(request, response);

        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        System.out.println("hung@gmail.com".matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$"));
    }

}
