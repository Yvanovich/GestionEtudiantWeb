package com.objis.universite.presentation.servlets;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class ListEtudiantServlet
 */
@WebServlet("/ListEtudiantServlet")
public class ListEtudiantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListEtudiantServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	
		 // Obtain a database connection:
        EntityManagerFactory emf =
           (EntityManagerFactory)getServletContext().getAttribute("emf");
        EntityManager em = emf.createEntityManager();

		//recuperation de a liste d'etudant enregistre en bd
		Iservice service = new Service(em);
		List<Etudiant>listEtudiant;
		listEtudiant = service.getAllEtudiantService();
		
		//enregistrement de la liste dans la session
		
		HttpSession session = request.getSession();
		
		session.setAttribute("listEtudiant", listEtudiant);
		
		request.getRequestDispatcher("pageListeEtudiant.jsp")
		.forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
