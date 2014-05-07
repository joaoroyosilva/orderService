<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<div class="page-header">
    <ul class="breadcrumb">
        <li><a href="#">Home</a> <span class="divider"></span></li>
        <li><a href="#">Soluções</a> <span class="divider"></span></li>
        <li class="active">Listar Soluções</li>
    </ul>
    <h1>Lista de Soluções</h1>
</div>

<table class="table table-hover">
  <thead>
    <tr>
      <th>#</th>
      <th>Name</th>
      <th>Ativo</th>
      <th>Opções</th>
    </tr>
  </thead>
  <tbody>
        <c:forEach items="${solutions}" var="solution">
            <tr>
                <td><c:out value="${solution.getId()}" /></td>
                <td><a href="SolutionController?action=edit&id=<c:out value="${solution.getId()}" />"><c:out value="${solution.getName()}" /></a></td>
                <td><input type="checkbox" name="active" disabled="disabled" <c:out value="${solution.getActive() ? 'checked': ''}"/> ></td>
                <td>
                    [<a href="SolutionController?action=edit&id=<c:out value="${solution.getId()}" />">Editar</a>]
                    [<a href="SolutionController?action=delete&id=<c:out value="${solution.getId()}" />">Excluir</a>]
                </td>
            </tr>
      </c:forEach>
  </tbody>
</table>
