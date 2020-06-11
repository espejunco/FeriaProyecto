package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbdd.Conexion;
import beans.User;

public class Users {

	public ArrayList<User> getAllUsers() {
		ResultSet resultados = Conexion.EjecutarSentencia("SELECT * FROM user");
		ArrayList<User> user = new controlador.Helper().ResultSet2ArrayList(resultados);
		return user;
	}

	public User getUserByNameAndPass(String nombre, String password) {
		ResultSet userBD = Conexion
				.EjecutarSentencia("SELECT * FROM user WHERE nombre='" + nombre + "' AND PASSWORD='" + password + "'");
		User user = new controlador.Helper().resultSet2Object(userBD);
		return user;
	}

	public boolean checkUserAndPass(String nombre, String password) {
		ResultSet usuarioBD = Conexion
				.EjecutarSentencia("SELECT * FROM user WHERE nombre ='" + nombre + "' AND PASSWORD='" + password + "'");

		try {
			return usuarioBD.next();
		} catch (SQLException e) {
			return false;
		}
	}

	public void insertUser(String nombre, String password) {
		Conexion.EjecutarUpdate("INSERT INTO user (NOMBRE, PASSWORD) VALUES ('" + nombre + "', '" + password + "');");
	}

	// Metodo para implementar una vez iniciado sesion (con un boton ej)
	public void updateUser(String nombre, String password) {
		Conexion.EjecutarUpdate("UPDATE user SET PASSWORD='" + password + "' WHERE nombre='" + nombre + "';");
	}

	public void deleteUser(String nombre, String password) {
		Conexion.EjecutarUpdate("DELETE FROM user WHERE nombre = '" + nombre + "' AND password = '" + password + "';");
	}

}