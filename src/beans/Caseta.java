package beans;

public class Caseta {

	int id;
	String nombre;
	String calle;
	int numero;
	int aforo;
	int estado;

	public Caseta() {
	}

	public Caseta(int id, String nombre, String calle, int numero, int aforo, int estado) {
		this.id = id;
		this.nombre = nombre;
		this.calle = calle;
		this.numero = numero;
		this.aforo = aforo;
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAforo() {
		return aforo;
	}

	public void setAforo(int aforo) {
		this.aforo = aforo;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		if(this.estado == 1) {
			return this.nombre + " || " + this.calle + " || " + this.numero + " || " + this.aforo + " || " + "Abierta";
		} else {
			return this.nombre + " || " + this.calle + " || " + this.numero + " || " + this.aforo + " || " + "Cerrada";
		}
	}

}
