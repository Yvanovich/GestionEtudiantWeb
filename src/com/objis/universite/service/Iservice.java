package com.objis.universite.service;

import java.util.List;

import com.objis.universite.domaine.Etudiant;

public interface Iservice {
	public int enregistreEtudiantService(Etudiant etudiant);
	public List<Etudiant> getAllEtudiantService();

}
