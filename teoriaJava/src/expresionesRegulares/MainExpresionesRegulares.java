package expresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainExpresionesRegulares {
    public static void main(String[] args) {
        // Ejemplo 1: Coincidir con un número de teléfono
        String textoTelefono = "Mi número de teléfono es 123-456-7890.";
        String patronTelefono = "\\d{3}-\\d{3}-\\d{4}";
        Pattern patternTelefono = Pattern.compile(patronTelefono);
        Matcher matcherTelefono = patternTelefono.matcher(textoTelefono);
        if (matcherTelefono.find()) {
            System.out.println("Número de teléfono encontrado: " + matcherTelefono.group());
        } else {
            System.out.println("Número de teléfono no encontrado.");
        }
        
        System.out.println();

        // Ejemplo 2: Reemplazar todas las vocales en una cadena con "X"
        String textoReemplazo = "Hola, cómo estás?";
        String resultadoReemplazo = textoReemplazo.replaceAll("[aeiouAEIOU]", "X");
        System.out.println("Texto modificado: " + resultadoReemplazo);
        
        System.out.println();

        // Ejemplo 3: Validar una dirección de correo electrónico
        String email = "usuario@dominio.com";
        String patronEmail = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern patternEmail = Pattern.compile(patronEmail);
        Matcher matcherEmail = patternEmail.matcher(email);
        if (matcherEmail.matches()) {
            System.out.println("La dirección de correo electrónico es válida.");
        } else {
            System.out.println("La dirección de correo electrónico no es válida.");
        }
        
        System.out.println();

        // Ejemplo 4: Dividir una cadena en palabras
        String textoDividido = "Esto es una prueba de división de palabras.";
        String[] palabrasDivididas = textoDividido.split("\\s+");
        System.out.println("Palabras encontradas:");
        for (String palabra : palabrasDivididas) {
            System.out.println(palabra);
        }
        
        System.out.println();

        // Ejemplo 5: Buscar todas las ocurrencias de una palabra en un texto
        String textoBusqueda = "El gato en el sombrero es un libro popular.";
        String palabraBuscada = "el";
        String patronBusqueda = "\\b" + palabraBuscada + "\\b";
        Pattern patternBusqueda = Pattern.compile(patronBusqueda, Pattern.CASE_INSENSITIVE);
        Matcher matcherBusqueda = patternBusqueda.matcher(textoBusqueda);
        int contador = 0;
        while (matcherBusqueda.find()) {
            contador++;
        }
        System.out.println("La palabra \"" + palabraBuscada + "\" se encontró " + contador + " veces.");
        
        System.out.println();

        // Ejemplo 6: Coincidir con una fecha en formato dd/mm/aaaa
        String textoFecha = "La fecha de hoy es 18/03/2024.";
        String patronFecha = "\\b(0?[1-9]|[12]\\d|3[01])/(0?[1-9]|1[0-2])/((19|20)\\d\\d)\\b";
        Pattern patternFecha = Pattern.compile(patronFecha);
        Matcher matcherFecha = patternFecha.matcher(textoFecha);
        if (matcherFecha.find()) {
            System.out.println("Fecha encontrada: " + matcherFecha.group());
        } else {
            System.out.println("Fecha no encontrada.");
        }
        
        System.out.println();

        // Ejemplo 7: Extraer todas las menciones de usuarios de Twitter en un texto
        String textoTwitter = "Los usuarios @usuario1 y @usuario2 estuvieron debatiendo en Twitter.";
        String patronTwitter = "@\\w+";
        Pattern patternTwitter = Pattern.compile(patronTwitter);
        Matcher matcherTwitter = patternTwitter.matcher(textoTwitter);
        System.out.println("Usuarios de Twitter encontrados:");
        while (matcherTwitter.find()) {
            System.out.println(matcherTwitter.group());
        }
        
        System.out.println();

        // Ejemplo 8: Validar un código postal en formato XXXXX o XXXXX-XXXX
        String codigoPostal = "12345";
        String patronCodigoPostal = "^\\d{5}(-\\d{4})?$";
        if (codigoPostal.matches(patronCodigoPostal)) {
            System.out.println("El código postal es válido.");
        } else {
            System.out.println("El código postal no es válido.");
        }
        
        System.out.println();

        // Ejemplo 9: Buscar URLs en un texto
        String textoURLs = "Visita mi sitio web en https://www.ejemplo.com y mira mi perfil en https://www.ejemplo.com/perfil.";
        String patronURLs = "\\bhttps?://\\S+\\b";
        Pattern patternURLs = Pattern.compile(patronURLs);
        Matcher matcherURLs = patternURLs.matcher(textoURLs);
        System.out.println("URLs encontradas:");
        while (matcherURLs.find()) {
            System.out.println(matcherURLs.group());
        }
        
        System.out.println();

        // Ejemplo 10: Reemplazar todos los números en una cadena con "X"
        String textoNumeros = "La temperatura es de 25 grados Celsius y el precio es $50.99.";
        String resultadoNumeros = textoNumeros.replaceAll("\\d+", "X");
        System.out.println("Texto modificado: " + resultadoNumeros);
        
        System.out.println();
        
        // Ejemplo 11: verificar si una dirección de correo electrónico es válida 
        String[] emails = {"alumnos@ilernaonline.com", "alumnos.DAM@ilernaonline.com", "alumnos-DAW_@ilernaonline.Ilerna.es"};

        // Patrón para verificar la validez de una dirección de correo electrónico
        String patronEmailValido = "^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern patternEmailValido = Pattern.compile(patronEmailValido);

        for (String correo : emails) {
            Matcher matcherEmailValido = patternEmailValido.matcher(correo);
            if (matcherEmailValido.matches()) {
                System.out.println("El correo electrónico \"" + correo + "\" es válido.");
            } else {
                System.out.println("El correo electrónico \"" + correo + "\" no es válido.");
            }
        }
    }
}

