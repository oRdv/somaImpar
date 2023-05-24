package br.senai.sp.jandira;

import java.util.Scanner;

public class soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int numeros[] = new int[6], impar = 0, i;
				
				Scanner teclado = new Scanner(System.in);
				
				System.out.println("Olá, bem vindo a somatória de números ímpares!");
				System.out.println("Insira o seu primeiro número: ");
				numeros[0] = teclado.nextInt();
				
				System.out.println("Insira o seu segundo número: ");
				numeros[1] = teclado.nextInt();
				
				System.out.println("Insira o seu terceiro número: ");
				numeros[2] = teclado.nextInt();
				
				System.out.println("Insira o seu quarto número: ");
				numeros[3] = teclado.nextInt();
				
				System.out.println("Insira o seu quinto número: ");
				numeros[4] = teclado.nextInt();
				
				System.out.println("E por último, insira o seu primeiro número: ");
				numeros[5] = teclado.nextInt();
			
				
				for(i = 0; i < numeros.length; i++) {

					if (numeros[i] % 2 == 1) {
						impar += numeros[i];
					}
					
				}
						
				System.out.println("A soma dos numeros ímpares dentro do intervalo é de: " + impar);
				
	}

}
