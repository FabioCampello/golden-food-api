package com.golden.food.api.service;

import com.golden.food.api.modelo.Cliente;
import com.golden.food.api.notificador.NotificadorEmail;

public class AtivacaoClienteService {
	
	private NotificadorEmail notificador;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo.");
	}

}
