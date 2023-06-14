<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="txt/html">
<title>Liste des voitures disponibles</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/main.css">
</head>
<body class="bg-body-secondary">
<%@include file="header.jsp" %>
<div class="container rounded mt-5 bg-white p-3">
<h2 class="text-info m-0 mb-4">Liste des voitures</h2>
<div class="d-flex justify-content-between align-items-center mb-3">
  <form action="afficheVoitures.php" method="get" class="d-flex align-items-center column-gap-3">
			<input name="motCle" type="text" placeholder="recherche par marque" value="${voiture.motCle}"/>
			<button class="btn btn-primary" type="submit">chercher</button>
</form>
 <a href="ajouterVoiture.jsp" class="btn btn-success">Ajouter une Voiture</a>
</div>
    <table class="table table-stiped table-bordered border-primary table-striped table-hover">
  <thead>
    <tr>
      <th scope="col">Id:</th>
      <th scope="col">marque:</th>
      <th scope="col">modele</th>
      <th scope="col">couleur</th>
      <th scope="col">matricule</th>
      <th scope="col">quantite</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody class="table-group-divider">
    <c:forEach items="${voiture.voitures}" var="v">
    	<tr>
    	<th>${v.id}</th>
    	<td>${v.marque}</td>
    	<td>${v.modele}</td>
    	<td>${v.couleur}</td>
    	<td>${v.matricule}</td>
    	<td>${v.quantite}</td>
    	<td>
    		<a class="p-1 fs-6 btn btn-danger"  href="supprimerVoiture.php?id=${v.id}">supprimer</a>
    		<a class="p-1 fs-6 btn btn-warning"  href="modifierVoiture.php?id=${v.id}">modifier</a>
    	</td>
    	</tr>
    </c:forEach>
  </tbody>
</table>
</div>
<script src="js/bootstrap.bundle.min.js"></script>
</body>
</html>