package ejEnVivo_persistenciaBBDD;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ConnectDBXampp {
	private final String HOST;
	private final String USER;
	private final String PASSWORD;
	
	public ConnectDBXampp() {
		this.HOST = "jdbc:mysql://localhost:3311/"; //Conectarse a xampp
		this.USER = "root";
		this.PASSWORD = "";
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
		
		//Usar la base de datos
		comandoSQL = "USE vt_m03b;";
		sentencia.executeUpdate(comandoSQL);
		
		//Crear tabla alumnos
		comandoSQL = "CREATE TABLE Alumnos(id_alumno INT AUTO_INCREMENT PRIMARY KEY, " +
		"nombre VARCHAR(50) NOT NULL);";
		sentencia.executeUpdate(comandoSQL);
		
		//Añadir valores a la tabla
		List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Juan"));
        alumnos.add(new Alumno("María"));
        alumnos.add(new Alumno("Pedro"));
        alumnos.add(new Alumno("Pepe"));
        
//		comandoSQL = "INSERT INTO Alumnos(nombre) VALUES (\"Diego\"), (\"Andrea\"), (\"Sonia\"), (\"Luis\");";

        for (Alumno alumno : alumnos) {
            comandoSQL = "INSERT INTO Alumnos (nombre) VALUES ('" + alumno.getName() + "')";
            sentencia.executeUpdate(comandoSQL);
        }
        
		//Mostrar la lista de Alumnos
		comandoSQL = "SELECT * FROM Alumnos";
		ResultSet result = sentencia.executeQuery(comandoSQL);
		
		List<Alumno> alumnoList = new ArrayList<>();
		while(result.next()) { //Mientras haya elementos en el objeto result...
			Alumno alumno = new Alumno(result.getLong("id_alumno"), result.getString("nombre"));
			alumnoList.add(alumno);
		}
		
		
		sentencia.close();
		connect.close();
		
		for(Alumno alumno: alumnoList) {
			System.out.println(alumno.toString());
		}
		
	}
	
}
