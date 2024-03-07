package videojuego;

import java.util.ArrayList;

public class MainVideoJuego {

	public static void main(String[] args) {
		
		//CREAR UNA ARRAYLIST VACÍO DE TIPO VIDEOJUEGO
		ArrayList<VideoJuego> listaVideoJuegos = new ArrayList<VideoJuego> ();
		
		//CREAR 5 VIDEOJUEGOS
		VideoJuego videojuego1 = new VideoJuego(1, "Elden Ring", "XBOne", 2, "categoria1");
		VideoJuego videojuego2 = new VideoJuego(2, "The Legend of Zelda: Tears of the Kingdom", "Switch", 5, "categoria2");
		VideoJuego videojuego3 = new VideoJuego(3, "Super Mario Odyssey", "Switch", 1, "categoría 3");
		VideoJuego videojuego4 = new VideoJuego(4, "The Witcher 3: Wild Hunt", "PC", 1, "categoría 4");
		VideoJuego videojuego5 = new VideoJuego(5, "God of War: Ragnarok", "PS4", 4, "categoría 5");
		
		//GUARDAR LOS VIDEOJUEGOS EN LA COLLECCIÓN
		listaVideoJuegos.add(videojuego1);
		listaVideoJuegos.add(videojuego2);
		listaVideoJuegos.add(videojuego3);
		listaVideoJuegos.add(videojuego4);
		listaVideoJuegos.add(videojuego5);
		
		
		
		//RECORRER LA ARRAYLIST CREADA Y MOSTRAR POR PANTALLA EL TÍTULO, CONSOLA Y CANTIDAD DE JUGADORES DE LOS VIDEOJUEGOS ALMACENADOS
		System.out.println("\n-------- LISTA COMPLETA DE VIDEOJUEGOS ------------");
		for (VideoJuego vj:listaVideoJuegos) {

			//Opción 1:
			/*System.out.println("\n-------- VIDEOJUEGO " + vj.getCodigo()+ ": ------------");
			System.out.println("Título: " + vj.getTitulo());
			System.out.println("Consola: " + vj.getConsola());
			System.out.println("Cantidad de jugadores: " + vj.getCantidadJugadores());*/
			
			//Opción 2:
			System.out.println("\n-------- Videojuego " + (listaVideoJuegos.indexOf(vj) + 1) + ": ------------");
			vj.mostrarDatos();
			
		}
		
		//CAMBIAR EL NOMBRE Y LA CANTIDAD DE JUGADORES DE DOS VIDEOJUEGOS
		
		//Opción 1:
		videojuego2.setTitulo("Dark Souls II: Scholar of the First Sin");
		videojuego2.setCantidadJugadores(3);
		videojuego3.setTitulo("Mario Kart 8 Deluxe");
		videojuego3.setCantidadJugadores(2);
		
		//Opción 2:
		/*
		for (VideoJuego vj : listaVideoJuegos) {
		    if (vj.getCodigo() == 1) {
		        vj.setTitulo("Dark Souls II: Scholar of the First Sin");
		        vj.setCantidadJugadores(3);
		    } else if (vj.getCodigo() == 3) {
		        vj.setTitulo("Mario Kart 8 Deluxe");
		        vj.setCantidadJugadores(2);
		    }
		}
		*/
		
		
		//MOSTRAR POR PANTALLA LOS DATOS DE TODOS LOS VIDEOJUEGOS DESPUÉS DEL CAMBIO
		System.out.println("\n-------- LISTA COMPLETA DE VIDEOJUEGOS DESPUÉS DE LOS CAMBIOS ------------");
		for (VideoJuego vj:listaVideoJuegos) {
			
			System.out.println("\n-------- Videojuego " + (listaVideoJuegos.indexOf(vj) + 1) + ": ------------");
			vj.mostrarDatos();
			
		}
		
		//RECORRER LA ARRAYLIST Y MOSTRAR POR PANTALLA ÚNICAMENTE LOS VIDEOJUEGOS QUE SEAN DE LA CONSOLA "NINTENDO 64"
		System.out.println("\n-------- LISTA DE TODOS LOS VIDEOJUEGOS DE LA CONSOLA SWITCH ------------");
		for (VideoJuego vj:listaVideoJuegos) {
			String nombreConsola = "Switch";
			if(vj.getConsola().equals(nombreConsola)) {
				System.out.println("\n-------- Videojuego " + (listaVideoJuegos.indexOf(vj) + 1) + ": ------------");
				
				//Opción 1: Muestra solo 3 datos
				//vj.mostrarDatos();
				
				//Opción 2: Muestra todos los datos
				System.out.println(vj.toString());
				
;			}
			
			
			
		}
	
	
	}

}
