package br.com.alura.jdbc.modelo;

import java.sql.Connection;

public class TestaInsercaoComProduto {

	public static void main(String[] args) {
		
		Produto comoda = new Produto("Comoda", "Comoda Vertical");
	
	}
	
	try(Connection connection = new ConnectionFactory().recuperarConexao()){
		
		
	}
	
}
