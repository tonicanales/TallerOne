package com.taller.test;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import com.taller.main.Fibonacci;
import com.taller.main.Geometry;
import com.taller.main.ListGeometry;
import com.taller.main.NumText;
import com.taller.main.Rectangle;
import com.taller.main.SuperWord;
import com.taller.main.SuperWord.Vocal;

public class TaylorTest {
	
	//@Test
	public void serieTest(){
		int number = 10;
		boolean actual = (number%2==0);  
		
		Assert.assertEquals(true, actual);

	}
	
	//@Test
	public void fibonacciTest(){
		
		int[] result = Fibonacci.fibonacci(5);
		int[] expected = new int[]{1, 2, 3, 5, 8};
		
		Assert.assertArrayEquals(expected, result);
	}
	
	
	//@Test
	public void vocales(){
		
		String palabra = "Murcielago";
		
		SuperWord vocalTest = new SuperWord(palabra);
		ArrayList<Vocal> vocales = vocalTest.numberVocal();
		Assert.assertEquals(1, vocales.get(0).getNumber());
		Assert.assertEquals('a', vocales.get(0).getVocal());
		
	}
	
	//@Test
	public void palindromo(){
		
		SuperWord vocalTest = new SuperWord("Aerea");

		Assert.assertEquals(true, vocalTest.isPalindromo());
		
	}
	
	
	//@Test
	public void numbText(){
		
		NumText numtext = new NumText("uno dos tres");

		Assert.assertEquals("123", numtext.numeroText());
		
	}
	
	
	@Test
	public void sortByArea(){
		
		ListGeometry listGeometry = new ListGeometry();
		
		Geometry[] expected = new Geometry[]{
				new Rectangle(3,2),
				new Rectangle(5,4),
				new Rectangle(4,3)
		};
		
		listGeometry.add(expected[0]);
		listGeometry.add(expected[1]);
		listGeometry.add(expected[2]);
		
		ArrayList<Geometry> listResult = listGeometry.sortByArea();
		
		Assert.assertEquals(expected[2],listResult.get(1));
		Assert.assertEquals(expected[0],listResult.get(2));


		
		
		
	}
	
}
