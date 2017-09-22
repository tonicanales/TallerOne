package com.taller.main;

public class AppOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length>0){
			try {
				int numero = Integer.valueOf(args[0]);
				if (numero%2 == 0){
					System.out.println("el número es par");
				} else {
					System.out.println("el número es impar");
				}
			} catch (RuntimeException e){
				System.out.println("No es un número");
				return;
			}
			
		} else {
			System.out.println("No hay argumentos");
		}
	}
}

