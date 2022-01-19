package com.figuras_geo;

public class Triangulo extends FiguraGeometrica implements IFiguraGeometrica{
	
	private double Base, Altura;
	
	public Triangulo(TipoFigura tipo, double base, double altura) {
		super(tipo);
		
		this.Base = base;
		this.Altura = altura;				
	}

	public double getArea() {
		return (double) (this.Base * this.Altura) / 2;
	}

	public double getPerimetro() {
		double lado = Math.sqrt(Math.pow(this.Altura, 2) + Math.pow(this.Base / 2, 2));
		return lado * 2 + this.Base;
	}

	public double getLargura() {
		return this.Base;
	}

	public double getAltura() {
		return this.Altura;
	}
	
}
