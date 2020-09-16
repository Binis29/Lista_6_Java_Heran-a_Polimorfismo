/*
 * 3. Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada instância da classe Empregado tem, para além dos atributos que caracterizam a classe Pessoa, os atributos codigoSetor (inteiro), salarioBase (vencimento base) e imposto (porcentagem retida dos impostos). Implemente a classe Empregado com métodos seletores e modificadores e um método calcularSalario. Escreva um programa de teste adequado para a classe Empregado. package entities;
 */
package entities;

public class Empregado extends Pessoa {
	
	private int codigoSetor;
	private double salarioBase;
	
	
	public Empregado() {
		
	}
	
	public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase) {
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		
	}




	public int getCodigoSetor() {
		return codigoSetor;
	}




	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}




	public double getSalarioBase() {
		return salarioBase;
	}




	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}




	public double calcularSalario(double porcentagemImposto) {
		
		return (this.salarioBase - (this.salarioBase*porcentagemImposto)/100);
	}
	
	public String toString() {
		return "Nome: " + getNome() + "\n" + "Endereço: " + getEndereco() + "\n" + "Telefone: " + getTelefone() + "\n" + "Código do Setor: " + getCodigoSetor() + "\n" +"Salário bruto: " + getSalarioBase();
	}

}
