package comodines;

import java.util.*;

public class MainComodines {

	public static void main(String[] args) {
		
		//Comodin "?"
		List<Integer> listaEnteros = Arrays.asList(1, 2, 3, 4, 5);
        List<String> listaStrings = Arrays.asList("Hola", "Mundo", "!");
        
        Impresor.imprimirLista(listaEnteros);
        Impresor.imprimirLista(listaStrings);
        
        //Comodín "? extends Tipo"
        List<Integer> listaEnteros2 = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> listaDoubles2 = Arrays.asList(1.5, 2.5, 3.5);
        
        ImpresorExtend.imprimirLista(listaEnteros2);
        ImpresorExtend.imprimirLista(listaDoubles2);
        
        //Comodín "? super Tipo"
        List<Object> listaObjetos3 = new ArrayList<>();
        List<Number> listaNumeros3 = new ArrayList<>();
        
        Agregador.agregarDato(listaObjetos3);
        Agregador.agregarDato(listaNumeros3);
        
        System.out.println("Lista de objetos: " + listaObjetos3);
        System.out.println("Lista de números: " + listaNumeros3);
        

	}

}
