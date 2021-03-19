package com.bdd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDDConnect {
	private Connection conn;
	public BDDConnect() {
		try {
			initConnect();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void initConnect() throws ClassNotFoundException {

        //STEP 3: Open a connection
        System.out.println("Connecting to a selected database...");
        try {
			setConn(DriverManager.getConnection(
			        "jdbc:mariadb://localhost/maven", "root", "root"));
			System.out.println("Connected database successfully...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		
	}

	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}

}
