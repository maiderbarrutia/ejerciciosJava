package comodines;

import java.util.*;

//COMODÍN "? super Tipo"
/*Se utiliza para especificar que el tipo debe ser una superclase de Tipo.
* Permite que una colección contenga elementos de un tipo específico y sus superclases.
* Es útil cuando se necesita agregar elementos a una colección, pero no se necesita leer elementos específicos de la colección.*/

public class Agregador {
	//Es un método estático llamado agregarDato que toma una lista que acepta elementos de tipo Integer o cualquier superclase de Integer
    public static void agregarDato(List<? super Integer> lista) {
        lista.add(10);
    }
}



/*En resumen, ? proporciona la máxima flexibilidad, 
 * ? extends Tipo se usa cuando se necesita leer elementos, 
 * y ? super Tipo se usa cuando se necesita agregar elementos. */
 