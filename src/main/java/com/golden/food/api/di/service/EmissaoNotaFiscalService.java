package com.golden.food.api.di.service;

import com.golden.food.api.di.Cliente;
import com.golden.food.api.di.Produto;

public class EmissaoNotaFiscalService {
	
	public void emitirNotaFiscal(Cliente cliente, Produto produto) {
		
//		NotificadorEmail notificador = new NotificadorEmail();
		
		NotificadorSMS notificador = new NotificadorSMS();
		notificador.notificar(cliente, "Nota fical do produto " + produto.getNome() + "foi emitida!");
	}

}
