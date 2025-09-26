package ar.edu.unq.po2.tp6;

public class Cliente {
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private double netoMensual;
	
	// Constructor
	public Cliente(String nombre, String apellido, String direccion, int edad, double netoMensual) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.netoMensual = netoMensual;
	}

	// Getters
	public String getNombre() {
		return this.nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public int getEdad() {
		return this.edad;
	}

	public double getNetoMensual() {
		return this.netoMensual;
	}
	
	// Metodos principales
	public double netoAnual() {
		return this.netoMensual * 12;
	}
}
