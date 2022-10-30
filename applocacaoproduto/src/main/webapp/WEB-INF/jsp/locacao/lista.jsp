<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Cadastramento de Locações</title>
</head>
<body>
	<div class="container mt-3">
		<h3>Locações: ${listagem.size()}</h3>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>Início</th>
					<th>Fim</th>
					<th>Descrição</th>
					<th>Processada</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${listagem}">
					<tr>
						<td>${item.inicio}</td>
						<td>${item.fim}</td>
						<td>${item.descricao}</td>
						<td>${item.processada}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>