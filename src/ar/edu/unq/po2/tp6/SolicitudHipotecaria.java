package ar.edu.unq.po2.tp6;

public class SolicitudHipotecaria extends SolicitudCredito {
	
	private final PropiedadInmobiliaria propiedad;

	// Constructor
	public SolicitudHipotecaria(Cliente cliente, int montoSolicitado, int plazoMeses, PropiedadInmobiliaria propiedad) {
		super(cliente, montoSolicitado, plazoMeses);
		this.propiedad = propiedad;
	}
	
	// Getter
	public PropiedadInmobiliaria getPropiedad() {
		return this.propiedad;
	}

	// Metodos sobre-escritos
	@Override
	public boolean esAceptable() {
		return false;
	}
	
	// Metodos propios
	
}
