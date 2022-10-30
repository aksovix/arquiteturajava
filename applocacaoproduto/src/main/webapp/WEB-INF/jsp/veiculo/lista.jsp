<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Cadastramento de Veículos</title>
</head>
<body>
	<div class="container mt-3">
		<h3>Veículos: ${listagem.size()}</h3>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>Código</th>
					<th>Marca</th>
					<th>Modelo</th>
					<th>Valor</th>
					<th>Ano/Modelo</th>
					<th>Cilindrada</th>
					<th>Porta-Malas</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${listagem}">
					<tr>
						<td>${item.codigo}</td>
						<td>${item.marca}</td>
						<td>${item.modelo}</td>
						<td>${item.valor}</td>
						<td>${item.anoModelo}</td>
						<td>${item.cilindrada}</td>
						<td>${item.portaMalas}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>