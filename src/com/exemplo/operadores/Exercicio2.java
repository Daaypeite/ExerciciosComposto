package com.exemplo.operadores;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x, soma;
		
		System.out.println("Insira um Numero inteiro para ver seu Sucessor");
		x = entrada.nextInt();
		soma = x + 1;
		System.out.println("Sucessor do numero é: " + soma);
		
		entrada.close();
	}

}
