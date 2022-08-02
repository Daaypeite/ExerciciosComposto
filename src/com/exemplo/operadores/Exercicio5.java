package com.exemplo.operadores;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int idade, diasVividos;
		System.out.println("Qual sua idade? ");
		idade = entrada.nextInt();

		diasVividos = idade * 365;
		System.out.println("Dias Vividos: " + diasVividos);

		entrada.close();
	}
}
