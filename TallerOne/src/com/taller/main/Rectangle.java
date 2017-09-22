package com.taller.main;

public class Rectangle extends Geometry{
	
	float ancho;
	float alto;
	
	public Rectangle(float ancho, float alto) {
		super(4);
		this.ancho = ancho;
		this.alto = alto;
		// TODO Auto-generated constructor stub
	}

	@Override
	public float computeArea() {
		
		return ancho * alto;
	}

	@Override
	public float computePerimetro() {
		return (ancho*2)+(alto*2);
	}
	
	
	
	

}
