<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Computador</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">

	<h2>Computador</h2>
	  <form action="/computador/incluir" method="post">
	    <div class="form-group">
	      <label>Código:</label>
	      <input type="number" class="form-control" placeholder="Entre com o código do computador" name="codigo">
	    </div>
	    <div class="form-group">
	      <label>Marca:</label>
	      <input type="text" class="form-control" placeholder="Entre com a marca do computador" name="marca">
	    </div>
	    <div class="form-group">
	      <label>Modelo:</label>
	      <input type="text" class="form-control" placeholder="Entre com o modelo do computador" name="modelo">
	    </div>
	    <div class="form-group">
	      <label>Valor:</label>
	      <input type="text" class="form-control" placeholder="Entre com o valor do computador" name="valor">
	    </div>
	    <div class="form-group">
	      <label>Memória:</label>
	      <input type="number" class="form-control" placeholder="Entre com quantidade de memória do computador" name="memoria">
	    </div>
	    <div class="form-group">
	      <label>CPU:</label>
	      <input type="text" class="form-control" placeholder="Entre com a velocidade do processador do computador" name="cpu">
	    </div>
	    <div class="form-group">
	      <label>Disco:</label>
	      <input type="text" class="form-control" placeholder="Entre com o tamanho do disco do computador" name="disco">
	    </div>

	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>
  
	</div>
</body>
</html>