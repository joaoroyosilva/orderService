<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<div class="page-header">
    <ul class="breadcrumb">
        <li><a href="#">Home</a> <span class="divider"></span></li>
        <li><a href="#">Empresas</a> <span class="divider"></span></li>
        <li class="active">Nova Empresa</li>
    </ul>
    <h1>Edição de Empresas</h1>
</div>
<form class="form-horizontal" action="CorporateController?action=edit&id=<c:out value="${corporate.getId()}"/>" method="post">

    <div class="form-group">
        <label for="corporatename" class="col-lg-2 control-label">Razão social*</label>
        <div class="col-lg-10">
            <input type="text" class="form-control" id="corporatename" placeholder="Razão Social" name="corporatename" value="<c:out value="${corporate.getCorporatename()}"/>" required>
        </div>
    </div>
    <div class="form-group">
        <label for="fantasyname" class="col-lg-2 control-label">Nome Fantasia*</label>
        <div class="col-lg-10">
            <input type="text" class="form-control" id="fantasyname" placeholder="Nome Fantasia" name="fantasyname" value="<c:out value="${corporate.getFantasyname()}"/>"required>
        </div>
    </div>
    <div class="form-group">
        <label for="cnpj" class="col-lg-2 control-label">CNPJ*</label>
        <div class="col-lg-10">
            <input type="text" class="form-control" id="cnpj" placeholder="CPNJ" name="cnpj" value="<c:out value="${corporate.getCnpj()}"/>" required>
        </div>
    </div>
    <div class="form-group">
        <label for="ie" class="col-lg-2 control-label">Inscrição Estadual*</label>
        <div class="col-lg-10">
            <input type="text" class="form-control" id="ie" placeholder="Inscrição Estadual" name="ie" value="<c:out value="${corporate.getIe()}"/>" required>
        </div>
    </div>
    <div class="form-group">
        <label for="address" class="col-lg-2 control-label">Endereço*</label>
        <div class="col-lg-8">
            <input type="text" class="form-control" id="address" placeholder="Endereço" name="address" value="<c:out value="${corporate.getAddress()}"/>" required>
        </div>
        <div class="col-lg-2">
            <input type="text" class="form-control" id="endereco" placeholder="Nº" name="num" value="<c:out value="${corporate.getNum()}"/>" required>
        </div>
    </div>
    <div class="form-group">
        <label for="phone1" class="col-lg-2 control-label">Telefone*</label>
        <div class="col-lg-4">
            <input type="text" class="form-control" id="phone1" placeholder="Telefone 1" name="phone1" value="<c:out value="${corporate.getPhone()}"/>" required>
        </div>
        <label for="phone2" class="col-lg-2 control-label">Telefone</label>
        <div class="col-lg-4">
            <input type="text" class="form-control" id="phone2" placeholder="Telefone 2" name="phone2" value="<c:out value="${corporate.getPhone2()}"/>">
        </div>
    </div>
    <div class="form-group">
        <label for="contact" class="col-lg-2 control-label">Contato</label>
        <div class="col-lg-10">
            <input type="text" class="form-control" id="contact" placeholder="Contato" name="contact" value="<c:out value="${corporate.getContact()}"/>" required>
        </div>
    </div>
    <div class="form-group">
        <label for="city" class="col-lg-2 control-label">Cidade*</label>
        <div class="col-lg-7">
            <input type="text" class="form-control" id="city" placeholder="Cidade" name="city" value="<c:out value="${corporate.getCity()}"/>" required>
        </div>
        <label for="uf" class="col-lg-2 control-label">UF*</label>
        <div class="col-lg-1">
            <input type="text" class="form-control" id="uf" placeholder="UF" name="uf" value="<c:out value="${corporate.getUf()}"/>" required>
        </div>
    </div>
    <div class="form-group">
        <label for="active" class="col-lg-2 control-label">Ativo</label>
        <div class="col-lg-10">
            <input type="checkbox" name="active" <c:out value="${corporate.getActive() ? 'checked': ''}"/> >
        </div>
    </div>
    <div class="form-group">
        <div class="col-lg-offset-2 col-lg-10">
            <button type="submit" class="btn btn-primary" name="save">Salvar</button>
        </div>
    </div>
</form>