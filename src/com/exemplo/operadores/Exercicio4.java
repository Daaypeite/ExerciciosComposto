package com.exemplo.operadores;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x, y, soma;
		System.out.println("Digite o valor de x");
		x = entrada.nextInt();
		System.out.println("Digite o valor de y");
		y = entrada.nextInt();
		soma = x * y;
		System.out.println("Resultado " + soma);
		entrada.close();

	}

}
