package ar.edu.unq.po2.tp6;

public class PropiedadInmobiliaria {
	private final String descripcion;
	private final String direccion;
	private final double valorFiscal;
	
	// Constructor
	public PropiedadInmobiliaria(String descripcion, String direccion, double valorFiscal) {
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valorFiscal = valorFiscal;
	}

	// Getters
	public String getDescripcion() {
		return descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public double getValorFiscal() {
		return valorFiscal;
	}
}
