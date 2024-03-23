package modelos;

import java.util.*;

/**
 * clase circulo
 */
public class Circulo {

	/**
	 * 
	 */
	private double radio;

	/**
	 * @param radio constructor
	 */
	public Circulo(double radio) {
		this.radio = radio;
	}

	/**
	 * @return devuelve el radio
	 */
	public double getRadio() {
		// TODO implement here
		return radio;
	}

	/**
	 * @param radio asigna un radio
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}

	/**
	 * @return toString que muestra el radio
	 */
	public String toString() {
		// TODO implement here
		return "radio: " + radio;
	}

	/**
	 * @return devuelve el perimetro
	 */
	public double obtenerPerimetro(Circulo c) {
		double perimetro;
		perimetro = (2 * (Math.PI)) * c.radio;
		return perimetro;
	}

	/**
	 * @return 	devuelve el area
	 */
	public double obtenerArea(Circulo c) {
		double area;
		area = Math.PI * (Math.pow(c.radio, 2));

		return area;
	}

}