package com.objis.universite.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Etudiant {
	
	//attributs
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idEtudiant;
	
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private String adresse;
	
	//constructeurs

	public Etudiant() {
		// TODO Auto-generated constructor stub
	}
	
	public Etudiant(String nom, String prenom, String email, String telephone, String adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.adresse = adresse;
	}
	
	
	public Etudiant(int idEtudiant, String nom, String prenom, String email, String telephone, String adresse) {
		super();
		this.idEtudiant = idEtudiant;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.adresse = adresse;
	}


	//getters & setters
	
	public int getIdEtudiant() {
		return idEtudiant;
	}
	public void setIdEtudiant(int idEtudiant) {
		this.idEtudiant = idEtudiant;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Etudiant [idEtudiant=" + idEtudiant + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email
				+ ", telephone=" + telephone + ", adresse=" + adresse + "]";
	}
	
	

}