package app;

import modelos.Rectangulo;
import modelos.Circulo;
public class main {

	public static void main(String[] args) {
		
		Rectangulo r1=new Rectangulo(2,3);
		Rectangulo r2=new Rectangulo (4,1);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println("Perimetro: "+r1.obtenerPerimetro());
		System.out.println("area: "+r2.obtenerArea());
		
		System.out.println("-----------");
		
		Circulo c1=new Circulo(2);
		Circulo c2=new Circulo(4);
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println("area: "+c1.obtenerArea());
		System.out.println("Perimetro: "+c2.obtenerPerimetro());
		
		
		
		
	}

}
