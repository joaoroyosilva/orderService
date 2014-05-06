<%-- 
    Document   : index
    Created on : May 1, 2014, 12:50:17 PM
    Author     : jroyo
--%>
<%@ include file="../validasession.jsp" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>OrderService</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <link href="bootstrap/css/bootstrap.css" rel="stylesheet"> 
        <style> 
            body { padding-top: 60px; overflow-y: scroll;} 
            .navbar-fixed-top,
            .navbar-fixed-bottom { background-color: white;}
        </style>
    </head>
    <body>

        <div class="navbar navbar-fixed-top">
            <div class="container">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">OrderService  
                    </a>
                </div>
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Usuários<b class="caret"></b></a>
                            <ul class="dropdown-menu">
                                <li><a href="UserController?action=add">Novo Usuário</a></li>
                                <li><a href="UserController?action=list">Listar Usuários</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Empresas<b class="caret"></b></a>
                            <ul class="dropdown-menu">
                                <li><a href="CorporateController?action=add">Nova Empresa</a></li>
                                <li><a href="CorporateController?action=list">Listar Empresas</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Soluções/Produtos <b class="caret"></b></a>
                            <ul class="dropdown-menu">
                                <li><a href="index.jsp?action=solutionadd">Cadastrar Solução/Produto</a></li>
                                <li><a href="index.jsp?action=solutionlist">Listar Soluções/Produtos</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Chamados <b class="caret"></b></a>
                            <ul class="dropdown-menu">
                                <li><a href="index.jsp?action=calladd">Novo Chamado</a></li>
                                <li><a href="index.jsp?action=calllist">Listar Chamados</a></li>
                            </ul>
                        </li>
                        <li><a href="index.jsp?action=about">Sobre</a></li>
                        <li>
                            <c:choose>
                                <c:when test="${_user !=  NULL}"> 
                                    <a href="AuthenticateController?action=logoff">Sair</a> 
                                </c:when>
                                <c:otherwise> 

                                </c:otherwise>
                            </c:choose>
                        </li>
                        <li>
                            <c:choose>
                                <c:when test="${_user !=  NULL}"> 
                                    <a ><span class="text-warning">Olá, bem vindo <c:out value="${_user.getName()}"/>!</span></a> 
                                </c:when>
                                <c:otherwise> 

                                </c:otherwise>
                            </c:choose>
                        </li>
                    </ul>
                </div><!--/.navbar-collapse -->
            </div>
        </div>
        <c:import url = "/view/helper/message.jsp"/>
        <div class="container" id="container">
            <c:if test="${pageContent !=  NULL}">
                <c:import url = "${pageContent}"/>
            </c:if>    
        </div>
        <div style="height: 100px;"></div>   
        <footer>
            <div class="navbar navbar-fixed-bottom">
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li><a ><span class="text-warning"> &COPY; 2014 </span></a> </li>
                        <li ><a href="#">APSOO</a></li>                
                    </ul>
                </div>
            </div>    
        </footer>

        <script src="bootstrap/js/jquery.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>
    </body>
</html>