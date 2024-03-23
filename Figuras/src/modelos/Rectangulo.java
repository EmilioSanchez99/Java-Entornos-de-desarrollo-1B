package modelos;


import java.util.*;

/**
 *  	clase rectangulo
 */
public class Rectangulo {

   
   
    private int base;

    
    private int altura;

    /**
     * 
     */
    public  Rectangulo() {
        // TODO implement here
    }

    /**
     * @param base 		base del rectangulo	
     * @param altura		altura del rectangulo
     */
    public  Rectangulo(int base, int altura) {
        this.base=base;
        this.altura=altura;
    }

    /**
     * @return 
     */
    public int getBase() {
        // TODO implement here
        return base;
    }

    /**
     * @return
     */
    public int getAltura() {
        // TODO implement here
        return altura;
    }

    /**
     * @param base
     */
    public void setBase(int base) {
        this.base=base;
    }

    /**
     * @param altura
     */
    public void setAltura(int altura) {
        this.altura=altura;
    }

    /**
     * @return 		devuelve la base y la altura
     */
    public String toString() {
        // TODO implement here
        return "base : "+ base +" altura : "+ altura;
    }

    /**
     * @return		calcular el area 
     */
    public double obtenerArea() {
        double area=0;
        area=base*altura;
        return area;
    }

    /**
     * @return 		calcular el perimetro
     */
    public double obtenerPerimetro() {
        double perimetro;
        perimetro=(2*base)+(2*altura);
        return perimetro;
    }

}