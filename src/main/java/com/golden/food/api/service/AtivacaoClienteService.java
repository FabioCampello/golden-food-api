package com.golden.food.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.golden.food.api.modelo.Cliente;
import com.golden.food.api.notificador.Notificador;

@Component
public class AtivacaoClienteService {
	
	@Autowired
	private List<Notificador> notificadores;

	public String ativar(Cliente cliente) {
		cliente.ativar();
		String notificacao = null;
		for(Notificador notificador: notificadores) {
			notificacao = notificador.notificar(cliente,"Seu cadastro no sistema está ativo!");
		}
		return notificacao;
	}

}
