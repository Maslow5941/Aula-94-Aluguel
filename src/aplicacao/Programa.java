package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Aluguel;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Aluguel[] vet = new Aluguel[10];
		System.out.print("quantos quartos quer alugar? ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
		System.out.println();
		System.out.println("Aluguel #" + i + ":");
		System.out.print("Nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Quarto: ");
		int quarto = sc.nextInt();
		vet[quarto] = new Aluguel(nome, email);
		}
		System.out.println();
		System.out.println("Quarto Ocupado:");
		for (int i=0; i<10; i++) {
		if (vet[i] != null) {
		System.out.println(i + ": " + vet[i]);
		}
		}
		
		
		sc.close();

	}

}
