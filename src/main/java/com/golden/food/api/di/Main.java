package com.golden.food.api.di;

import com.golden.food.api.di.notificador.Notificador;
import com.golden.food.api.di.notificador.NotificadorEmail;
import com.golden.food.api.di.notificador.NotificadorSMS;
import com.golden.food.api.di.service.AtivacaoClienteService;

public class Main {
	
	public static void main(String[] args) {
		Cliente joao = new Cliente("João", "joao@xyz.com", "8598999-7458");
		Cliente maria = new Cliente("Maria", "maria@xyz.com", "8597485-5266");
		
		Notificador notificadorEmail = new NotificadorEmail();
		Notificador notificadorSMS = new NotificadorSMS();
		
		AtivacaoClienteService ativacaoClienteEmail = new AtivacaoClienteService(notificadorEmail);
		AtivacaoClienteService ativacaoClienteSMS = new AtivacaoClienteService(notificadorSMS);
		
		ativacaoClienteEmail.ativar(joao);
		ativacaoClienteSMS.ativar(maria);
	}

}
