package com.figuras_geo;

public enum TipoFigura {
	RETANGULO("Um retângulo é um quadrilátero que possui todos os ângulos internos congruentes"), 
	TRIANGULO("Figura geométrica que ocupa o espaço interno limitado por três segmentos de reta que concorrem."), 
	CIRCULO("É o conjunto dos pontos internos de uma circunferência"),
	UNKNOW("Figura não reconhecida");
	
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
