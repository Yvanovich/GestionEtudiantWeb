<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="menu.jsp" %>


<h1>Liste Des Etudiants</h1>

<table>
<tr>
<th>Numero</th>
<th>Nom</th>
<th>Prenom</th>
<th>Email</th>
<th>Telephone</th>
<th>Addresse</th>
</tr>

<%

java.util.List<com.objis.universite.domaine.Etudiant> listEtudiant
= (java.util.List<com.objis.universite.domaine.Etudiant>) 
 session.getAttribute("listEtudiant");

//affichage de la liste des etudiants

for(com.objis.universite.domaine.Etudiant etudiant: listEtudiant){
	out.println("<tr><td>"+ etudiant.getIdEtudiant() +
			"</td><td>"+ etudiant.getNom()+"</td><td>"+etudiant.getPrenom()+
			"</td><td>"+ etudiant.getEmail()+"</td><td>"+etudiant.getTelephone()+
			"</td><td>"+ etudiant.getAdresse()+"</td></tr>");
	
}

%>


<tr>
<td>0</td>
<td>test</td>
<td>test</td>
<td>test</td>
<td>test</td>
<td>test</td>
</tr>
</table>
</body>
</html>