<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="txt/html">
<title>Liste des clients</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/main.css">
</head>
<body class="bg-body-secondary">
<%@include file="header.jsp" %>
<div class="container rounded mt-5 bg-white p-3">
<h2 class="text-info m-0 mb-4">Liste des clients</h2>
<div class="d-flex justify-content-between align-items-center mb-3">
	<form action="afficheClients.php" method="get" class="d-flex align-items-center column-gap-3">
			<input name="motCle" type="text" placeholder="recherche par cin" value="${client.motCle}"/>
			<button class="btn btn-primary" type="submit">chercher</button>
</form>
<a href="ajouterClient.jsp" class="btn btn-success">Ajouter un Client</a>
</div>
    <table class="table table-stiped table-bordered border-primary table-striped table-hover">
  <thead>
    <tr>
      <th scope="col">Id:</th>
      <th scope="col">cin:</th>
      <th scope="col">nom:</th>
      <th scope="col">prenom:</th>
      <th scope="col">adresse:</th>
      <th scope="col">telephone:</th>
      <th scope="col">action</th>
    </tr>
  </thead>
  <tbody class="table-group-divider">
  		<c:forEach items="${client.clients}" var="c">
    	<tr>
    	<th>${c.id}</th>
    	<td>${c.cin}</td>
    	<td>${c.nom}</td>
    	<td>${c.prenom}</td>
    	<td>${c.adresse}</td>
    	<td>${c.telephone}</td>
    	<td>
    		<a class="p-1 fs-6 btn btn-danger"  href="supprimerClient.php?id=${c.id}">supprimer</a>
    		<a class="p-1 fs-6 btn btn-warning"  href="modifierClient.php?id=${c.id}">modifier</a>
    	</td>
    	</tr>
    	</c:forEach>
  </tbody>
</table>
</div>
<script src="js/bootstrap.bundle.min.js"></script>
</body>
</html>