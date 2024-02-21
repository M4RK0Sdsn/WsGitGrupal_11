package git_11;

import java.util.Scanner;

public class MainEquipo {

	public static void main(String[] args) {
			// Creamos los objetos
			Scanner sc = new Scanner(System.in);
			int arrayTamanio = 0;
			System.out.println("Introduce la cantidad de jugadores que tiene el equipo");
			arrayTamanio = sc.nextInt();
			Equipo[] equipos = new Equipo[2];
			equipos[0] = new Equipo(null, new String[arrayTamanio]);
			equipos[1] = new Equipo("", new String[arrayTamanio]);
			
			// Pedimos los datos y rellenamos los objetos
		
			for (int i = 0;i< equipos.length;i++) {
				System.out.println("Introduce el nombre del equipo");
				sc.next();
				equipos[i].nombre = sc.nextLine();
				for (int j = 0;j< equipos[i].listaNombres.length;j++) {
					int c = 1 +j;
					System.out.println("Introduce el nombre del jugador numero " + (c));
					equipos[i].listaNombres[j]= sc.nextLine();
				}
			}
			
			for(int i = 0;i< equipos.length;i++) {
				// TOSTRING
				System.out.println(equipos[i]);
				// Mostrar los jugadores
				equipos[i].mostrarJugadores();
				// Devolver si existe un jugador
				System.out.println("Introducir jugador para ver si esta en la lista");
				String jugador = sc.nextLine();
				System.out.println("El jugador existe en la lista ? : " + equipos[i].devolverSiExiste(jugador));
				// Devolver numero de jugadores
				System.out.println(" El equipo tiene " + equipos[i].devolverNumeroJugadores() + " jugadores");
				// Es Apto para jugar
				System.out.println("Es el equipo apto para jugar ? : " + equipos[i].esAptoParaJugar());
				// Es la lista de jugadores la misma 
				

				System.out.println("Es la lista de jugadores la misma ? : " + equipos[i].esIgualListaJugadores(equipos[0]));
				// Es el equipo el mismo
				
				System.out.println("Es el equipo exactamente igual ? : " + equipos[i].esIgualEquipo(equipos[1]));
				System.out.println("----------------------------------------------------------------------------------------------------");
			}
			sc.close();

		}
		
		/*public static void pedirDatosEquipos(Scanner sc, Equipo e) {
			System.out.println("Introduce el nombre del equipo");
			e.nombre = sc.nextLine();
			for (int i = 0;i< e.listaNombres.length;i++) {
					System.out.println("Introduce el nombre del jugador numero " + (i+1));
					e.listaNombres[i] = sc.nextLine();
			}
		}*/

}

