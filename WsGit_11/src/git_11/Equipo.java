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
		
		// Mostrar todos los jugadores
		public void mostrarJugadores() {
			for(int i = 0; i< this.listaNombres.length;i++) {
				int j = i +1;
				System.out.println("Jugador " + j + " : " + this.listaNombres[i]);
			}
		}
		
		// Los objetos tendrán la opción de devolver si existe un jugador pasado por parámetro.
		
		public boolean devolverSiExiste(String jugador) {
			boolean existe = false;
			for(int i = 0; i< this.listaNombres.length;i++) {
				if(this.listaNombres[i].equals(jugador)) {
					existe = true;
					break;
				}
			}
			return existe;
		}

}
