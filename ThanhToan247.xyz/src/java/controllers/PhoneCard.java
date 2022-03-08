/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.ProductDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Price;

/**
 *
 * @author hungt
 */
@WebServlet(name = "Product", urlPatterns = {"/phonecard"})
public class PhoneCard extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.setContentType("text/html;charset=UTF-8");
            request.setAttribute("supplier", new ProductDAO().getSupplierByCardTypeID(1));
            request.setAttribute("SupplierID", request.getParameter("SupplierID"));
            List<Price> listPrice = new ProductDAO().getPriceBySupplierID(Integer.parseInt(request.getParameter("SupplierID")));
            request.setAttribute("price", listPrice);
            request.setAttribute("active", "style= 'transform: scale(1.2);border: 1px solid rgb(187, 224, 84);'");
            request.getRequestDispatcher("Product/PhoneCard.jsp").forward(request, response);
        } catch (Exception e) {
            request.getRequestDispatcher("Product/PhoneCard.jsp").forward(request, response);
        }
        request.getSession().removeAttribute("notEnoughProduct");
    }

   
}
