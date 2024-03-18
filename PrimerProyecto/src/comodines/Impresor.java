package comodines;

import java.util.*;

//COMODÍN "?"
/*Representa un tipo desconocido. Se utiliza cuando no se necesita saber el tipo específico en una parte particular del código.
* Se puede usar para leer elementos de una colección, pero no se puede utilizar para escribir en la colección, 
ya que el compilador no sabe el tipo exacto del elemento. */

public class Impresor {
	//Es un método llamado imprimirLista que toma una lista de argumentos de cualquier tipo (List<?>)
    public static void imprimirLista(List<?> lista) {  
        for (Object elemento : lista) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
