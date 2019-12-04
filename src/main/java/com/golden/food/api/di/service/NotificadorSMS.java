package com.golden.food.api.di.service;

import com.golden.food.api.di.Cliente;

public class NotificadorSMS {

	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s por SMS através do telefone %s: %s\n", cliente.getNome(), cliente.getTelefone(), mensagem);
	}
	
}
