<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Loca��es</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">

	<h2>Loca��o</h2>
	  <form action="/locacao/incluir" method="post">
	    <div class="form-group">
	      <label>Descri��o:</label>
	      <input type="text" class="form-control" placeholder="Entre com a descri��o" name="descricao">
	    </div>
	    <div class="form-group">
	      <label>In�cio:</label>
	      <input type="datetime-local" class="form-control" name="inicio">
	    </div>
	    <div class="form-group">
	      <label>Fim:</label>
	      <input type="datetime-local" class="form-control" name="fim">
	    </div>
	    <div class="form-group">
	      <label>Processada:</label>
			<div class="form-check">
			  <input type="radio" class="form-check-input" name="processada" value="true"> Sim
			  <label class="form-check-label"></label>
			</div>
			<div class="form-check">
			  <input type="radio" class="form-check-input" name="processada" value="false"> N�o
			  <label class="form-check-label"></label>
			</div>
	    </div>

	    <div class="form-group">
	      <label>Locat�rio:</label>
	      <select name="locatario" class="form-control">
	      	<c:forEach var="locatario" items="${locatarios}">
	      		<option value="${locatario.id}">${locatario.nome}</option>
	      	</c:forEach>
	      </select>
	    </div>

	    <div class="form-group">
	      <label>Produtos:</label>
	      	<c:forEach var="produto" items="${produtos}">
				<div class="form-check">
				  <input class="form-check-input" type="checkbox" name="produtos" value="${produto.id}">
				  <label class="form-check-label"> ${produto.marca} ${produto.modelo}</label>
				</div>	   
			</c:forEach>   
	    </div>

	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>
  
	</div>
</body>
</html>