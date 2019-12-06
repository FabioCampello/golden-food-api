package com.golden.food.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.golden.food.api.modelo.Cliente;
import com.golden.food.api.notificador.Notificador;

@Component
public class AtivacaoClienteService {
	
	@Autowired
	private Notificador notificadorEmail;

//	public AtivacaoClienteService(Notificador notificadorEmail) {
//		this.notificadorEmail = notificadorEmail;
//	}

	public void ativar(Cliente cliente) {
		cliente.ativar();

		this.notificadorEmail.notificar(cliente, "Seu cadastro no sistema está ativo.");
	}

}
