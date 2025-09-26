package ar.edu.unq.po2.tp6;

public abstract class SolicitudCredito {
	private final Cliente cliente;
	private final double montoSolicitado;
	private final int plazoMeses;
	
	// Constructor
	public SolicitudCredito(Cliente cliente, double montoSolicitado, int plazoMeses) {
		this.cliente = cliente;
		this.montoSolicitado = montoSolicitado;
		this.plazoMeses = plazoMeses;
	}
	
	// Getters
	public Cliente getCliente() {
		return this.cliente;
	}

	public double getMontoSolicitado() {
		return this.montoSolicitado;
	}

	public int getPlazoMeses() {
		return this.plazoMeses;
	}

	// Metodos principales
	public double montoMensual() {
		return this.montoSolicitado / this.plazoMeses;
	}
	
	public abstract boolean esAceptable();
	
	protected boolean montoNoExcede(double porcentaje) {
		double limiteDeMonto = this.getCliente().getNetoMensual() * (porcentaje / 100);
		
		return this.montoMensual() <= limiteDeMonto;
	}
}
