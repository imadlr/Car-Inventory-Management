<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="txt/html">
<title>Liste des commandes</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/main.css">
</head>
<body class="bg-body-secondary">
<%@include file="header.jsp" %>
<div class="container rounded mt-5 bg-white p-3">
<h2 class="text-info m-0 mb-4">Liste des commandes</h2>
<div class="d-flex align-items-center justify-content-between mb-3">
  <form action="afficheCommande.php" method="get" class="d-flex align-items-center column-gap-3">
			<input name="motCle" type="text" placeholder="recherche par numéro" value="${commande.motCle}"/>
			<button class="btn btn-primary" type="submit">chercher</button>
</form>
 <a href="ajouterCommande.jsp" class="btn btn-success">Ajouter une Commande</a>
</div>
    <table class="table table-stiped table-bordered border-primary table-striped table-hover">
  <thead>
    <tr>
      <th scope="col">Id:</th>
      <th scope="col">Numéro:</th>
      <th scope="col">Date:</th>
      <th scope="col">Quantité:</th>
      <th scope="col">Id_Client:</th>
      <th scope="col">Id_Voiture:</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody class="table-group-divider">
    <c:forEach items="${commande.commandes}" var="d">
    	<tr>
    	<th>${d.id}</th>
    	<td>${d.numero}</td>
    	<td>${d.date}</td>
    	<td>${d.quantite}</td>
    	<td>${d.idClient}</td>
    	<td>${d.idVoiture}</td>
    	<td>
    		<a class="p-1 fs-6 btn btn-danger"  href="supprimerCommande.php?id=${d.id}">supprimer</a>
    		<a class="p-1 fs-6 btn btn-warning"  href="modifierCommande.php?id=${d.id}">modifier</a>
    	</td>
    	</tr>
    </c:forEach>
  </tbody>
</table>
</div>
<script src="js/bootstrap.bundle.min.js"></script>
</body>
</html>