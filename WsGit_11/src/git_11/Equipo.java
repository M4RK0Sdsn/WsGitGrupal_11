package git_11;

import java.util.Arrays;

public class Equipo {
	// Atributos
	
		String nombre;
		String[] listaNombres;

		
		// Constructores
		public Equipo() {
			super();
		}
		
		public Equipo(String nombre, String[] listaNombres) {
			super();
			this.nombre = nombre;
			this.listaNombres = listaNombres;
		}

		
		// MÉTODOS 
		
		// TOSTRING
		@Override
		public String toString() {
			return "Equipo [nombre=" + nombre + ", listaNombres=" + Arrays.toString(listaNombres) + "]";
		}

}
