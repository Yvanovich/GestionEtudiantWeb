package com.objis.universite.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMYSQL {

	// Information d'accès à la base de données
	public static String url = "jdbc:mysql://localhost/gestionetudiant";
	public static String login = "yvan";
	public static String passwd = "yvan";
	public static Connection connection;
	
	/**
	 * Methode connection
	 * Ne prend rien en parametre
	 * @return Connection
	 */
 public static Connection getInstance() {
		
		if (connection == null) {
			
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				// Etape 1 : récupération de la connexion
			  connection = DriverManager.getConnection(url, login, passwd);
		
			}catch (SQLException e) {
				
				System.out.println("Probleme de connection");
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return connection;
	}
}
