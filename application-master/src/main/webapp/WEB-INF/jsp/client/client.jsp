<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Mobilecard</title>
</head>
<body>
	<%@ include file="manage.jsp"%>
	<div id="grids" style="display: block;">
		<c:if test="${(not empty search)}">
			<%@ include file="list.jsp"%>
		</c:if>
	</div>
</body>
</html>