<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<div class="page-header">
    <ul class="breadcrumb">
        <li><a href="#">Home</a> <span class="divider"></span></li>
        <li><a href="#">Empresas</a> <span class="divider"></span></li>
        <li class="active">Nova Empresa</li>
    </ul>
    <h1>Cadastro de Empresas</h1>
</div>
<form class="form-horizontal" action="CorporateController?action=add" method="post">

    <div class="form-group">
        <label for="corporatename" class="col-lg-2 control-label">Razão social*</label>
        <div class="col-lg-10">
            <input type="text" class="form-control" id="corporatename" placeholder="Razão Social" name="corporatename" required>
        </div>
    </div>
    <div class="form-group">
        <label for="fantasyname" class="col-lg-2 control-label">Nome Fantasia*</label>
        <div class="col-lg-10">
            <input type="text" class="form-control" id="fantasyname" placeholder="Nome Fantasia" name="fantasyname" required>
        </div>
    </div>
    <div class="form-group">
        <label for="cnpj" class="col-lg-2 control-label">CNPJ*</label>
        <div class="col-lg-10">
            <input type="text" class="form-control" id="cnpj" placeholder="CPNJ" name="cnpj" required>
        </div>
    </div>
    <div class="form-group">
        <label for="ie" class="col-lg-2 control-label">Inscrição Estadual*</label>
        <div class="col-lg-10">
            <input type="text" class="form-control" id="ie" placeholder="Inscrição Estadual" name="ie" required>
        </div>
    </div>
    <div class="form-group">
        <label for="address" class="col-lg-2 control-label">Endereço*</label>
        <div class="col-lg-8">
            <input type="text" class="form-control" id="address" placeholder="Endereço" name="address" required>
        </div>
        <div class="col-lg-2">
            <input type="text" class="form-control" id="endereco" placeholder="Nº" name="num" required>
        </div>
    </div>
    <div class="form-group">
        <label for="phone1" class="col-lg-2 control-label">Telefone*</label>
        <div class="col-lg-4">
            <input type="text" class="form-control" id="phone1" placeholder="Telefone 1" name="phone1" required>
        </div>
        <label for="phone2" class="col-lg-2 control-label">Telefone*</label>
        <div class="col-lg-4">
            <input type="text" class="form-control" id="phone2" placeholder="Telefone 2" name="phone2">
        </div>
    </div>
    <div class="form-group">
        <label for="contact" class="col-lg-2 control-label">Contato</label>
        <div class="col-lg-10">
            <input type="text" class="form-control" id="contact" placeholder="Contato" name="contact" required>
        </div>
    </div>
    <div class="form-group">
        <label for="city" class="col-lg-2 control-label">Cidade*</label>
        <div class="col-lg-7">
            <input type="text" class="form-control" id="city" placeholder="Cidade" name="city" required>
        </div>
        <label for="uf" class="col-lg-2 control-label">UF*</label>
        <div class="col-lg-1">
            <input type="text" class="form-control" id="uf" placeholder="UF" name="uf" required>
        </div>
    </div>
    <div class="form-group">
        <label for="active" class="col-lg-2 control-label">Ativo</label>
        <div class="col-lg-10">
            <input type="checkbox" name="active">
        </div>
    </div>
    <div class="form-group">
        <div class="col-lg-offset-2 col-lg-10">
            <button type="submit" class="btn btn-primary" name="save">Salvar</button>
            <button type="reset" class="btn btn-default" name="save">Limpar</button>
        </div>
    </div>
</form>