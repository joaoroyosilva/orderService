<div class="page-header">
    <ul class="breadcrumb">
        <li><a href="index.php">Início</a> <span class="divider"></span></li>
        <li><a href="index.php?action=userlist.php">Usuários</a> <span class="divider"></span></li>
        <li class="active">Novo Usuário</li>
    </ul>
    <h1>Cadastro de Usuários</h1>
</div>
<form class="form-horizontal" action="UserController?action=add" method="post">

    <div class="form-group">
      <label for="name" class="col-lg-2 control-label">Nome</label>
      <div class="col-lg-10">
        <input type="text" class="form-control" id="name" placeholder="Nome" name="name" required>
      </div>
    </div>
    <div class="form-group">
      <label for="password" class="col-lg-2 control-label">Senha</label>
      <div class="col-lg-10">
        <input type="password" class="form-control" id="password" placeholder="Senha" name="password" required>
      </div>
    </div>
    <div class="form-group">
      <label for="email" class="col-lg-2 control-label">E-mail</label>
      <div class="col-lg-10">
        <input type="email" class="form-control" id="email" placeholder="E-mail" name="email" required>
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