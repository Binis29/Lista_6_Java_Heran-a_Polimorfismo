/*
 * 2. Considere, como subclasse da classe Pessoa (desenvolvida no exerc�cio anterior) a classe Fornecedor. Considere que cada inst�ncia da classe Fornecedor tem, para al�m dos atributos que caracterizam a classe Pessoa, os atributos valorCredito (correspondente ao cr�dito m�ximo atribu�do ao fornecedor) e valorDivida (montante da d�vida para com o fornecedor). Implemente na classe Fornecedor, para al�m dos usuais m�todos seletores e modificadores, um m�todo obterSaldo() que devolve a diferen�a entre os valores dos atributos valorCredito e valorDivida. Depois de implementada a classe Fornecedor, crie um programa de teste adequado que lhe permita verificar o funcionamento dos m�todos implementados na classe Fornecedor e os herdados da classe Pessoa.
 */

package entities;

public class Fornecedor extends Pessoa {
	
	private double valorCredito;
	private double valorDivida;
	private double saldo;
//___________________________________________________________________________	
	public Fornecedor(String nome, String endereco) {
		super(nome, endereco);
		// TODO Auto-generated constructor stub
	}

	public Fornecedor(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		
	}
	
	public Fornecedor () {
	
		super ();
	}
	
	public Fornecedor(String nome) {
		super(nome);
	}

	public Fornecedor(String nome, double valorCredito, double valorDivida) {
		super(nome);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	public Fornecedor(double valorCredito, double valorDivida) {
		
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	

	public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
//___________________________________________________________________________	
	public double obterSaldo() {
		
		return (valorCredito - valorDivida) ;
	}
	
	public void check() {
		saldo = obterSaldo();
		
		if(saldo >0) {
			System.out.println("Saldo positivo: R$ " + obterSaldo());
		} else {
			System.out.println("Saldo negativo: R$ " + obterSaldo());
		}
	}
	public String toString() {
    	
    	return "Nome: " + getNome() + "\n" + "Endere�o: " + getEndereco() + "\n"
    	+ "Telefone: " + getTelefone();
    	
    	
    }
	

}
