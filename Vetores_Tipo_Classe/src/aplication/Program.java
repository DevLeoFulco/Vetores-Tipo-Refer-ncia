package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Produtos;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe a quantidade de Produtos seguido de seus nomes e preços: ");
		int n= sc.nextInt();
		Produtos[] vet = new Produtos [n]; 
		
		for (int i=0; i<vet.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vet[i] = new Produtos(nome,preco);
		}
		
		double soma = 0.0;
		for (int i=0; i<vet.length; i++) {
			soma += vet[i].getPreco();
		}
		
		double media = soma/n;
		System.out.printf("A media de preço dos produtos é : %.2f%n ",media);
		
		sc.close();

	}

}
