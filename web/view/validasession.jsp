    <%  
    //verifica se a sessao do usuario � v�lida  
    if (session.getAttribute("_user") == null)  
    {  
            response.sendRedirect("index.jsp");  
    }  
    %>  