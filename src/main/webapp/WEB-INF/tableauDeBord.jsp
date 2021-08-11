<%--
  Created by IntelliJ IDEA.
  User: cindanojonathan
  Date: 11/08/2021
  Time: 13:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Facture - Tableau de bord</title>
</head>
<body>
<p>Client connecté : client1</p>
<a href="deconnexion">Deconnexion</a>
<h1>Tableau de bord</h1>

<form action="tableauBord" method="">


<table>
    <h2>Vos factures à régler</h2>
    <tr>
        <th>Numéro</th>
        <th>Date d'échéance</th>
        <th>Montant</th>
        <th>Action</th>
    </tr>
    <tr>
        <c:forEach items="${factures}" var="facture">
            <th>${facture.id}</th>
            <th>${facture.dateEcheance}</th>
            <th>${facture.montantEnEuros}</th>
            <th><a href="RÉGLER">Régler</a></th>
        </c:forEach>
    </tr>
</table>

<table>
<h2>Vos factures réglées</h2>
<tr>
    <th>Numéro</th>
    <th>Date d'échéance</th>
    <th>Montant</th>
    <th>Action</th>
</tr>
</table>

<table>
<h2>Vos cartes bancaires</h2>
<tr>
    <th>Numéro</th>
    <th>Expiration</th>
    <th>Cryptogramme</th>
    <th>Action</th>
</tr>
</table>
</form>

</body>
</html>
