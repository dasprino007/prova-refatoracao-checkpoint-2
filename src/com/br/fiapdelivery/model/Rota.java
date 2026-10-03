package com.br.fiapdelivery.model;

public class Rota {
	private Pacote pacote;
	private Veiculo veiculo;


	public Rota(Pacote pacote, Veiculo veiculo) {
		if(pacote.getPeso() > veiculo.getCapacidade()) {
			System.err.println("[ERROR]: O pacote tem um peso maior que veiculo suporta");
			return;
		}
		
		setPacote(pacote);
		setVeiculo(veiculo);
	}
	
	public void comecarEntrega() 
	{
		if(pacote.getStatus() == "A caminho") {
			System.out.println("[WARNING]: A entrega "+ pacote.getCodigo() +" já esta a caminho");
			return;
		}
		
		else if(pacote.getStatus() == "Cancelado") {
			System.err.println("[ERROR]: A entrega "+ pacote.getCodigo() +"Foi cancelada");
			return;
		}
		
		pacote.setStatus("A caminho");
		System.out.println("Levando o pacote " + pacote.getCodigo() + " no Veiculo " + veiculo.getPlaca());
	}
	
	public Pacote getPacote() {
		return pacote;
	}


	private void setPacote(Pacote pacote) {
		this.pacote = pacote;
	}


	public Veiculo getVeiculo() {
		return veiculo;
	}


	private void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

}
