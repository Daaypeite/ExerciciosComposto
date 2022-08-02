package com.exemplo.operadores;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int y, soma;
		System.out.println("Insira um Numero inteiro para ver seu Antecessor");
		y = entrada.nextInt();
		soma = y - 1;
		System.out.println("Antecessor do numero é: " + soma);
		entrada.close();
	}

}
