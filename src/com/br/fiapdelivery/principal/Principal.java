package com.br.fiapdelivery.principal;

import com.br.fiapdelivery.model.Caminhao;
import com.br.fiapdelivery.model.Pacote;
import com.br.fiapdelivery.model.Rota;

public class Principal {

	public static void main(String[] args) {
		Caminhao caminhao = new Caminhao("ABC1D23", 500, 6);
		Pacote pacote = new Pacote("SW123456789BR", 10.5);
		
		Rota rota = new Rota(pacote, caminhao);
		rota.comecarEntrega();
	}

}
