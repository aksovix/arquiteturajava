<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Celular</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">

	<h2>Celular</h2>
	  <form action="/celular/incluir" method="post">
	    <div class="form-group">
	      <label>Código:</label>
	      <input type="number" class="form-control" placeholder="Entre com o código do celular" name="codigo">
	    </div>
	    <div class="form-group">
	      <label>Marca:</label>
	      <input type="text" class="form-control" placeholder="Entre com a marca do celular" name="marca">
	    </div>
	    <div class="form-group">
	      <label>Modelo:</label>
	      <input type="text" class="form-control" placeholder="Entre com o modelo do celular" name="modelo">
	    </div>
	    <div class="form-group">
	      <label>Valor:</label>
	      <input type="text" class="form-control" placeholder="Entre com o valor do celular" name="valor">
	    </div>
	    <div class="form-group">
	      <label>Peso:</label>
	      <input type="number" class="form-control" placeholder="Entre com o peso do celular" name="peso">
	    </div>
	    <div class="form-group">
	      <label>Bateria:</label>
	      <input type="number" class="form-control" placeholder="Entre com a capacidade da bateria do celular" name="bateria">
	    </div>
	    <div class="form-group">
	      <label>Tela:</label>
	      <input type="text" class="form-control" placeholder="Entre com o tamanho da tela" name="tela">
	    </div>

	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>
  
	</div>
</body>
</html>