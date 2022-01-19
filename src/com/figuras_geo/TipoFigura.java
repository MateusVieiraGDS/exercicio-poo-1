package com.figuras_geo;

public enum TipoFigura {
	RETANGULO("Um ret�ngulo � um quadril�tero que possui todos os �ngulos internos congruentes"), 
	TRIANGULO("Figura geom�trica que ocupa o espa�o interno limitado por tr�s segmentos de reta que concorrem."), 
	CIRCULO("� o conjunto dos pontos internos de uma circunfer�ncia"),
	UNKNOW("Figura n�o reconhecida");
	
	String descricao;
	
	TipoFigura (String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoFigura Parse(String tipo) {
		for(var t : TipoFigura.values()) {
			if(t.toString().equals(tipo)) return t;
		}
		return UNKNOW;
	}
}
