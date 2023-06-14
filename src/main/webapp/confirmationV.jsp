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
<h2 class="text-info m-0 mb-4">Voiture Ajouté</h2>
    <div class="row">
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">ID:</label>
    <input type="text" class="form-control" value="${voiture.id}" disabled>
  </div>
   <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Marque:</label>
    <input type="text" class="form-control" value="${voiture.marque}" disabled>
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Modele:</label>
    <input type="text" class="form-control" value="${voiture.modele}" disabled>
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Couleur</label>
    <input type="text" class="form-control" value="${voiture.couleur}" disabled>
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Immatriculation:</label>
    <input type="text" class="form-control" value="${voiture.matricule}" disabled>
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">quantite:</label>
    <input type="text" class="form-control" value="${voiture.quantite}" disabled>
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">prix d'achat:</label>
    <input type="text" class="form-control" value="${voiture.prixAchat}" disabled>
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Date d'achat:</label>
    <input type="text" class="form-control" value="${voiture.dateAchat}" disabled>
  </div>
</div>
</div>
<script src="js/bootstrap.bundle.min.js"></script>
</body>
</html>