package com.figuras_geo;

public class Circulo extends FiguraGeometrica implements IFiguraGeometrica{

	
	private double Raio;
	
	public Circulo (TipoFigura tipo, double diametro) {
		super(tipo);
		
		this.Raio = diametro / 2;
	}
	public double getArea() {
		return Math.pow(this.Raio, 2) * Math.PI;
	}
	public double getPerimetro() {
		return Math.PI * this.Raio * 2;
	}
	public double getLargura() {
		return this.Raio * 2;
	}
	public double getAltura() {
		return this.Raio * 2;
	}
}
