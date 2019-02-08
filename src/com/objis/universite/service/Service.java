package com.objis.universite.service;

import java.util.List;

import javax.persistence.EntityManager;

import com.objis.universite.dao.Dao;
import com.objis.universite.dao.IDao;
import com.objis.universite.domaine.Etudiant;

public class Service implements Iservice {

	private IDao dao;

	public Service() {
		
		 this.dao =new Dao();
		
	}

	
	public Service(EntityManager em) {
		
		 this.dao =new Dao(em);
		
	}
	
	@Override
	public int enregistreEtudiantService(Etudiant etudiant) {
		// TODO Auto-generated method stub
		return dao.enregistreEtudiantDao(etudiant);
	}

	@Override
	public List<Etudiant> getAllEtudiantService() {
		// TODO Auto-generated method stub
		return dao.getAllEtudiants();
	}

}
