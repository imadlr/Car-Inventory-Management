<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/main.css">
<meta charset="UTF-8">
<title>Modifier un client</title>
</head>
<body class="bg-body-secondary">
<%@include file="header.jsp" %>
<div class="container container rounded mt-5 bg-white p-3">
    <h2 class="text-info m-0 mb-4">Modifier un client</h2>
     <form class="row" action="modifierClientSave.php" method="post">
    <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">ID:</label>
    <input type="text" class="form-control" disabled value="${client.id}">
    <input type="hidden" class="form-control" name="id" value="${client.id}">
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Cin:</label>
    <input type="text" class="form-control" name="cin" value="${client.cin}">
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Nom:</label>
    <input type="text" class="form-control" name="nom" value="${client.nom}">
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Prenom</label>
    <input type="text" class="form-control" name="prenom" value="${client.prenom}">
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Adresse:</label>
    <input type="text" class="form-control" name="adresse" value="${client.adresse}">
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Telephone:</label>
    <input type="text" class="form-control" name="telephone" value="${client.telephone}">
  </div>
  <button type="submit" class="btn btn-primary">modifier</button>
</form>
</div>
</body>
</html>