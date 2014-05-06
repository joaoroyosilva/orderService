/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controller;

import br.com.business.CorporateBO;
import br.com.model.Corporate;
import br.com.util.Message;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jroyo
 */
public class CorporateController extends HttpServlet {

    private static String LIST = "/view/corporate/list.jsp";
    private static String ADD = "/view/corporate/add.jsp";
    private static String EDIT = "/view/corporate/edit.jsp";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Message message = Message.singleton();

        CorporateBO corporateBo = new CorporateBO();

        String forward = LIST;

        String action = request.getParameter("action");

        String id = request.getParameter("id");
        
        switch (action) {
            case "add":

                forward = ADD;

                break;

            case "edit":

                forward = EDIT;

                break;

            case "list":

                request.setAttribute("corporates", corporateBo.getAllCorporates());

                break;

            case "delete":

                corporateBo.deleteCorporate(Integer.parseInt(id));
                
                message.addMessage("Empressa apagada com sucesso!");
                
                request.setAttribute("corporates", corporateBo.getAllCorporates());

                break;

            default:

                forward = ADD;
        }
        request.setAttribute("message", message);

        request.setAttribute("pageContent", forward);

        RequestDispatcher view = request.getRequestDispatcher("/view/index/index.jsp");

        view.forward(request, response);
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
        Message message = Message.singleton();

        request.setCharacterEncoding("UTF-8");
        
        Corporate corporate;

        String forward = "";

        String action = request.getParameter("action");

        String id = request.getParameter("id");

        CorporateBO corporateBo = new CorporateBO();

        try {
            switch (action) {
                case "add":

                case "edit":

                    String coporatename = request.getParameter("corporatename");

                    String fantasyname = request.getParameter("fantasyname");

                    String cnpj = request.getParameter("cnpj");

                    String ie = request.getParameter("ie");

                    String address = request.getParameter("address");

                    String num = request.getParameter("num");

                    String phone1 = request.getParameter("phone1");

                    String phone2 = request.getParameter("phone2");

                    String contact = request.getParameter("contact");

                    String city = request.getParameter("city");

                    String uf = request.getParameter("uf");

                    boolean active = request.getParameter("active") != null ? true : false;

                    corporate = new Corporate(coporatename, fantasyname, cnpj, ie, address, num, phone2, phone2, contact, city, uf, active);

                    if (id == null || id.isEmpty()) {
                        corporateBo.insertCorporate(corporate);

                        message.addMessage("Empresa adicionada com sucesso!");
                    } else {
                        corporate.setId(Integer.parseInt(id));

                        corporateBo.updateCorporate(corporate);

                        message.addMessage("Empresa atualizada com sucesso!");
                    }

                    request.setAttribute("corporates", corporateBo.getAllCorporates());

                    forward = LIST;

                    break;

            }
        } catch (Exception ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }

        request.setAttribute("message", message);

        request.setAttribute("pageContent", forward);

        RequestDispatcher view = request.getRequestDispatcher("/view/index/index.jsp");

        view.forward(request, response);
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
