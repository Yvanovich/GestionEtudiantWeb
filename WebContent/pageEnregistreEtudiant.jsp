<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enregistrer Etudiant</title>
</head>
<body>

	<%@ include file="menu.jsp" %>


<h1> Formulaire Enregistrer Un Etudiant</h1>

<form method="post" action="EnregistrerEtudiantServlet">
	<fieldset>
	<legend>Remplir les champs et cliquer sur le bouton envoyer</legend>
	Nom:							<input type = "text" name="nom"/><br/> <br/>
	Prenom:							<input type = "text" name="prenom"/><br/> <br/>
	Email:							<input type = "text" name="email"/><br/> <br/>
	Telephone:						<input type = "text" name="telephone"/><br/> <br/>
	Addresse:					<textarea rows=2 cols=20 name="addresse"></textarea><br/> <br/>
	<input type = "submit" value="Enregistrer" name="enregistrer"/>
	</fieldset>
	</form>



</body>
</html>