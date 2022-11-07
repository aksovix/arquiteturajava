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
		<h3>Celulares: ${listagem.size()}</h3>

	  	<h4><a href="/celular">Novo Celular</a></h4>

		<table class="table table-striped">
			<thead>
				<tr>
	        		<th>ID</th>
					<th>Código</th>
					<th>Marca</th>
					<th>Modelo</th>
					<th>Valor</th>
					<th>Peso</th>
					<th>Bateria</th>
					<th>Tela</th>
	        		<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${listagem}">
					<tr>
						<td>${item.id}</td>
						<td>${item.codigo}</td>
						<td>${item.marca}</td>
						<td>${item.modelo}</td>
						<td>${item.valor}</td>
						<td>${item.peso}</td>
						<td>${item.bateria}</td>
						<td>${item.tela}</td>
		        		<td><a href="/celular/${item.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>