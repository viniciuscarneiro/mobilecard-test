<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<title>Lista de Clientes</title>
</head>
<body>
	<p>Listagem de Clientes</p>
	<table border="2">
		<thead>
			<tr>
				<th>Identificador</th>
				<th>Nome</th>
				<th>Email</th>
				<th>Ações</th>
			</tr>
		</thead>
		<c:forEach items="${clientList}" var="client">
			<tbody>
				<tr>
					<td>${client.id}</td>
					<td>${client.name }</td>
					<td>${client.email }</td>
					<td>
						<a href="<c:url value='/client/manage?clientId=${client.id}' />" title="Editar Cliente"> 
							<img src="<%=request.getContextPath()%>/img/edit.png" />
						</a>
						<a href="<c:url value='/client/delete?clientId=${client.id}' />" title="Deletar Cliente"> 
							<img src="<%=request.getContextPath()%>/img/delete.png" />
						</a>
					</td>
				</tr>
			</tbody>
		</c:forEach>
	</table>
	<br/><br/>
	<a href="<c:url value='/client/' />"	title="Novo Cliente">
	Cadastrar Novo Cliente</a>
</body>
</html>