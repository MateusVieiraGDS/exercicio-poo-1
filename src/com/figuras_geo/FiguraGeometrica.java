package com.figuras_geo;

public abstract class FiguraGeometrica {
	
	public final TipoFigura tipo;
	
	public FiguraGeometrica(TipoFigura tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return this.tipo.name();
	}
	
	public String getDescricao() {
		return this.tipo.getDescricao();
	}
	
}
