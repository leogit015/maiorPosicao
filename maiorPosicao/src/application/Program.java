package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar?");
		int n = sc.nextInt();
		double[] vet = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vet[i]=sc.nextDouble();
			
		}
		
		int posMaior;
		double maior;
		
		maior = vet[0];
		posMaior = 0;
		
		for (int i=0; i<n; i++) {
			if (vet[i] > maior) {
				maior = vet[i];
				posMaior = i;
			}
		}
		
		 System.out.printf("MAIOR VALOR = %.1f%n", maior);
	     System.out.printf("POSICAO DO MAIOR VALOR = %d%n", posMaior);
		
		
		
		
		
		
		sc.close();

	}

}
