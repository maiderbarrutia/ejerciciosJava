package ejEnVivo_persistenciaBBDD;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class ConnectDBXampp {
	private final String HOST;
	private final String USER;
	private final String PASSWORD;
	
	public ConnectDBXampp() {
		this.HOST = "jdbc:mysql://localhost:3306/"; //Conectarse a xampp
//		this.HOST = "jdbc:oracle:thin:@localhost:1521:xe"; //Conectarse a oracle
		this.USER = "MySQL80";
		this.PASSWORD = "maiWebDevelop23 ";
	}
	

	
	public void connectToDB() throws SQLException{
		
		//VERSIÓN MYSQL:
		
		Connection connect = DriverManager.getConnection(HOST, USER, PASSWORD);
		Statement sentencia = connect.createStatement(); //Permite lanzar consultas a la base de datos
		
		//Borrar la base de datos
		String comandoSQL = "DROP DATABASE IF EXISTS vt_m03b";
		sentencia.executeUpdate(comandoSQL); // Si va a modificar la base de datos utilizar executeUpdate //Si no va a modificar la base de datos pero es una consulta utilizar executeQuery
	
		//Crear la base de datos
		comandoSQL = "CREATE DATABASE IF NOT EXISTS vt_m03b";
		sentencia.executeUpdate(comandoSQL);
		
		sentencia.close();
		connect.close();
		
		
		
	}
	
}
