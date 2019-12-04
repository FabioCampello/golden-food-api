package com.golden.food.api.di.service;

import com.golden.food.api.di.Cliente;
import com.golden.food.api.di.Produto;
import com.golden.food.api.di.notificador.Notificador;

public class EmissaoNotaFiscalService {
	
	private Notificador notificador;
	
	public EmissaoNotaFiscalService(Notificador notificador) {
		this.notificador = notificador;
	}
	
	public void emitirNotaFiscal(Cliente cliente, Produto produto) {	
		this.notificador.notificar(cliente, "Nota fical do produto " + produto.getNome() + "foi emitida!");
	}

}
