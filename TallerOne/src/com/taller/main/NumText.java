package com.taller.main;

public class NumText {

	private String numero;

	public NumText(String numero) {
		this.numero = numero;
	}

	
	public int[] numeroText(){

		String[] parts = numero.split(" ");
		int[] finalnumb = new int[parts.length];
		int indice=0;

		for (int i = 0; i<=parts.length-1; i++){

			switch (parts[i]) {
			case "uno": finalnumb[i]=1;
			break;
			case "dos": finalnumb[i]=2;
			break;
			case "tres": finalnumb[i]=3;
			break;
			case "cuatro":finalnumb[i]=4;
			break;
			case "cinco": finalnumb[i]=5;
			break;
			case "seis": finalnumb[i]=6;
			break;
			case "siete": finalnumb[i]=7;
			break;
			case "ocho": finalnumb[i]=8;
			break;
			case "nueve": finalnumb[i]=9;
			break;
			case "cero": finalnumb[i]=0;
			}

		}
		
		for (int i=0; i<=finalnumb.length-1; i++){
			
			indice = (int)Math.pow(10,finalnumb.length-1-i);
			
			
		}
		
		return finalnumb;

	}

	
}
