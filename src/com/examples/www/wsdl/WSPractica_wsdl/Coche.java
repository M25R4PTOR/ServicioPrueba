package com.examples.www.wsdl.WSPractica_wsdl;

public class Coche {

	private int idCoche;

	private String marca;

	private int idTitular;

	public int getIdCoche() {
		return idCoche;
	}

	public void setIdCoche(int idCoche) {
		this.idCoche = idCoche;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getIdTitular() {
		return idTitular;
	}

	public void setIdTitular(int idTitular) {
		this.idTitular = idTitular;
	}

	public Coche(int idCoche, String marca, int idTitular) {
		super();
		this.idCoche = idCoche;
		this.marca = marca;
		this.idTitular = idTitular;
	}

	@Override
	public String toString() {
		return "Coche [idCoche=" + idCoche + ", marca=" + marca + ", idTitular=" + idTitular + "]";
	}

}
