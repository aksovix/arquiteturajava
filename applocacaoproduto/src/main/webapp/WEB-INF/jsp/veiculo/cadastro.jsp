<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Ve�culo</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">

	<h2>Ve�culo</h2>
	  <form action="/veiculo/incluir" method="post">
	    <div class="form-group">
	      <label>C�digo:</label>
	      <input type="number" class="form-control" placeholder="Entre com o c�digo do ve�culo" name="codigo">
	    </div>
	    <div class="form-group">
	      <label>Marca:</label>
	      <input type="text" class="form-control" placeholder="Entre com a marca do ve�culo" name="marca">
	    </div>
	    <div class="form-group">
	      <label>Modelo:</label>
	      <input type="text" class="form-control" placeholder="Entre com o modelo do ve�culo" name="modelo">
	    </div>
	    <div class="form-group">
	      <label>Valor:</label>
	      <input type="text" class="form-control" placeholder="Entre com o valor do ve�culo" name="valor">
	    </div>
	    <div class="form-group">
	      <label>Ano/Modelo:</label>
	      <input type="text" class="form-control" placeholder="Entre com o Ano/Modelo do ve�culo" name="anoModelo">
	    </div>
	    <div class="form-group">
	      <label>Cilincrada:</label>
	      <input type="text" class="form-control" placeholder="Entre com a cilindrada do ve�culo" name="cilindrada">
	    </div>
	    <div class="form-group">
	      <label>Porta-Malas:</label>
	      <input type="number" class="form-control" placeholder="Entre com a capacidade do porta-malas do ve�culo" name="portaMalas">
	    </div>

	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>
  
	</div>
</body>
</html>