/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controller;

import br.com.business.SolutionBO;
import br.com.model.Solution;
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
public class SolutionController extends HttpServlet {

    private static String LIST = "/view/solution/list.jsp";
    private static String ADD = "/view/solution/add.jsp";
    private static String EDIT = "/view/solution/edit.jsp";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Message message = Message.singleton();

        SolutionBO solutionBo = new SolutionBO();

        String forward = LIST;

        String action = request.getParameter("action");

        String id = request.getParameter("id");

        Solution solution;

        switch (action) {
            case "add":

                forward = ADD;

                break;

            case "edit":

                solution = solutionBo.getSolution(Integer.parseInt(id));

                request.setAttribute("solution", solution);

                forward = EDIT;

                break;

            case "list":

                request.setAttribute("solutions", solutionBo.getAllSolutions());

                break;

            case "delete":

                solutionBo.deleteSolution(Integer.parseInt(id));

                message.addMessage("Solução apagada com sucesso!");

                request.setAttribute("solutions", solutionBo.getAllSolutions());

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

        Solution solution;

        String forward = "";

        String action = request.getParameter("action");

        String id = request.getParameter("id");

        SolutionBO solutionBo = new SolutionBO();

        try {
            switch (action) {
                case "add":

                case "edit":

                    String name = request.getParameter("name");

                    String description = request.getParameter("description");

                    boolean active = request.getParameter("active") != null ? true : false;

                    solution = new Solution(name, description, active);

                    if (id == null || id.isEmpty()) {
                        solutionBo.insertSolution(solution);

                        message.addMessage("Solução adicionada com sucesso!");
                    } else {
                        solution.setId(Integer.parseInt(id));

                        solutionBo.updateSolution(solution);

                        message.addMessage("Solução atualizada com sucesso!");
                    }

                    request.setAttribute("solutions", solutionBo.getAllSolutions());

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
