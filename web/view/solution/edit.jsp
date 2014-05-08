<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<div class="page-header">
    <ul class="breadcrumb">
        <li><a href="#">Home</a> <span class="divider"></span></li>
        <li><a href="#">Soluções</a> <span class="divider"></span></li>
        <li class="active">Editar Solução</li>
    </ul>
    <h1>Editar de Soluções</h1>
</div>
<form class="form-horizontal" action="SolutionController?action=edit&id=<c:out value="${solution.getId()}"/>" method="post">

    <div class="form-group">
        <label for="name" class="col-lg-2 control-label">Nome</label>
        <div class="col-lg-10">
            <input type="text" class="form-control" id="name" placeholder="Nome" name="name" value="<c:out value="${solution.getName()}"/>">
        </div>
    </div>
    <div class="form-group">
        <label for="description" class="col-lg-2 control-label">Descrição</label>
        <div class="col-lg-10">
            <textarea rows="4" class="form-control" id="description" placeholder="Descreva a solução/produto... " name="description" ><c:out value="${solution.getDescription()}"/></textarea>
        </div>
    </div>
    <div class="form-group">
        <label for="active" class="col-lg-2 control-label">Ativo</label>
        <div class="col-lg-10">
            <input type="checkbox" name="active" <c:out value="${solution.getActive() ? 'checked': ''}"/>>
        </div>
    </div>
    <div class="form-group">
        <div class="col-lg-offset-2 col-lg-10">
            <button type="submit" class="btn btn-primary" name="save">Salvar</button>
        </div>
    </div>
</form>