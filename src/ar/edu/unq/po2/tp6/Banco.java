package ar.edu.unq.po2.tp6;

import java.util.ArrayList;

public class Banco {
	private ArrayList<Cliente> clientes;
	private ArrayList<SolicitudCredito> solicitudesCredito;
	
	// Constructor
	public Banco(ArrayList<Cliente> clientes, ArrayList<SolicitudCredito> solicitudesCredito) {
		super();
		this.clientes = clientes;
		this.solicitudesCredito = solicitudesCredito;
	}
	
	// Getters
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public ArrayList<SolicitudCredito> getSolicitudesCredito() {
		return solicitudesCredito;
	}
	
	//Metodos principales
	public void agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
}
