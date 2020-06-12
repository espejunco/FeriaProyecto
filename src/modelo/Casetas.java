package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbdd.Conexion;
import beans.Caseta;
import beans.User;

public class Casetas {

	public ArrayList<Caseta> getAllCasetas() {
		ResultSet resultados = Conexion.EjecutarSentencia("SELECT * FROM casetas;");
		ArrayList<Caseta> casetas = new controlador.Helper().setCasetaArrayList(resultados);
		return casetas;
	}
	
	public Caseta getCasetaByNumero(int numero) {
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT * FROM casetas WHERE numero = '" + numero + "'; ");
		Caseta caseta = new controlador.Helper().setCasetaObject(resultado);
		return caseta;
	}
	
	public void modificarEstado(int numero, int estado) {
		Conexion.EjecutarUpdate("UPDATE casetas SET estado='" + estado + "' WHERE numero='" + numero + "';");
	}
	
}
