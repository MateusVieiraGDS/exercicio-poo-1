package com.figuras_geo;

public class Retangulo extends FiguraGeometrica implements IFiguraGeometrica{
	
	private double Largura, Altura;
	
	public Retangulo(TipoFigura tipo, double largura, double altura) {
		super(tipo);
		this.Largura = largura;
		this.Altura = altura;
	}

	public double getArea() {
		return (double) this.Largura * this.Altura;
	}

	public double getPerimetro() {
		return (double) this.Largura + this.Altura;
	}

	public double getLargura() {
		return this.Largura;
	}

	public double getAltura() {
		return this.Altura;
	}	

}
