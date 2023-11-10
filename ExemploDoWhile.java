package com.igor.cursojava.aula04;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
	
		int tabuada, x=1, resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a tabuada:");
		tabuada = leia.nextInt(); //8
		
		do {
			resultado = tabuada * x;
			System.out.println("\n" + tabuada + " x " + x + " = " + resultado);
			x++;
			
		}while(x <=10);
		
		
		}
	}


