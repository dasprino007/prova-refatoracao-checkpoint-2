package com.br.fiapdelivery.model;

public class Pacote {
	private String codigo;
	private double peso;
	private String status;
	
	private String statusPendente = "Pendente";
	private String statusCaminho = "A caminho";
	private String statusCancelado = "Cancelado";

	public Pacote(String codigo, double peso) {
		setCodigo(codigo);
		setPeso(peso);
		setStatus(statusPendente);
	}

	public String getCodigo() {
		return codigo;
	}

	private void setCodigo(String codigo) {
		int tamanhoCodigo = 13; 
		
		if(codigo.length() > tamanhoCodigo || tamanhoCodigo > codigo.length()) {
			System.err.println("[ERROR]: O codigo precisa de " + tamanhoCodigo + " caracteres alfanuméricos");
			return;
		}
		
		this.codigo = codigo;
	}

	public double getPeso() {
		return peso;
	}

	private void setPeso(double peso) {
		if(0 > peso) {
			System.err.println("[ERROR]: A capacidade não pode ser um numero negativo");
			return;
		}
		
		this.peso = peso;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		if(status != statusPendente && status != statusCaminho && status != "Entregue" && status != statusCancelado) {
			System.err.println("[ERROR]: O valor " + status + "não é permitido em status");
			return;
		}
		
		this.status = status;
	}
	
	public String getStatusPendente() {
		return statusPendente;
	}
	
	public String getStatusCaminho() {
		return statusCaminho;
	}
	
	public String getStatusCancelado() {
		return statusCancelado;
	}
}
