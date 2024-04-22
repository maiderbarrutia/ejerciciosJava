package listaContactos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContactsAgenda {
	private List<Contact> contacts;
	private DatabaseConnection dbConnection;
	
	public ContactsAgenda(DatabaseConnection dbConnection) {
        this.contacts = new ArrayList<>();
        this.dbConnection = dbConnection;
    }

    public void addContact(Contact contact) {
        // Agregar el contacto a la lista
        contacts.add(contact);
        
        // Agregar el contacto a la base de datos
        try {
            dbConnection.insertContact(contact);
        } catch (SQLException e) {
            System.out.println("Error al agregar contacto a la base de datos: " + e.getMessage());
        }
    }
    
    public void updateContact(Contact contact) {
        // Actualizar el contacto en la lista
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getId() == contact.getId()) {
                contacts.set(i, contact);
                break;
            }
        }
        try {
            dbConnection.updateContact(contact); // Actualizar el contacto en la base de datos
        } catch (SQLException e) {
            // Manejar la excepción apropiadamente
            e.printStackTrace();
        }
    }
    
    public void deleteContact(int contactId) {
        // Eliminar el contacto de la lista
        Contact contactToRemove = null;
        for (Contact contact : contacts) {
            if (contact.getId() == contactId) {
                contactToRemove = contact;
                break;
            }
        }
        if (contactToRemove != null) {
            contacts.remove(contactToRemove);
            try {
                dbConnection.deleteContact(contactId); // Eliminar el contacto de la base de datos
            } catch (SQLException e) {
                // Manejar la excepción apropiadamente
                e.printStackTrace();
            }
        }
    }
    
 // Método para obtener un contacto por su ID
    public Contact getContactById(int contactId) {
        for (Contact contact : contacts) {
            if (contact.getId() == contactId) {
                return contact;
            }
        }
        return null; // Si no se encuentra el contacto con el ID especificado
    }


    public List<Contact> getContacts() {
        return contacts;
    }
}
