package ar.edu.unq.po2.tp6;

public class SolicitudPersonal extends SolicitudCredito {

	// Constructor
	public SolicitudPersonal(Cliente cliente, int montoSolicitado, int plazoMeses) {
		super(cliente, montoSolicitado, plazoMeses);
	}

	// Metodos sobre-escritos
	@Override
	public boolean esAceptable() {
		return this.suficientesIngresosAnuales() && this.montoNoExcede(70);
	}

	// Metodos propioss
	private boolean suficientesIngresosAnuales() {
		return (this.getCliente().netoAnual() >= 15000);
	}
}
