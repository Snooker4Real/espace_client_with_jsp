<%--
  Created by IntelliJ IDEA.
  User: cindanojonathan
  Date: 11/08/2021
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Espace Client</title>
</head>
<body>
<h1>Espace Client - Connexion</h1>

<form action="connexion" method="post">
    <input type="text" name="mail" placeHolder="Email"><br>
    <input type="password" name="mdp" placeHolder="Mot de Passe"><br>
    <input type="submit" value="Connexion">
</form>


</body>
</html>
