package com.golden.food.api.notificador;

import com.golden.food.api.modelo.Cliente;

public class NotificadorEmail implements Notificador {

	private boolean caixaAlta;
	private String hostServidorSmtp;

	public NotificadorEmail() {
		System.out.println("Construtor NotificadorEmail chamado.");
	}

	public NotificadorEmail(String hostServidorSmtp) {
		this.hostServidorSmtp = hostServidorSmtp;
		System.out.println("NotificadorEmail");
	}

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		if (Boolean.TRUE.equals(this.caixaAlta)) {
			mensagem = mensagem.toUpperCase();
		}
		System.out.printf("Notificando %s através do e-mail %s usando SMTP %s: %s\n", cliente.getNome(), cliente.getEmail(), hostServidorSmtp, mensagem);
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}

}
