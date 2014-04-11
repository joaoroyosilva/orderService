<div class="page-header">
    <ul class="breadcrumb">
        <li><a href="index.php">Início</a> <span class="divider"></span></li>
        <li><a href="index.php?action=calllist">Chamados</a> <span class="divider"></span></li>
        <li class="active">Novo Chamado</li>
    </ul>
    <h1>Abertura de Chamado</h1>
</div>
<form class="form-horizontal" action="#" method="post">
    <div class="form-group">
      <label for="problem" class="col-lg-2 control-label">Problema</label>
      <div class="col-lg-10">
        <input type="text" class="form-control" id="problem" placeholder="Problema" name="problem" required>
      </div>
    </div>
    <div class="form-group">
      <label for="preffereddate" class="col-lg-2 control-label">Data preferencial</label>  
      <div class="col-lg-2">
        <input type="date" class="form-control" id="preffereddate" name="preffereddate" required />
      </div>
    </div>
    <div class="form-group">
      <label for="prefferedhour" class="col-lg-2 control-label">Horário preferencial</label>
      <div class="col-lg-2">
        <input type="time" class="form-control" name="prefferedhour" id="prefferedhour" />
      </div>
    </div>
    <div class="form-group">
      <label for="problem" class="col-lg-2 control-label">Problema</label>
      <div class="col-lg-10">
        <input type="text" class="form-control" id="problem" placeholder="Problema" name="problem" required>
      </div>
    </div>
    <div class="form-group">
      <label for="solution" class="col-lg-2 control-label">Solução/Produto</label>
      <div class="col-lg-10">
        <select class="btn dropdown-toggle">
            <option value="Redes">Redes</option>
            <option value="Hardware">Hardware</option>
            <option value="PAF-ECF">Software de PAF-ECF</option>
            <option value="TEF">TEF</option>
        </select>
      </div>
    </div>
    <div class="form-group">
      <label for="description" class="col-lg-2 control-label">Descrição</label>
      <div class="col-lg-10">
        <textarea rows="10" class="form-control" id="description" placeholder="Descreva o problema... " name="description" required></textarea>
      </div>
    </div>
    <div class="form-group">
      <div class="col-lg-offset-2 col-lg-10">
        <button type="submit" class="btn btn-primary" name="save">Salvar</button>
          <button type="reset" class="btn btn-default" name="save">Limpar</button>
      </div>
    </div>
</form>