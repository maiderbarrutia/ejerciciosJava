package com.persistence.persistenceProject;


//IMPORTAR LAS LIBRERÍAS QUE SE VAN A USAR
	//import java.sql.*;  //Para importar varias librerias de una misma raíz
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

public class Conexion {

	

	//DECLARAR LAS VARIABLES DONDE INTRODUCIMOS LOS DATOS DE LA BASE DE DATOS

	private static final String DRIVER = "com.mysql.jdbc.Driver"; //Driver JDBC
	private static final String BBDD ="localhost"; //Dirección de la base de datos mysql
	private static final String USUARIO = "root"; //Usuario introducido en la base de datos
	private static final String PASSWORD = "root"; //Contraseña introducida en la base de datos

	//FUNCIÓN PARA CONECTARNOS A LA BASE DE DATOS
	public Connection conexionBBDD(){
		Connection conec = null; //Controlamos las excepciones que aparecen al interactuar con la BBDD
		try {
			Class.forName(DRIVER);
				//Crear una conexión a la base de datos
				conec = DriverManager.getConnection(BBDD, USUARIO, PASSWORD);
		} catch (Exception errores) { //Control de errores de la conexión la BBDD
				System.err.println("Se ha producido un error al conectar con la base de datos.\n" + errores);
		}
		return conec;
	}

	//RECUPERACIÓN Y MANIPULACIÓN DE INFORMACIÓN
	//1- Añadir información
//	public void insertData() {
//		Connection conec = conexionBBDD();
//		if (conec != null)
//		try {
//			//Datos a insertar
//			String consultaInsercion = "INSERT INTO sorteo (fecha, num1, num2,num3, num4, num5, complementario) " +
//			"VALUES (‘25/11/2020’, ‘23’, ‘34’, ‘45’, ‘65’, ‘34’,’9’);";
//			System.out.println(consultaInsercion);
//			
//			// Creación del Statement para poder realizar las consultas.
//			Statement consulta = conec.createStatement();
//			
//			// Ejecución de la consulta
//			consulta.executeUpdate(consultaInsercion);
//			System.out.println("Datos insertados correctamente");
//			
//			// Cierre del Statement
//			consulta.close();
//		} catch (SQLException e) {
//			System.err.println("Se ha producido un error al insertar en la base de datos.\n" + e);
//		} finally {
//			//Cierre de la conexión.
//			cerrarConexion(conec);
//		}
//	}

	//2- Obtener información de la base de datos
//	public void getData() {
//		Connection conec = conexionBBDD();
//		if (conec != null)
//		try {
//			//Datos a consultar
//			String consultaSeleccion = "SELECT * FROM sorteo;";
//			System.out.println(consultaSeleccion);
//			
//			// Creación del Statement para poder realizar las consultas.
//			Statement consulta = conec.createStatement();
//			
//			// Ejecución de la consulta
//			if(consulta.execute(consultaSeleccion)){
//				ResultSet resultSet = consulta.getResultSet();
//				while(resultSet.next()){
//					Sorteo sorteo = new Sorteo
//					(resultSet.getInt("id"),
//					resultSet.getString("num1"),
//					resultSet.getString("fecha"),
//					resultSet.getString("num2"),
//					resultSet.getString("num3"),
//					resultSet.getString("num4"),
//					resultSet.getString("num5"),
//					resultSet.getString("complementario")
//					);
//					System.out.println(sorteo.toString());
//				}
//			}
//			System.out.println("Datos recuperados correctamente");
//			// Cierre del Statement
//			consulta.close();
//		} catch (SQLException e) {
//			System.err.println("Se ha producido un error al insertar en la base de datos.\n" + e);
//		} finally {
//			//Cierre de la conexión.
//			cerrarConexion(conec);
//		}
//	}

	//CERRAR CONEXIÓN
	public void cerrarConexion(Connection conection){
		try{
		//Cierre de conexión
			conection.close();
		}catch(SQLException e){
			//Controlamos excepción que se pueda producir al cierre de la conexión
			System.err.println("Se ha producido un error al conectar con la base de datos." + e);
		}
	}
}
