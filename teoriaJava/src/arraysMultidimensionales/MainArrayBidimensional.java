package arraysMultidimensionales;

import java.util.Arrays;

public class MainArrayBidimensional {

	public static void main(String[] args) {
		//DECLARACIÓN DE UN ARRAY MULTIDIMENSIONAL
		int [][] array1 = new int[5][];  //int [filas][columnas]
		array1[0] = new int[] {1, 2, 3, 4};
		array1[1] = new int[] {5, 6, 7, 8};
		
		int[][] array2 = new int[][]{{7, 3, 2, 8}, {1, 4, 6, 5}};
		
		//MOSTRAR UN ARRAY BIDIMENSIONAL
		//Mostrar el array1 (saca varios valores nulos porque yo le tengo puesto que tenga 5 filas y solo hay 2
		System.out.println("Mostrar los valores de las dos filas del array1:");
		for (int i = 0; i < array1.length; i++) {
            System.out.println(Arrays.toString(array1[i]));
        }
		
		//Mostrar el array con valores introducidos en el array2
		System.out.println("Mostrar los valores de las dos filas del array2:");
		for (int i = 0; i < array2.length; i++) {
            System.out.println(Arrays.toString(array2[i]));
        }
				
		//Mostrar la primera fila en array
		System.out.println("Mostrar primera fila:");
		System.out.println(Arrays.toString(array1[0]));
		
		//Mostrar la segunda fila en array
		System.out.println("Mostrar segunda fila:");
		System.out.println(Arrays.toString(array1[1]));
		
		//Mostrar las dos filas de arrays en números
		System.out.print("Mostrar las dos filas de arrays: ");
		for(int i=0; i<2; i++) {  //filas
			System.out.println(); 
			System.out.print("Fila " + (i+1) + ": ");
			for(int j=0; j<4; j++) { //Columnas
				System.out.print(array1[i][j] + " ");
			}
		}
		
		
		
		//METODOS DE UN ARRAY BIDIMENSIONAL:
		// Arrays.deepToString() - Muestra el contenido del array bidimensional
        System.out.println("Contenido del array bidimensional:");
        System.out.println(Arrays.deepToString(array2));
        
        // Arrays.sort() - Ordena cada fila del array bidimensional
        for (int i = 0; i < array2.length; i++) {
            Arrays.sort(array2[i]);
        }
        System.out.println("\nArray bidimensional ordenado:");
        System.out.println(Arrays.deepToString(array2));
        
        // Arrays.binarySearch() - Búsqueda binaria en una fila específica del array bidimensional
        int indice = Arrays.binarySearch(array2[1], 8); //Busca el número 8 en la segunda fila del array
        System.out.println("\nEl índice del elemento 8 en la segunda fila es: " + indice);
		
		
		
		
		
		

	}

}
