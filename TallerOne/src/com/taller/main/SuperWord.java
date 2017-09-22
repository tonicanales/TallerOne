package com.taller.main;

import java.util.ArrayList;

public class SuperWord {

	private String word;

	public SuperWord(String word){

		this.word = word;

	}


	public ArrayList<Vocal> numberVocal(){

		int avocales = 0;
		int evocales = 0;
		int ivocales = 0;
		int ovocales = 0;
		int uvocales = 0;

		ArrayList<Vocal> vocales = new ArrayList<>();

		for(int i=0; i<= word.length()-1; i++){

			switch (word.charAt(i)) {
			case 'a': avocales++;
			break;
			case 'e': evocales++;
			break;
			case 'i': ivocales++;
			break;
			case 'o': ovocales++;
			break;
			case 'u': uvocales++;
			}
	
		}
		vocales.add(new SuperWord.Vocal('a',avocales));
		vocales.add(new SuperWord.Vocal('e',evocales));
		vocales.add(new SuperWord.Vocal('i',ivocales));
		vocales.add(new SuperWord.Vocal('o',ovocales));
		vocales.add(new SuperWord.Vocal('u',uvocales));
		
		return vocales;

	}


	
	public boolean isPalindromo(){
		
		String cadena="";
		String anedac="";
		
		for (int i=0; i < word.length(); i++) {
			  if (word.charAt(i) != ' ')
			    cadena += word.charAt(i);
		}
		
		cadena = cadena.toUpperCase();
		
		for (int i =0; i <= cadena.length()-1; i++){
			anedac += cadena.charAt(cadena.length()-1-i);
		}
		
		if (cadena.equals(anedac)) return true;
		else return false;
		
	}
	
	
	
		public static class Vocal{

			final private char vocal;
			final private int number;

			public Vocal(char vocal, int number) {
				this.vocal = vocal;
				this.number = number;
			}

			public char getVocal() {
				return vocal;
			}

			public int getNumber() {
				return number;
			}

		}



		
		


	}
