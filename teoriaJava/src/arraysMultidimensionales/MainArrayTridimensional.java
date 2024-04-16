package arraysMultidimensionales;

import java.util.Arrays;

public class MainArrayTridimensional {

	public static void main(String[] args) {
		//DECLARACIÓN DE UN ARRAY MULTIDIMENSIONAL
		int [][][] array1 = new int[3][3][3]; //int [filas][columnas][dimensiones]
		
		int[][][] array2 = {
			    {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
			    {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
			    {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}
			};
		
		//ASIGNANDO VALORES AL ARRAY 1
		array1[0] = new int[][] {  //Fila 1
		    {1, 2, 3}, //Columna 1    -----   //1 es la dimensión 1, 2 es dimensión 2, 3 es dimensión 3
		    {4, 5, 6},  //Columna 2    -----   //4 es la dimensión 1, 5 es dimensión 2, 6 es dimensión 3
		    {7, 8, 9}
		};

		array1[1] = new int[][] {
		    {10, 11, 12},
		    {13, 14, 15},
		    {16, 17, 18}
		};

		array1[2] = new int[][] {
		    {19, 20, 21},
		    {22, 23, 24},
		    {25, 26, 27}
		};
		
		
		//MOSTRAR UN ARRAY BIDIMENSIONAL
		for(int i=0; i<3; i++) {  //filas
			System.out.println(); 
			System.out.println("Fila " + (i+1) + ": ");
			for(int j=0; j<3; j++) { //Columnas dentro de una fila
				System.out.print("Columna " + (j+1) + ": ");
				for(int k=0; k<3; k++) { //Profundidad dentro de una celda
					System.out.print("Dimensión " + (k+1) + ": ");
					System.out.print(array1[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		//Muestra el array
		System.out.println("Contenido del array tridimensional (array2):");
        System.out.println(Arrays.deepToString(array2));
        
		
		//METODOS DE UN ARRAY TRIDIMENSIONAL:
        // Ordenar cada "capa" del array tridimensional (cada matriz bidimensional)
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                Arrays.sort(array2[i][j]);
            }
        }
        System.out.println("\nArray tridimensional (array2) ordenado:");
        System.out.println(Arrays.deepToString(array2));

        // Búsqueda binaria en una "capa" específica del array tridimensional (array2)
        int indice = Arrays.binarySearch(array2[1][1], 14);
        System.out.println("\nEl índice del elemento 14 en la segunda capa (segunda matriz bidimensional) es: " + indice);
		
		

	}

}
