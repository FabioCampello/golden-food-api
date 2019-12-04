package com.golden.food.api.notificador;

import org.springframework.stereotype.Component;

import com.golden.food.api.modelo.Cliente;

@Component
public class NotificadorEmail {
	
	public NotificadorEmail() {
		System.out.println("Construtor chamado.");
	}
	
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
