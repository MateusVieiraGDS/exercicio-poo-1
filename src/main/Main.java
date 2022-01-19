package main;

import com.figuras_geo.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem vindo ao Manipulador de figuras geom�tricas.");
		System.out.println("Vamos come�ar registrando suas figuras, ap�s recebera informa��es.");
		
		ArrayList<IFiguraGeometrica> figuras = new ArrayList<IFiguraGeometrica>();
		
		System.out.println("\nFiguras dispon�veis (RETANGULO, CIRCULO, TRIANGULO) ou ENTER para seguir.");
		String figura_nome = sc.nextLine();
		
		while(figura_nome != "") {				
			IFiguraGeometrica figura = null;
			var tipo_figura = TipoFigura.Parse(figura_nome.toUpperCase());
			
			switch(tipo_figura) {
				case RETANGULO:
					System.out.println("Insira a largura e altura do ret�ngulo separado por espa�o:");
					figura = new Retangulo(tipo_figura, sc.nextDouble(), sc.nextDouble());
					System.out.println("Figura Registrada!");
				break;
				case TRIANGULO:
					System.out.println("Insira a base e altura do triangulo separado por espa�o:");
					figura = new Triangulo(tipo_figura, sc.nextDouble(), sc.nextDouble());
					System.out.println("Figura Registrada!");
				break;
				case CIRCULO:
					System.out.println("Insira o di�metro do c�rculo:");
					figura = new Circulo(tipo_figura, sc.nextDouble());
					System.out.println("Figura Registrada!");
				break;
				case UNKNOW:
				default:
					System.out.println("Infelizmente n�o reconhecemos sua figura.");
			}	
			if(figura != null) {
				figuras.add(figura);
				sc.nextLine(); //LIMPANDO BUFFER
			}
						
			System.out.println("\nFiguras dispon�veis (RETANGULO, CIRCULO, TRIANGULO) ou ENTER para seguir.");
			figura_nome = sc.nextLine();
		}
		
		System.out.printf("Um total de %d figuras foram registradas, sendo elas:%n", figuras.size());
		
		for(var figura : figuras) {
			System.out.println("\nTipo de Figura: " + figura.getTipo());
			System.out.println("   Descri��o: " + figura.getDescricao());
			System.out.printf("   Dimens�es: %.2f largura X %.2f altura.%n", figura.getLargura(), figura.getAltura());
			System.out.printf("   Per�metro: %.2f%n", figura.getPerimetro());
			System.out.printf("   �rea: %.2f%n", figura.getArea());
		}	
		
		System.out.println("ENTER para sair...");
		sc.nextLine();
			
		sc.close();
	}	

}
