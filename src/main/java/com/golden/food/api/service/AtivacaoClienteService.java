package com.golden.food.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.golden.food.api.modelo.Cliente;
import com.golden.food.api.notificador.Notificador;

@Component
public class AtivacaoClienteService {
	
	@Autowired(required = false)
	private Notificador notificador;

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		if(notificador != null) {
			notificador.notificar(cliente,"Seu cadastro no sistema está ativo!");
		} else {
			System.out.println("Não existe notificador, mas o cliente foi ativado.");
		}

	}

}
