package com.itgate.detection_rec.db;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connexion {

	static String url;
	static ResultSet rs;
	static java.sql.Connection cn = null;

	private Connexion() {

		// Information d'accées base données
		String url = "jdbc:mysql://localhost/detection_rec";
		String login = "root";
		String passwd = "";

		java.sql.Statement st = null;

		try {

			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.jdbc.Driver");

			// Etape 2 : rï¿½cupï¿½ration de la connexion
			cn = DriverManager.getConnection(url, login, passwd);
			System.out.println("singleton");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null,
					ex);
		}
	}

	public static  Connection getConnection() {
		Connexion connexion = null;
		if (connexion == null) {

			connexion = new Connexion();
		}

		return cn;

	}
}
