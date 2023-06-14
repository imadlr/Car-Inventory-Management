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
<h2 class="text-info m-0 mb-4">Client Ajouté</h2>
    <div class="row">
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">ID:</label>
    <input type="text" class="form-control" value="${client.id}" disabled>
  </div>
   <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Cin:</label>
    <input type="text" class="form-control" value="${client.cin}" disabled>
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Nom:</label>
    <input type="text" class="form-control" value="${client.nom}" disabled>
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Prenom</label>
    <input type="text" class="form-control" value="${client.prenom}" disabled>
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Adresse:</label>
    <input type="text" class="form-control" value="${client.adresse}" disabled>
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Telephone:</label>
    <input type="text" class="form-control" value="${client.telephone}" disabled>
  </div>
</div>
</div>
<script src="js/bootstrap.bundle.min.js"></script>
</body>
</html>