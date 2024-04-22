package listaContactos;

import java.sql.*;

public class DatabaseConnection {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USERNAME = "agendaUser";
    private static final String PASSWORD = "user123";
    private Connection connection;

    public DatabaseConnection() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Conexión establecida con la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    public void insertContact(Contact contact) throws SQLException {
        String sql = "INSERT INTO contacts (name, phone) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, contact.getName());
            statement.setString(2, contact.getPhone());
            statement.executeUpdate();
        }
    }
    
    public void updateContact(Contact contact) throws SQLException {
        String sql = "UPDATE contacts SET name = ?, phone = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, contact.getName());
            statement.setString(2, contact.getPhone());
            statement.setInt(3, contact.getId());
            statement.executeUpdate();
        }
    }
    
    public void deleteContact(int contactId) throws SQLException {
        String sql = "DELETE FROM contacts WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, contactId);
            statement.executeUpdate();
        }
    }

    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexión cerrada.");
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}
