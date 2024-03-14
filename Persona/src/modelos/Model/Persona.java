package modelos.Model;


import java.util.*;
/**
 * 
 */
public class Persona {

    
	private String dni;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad = 0;
    
    public Persona(String nombre, String dni, String apellido1,String apellido2,int edad) {
    	this.apellido1=apellido1;
    	this.apellido2=apellido2;
    	this.nombre=nombre;
    	this.dni=dni;
    	this.edad=edad;
    }

    
    

    /**
     * @param dni 
     * @param nombre
     */
    public void Persona(String dni, String nombre) {
        // TODO implement here
    }

    /**
     * @param dni
     */
    public void setDni(String dni) {
        this.dni=dni;
    }

    /**
     * @return
     */
    public String getDni() {
        
        return dni;
    }

}