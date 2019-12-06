package com.golden.food.api.notificador;

import org.springframework.stereotype.Component;

import com.golden.food.api.modelo.Cliente;

@Component
public class NotificadorEmail implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s usando SMTP %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
