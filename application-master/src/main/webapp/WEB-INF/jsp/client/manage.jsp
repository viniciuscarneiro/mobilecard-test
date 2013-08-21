<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<title>Cadastro/Edição de Clientes</title>
	<!-- plugin: jQuery -->
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery/jquery-1.9.1.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/app/client.js"></script>
</head>
<body>
	<a href="<c:url value='/client/list' />" title="Listagem de Clientes">Listagem de Clientes</a>
	<form id="formClient" method="post" action="<%=request.getContextPath()%>/client/save">
		<p>Cadastro/Edição de Clientes</p>
		<div>
			
			<input type="hidden" id="clientId" name="client.id" value="${id}" /> <br />
			<table>
			<tr>
				<td><label>Nome:</label></td>
				<td><input type="text" id="name" name="client.name" value="${name}" size="50" maxlength="50"/> </td>
			</tr>
			<tr>
				<td><label>Email:</label></td>
				<td><input type="text" id="email" name="client.email" value="${email}" size="50" maxlength="50"/> <br /> </td>
			</tr>
			<tr>
				<td><label>Endereço:</label></td>
				<td><input type="text" id="addres" name="client.address" value="${address}" size="50" maxlength="50"/> <br /></td>
			</tr>
			<tr>
				<td><label>Bairro:</label></td>
				<td><input type="text" id="neighborhood" name="client.neighborhood" value="${neighborhood}" size="50" maxlength="50"/> <br /></td>
			</tr>
			<tr>
				<td><label>Cidade:</label></td>
				<td><input type="text" id="city" name="client.city" value="${city}" size="50" maxlength="50"/> <br /> </td>
			</tr>
			<tr>
				<td><label>Estado:</label></td>
				<td>
					<input type="hidden" id="estadoSelecionado" name="uf" value="${uf}" />
					<select id="uf" name="client.uf">
						<option value="0">Selecione o Estado</option>
						<option value="AC">Acre</option>
						<option value="AL">Alagoas</option>
						<option value="AP">Amapá</option>
						<option value="AM">Amazonas</option>
						<option value="BA">Bahia</option>
						<option value="CE">Ceará</option>
						<option value="DF">Distrito Federal</option>
						<option value="ES">Espírito Santo</option>
						<option value="GO">Goiás</option>
						<option value="MA">Maranhão</option>
						<option value="MT">Mato Grosso</option>
						<option value="MS">Mato Grosso do Sul</option>
						<option value="MG">Minas Gerais</option>
						<option value="PR">Paraná</option>
						<option value="PB">Paraíba</option>
						<option value="PA">Pará</option>
						<option value="PE">Pernambuco</option>
						<option value="PI">Piauí</option>
						<option value="RN">Rio Grande do Norte</option>
						<option value="RS">Rio Grande do Sul</option>
						<option value="RJ">Rio de Janeiro</option>
						<option value="RO">Rondônia</option>
						<option value="RR">Roraima</option>
						<option value="SC">Santa Catarina</option>
						<option value="SE">Sergipe</option>
						<option value="SP">São Paulo</option>
						<option value="TO">Tocantins</option>
					</select> 
				</td>
			</tr>
			</table>
			<br/>
			
		</div>
		<input type="submit" value="Salvar"/>
	</form>

</body>
</html>