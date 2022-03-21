/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.ProductDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hungt
 */
@WebServlet(name = "PhoneCard", urlPatterns = {"/phonecard"})
public class PhoneCard extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.setContentType("text/html;charset=UTF-8");
            request.setAttribute("supplierID", request.getParameter("supplierID"));
            request.setAttribute("priceID", request.getParameter("priceID"));
            request.setAttribute("supplier", new ProductDAO().getSupplierByCardTypeID(1));
            request.setAttribute("price", new ProductDAO().getPriceBySupplierID(Integer.parseInt(request.getParameter("supplierID"))));
            request.setAttribute("active", "style= 'transform: scale(1.2);border: 1px solid rgb(187, 224, 84);'");
            request.setAttribute("activePrice", "style= 'border: 1px solid rgb(76, 97, 20);transform: scale(1.08);box-shadow: rgb(0 0 0 / 24%) 0px 3px 8px;background-color: papayawhip'");
            request.getSession().setAttribute("urlCurrent", request.getRequestURI());
            request.getRequestDispatcher("Product/PhoneCard.jsp").forward(request, response);
        } catch (Exception e) {
            request.getRequestDispatcher("Product/PhoneCard.jsp").forward(request, response);
        }
        request.getSession().removeAttribute("notEnoughProduct");
    }

   
}
