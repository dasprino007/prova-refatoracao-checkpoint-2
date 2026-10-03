package com.br.fiapdelivery.model;

public class Veiculo {
	private String placa;
	private double capacidade;
	
	
	public Veiculo(String placa, double capacidade) {
		setPlaca(placa);
		setCapacidade(capacidade);
	}
	
	public String getPlaca() {
		return placa;
	}
	
	private void setPlaca(String placa) {
		int tamanhoPlaca = 7;
		
		if(tamanhoPlaca > placa.length() || placa.length() > tamanhoPlaca) {
			System.err.println("[ERROR]: A placa precisa de " + tamanhoPlaca + " caracteres alfanuméricos");
			return;
		}
		
		this.placa = placa;
	}
	
	public double getCapacidade() {
		return capacidade;
	}
	
	public void setCapacidade(double cap) {
		if(0 > cap) {
			System.err.println("[ERROR]: A capacidade não pode ser um numero negativo");
			return;
		}
		
		this.capacidade = cap;
	}
}
