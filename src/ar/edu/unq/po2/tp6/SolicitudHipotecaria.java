package ar.edu.unq.po2.tp6;

public class SolicitudHipotecaria extends SolicitudCredito {
	
	private final PropiedadInmobiliaria propiedad;

	// Constructor
	public SolicitudHipotecaria(Cliente cliente, double montoSolicitado, int plazoMeses, PropiedadInmobiliaria propiedad) {
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
		return this.montoNoExcede(50) && this.montoTotalValido() && this.edadDentroDelLimite();
	}
	
	// Metodos propios
	private boolean montoTotalValido() {
		return this.getMontoSolicitado() <= this.propiedad.getValorFiscal() * 0.7;
	}
	
	private boolean edadDentroDelLimite() {
		int edadAlFinalizar = this.getCliente().getEdad() + this.getPlazoMeses() / 12;
		return edadAlFinalizar <= 65;
	}
}
