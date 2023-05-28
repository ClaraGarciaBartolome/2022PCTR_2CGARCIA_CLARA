public class SistemaLanzador {
    
	public static void main(String[] args) {
        int numTiposEnemigos = 4;
        int maxEnemigos = 20;

        //Inicializamos juego
        Juego juego = new Juego(numTiposEnemigos, maxEnemigos);
        
        System.out.println("	SIMULACIÓN VIDEOJUEGO	");
        
        for (int i = 0; i < numTiposEnemigos; i++) {

            Thread hiloEnemigo = new Thread(new ActividadEnemiga(i, juego));
            Thread hiloAliado = new Thread(new ActividadAliada(i, juego));

            hiloEnemigo.start();
            hiloAliado.start();

        }
    }
}

