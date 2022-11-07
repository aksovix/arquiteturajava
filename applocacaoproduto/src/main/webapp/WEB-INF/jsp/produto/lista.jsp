<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Produtos</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	
	<div class="container mt-3">
		<h3>Produtos: ${listagem.size()}</h3>

		<table class="table table-striped">
			<thead>
				<tr>
	        		<th>ID</th>
					<th>Código</th>
					<th>Marca</th>
					<th>Modelo</th>
					<th>Valor</th>
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
		        		<td><a href="/produto/${item.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>