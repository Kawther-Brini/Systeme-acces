package com.itgate.detection_rec.dao;

import java.util.List;

import com.itgate.detection_rec.model.Etudiant;

public interface IEtudiant {

	public void addEtudiant(Etudiant e);

	public void removeEtudiant(Etudiant e);

	public Etudiant getEtudiantById(int id);

	public Etudiant getEtudiantByCode(String code);

	public List<Etudiant> getAllEtudiant();

}
