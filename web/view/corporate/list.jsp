<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<div class="page-header">
    <ul class="breadcrumb">
        <li><a href="#">Home</a> <span class="divider"></span></li>
        <li><a href="#">Empresas</a> <span class="divider"></span></li>
        <li class="active">Listar Empresas</li>
    </ul>
    <h1>Lista de Empresas</h1>
</div>

<table class="table table-hover">
  <thead>
    <tr>
      <th>#</th>
      <th>Razão Social</th>
      <th>Nome Fantasia</th>
      <th>CNPJ</th>
      <th>Telefone</th>
      <th>Contato</th>
    </tr>
  </thead>
  <tbody>
        <c:forEach items="${corporates}" var="corporate">
            <tr>
                <td><c:out value="${corporate.getId()}" /></td>
                <td><a href="#"><c:out value="${corporate.getCorporatename()}" /></a></td>
                <td><c:out value="${corporate.getFantasyname()}" /></td>
                <td><c:out value="${corporate.getCnpj()}" /></td>
                <td><c:out value="${corporate.getPhone()}" /></td>
                <td><c:out value="${corporate.getContact()}" /></td>
            </tr>
      </c:forEach>
  </tbody>
</table>
