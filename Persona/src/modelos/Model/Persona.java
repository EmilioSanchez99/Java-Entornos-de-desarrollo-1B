package modelos.Model;


import java.util.*;
/**
 * 
 */
public class Persona {

    /**
     * Default constructor
     */
    public Persona() {
    }

    /**
     * 
     */
    private String dni;

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String apellido1;

    /**
     * 
     */
    private String apellido2;

    /**
     * 
     */
    private int edad = 0;

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