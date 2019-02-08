package com.objis.universite.presentation.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.objis.universite.dao.Dao;
import com.objis.universite.dao.IDao;
import com.objis.universite.domaine.Etudiant;
import com.objis.universite.service.Iservice;
import com.objis.universite.service.Service;

/**
 * Servlet implementation class EnregistrerEtudiantServlet
 */
@WebServlet("/EnregistrerEtudiantServlet")
public class EnregistrerEtudiantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static Iservice service;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnregistrerEtudiantServlet() {
        super();
        
      //  service = new Service();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		//declaration de variables
		String nom;
		String prenom;
		String email;
		String telephone;
		String addresse;
		
		//recuperation des parametres envoyé au formulaire
		
		nom = request.getParameter("nom");
		prenom = request.getParameter("prenom");
		email = request.getParameter("email");
		telephone = request.getParameter("telephone");
		addresse = request.getParameter("addresse");
		
		Etudiant etudiant = new Etudiant();
		//initialisation des attribut
		etudiant.setNom(nom);
		etudiant.setPrenom(prenom);
		etudiant.setEmail(email);
		etudiant.setTelephone(telephone);
		etudiant.setAdresse(addresse);

		// Obtain a database connection:
	        EntityManagerFactory emf =
	           (EntityManagerFactory)getServletContext().getAttribute("emf");
	        EntityManager em = emf.createEntityManager();
		
	//enregistrement de lobjet etudiant  via la couche service	
		
		Iservice service = new Service(em);
		service.enregistreEtudiantService(etudiant);
		
		//enregistrement de l'objet dans la session
		//HttpSession session request.getSession();
		//session.setAttribute("etudiant", etudiant);
		
		//enregistrement de l'objet dans la session
		//request.setAttribute("contact", contact);
		
		request.getRequestDispatcher("/ListEtudiantServlet").forward(request, response);

	}

}
