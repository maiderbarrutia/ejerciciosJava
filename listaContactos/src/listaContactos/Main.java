package listaContactos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Establecer la conexión a la base de datos
        DatabaseConnection dbConnection = new DatabaseConnection();
        ContactsAgenda contactsAgenda = new ContactsAgenda(dbConnection);

        // Pedir al usuario que ingrese los contactos
        System.out.println("Ingresa los contactos:");
        ingresarContactosDesdeScanner(contactsAgenda, scanner);

        // Mostrar los contactos en la agenda
        mostrarContactos(contactsAgenda);

        // Actualizar contactos según la entrada del usuario
        actualizarContactos(contactsAgenda, scanner);

        // Eliminar contactos según la entrada del usuario
        eliminarContactos(contactsAgenda, scanner);

        // Cerrar la conexión a la base de datos
        dbConnection.closeConnection();

        // Cerrar el Scanner
        scanner.close();
    }

    // Método para ingresar contactos desde el scanner
    private static void ingresarContactosDesdeScanner(ContactsAgenda contactsAgenda, Scanner scanner) {
        String respuesta;
        do {
            System.out.print("Nombre: ");
            String name = scanner.nextLine();
            System.out.print("Teléfono: ");
            String phone = scanner.nextLine();

            Contact contact = new Contact(name, phone);
            contactsAgenda.addContact(contact);

            System.out.print("¿Quieres agregar otro contacto? (Sí/No): ");
            respuesta = scanner.nextLine().toLowerCase();
        } while (respuesta.equals("sí") || respuesta.equals("si"));
    }

    // Método para mostrar los contactos en la agenda
    private static void mostrarContactos(ContactsAgenda contactsAgenda) {
        System.out.println("\nNombres de los contactos:");
        for (Contact contact : contactsAgenda.getContacts()) {
            System.out.println(contact.toString());
        }
    }

    // Método para actualizar contactos
    private static void actualizarContactos(ContactsAgenda contactsAgenda, Scanner scanner) {
        String respuesta = "sí"; // Inicializamos respuesta con un valor predeterminado
        
        do {
            System.out.print("Ingrese el ID del contacto a actualizar (0 para salir): ");
            int contactId = Integer.parseInt(scanner.nextLine());

            if (contactId == 0) {
                break; // Salir del bucle si el usuario ingresa 0
            }

            Contact contactToUpdate = contactsAgenda.getContactById(contactId);
            if (contactToUpdate != null) {
                System.out.print("Nuevo nombre: ");
                String newName = scanner.nextLine();
                System.out.print("Nuevo teléfono: ");
                String newPhone = scanner.nextLine();

                contactToUpdate.setName(newName);
                contactToUpdate.setPhone(newPhone);

                contactsAgenda.updateContact(contactToUpdate);
                System.out.println("Contacto actualizado correctamente.");
            } else {
                System.out.println("No se encontró ningún contacto con ese ID.");
            }

            System.out.print("¿Desea actualizar otro contacto? (Sí/No): ");
            respuesta = scanner.nextLine().toLowerCase();
        } while (respuesta.equals("sí") || respuesta.equals("si"));

        // Si el usuario no tiene otro contacto para actualizar, dirigirlo a eliminar contactos
        if (!respuesta.equals("sí") && !respuesta.equals("si")) {
            eliminarContactos(contactsAgenda, scanner);
        }
    }


    // Método para eliminar contactos
    private static void eliminarContactos(ContactsAgenda contactsAgenda, Scanner scanner) {
        String respuesta;
        do {
            System.out.print("Ingrese el ID del contacto a eliminar: ");
            int contactId = Integer.parseInt(scanner.nextLine());

            Contact contactToDelete = contactsAgenda.getContactById(contactId);
            if (contactToDelete != null) {
                contactsAgenda.deleteContact(contactToDelete.getId());
                System.out.println("Contacto eliminado correctamente.");
            } else {
                System.out.println("No se encontró ningún contacto con ese ID.");
            }

            System.out.print("¿Desea eliminar otro contacto? (Sí/No): ");
            respuesta = scanner.nextLine().toLowerCase();
        } while (respuesta.equals("sí") || respuesta.equals("si"));
    }
}
