package arraysUnidimensionales;

import java.util.Arrays;

public class MainArrayUnidimensional {

	public static void main(String[] args) {
		//DECLARACIÓN DE UN ARRAY UNIDIMENSIONAL
		int [] array1 = new int[10]; //10 números con el valor por defecto que es 0
		char[] array2 = new char[20]; 
		
		//int[] array3 = new int[4] {2, 4, 6, 8}; //DARÁ ERROR
		int[] array4 = new int[] {4, 8, 2, 6};  //[2, 4, 6, 8]
		int[] array5 = {2, 4, 6, 8};  //[2, 4, 6, 8]
		
		//MOSTRAR UN ARRAY UNIDIMENSIONAL
		System.out.println("Mostrando un array: " + Arrays.toString(array5));
		
		System.out.print("Mostrar la fila del array: ");
		for(int i=0; i<4; i++) {
			System.out.println("Fila " + i + ": " + array4[i] + " ");
		}
		
		
		//METODOS DE UN ARRAY:
		
		//toString() : Devuelve una representación de cadena de objeto
		System.out.println("toString(): " + Arrays.toString(array5)); //Para mostrarlo hay que importar la librería java.util.Arrays
		System.out.println("toString() directorio: " + array5.toString()); //Esto me dá la posición de memoria en la que está, no sirve para nada
		System.out.println("toString() directorio: " + array4.toString());
		
		//length : Obtiene la longitud del array
		System.out.println("HashCode del array6: " + array5.length);
		
		//clone() : Crea y devuelve una copia de un objeto
		int[] miArrayClonado = array5.clone();
		System.out.println("clone(): " + Arrays.toString(miArrayClonado));

		//hasCode(): Devuelve un valor de código hash para el objeto
		System.out.println("HashCode(): " + array5.hashCode());
		
		//equals(): Indica si algún otro objeto es igual a este
		System.out.println("equals() --> ¿El array4 es igual al array5?: " + Arrays.equals(array4, array5));
		
		//getClass(): Devuelve la clase de tiempo de ejecución de este objeto
		System.out.println("getClass() --> Clase del objeto array5: " + array5.getClass());
		
		//notify(): Despierta un único hilo que está esperando en el monitor de este objeto
		
		//notifyAll(): Despierta todos los hilos que están esperando en el monitos de este objeto
		
		//wait(): Hace que el subproceso actual espere hasta que otro subproceso invoque el método notify() o el método notifyAll() para este objeto o haya transcurrido un periodo de tiempo especificado
	
		
		// Arrays.sort() - Ordena el array
		Arrays.sort(array4);
        System.out.println("Array unidimensional ordenado:");
        System.out.println(Arrays.toString(array4));
        
        // Arrays.binarySearch() - Búsqueda binaria en el array
        int indice = Arrays.binarySearch(array5, 8);
        System.out.println("El índice del elemento 3 es: " + indice);
	
	
	}

}
