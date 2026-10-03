package com.br.fiapdelivery.model;

public class Moto extends Veiculo{
	private boolean hasBau;

	public Moto(String placa, double capacidade, boolean hasBau) {
		// Usar o construtor da classe mãe
		super(placa, capacidade);
		setHasBau(hasBau);
	}

	public boolean HasBau() {
		return hasBau;
	}

	private void setHasBau(boolean hasBau) {
		this.hasBau = hasBau;
	}

}
