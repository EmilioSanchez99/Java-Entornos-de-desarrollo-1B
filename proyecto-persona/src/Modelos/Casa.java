package Modelos;

/**
 * 
 */
public class Casa {

	private String direccion;
	private int numHabitaciones;
	private int metrosCuadrados;

	/**
	 * Representa una casa del mundo
	 */
	public Casa() {
	}

	/**
	 * @param Direccion       La direccion de la casa
	 * @param numHabitaciones numero de habitaciones de la casa
	 * @param metrosCuadrados metros cuadrados de la casa
	 */
	public Casa(String direccion, int numHabitaciones, int metrosCuadrados) {
		this.direccion = direccion;
		this.numHabitaciones = numHabitaciones;
		this.metrosCuadrados = metrosCuadrados;
	}

	/**
	 * @return devuelve la direccion
	 */
	public String getDireccion() {
		// TODO implement here
		return direccion;
	}

	/**
	 * @return devuelve el numero de habitaciones
	 */
	public int getNUmHabitaciones() {
		// TODO implement here
		return numHabitaciones;
	}

	/**
	 * @return devuelve el numero de metros cuadrados de la casa
	 */
	public int getMetrosCuadrados() {
		// TODO implement here
		return metrosCuadrados;
	}

	/**
	 * @param Direccion introduce la direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @param numHabitaciones introduce el numero de habitaciones
	 */
	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones=numHabitaciones;
	}

	/**
	 * @param metrosCuadrados	introduce los metros cuadrados de la casa
	 */
	public void setMetrosCuadrados(int metrosCuadrados) {
		this.metrosCuadrados=metrosCuadrados;
	}

	/**
	 * @return una cadena con la direccion, numero de habitaciones y metros cuadrados
	 */
	public String toString() {
		// TODO implement here
		return "direccion: "+direccion+"numero de habitaciones: "+numHabitaciones+"metros cuadrados: "+metrosCuadrados;
	}

}