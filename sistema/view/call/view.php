<div class="page-header">
    <ul class="breadcrumb">
        <li><a href="index.php">Início</a> <span class="divider"></span></li>
        <li class="active">Chamado</li>
    </ul>
    <h1>Chamado: #</h1>
</div>

<div class="container">
    <ul>
        <li>
            <label class="label-campo">Abertura: </label> 15/04/2014 - 15:00.
        </li>
        <li>
            <label class="label-campo">Status: </label> <strong>Aberto</strong>.
        </li>
        <li>
            <label class="label-campo">Cliente: </label> Lojas Center Car.
        </li>
        <li>
            <label class="label-campo">Problema: </label> Computador não conecta ao servidor.
        </li>
        <li>
            <label class="label-campo">Descrição: </label> Computador dá uma mensagem de que não foi possível conectar ao servidor e que o sistema será encerrado. 
        </li>
    </ul>
</div>
<h2>Dados do atendimento</h2>
<form class="form-horizontal" action="#" method="post">
    <div class="form-group">
      <label for="cause" class="col-lg-2 control-label">Causa</label>
      <div class="col-lg-10">
        <textarea rows="6" class="form-control" id="cause" placeholder="Informe a causa do problema" name="cause" required></textarea>
      </div>
    </div>
    <div class="form-group">
      <label for="solution" class="col-lg-2 control-label">Solução</label>
      <div class="col-lg-10">
        <textarea rows="6" class="form-control" id="solution" placeholder="Descreva a solução do problema" name="solution" required></textarea>
      </div>
    </div>
    <div class="form-group">
      <div class="col-lg-offset-2 col-lg-10">
        <button type="submit" class="btn btn-primary" name="save">Salvar</button>
          <button type="reset" class="btn btn-default" name="save">Limpar</button>
      </div>
    </div>
</form>