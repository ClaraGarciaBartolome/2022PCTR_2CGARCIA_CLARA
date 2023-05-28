import java.util.Hashtable;


class Juego implements IJuego{
	private int contadorEnemigosTotales = 0;
	private  Hashtable<Integer, Integer> contadoresEnemigosTipo;
    private  Hashtable<Integer, Integer> contadoresEliminadosTipo;
    private int MINENEMIGOS=0;
    private int  MAXENEMIGOS;

    public Juego(int MINENEMIGOS, int MAXENEMIGOS) {
        this.MINENEMIGOS = MINENEMIGOS;
        this. MAXENEMIGOS = MAXENEMIGOS;
        this.contadoresEnemigosTipo = new Hashtable<>();
        this.contadoresEliminadosTipo = new Hashtable<>();

    }

    @Override
    public synchronized void generarEnemigo(int tipoEnemigo) {
    }

    @Override
    public synchronized void eliminarEnemigo(int tipoEnemigo) {
    }

	private synchronized void comprobarAntesDeGenerar(int tipoEnemigo) {
    }
	
	
	private synchronized void comprobarAntesDeEliminar(int tipoEnemigo) {
    }
	
    private void imprimirInfo(int tipoEnemigo, String string) {
    }
    
    
    
    public int sumarContadores() {
        return 0;
    }
    
	
    public void checkInvariante() {	
        }
}