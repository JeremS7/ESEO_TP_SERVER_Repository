package com.bdd;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BDDActions {
	
	private Connection conn;
	
	public BDDActions(Connection conn) {
		this.conn = conn;
	}
	
	public String FetchCities() {
		Statement st;
		StringBuilder listCities = new StringBuilder();
		try {
			st = conn.createStatement();
			String query = "SELECT * FROM ville_france";
			ResultSet rs = st.executeQuery(query);
		      while (rs.next())
		      {
		        String nomCommune = rs.getString("Nom_commune");
		        String codePostal = rs.getString("Code_postal");
		        listCities.append(String.format("%s-%s</br>", nomCommune,codePostal));
		     
		      }
		      st.close();
		      return listCities.toString();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		

	}

}
