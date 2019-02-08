package com.objis.universite.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.objis.universite.domaine.Etudiant;

public class Dao implements IDao {

	private EntityManager em;
	
	public Dao() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Dao(EntityManager em) {
		super();
		this.em = em;
	}
	

	@Override
	public int enregistreEtudiantDao(Etudiant etudiant) {


			try {

					// 2 : Ouverture transaction 
					EntityTransaction tx =  em.getTransaction();
					tx.begin();
					
					
					
					// 4 : Persistance Objet/Relationnel : création d'un enregistrement en base
					 em.persist(etudiant);
					
					// 5 : Fermeture transaction 
					 tx.commit();

					/*// Etape 1 : récupération de la connexion
					Connection cn = ConnectionMYSQL.getInstance();


					String sql = "INSERT INTO `etudiant` (`nom`,`prenom`,`email`,`telephone`,`adresse`) "
							   + "VALUES(?,?,?,?,?)";				

						
						// Etape 2 : Création d'un statement
						PreparedStatement ps = cn.prepareStatement(sql);
						ps.setString(1, etudiant.getNom());
						ps.setString(2, etudiant.getPrenom());
						ps.setString(3, etudiant.getEmail());
						ps.setString(4, etudiant.getTelephone());
						ps.setString(5, etudiant.getAdresse());
						
						// Etape 3 : exécution requête
						ps.executeUpdate();
						
						

						// Etape 4 : gestion des exceptions et libération 'automatique' des ressources*/
					} catch (Exception e) {
						e.printStackTrace();
						return 0;
						
					}  
				
		return 1;
	}

	@Override
	public List<Etudiant> getAllEtudiants() {
		
		/*
		 * Creation d'une collection d'etudiant
		 */
		List<Etudiant> maListeEtudiant = new ArrayList<Etudiant>();
				
				try {


						// 2 : Ouverture transaction 
								EntityTransaction tx =  em.getTransaction();
								tx.begin();
								
								
								
								// 4 : obtention de la liste des eleves viaEntityManager
								maListeEtudiant = em.createQuery("from Etudiant" , Etudiant.class).getResultList();
								
							/*maListEleve = em.createQuery("from Eleve e where e.classe = :cl" , Eleve.class)
												.setParameter("cl", "td")
												.getResultList();*/
								
								// 5 : Fermeture transaction 
								 tx.commit();

					/*// Etape 1 : récupération de la connexion
					Connection cn = ConnectionMYSQL.getInstance();

					// Etape 2 : préparation requête
					Statement st = cn.createStatement();

					String sql = "SELECT * FROM etudiant ";

					// Etape 3 : exécution requête
					ResultSet rs = st.executeQuery(sql);

					// Etape 4 :parcours Resultset (optionnel)
					while (rs.next()) {
						
						
						Etudiant etud = new Etudiant();
						etud.setIdEtudiant(rs.getInt("id_etudiant"));
						etud.setNom(rs.getString("nom"));
						etud.setPrenom(rs.getString("prenom"));
						etud.setEmail(rs.getString("email"));
						etud.setTelephone(rs.getString("telephone"));
						etud.setAdresse(rs.getString("adresse"));

						//Instruction permettant d'ajouter un objet etudiant dans la liste d'etudiant
						 
						maListeEtudiant.add(etud);
						//System.out.println(rs.getString("prenom")+" "+ rs.getString("nom"));
					}
					
					// Etape 5 : gestion des exceptions et libération 'automatique' des ressources*/
				} catch (Exception e) {
					e.printStackTrace();
				} 
		// TODO Auto-generated method stub
		return maListeEtudiant;
	}

}
