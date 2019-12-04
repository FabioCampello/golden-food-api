package com.golden.food.api.di;

public class Main {
	
	public static void main(String[] args) {
		Cliente joao = new Cliente("João", "joao@xyz.com", "8598999-7458");
		Cliente maria = new Cliente("Maria", "maria@xyz.com", "8597485-5266");
		
		AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService();
		ativacaoCliente.ativar(joao);
		ativacaoCliente.ativar(maria);
	}

}
