
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>OrderService</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link href="../bootstrap/css/bootstrap.css" rel="stylesheet">
    <style> body { padding-top: 60px; } </style>
  </head>
  <body>
      <?php
        $container = $_REQUEST["action"];
       ?>
     <div class="navbar  navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="index.php">OrderService  
          </a>
        </div>
        <div class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="index.php">Início</a></li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Usuários <b class="caret"></b></a>
              <ul class="dropdown-menu">
                <li><a href="index.php?action=useradd.php">Novo Usuário</a></li>
                <li><a href="index.php?action=userlist.php">Listar Usuários</a></li>
              </ul>
            </li>
            <li><a href="#contact">Sobre</a></li>
            <li>  
                <a href="../../index.php">Sair</a> 
            </li>
            <li>
                <a ><span class="text-warning">Olá, bem vindo João Gabriel!</span></a> 
            </li>
          </ul>
        </div><!--/.navbar-collapse -->
      </div>
    </div>
   
    <div class="container" id="container">
        
       <?php
            if($container == "useradd.php"){
                include("../user/add.php");
            }else if($container == "userlist.php"){
                include("../user/list.php");
            }
        ?>
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
     
    <script src="../bootstrap/js/jquery.js"></script>
    <script src="../bootstrap/js/bootstrap.min.js"></script>
  </body>
</html>
