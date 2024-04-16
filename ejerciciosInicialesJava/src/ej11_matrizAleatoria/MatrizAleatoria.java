package ej11_matrizAleatoria;

import java.util.Random;

public class MatrizAleatoria {
	private int[][] array = new int [2][3];
	
	protected MatrizAleatoria() {
        Random numAleatorios = new Random();
        for (int i = 0; i < array.length; i++) { //fila
            for (int j = 0; j < array[0].length; j++) { //columna
                array[i][j] = numAleatorios.nextInt(10) + 1; // Números aleatorios entre 1 y 10
            }
        }
    }
	protected void imprimirMatriz() {
		for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
	}
	
	
	protected void mostrarSumaFilasColumnas() {
	    int[] sumaFilas = new int[array.length];
	    int[] sumaColumnas = new int[array[0].length];

	    // Calcular sumas de filas y columnas y mostrar la matriz
	    for (int i = 0; i < array.length; i++) {
	        for (int j = 0; j < array[0].length; j++) {
	            sumaFilas[i] += array[i][j];
	            sumaColumnas[j] += array[i][j];
	            System.out.print(array[i][j] + " ");
	        }
	        System.out.println(sumaFilas[i]); // Mostrar suma de fila
	    }

	    // Mostrar sumas de columnas y calcular la suma total
	    int sumaTotal = 0;
	    for (int j = 0; j < array[0].length; j++) {
	        System.out.print(sumaColumnas[j] + " ");
	        sumaTotal += sumaColumnas[j];
	    }
	    System.out.println(sumaTotal); // Mostrar suma total
	}

	
	
	
	
	
}
