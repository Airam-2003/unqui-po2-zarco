package ar.edu.unq.po2.tp6;

public class PropiedadInmobiliaria {
	private final String descripcion;
	private final String direccion;
	private final int valorFiscal;
	
	// Constructor
	public PropiedadInmobiliaria(String descripcion, String direccion, int valorFiscal) {
		super();
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

	public int getValorFiscal() {
		return valorFiscal;
	}
}
