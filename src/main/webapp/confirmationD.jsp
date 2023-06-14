<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="txt/html">
<title>confirmation</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/main.css">
</head>
<body class="bg-body-secondary">
<%@include file="header.jsp" %>
<div class="container rounded mt-5 bg-white p-3">
<h2 class="text-info m-0 mb-4">Commande Ajouté</h2>
    <div class="row">
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">ID:</label>
    <input type="text" class="form-control" value="${commande.id}" disabled>
  </div>
   <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Numéro:</label>
    <input type="text" class="form-control" value="${commande.numero}" disabled>
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Date::</label>
    <input type="text" class="form-control" value="${commande.date}" disabled>
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Quantite:</label>
    <input type="text" class="form-control" value="${commande.quantite}" disabled>
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Id_Client:</label>
    <input type="text" class="form-control" value="${commande.idClient}" disabled>
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Id_Voiture:</label>
    <input type="text" class="form-control" value="${commande.idVoiture}" disabled>
  </div>
</div>
</div>
<script src="js/bootstrap.bundle.min.js"></script>
</body>
</html>