package ejEnVivo_persistenciaBBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConnectBDMysql {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver"; // Driver JDBC
    private static final String HOST = "jdbc:mysql://localhost:3306/"; // Dirección de la base de datos MySQL
    private static final String USER = "root"; // Usuario de la base de datos MySQL
    private static final String PASSWORD = "maiWebDevelop23"; // Contraseña de la base de datos MySQL

    public void connectToDB() throws SQLException {
        Connection connect = conexionBBDD();
        System.out.println("Conexión establecida con éxito.");
        
        // Borrar el usuario
        dropUser(connect, "alumno");

        // Crear un nuevo usuario
        createUser(connect, "alumno", "user123");

        // Otorgar privilegios al usuario
        grantPrivileges(connect, "alumno");


        // Borrar la base de datos
        dropDatabase(connect, "persistenciaBD");

        // Crear una nueva base de datos
        createDatabase(connect, "persistenciaBD");
        
     // Borrar la tabla Alumno
//        dropTablaAlumno(connect);
        
     // Crear tabla Alumno si no existe
        crearTablaAlumno(connect, "persistenciaBD");
        
     // Agregar lista de alumnos
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Juan"));
        alumnos.add(new Alumno("María"));
        alumnos.add(new Alumno("Pedro"));
        agregarListaAlumnos(connect, "persistenciaBD", alumnos);
        
        //Mostrar la lista de alumnos
        mostrarListaAlumnos(connect, "persistenciaBD");


        System.out.println("Proceso completado con éxito.");

        connect.close();
    }

    private Connection conexionBBDD() throws SQLException {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(HOST, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("Error al cargar el controlador JDBC", e);
        }
    }

    private void createUser(Connection connect, String username, String password) throws SQLException {
        Statement statement = connect.createStatement();
        String createUserSQL = "CREATE USER '" + username + "'@'localhost' IDENTIFIED BY '" + password + "'";
        statement.executeUpdate(createUserSQL);
        System.out.println("Usuario '" + username + "' creado correctamente.");
        statement.close();
    }

    private void grantPrivileges(Connection connect, String username) throws SQLException {
        Statement statement = connect.createStatement();
        String grantSQL = "GRANT ALL PRIVILEGES ON *.* TO '" + username + "'@'localhost'";
        statement.executeUpdate(grantSQL);
        System.out.println("Privilegios otorgados correctamente al usuario '" + username + "'.");
        statement.close();
    }

    private void dropUser(Connection connect, String username) throws SQLException {
        Statement statement = connect.createStatement();
        String dropUserSQL = "DROP USER '" + username + "'@'localhost'";
        statement.executeUpdate(dropUserSQL);
        System.out.println("Usuario '" + username + "' eliminado correctamente.");
        statement.close();
    }

    private void createDatabase(Connection connect, String dbName) throws SQLException {
        Statement statement = connect.createStatement();
        String createDatabaseSQL = "CREATE DATABASE " + dbName;
        statement.executeUpdate(createDatabaseSQL);
        System.out.println("Base de datos '" + dbName + "' creada correctamente.");
        statement.close();
    }

    private void dropDatabase(Connection connect, String dbName) throws SQLException {
        Statement statement = connect.createStatement();
        String dropDatabaseSQL = "DROP DATABASE IF EXISTS " + dbName;
        statement.executeUpdate(dropDatabaseSQL);
        System.out.println("Base de datos '" + dbName + "' eliminada correctamente.");
        statement.close();
    }
    
    private void dropTablaAlumno(Connection connect) throws SQLException {
        Statement statement = connect.createStatement();
        String dropTableSQL = "DROP TABLE IF EXISTS Alumno";
        statement.executeUpdate(dropTableSQL);
        System.out.println("Tabla 'Alumno' eliminada correctamente.");
        statement.close();
    }
    
    private void crearTablaAlumno(Connection connect, String dbName) throws SQLException {
        Statement statement = connect.createStatement();
        String createTableSQL = "CREATE TABLE IF NOT EXISTS " + dbName + ".Alumno (" +
                                "id INT AUTO_INCREMENT PRIMARY KEY," +
                                "nombre VARCHAR(255) NOT NULL)";
        statement.executeUpdate(createTableSQL);
        System.out.println("Tabla 'Alumno' en la base de datos '" + dbName + "' creada correctamente.");
        statement.close();
    }
    
    private void agregarListaAlumnos(Connection connect, String dbName, List<Alumno> alumnos) throws SQLException {
        Statement statement = connect.createStatement();
        for (Alumno alumno : alumnos) {
            String insertSQL = "INSERT INTO " + dbName + ".Alumno (nombre) VALUES ('" + alumno.getName() + "')";
            statement.executeUpdate(insertSQL);
        }
        System.out.println("Lista de alumnos agregada correctamente.");
        statement.close();
    }
    
    private void mostrarListaAlumnos(Connection connect, String dbName) throws SQLException {
        Statement statement = connect.createStatement();
        String selectSQL = "SELECT * FROM " + dbName + ".Alumno";
        ResultSet resultSet = statement.executeQuery(selectSQL);

        System.out.println("Lista de alumnos:");
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String nombre = resultSet.getString("nombre");
            System.out.println("ID: " + id + ", Nombre: " + nombre);
        }

        resultSet.close();
        statement.close();
    }



}

