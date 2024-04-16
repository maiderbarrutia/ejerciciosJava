package comodines;

import java.util.*;

//COMODÍN "? EXTENDS Tipo"
/*Se utiliza para especificar que el tipo debe ser una subclase de Tipo. 
 * Permite que una colección contenga elementos de un tipo específico y sus subtipos.
 * Es útil cuando se necesita leer elementos de una colección y no se necesita agregar nuevos elementos a la colección.*/

public class ImpresorExtend {
	//Es un método llamado imprimirLista que contiene elementos que son subclases de Number
    public static void imprimirLista(List<? extends Number> lista) {
        for (Number elemento : lista) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
