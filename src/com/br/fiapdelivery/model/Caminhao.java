package com.br.fiapdelivery.model;

public class Caminhao extends Veiculo{
	private int eixos;
	
	public Caminhao(String placa, double capacidade, int eixos) {
		// Usar o construtor da classe mãe
		super(placa, capacidade); 
		setEixos(eixos);
	}

	public int getEixos() {
		return eixos;
	}

	private void setEixos(int eixos) {
		if(0 > eixos) {
			System.err.println("[ERROR]: O atributo eixos não pode possuir um numero negativo");
		}
		
		this.eixos = eixos;
	}

}
