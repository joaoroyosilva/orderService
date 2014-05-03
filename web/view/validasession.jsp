    <%  
    //verifica se a sessao do usuario é válida  
    if (session.getAttribute("_user") == null)  
    {  
            response.sendRedirect("index.jsp");  
    }  
    %>  