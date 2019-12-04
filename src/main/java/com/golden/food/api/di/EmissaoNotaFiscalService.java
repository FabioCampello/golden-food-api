package com.golden.food.api.di;

public class EmissaoNotaFiscalService {
	
	public void emitirNotaFiscal(Cliente cliente, Produto produto) {
		
//		NotificadorEmail notificador = new NotificadorEmail();
		
		NotificadorSMS notificador = new NotificadorSMS();
		notificador.notificar(cliente, "Nota fical do produto " + produto.getNome() + "foi emitida!");
	}

}
