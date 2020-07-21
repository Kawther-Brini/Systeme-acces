/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itgate.detection_rec.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.itgate.detection_rec.db.Connexion;
import com.itgate.detection_rec.model.Etudiant;

/**
 *
 * @author TOSHIBA
 */
public class EtudiantImpl implements IEtudiant {

	Statement statement;

	@Override
	public void addEtudiant(Etudiant e) {
		try {
			statement = Connexion.getConnection().createStatement();
			String query = "INSERT INTO `Etudiant`(`nom`, `prenom`, `image`, `code`) VALUES ('"
					+ e.getNom()
					+ "','"
					+ e.getPrenom()
					+ "','"
					+ e.getImg()
					+ "'," + e.getCode() + ")";
			statement.executeUpdate(query);

		} catch (SQLException ex) {
			Logger.getLogger(EtudiantImpl.class.getName()).log(Level.SEVERE,
					null, ex);
		}
	}

	@Override
	public void removeEtudiant(Etudiant e) {
		try {
			statement = Connexion.getConnection().createStatement();
			String query = "DELETE FROM etudiant WHERE id=" + e.getId() + ";";
			System.out.println(" " + query);
			statement.executeUpdate(query);

		} catch (SQLException ex) {
			Logger.getLogger(EtudiantImpl.class.getName()).log(Level.SEVERE,
					null, ex);
		}
	}

	@Override
	public Etudiant getEtudiantById(int id) {
		try {
			statement = Connexion.getConnection().createStatement();
			String query = "Select * from etudiant Where id=" + id + ";";
			Etudiant etudiant = new Etudiant();
			System.out.println(query);
			ResultSet rs = statement.executeQuery(query);
			while (rs.next()) {
				etudiant.setNom(rs.getString("nom"));
				etudiant.setPrenom(rs.getString("prenom"));
				etudiant.setImg(rs.getString("image"));
				etudiant.setCode(rs.getString("code"));

			}
			return etudiant;
		} catch (SQLException ex) {
			Logger.getLogger(EtudiantImpl.class.getName()).log(Level.SEVERE,
					null, ex);
		}
		return null;
	}

	@Override
	public List<Etudiant> getAllEtudiant() {

		try {
			statement = Connexion.getConnection().createStatement();
			List<Etudiant> listEtudiant = new ArrayList<Etudiant>();

			String query = "Select * from Etudiant;";
			ResultSet rs = statement.executeQuery(query);
			while (rs.next()) {
				Etudiant etudiant = new Etudiant(rs.getString("nom"),
						rs.getString("prenom"), rs.getString("image"),
						rs.getString("code"));
				listEtudiant.add(etudiant);
			}

			return listEtudiant;
		} catch (SQLException ex) {
			Logger.getLogger(EtudiantImpl.class.getName()).log(Level.SEVERE,
					null, ex);
		}
		return null;
	}

	@Override
	public Etudiant getEtudiantByCode(String code) {
		try {
			statement = Connexion.getConnection().createStatement();
			String query = "Select * from etudiant Where code='" + code + "';";
			Etudiant etudiant = new Etudiant();
			System.out.println(query);
			ResultSet rs = statement.executeQuery(query);
			while (rs.next()) {
				etudiant.setNom(rs.getString("nom"));
				etudiant.setPrenom(rs.getString("prenom"));
				etudiant.setImg(rs.getString("image"));
				etudiant.setCode(rs.getString("code"));

			}
			return etudiant;
		} catch (SQLException ex) {
			Logger.getLogger(EtudiantImpl.class.getName()).log(Level.SEVERE,
					null, ex);
		}
		return null;
	}
}