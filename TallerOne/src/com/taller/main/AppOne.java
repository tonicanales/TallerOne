package com.taller.main;

public class AppOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length>0){
			try {
				int numero = Integer.valueOf(args[0]);
				if (numero%2 == 0){
					System.out.println("el n�mero es par");
				} else {
					System.out.println("el n�mero es impar");
				}
			} catch (RuntimeException e){
				System.out.println("No es un n�mero");
				return;
			}
			
		} else {
			System.out.println("No hay argumentos");
		}
	}
}

