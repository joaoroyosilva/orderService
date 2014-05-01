package br.com.controller;


import br.com.business.ProfileBO;
import br.com.model.Profile;
import br.com.util.Message;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vitor
 */
public class ProfileController extends HttpServlet {

    private static String LIST = "/view/profile/list.jsp";
    private static String ADD = "/view/profile/add.jsp";
    private static String EDIT = "/view/profile/edit.jsp";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Message message = Message.singleton();

        String forward = LIST;

        String action = request.getParameter("action");

        String id = request.getParameter("id");

        ProfileBO profileBo = new ProfileBO();

       

        request.setAttribute("message", message);

        request.setAttribute("pageContent", forward);

        RequestDispatcher view = request.getRequestDispatcher("/view/index/index.jsp");

        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Message message = Message.singleton();

        Profile profile;

        String forward = "";

        String action = request.getParameter("action");

        String id = request.getParameter("id");

        ProfileBO profileBo = new ProfileBO();

     
     
        request.setAttribute("message", message);

        request.setAttribute("pageContent", forward);

        RequestDispatcher view = request.getRequestDispatcher("/view/index/index.jsp");

        view.forward(request, response);
    }
}