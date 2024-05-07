package ejEnVivo_persistenciaBBDD;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
    	
//    	ConnectDB connection = new ConnectDB(); //Conectar a xampp
    	ConnectBDOracle connection = new ConnectBDOracle(); //Conectar a oracle
//    	ConnectBDMysql connection = new ConnectBDMysql(); //Conectar a Mysql workbench
    	
    	try {
    		connection.connectToDB();
    	} catch (SQLException e) {
	    	System.err.println("No se ha podido conectar a la BBDD");
	    	e.printStackTrace(); //Pila de errores
    	}
    }
}

