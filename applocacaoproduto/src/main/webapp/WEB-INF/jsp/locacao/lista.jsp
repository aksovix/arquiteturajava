<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Loca??es</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	
	<div class="container mt-3">
		<h3>Loca??es: ${listagem.size()}</h3>

	    <h4><a href="/locacao">Nova loca??o</a></h4>

		<table class="table table-striped">
			<thead>
				<tr>
	        		<th>ID</th>
					<th>In?cio</th>
					<th>Fim</th>
					<th>Descri??o</th>
					<th>Processada</th>
					<th>Locat?rio</th>
					<th>Produtos</th>
	        		<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${listagem}">
					<tr>
						<td>${item.id}</td>
						<td>${item.inicio}</td>
						<td>${item.fim}</td>
						<td>${item.descricao}</td>
						<td>${item.processada}</td>
				        <td>${item.locatario.nome}</td>
				        <td>${item.produtos.size()}</td>
		        		<td><a href="/locacao/${item.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>