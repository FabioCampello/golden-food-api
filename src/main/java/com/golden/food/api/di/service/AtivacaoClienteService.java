package com.golden.food.api.di.service;

import com.golden.food.api.di.Cliente;

public class AtivacaoClienteService {
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
//		NotificadorEmail notificador = new NotificadorEmail();
		NotificadorSMS notificador = new NotificadorSMS();
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo.");
	}

}
