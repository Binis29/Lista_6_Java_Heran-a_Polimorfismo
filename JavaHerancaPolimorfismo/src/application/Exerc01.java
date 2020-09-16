/*1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores (getters) e modificadores (setters), e ainda o construtor padrão e pelo menos mais duas opções de construtores conforme sua percepção. Atributos: String nome; String endereço; String telefone; 
 * 
 * 2. Considere, como subclasse da classe Pessoa (desenvolvida no exercício anterior) a classe Fornecedor. Considere que cada instância da classe Fornecedor tem, para além dos atributos que caracterizam a classe Pessoa, os atributos valorCredito (correspondente ao crédito máximo atribuído ao fornecedor) e valorDivida (montante da dívida para com o fornecedor). Implemente na classe Fornecedor, para além dos usuais métodos seletores e modificadores, um método obterSaldo() que devolve a diferença entre os valores dos atributos valorCredito e valorDivida. Depois de implementada a classe Fornecedor, crie um programa de teste adequado que lhe permita verificar o funcionamento dos métodos implementados na classe Fornecedor e os herdados da classe Pessoa.
 */

package application;

import entities.Fornecedor;

public class Exerc01 {

	public static void main(String[] args) {
		
		Fornecedor fornecedor =  new Fornecedor(2500, 1800);
		
		fornecedor.setNome("João");
		fornecedor.setEndereco("Rua Caxias, 325, centro, São Paulo, SP");
		fornecedor.setTelefone("11 9 9596-8723");
		
		System.out.println(fornecedor.toString());
		fornecedor.check();
		

	}

}
