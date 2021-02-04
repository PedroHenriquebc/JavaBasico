package com.aprendendo.java;

public class While {

	public static void main(String[] args) {
		//While
		/* 
		 
		while( expressao booleana){
			bloco de comandos
		}
		
		*/
		int cont = 0;
		while(cont < 10) {
			System.out.println(cont);
			cont ++;
		}
		
		
		
		//Do While
		/*
		 
		do{
		bloco de comandos
		}while(expressao booleana);
		
		*/
		int cont2 = -1;
		do {
			cont2 ++;
			System.out.println(cont2);
		}while(cont2 < 9);
	}
}
