package com.golden.food.api.notificador;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.golden.food.api.modelo.Cliente;

@Qualifier("urgencia")
@Component
public class NotificadorSMS implements Notificador {

	@Override
	public String notificar(Cliente cliente, String mensagem) {
		System.out.println(String.format("Notificando %s por SMS através do telefone %s: %s", cliente.getNome(), cliente.getEmail(), mensagem));
		return String.format("Notificando %s através do e-mail %s: %s", cliente.getNome(), cliente.getTelefone(), mensagem);
	}

}
