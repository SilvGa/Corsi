package it.polito.tdp.corsi.db;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConnectDB {
	private static final String jdbcURL ="jdbc:mysql://localhost/iscritticorsi?user=root&password=Pass4cas0";

	public static Connection conn;
	
	public static Connection getConnection() {
		try {
			if(conn==null||conn.isClosed()) {
				conn=DriverManager.getConnection(jdbcURL);
			}
		}catch(SQLException e) {
			System.err.println("Errore di connessione al DB");
			throw new RuntimeException(e);
		}
		
		return conn;
	}
}
