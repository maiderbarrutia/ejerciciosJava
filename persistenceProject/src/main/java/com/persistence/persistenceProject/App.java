package com.persistence.persistenceProject;

import java.sql.*;

public class App {

    // Configuración de la conexión a la base de datos
    private static final String DDBB_URL = "jdbc:mysql://localhost:3306/pruebajpa";
    private static final String DDBB_USUARIO = "root";
    private static final String DDBB_CONTRASEÑA = "maiWebDevelop23";

    public static void main(String[] args) {
        Connection conexion = null;

        try {
            // Establecer conexión a la base de datos
            conexion = DriverManager.getConnection(DDBB_URL, DDBB_USUARIO, DDBB_CONTRASEÑA);

            // Crear la tabla "libros" si no existe
            crearTablaLibros(conexion);

            // Agregar un libro
            agregarLibro(conexion, "Libro4", "George Orwell", 1987);
            
         // Borrar un libro (Ejemplo: Borrar el libro con ID 1)
            //borrarLibro(conexion, "Libro4");

            // Mostrar la lista de libros
            mostrarLibros(conexion);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión a la base de datos
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void crearTablaLibros(Connection conexion) throws SQLException {
        String consulta = "CREATE TABLE IF NOT EXISTS libros (" +
                "id INT AUTO_INCREMENT PRIMARY KEY," +
                "titulo VARCHAR(255) NOT NULL," +
                "autor VARCHAR(255) NOT NULL," +
                "fecha INT NOT NULL)";

        try (Statement statement = conexion.createStatement()) {
            statement.execute(consulta);
        }
    }

    private static void agregarLibro(Connection conexion, String titulo, String autor, int fecha) throws SQLException {
    	if (existeLibro(conexion, titulo)) {
            System.out.println("El libro con título '" + titulo + "', autor '" + autor + "' y fecha '" + fecha + "' ya existe. No se agregará.");
            return;
        }
    	
    	String consulta = "INSERT INTO libros (titulo, autor, fecha) VALUES (?, ?, ?)";

        try (PreparedStatement preparedStatement = conexion.prepareStatement(consulta)) {
            preparedStatement.setString(1, titulo);
            preparedStatement.setString(2, autor);
            preparedStatement.setInt(3, fecha);

            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Libro agregado correctamente.");
            } else {
                System.out.println("Error al agregar el libro.");
            }
        }
    }
    
//    private static boolean existeLibro(Connection conexion, String titulo, String autor, int fecha) throws SQLException {
//        String consulta = "SELECT COUNT(*) AS total FROM libros WHERE titulo = ? AND autor = ? AND fecha = ?";
//
//        try (PreparedStatement preparedStatement = conexion.prepareStatement(consulta)) {
//            preparedStatement.setString(1, titulo);
//            preparedStatement.setString(2, autor);
//            preparedStatement.setInt(3, fecha);
//
//            try (ResultSet resultSet = preparedStatement.executeQuery()) {
//                resultSet.next();
//                int total = resultSet.getInt("total");
//                return total > 0;
//            }
//        }
//    }
    private static boolean existeLibro(Connection conexion, String titulo) throws SQLException {
        String consulta = "SELECT COUNT(*) AS total FROM libros WHERE titulo = ?";

        try (PreparedStatement preparedStatement = conexion.prepareStatement(consulta)) {

            preparedStatement.setString(1, titulo);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                resultSet.next();
                int total = resultSet.getInt("total");
                return total > 0;
            }
        }
    }

    private static void mostrarLibros(Connection conexion) throws SQLException {
        String consulta = "SELECT id, titulo, autor, fecha FROM libros";

        try (Statement statement = conexion.createStatement();
             ResultSet resultSet = statement.executeQuery(consulta)) {

            System.out.println("Lista de Libros:");
            System.out.println("ID\tTítulo\tAutor\tFecha");

            /*while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String titulo = resultSet.getString("titulo");
                String autor = resultSet.getString("autor");
                int fecha = resultSet.getInt("fecha");

                System.out.println(id + "\t" + titulo + "\t" + autor + "\t" + fecha);
            }*/
            
            for (; resultSet.next(); ) {
                int id = resultSet.getInt("id");
                String titulo = resultSet.getString("titulo");
                String autor = resultSet.getString("autor");
                int fecha = resultSet.getInt("fecha");

                System.out.println(id + "\t" + titulo + "\t" + autor + "\t" + fecha);
            }
            
        }
    }
    
    /*private static void borrarLibro(Connection conexion, int idLibro) throws SQLException {
        String consulta = "DELETE FROM libros WHERE id = ?";

        try (PreparedStatement preparedStatement = conexion.prepareStatement(consulta)) {
            preparedStatement.setInt(1, idLibro);

            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Libro con ID " + idLibro + " borrado correctamente.");
            } else {
                System.out.println("No se encontró ningún libro con ID " + idLibro + ".");
            }
        }
    }*/
    
    private static void borrarLibro(Connection conexion, String tituloLibro) throws SQLException {
        String consulta = "DELETE FROM libros WHERE titulo = ?";

        try (PreparedStatement preparedStatement = conexion.prepareStatement(consulta)) {
            preparedStatement.setString(1, tituloLibro);

            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Libro con ID " + tituloLibro + " borrado correctamente.");
            } else {
                System.out.println("No se encontró ningún libro con ID " + tituloLibro + ".");
            }
        }
    }
    
    
    
}
