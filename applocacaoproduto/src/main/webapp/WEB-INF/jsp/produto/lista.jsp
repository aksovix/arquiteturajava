<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Cadastramento de Produtos</title>
</head>
<body>
	<div class="container mt-3">
		<h3>Produtos: ${listagem.size()}</h3>

		<table class="table table-striped">
			<thead>
				<tr>
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
						<td>${item.codigo}</td>
						<td>${item.marca}</td>
						<td>${item.modelo}</td>
						<td>${item.valor}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>