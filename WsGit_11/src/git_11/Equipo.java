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
		// Los objetos tendrán la opción de devolver el numero de jugadores que tienen.
		
		public int devolverNumeroJugadores() {
			int contador = 0;
			for(int i = 0; i< this.listaNombres.length;i++) {
				if(this.listaNombres[i] != null && this.listaNombres[i] != " ") {
					contador++;
				}
			}
			return contador;
		}
		
		// Los objetos tendrán la opción de devolver si el número de jugadores que tienen es apto para jugar. 
		// Un equipo es apto para jugar si tiene al menos 7 jugadores.
		
		public boolean esAptoParaJugar() {
			int numeroJugadores = devolverNumeroJugadores();
			boolean esApto = false;
			if(numeroJugadores>7) {
				esApto = true;
			}else {
				esApto = false;
			}
			return esApto;
		}
		
		// Los objetos tendrán la opción de devolver si una lista de jugadores 
		// pasada por parámetro es exactamente igual a su lista de jugadores
		
		public boolean esIgualListaJugadores(Equipo e) {
			boolean esIgual = false;
			for(int i = 0; i< this.listaNombres.length;i++) {
					for(int j = 0; j< e.listaNombres.length ; j++) {
						if(this.listaNombres[i].equalsIgnoreCase(e.listaNombres[j])) {
							esIgual = true;
						}	
				}
			}
			return esIgual;
		}
		
		// Los objetos tendrán la opción de devolver si un equipo pasado por 
		// parámetro es exactamente igual al mismo. Un equipo es exactamente igual 
		// si tiene el mismo nombre y la misma lista de jugadores con los mismos nombres.
		
		public boolean esIgualEquipo(Equipo e) {
			boolean esIgual = false;
			for(int i = 0; i< this.listaNombres.length;i++) {
				if(this.listaNombres[i] == e.listaNombres[i] && this.nombre == e.nombre) {
					esIgual = true;
				}else {
					esIgual = false;
				}
			}
			return esIgual;
			
		}
		

}
