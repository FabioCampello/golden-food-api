package com.golden.food.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.golden.food.api.modelo.Cliente;
import com.golden.food.api.notificador.Notificador;

@Component
public class AtivacaoClienteService {
	
	@Autowired
	private Notificador notificador;

	public String ativar(Cliente cliente) {
		cliente.ativar();
		return notificador.notificar(cliente,"Seu cadastro no sistema está ativo!");
	}

}
