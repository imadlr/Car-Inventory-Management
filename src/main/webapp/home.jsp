<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/main.css">
<meta charset="UTF-8">
<title>Statistiques</title>
</head>
<body class="bg-body-secondary">
<%@include file="header.jsp" %>
<div class="container container rounded mt-5 bg-white p-3">
    <h2 class="text-info m-0 mb-4">Statistiques</h2>
    <div class="row gap-4 mx-auto" style="width: 930px;">
		<div class="card text-white bg-primary col-lg-4 col-md-6" style="max-width: 18rem;">
  <div class="card-header">Nombre des clients</div>
  <div class="card-body">
    <p class="card-text fs-1 fw-bold">${client.nombreClient}</p>
  </div>
</div>
<div class="card text-white bg-primary col-lg-4 col-md-6" style="max-width: 18rem;">
  <div class="card-header">Nombre des voitures</div>
  <div class="card-body">
    <p class="card-text fs-1 fw-bold">${voiture.nombreVoiture}</p>
  </div>
</div>
<div class="card text-white bg-primary col-lg-4 col-md-6" style="max-width: 18rem;">
  <div class="card-header">Nombre des commandes</div>
  <div class="card-body">
    <p class="card-text fs-1 fw-bold">${commande.nombreCommande}</p>
  </div>
</div>
	</div>
</div>
</div>
</body>
</html>