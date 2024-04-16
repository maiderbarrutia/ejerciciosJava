package lecturaEscrituraArchivos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscrituraInformacion {
	public void escribir(){
		String txt ="\nEscribimos a un fichero con Ilerna Online.";
		try{
			FileWriter doc = new FileWriter("Prueba.txt",true);
			for(int i =0; i < txt.length(); i++){
				doc.write(txt.charAt(i));
			}
			doc.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
