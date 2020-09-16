/*1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores (getters) e modificadores (setters), e ainda o construtor padr�o e pelo menos mais duas op��es de construtores conforme sua percep��o. Atributos: String nome; String endere�o; String telefone; 
 * 
 * 2. Considere, como subclasse da classe Pessoa (desenvolvida no exerc�cio anterior) a classe Fornecedor. Considere que cada inst�ncia da classe Fornecedor tem, para al�m dos atributos que caracterizam a classe Pessoa, os atributos valorCredito (correspondente ao cr�dito m�ximo atribu�do ao fornecedor) e valorDivida (montante da d�vida para com o fornecedor). Implemente na classe Fornecedor, para al�m dos usuais m�todos seletores e modificadores, um m�todo obterSaldo() que devolve a diferen�a entre os valores dos atributos valorCredito e valorDivida. Depois de implementada a classe Fornecedor, crie um programa de teste adequado que lhe permita verificar o funcionamento dos m�todos implementados na classe Fornecedor e os herdados da classe Pessoa.
 */

package application;

import entities.Fornecedor;

public class Exerc01 {

	public static void main(String[] args) {
		
		Fornecedor fornecedor =  new Fornecedor(2500, 1800);
		
		fornecedor.setNome("Jo�o");
		fornecedor.setEndereco("Rua Caxias, 325, centro, S�o Paulo, SP");
		fornecedor.setTelefone("11 9 9596-8723");
		
		System.out.println(fornecedor.toString());
		fornecedor.check();
		

	}

}
