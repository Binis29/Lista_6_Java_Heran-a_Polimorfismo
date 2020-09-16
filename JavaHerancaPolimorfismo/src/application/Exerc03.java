package application;

import java.util.Scanner;

import entities.Empregado;

public class Exerc03 {

	public static void main(String[] args) {
		
		double impostos;
		
		Empregado empregado = new Empregado("Cleiton","Rua Ubirajara Donizetti de Andrade 326A", "(38) 9 9947-2326", 15326, 6000);
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Entre com a porcentagem de impostos: ");
		impostos = sc.nextDouble();
		
		
		
		System.out.println("________________________________________________________________________");
		
		System.out.println(empregado.toString());
		
		System.out.println("Salário líquido: " + empregado.calcularSalario(impostos) );
		
		sc.close();

	}

}
