package com.golden.food.api.notificador;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.golden.food.api.modelo.Cliente;

@Primary
@Component
public class NotificadorEmail implements Notificador {

	@Override
	public String notificar(Cliente cliente, String mensagem) {
		System.out.println(String.format("Notificando %s através do e-mail %s: %s", cliente.getNome(), cliente.getEmail(), mensagem));
		return String.format("Notificando %s através do e-mail %s: %s", cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
