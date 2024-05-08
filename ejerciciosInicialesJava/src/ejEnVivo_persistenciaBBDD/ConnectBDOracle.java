package ejEnVivo_persistenciaBBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConnectBDOracle {
    private static final String HOST = "jdbc:oracle:thin:@localhost:1521:xe"; // Dirección de la base de datos Oracle
//    private static final String USER = "alumno"; // Usuario de la base de datos Oracle
//    private static final String PASSWORD = "user123"; // Contraseña de la base de datos Oracle
    
    private static final String USER = "system"; // Usuario root de la base de datos Oracle
    private static final String PASSWORD = "maiWebDevelop23"; // Contraseña de usuario root de la base de datos Oracle

    public void connectToDB() throws SQLException {
        Connection connect = conexionBBDD();
        System.out.println("Conexión establecida con éxito.");
        
        String baseDatos = "persistenciaBD";
        String usuarioNuevo = "alumno5";
        
        //EN ORACLE NO SE PUEDE CREAR Y BORRAR LA BASE DE DATOS EN SI, SE CREA Y SE BORRA EL USUARIO
        
        //Borrar usuario
        borrarUsuario(connect, usuarioNuevo);

        // Crear un nuevo usuario
        createUser(connect, usuarioNuevo, "user123");
        

        // Otorgar privilegios al usuario
        grantPrivileges(connect, usuarioNuevo);
        
        //Cambiar el usuario que contiene la base de datos elegida
//        cambiarSchema(connect, usuarioNuevo);


        // Crear tabla Alumno si no existe
//        crearTablaAlumno(connect, usuarioNuevo);

        // Agregar lista de alumnos
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Juan"));
        alumnos.add(new Alumno("María"));
        alumnos.add(new Alumno("Pedro"));
//        agregarListaAlumnos(connect, usuarioNuevo, alumnos);

        // Mostrar la lista de alumnos
//        mostrarListaAlumnos(connect, usuarioNuevo);

        System.out.println("Proceso completado con éxito.");

        connect.close();
    }

    private Connection conexionBBDD() throws SQLException {
        try {
            return DriverManager.getConnection(HOST, USER, PASSWORD);
        } catch (SQLException e) {
            throw new SQLException("Error al conectar con la base de datos", e);
        }
    }
    
    private void crearTablaAlumno(Connection connect, String tableName) throws SQLException {
    	Statement statement = connect.createStatement();
        String createTableSQL = "CREATE TABLE " + tableName + " (" +
                                "id NUMBER(10) GENERATED BY DEFAULT ON NULL AS IDENTITY," +
                                "nombre VARCHAR2(255) NOT NULL)";
        statement.executeUpdate(createTableSQL);
        System.out.println("Tabla 'Alumno' en la base de datos '" + tableName + "' creada correctamente.");
        statement.close();
    }

    private void agregarListaAlumnos(Connection connect, String tableName, List<Alumno> alumnos) throws SQLException {
        Statement statement = connect.createStatement();
        for (Alumno alumno : alumnos) {
        	String insertSQL = "INSERT INTO " + tableName + " VALUES (" + alumno.getId_alumno() + ", '" + alumno.getName() + "')";
            statement.executeUpdate(insertSQL);
        }
        System.out.println("Lista de alumnos agregada correctamente.");
        statement.close();
    }
   
    private void createUser(Connection connect, String username, String password) throws SQLException {
        Statement statement = connect.createStatement();
        
        // Establecer _ORACLE_SCRIPT en true
        statement.executeUpdate("ALTER SESSION SET \"_ORACLE_SCRIPT\" = true");

        // Crear usuario
        String createUserSQL = "CREATE USER " + username + " IDENTIFIED BY " + password;
        statement.executeUpdate(createUserSQL);
        System.out.println("Usuario '" + username + "' creado correctamente.");

        statement.close();
    }
    
    private void borrarUsuario(Connection connect, String username) throws SQLException {
        Statement statement = connect.createStatement();
        
     // Establecer _ORACLE_SCRIPT en true
        statement.executeUpdate("ALTER SESSION SET \"_ORACLE_SCRIPT\" = true");
        
        String dropUserSQL = "DROP USER " + username + " CASCADE";
        statement.executeUpdate(dropUserSQL);
        System.out.println("Usuario '" + username + "' borrado correctamente.");
        statement.close();
    }



    private void grantPrivileges(Connection connect, String username) throws SQLException {
        Statement statement = connect.createStatement();
        String grantSQL = "GRANT ALL PRIVILEGES TO " + username;
        statement.executeUpdate(grantSQL);
        System.out.println("Privilegios otorgados correctamente al usuario '" + username + "'.");
        statement.close();
    }
    
    private void cambiarSchema(Connection connect, String schemaName) throws SQLException {
        Statement statement = null;
        try {
            statement = connect.createStatement();
            String alterSessionSQL = "ALTER SESSION SET CURRENT_SCHEMA = " + schemaName;
            statement.executeUpdate(alterSessionSQL);
            System.out.println("Schema cambiado a '" + schemaName + "'.");
        } finally {
            if (statement != null) {
                statement.close();
            }
        }
    }

    private void mostrarListaAlumnos(Connection connect, String tableName) throws SQLException {
        Statement statement = connect.createStatement();
        String selectSQL = "SELECT * FROM " + tableName;
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

