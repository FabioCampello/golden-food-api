package com.golden.food.api.di;

public class AtivacaoClienteService {
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
//		NotificadorEmail notificador = new NotificadorEmail();
		NotificadorSMS notificador = new NotificadorSMS();
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo.");
	}

}
