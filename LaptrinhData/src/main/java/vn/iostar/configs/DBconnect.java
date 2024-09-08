package vn.iostar.configs;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnect {
	
	static String URL = "jdbc:sqlserver://localhost\\MSSQLSERVER;databaseName=LaptrinhWeb";
	static String user = "thuc";
	static String pass = "1";
	static Connection conn ; 
	public static Connection getConnection() throws IOException {
		 conn = null ;
		try {
	            conn = DriverManager.getConnection(URL,user,pass);
	            if (conn != null) {
	                DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
	                System.out.println("Driver name: " + dm.getDriverName());
	                System.out.println("Driver version: " + dm.getDriverVersion());
	                System.out.println("Product name: " + dm.getDatabaseProductName());
	                System.out.println("Product version: " + dm.getDatabaseProductVersion());
	            }
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	        }
		return (conn); 
	}
	 public static void main(String[] args) {
	        try {
	            Connection c = getConnection();
	            if (c == null ) 
	            {
	            	System.out.print("something wrong ");
	            }
	            else 
	            {
	            	System.out.print("ok");
	            }
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        } 
	        
	    }
	
}


