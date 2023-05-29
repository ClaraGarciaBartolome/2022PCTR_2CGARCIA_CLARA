import java.util.Hashtable;


class Juego implements IJuego{
	private int contadorEnemigosTotales = 0;
	private  Hashtable<Integer, Integer> contadoresEnemigosTipo;
    private final Hashtable<Integer, Integer> contadoresEliminadosTipo;
    private final int numTiposEnemigos;
    private final int MINENEMIGOS=0;
    final int  MAXENEMIGOS;

    public Juego(int numTiposEnemigos, int MAXENEMIGOS) {
        this.numTiposEnemigos = numTiposEnemigos;
        this. MAXENEMIGOS = MAXENEMIGOS;
        this.contadoresEnemigosTipo = new Hashtable<>();
        this.contadoresEliminadosTipo = new Hashtable<>();

        for (int i = 0; i < numTiposEnemigos; i++) {
            contadoresEnemigosTipo.put(i, 0);
            contadoresEliminadosTipo.put(i, 0);
        }
        
    }

    @Override
    public synchronized void generarEnemigo(int tipoEnemigo) {
 
        int enemigosTipoActual = contadoresEnemigosTipo.get(tipoEnemigo);
        contadoresEnemigosTipo.put(tipoEnemigo, enemigosTipoActual + 1);
        this.contadorEnemigosTotales++;
        imprimirInfo(tipoEnemigo, "Generado ");
        
        notifyAll();
    }

    @Override
    public synchronized void eliminarEnemigo(int tipoEnemigo) {
        
        int enemigosTipoActual = contadoresEnemigosTipo.get(tipoEnemigo);
        
        if (enemigosTipoActual > 0) {
            contadoresEnemigosTipo.put(tipoEnemigo, contadoresEnemigosTipo.get(tipoEnemigo) - 1);
            contadoresEliminadosTipo.put(tipoEnemigo, contadoresEliminadosTipo.get(tipoEnemigo) + 1);
            this.contadorEnemigosTotales--;
            
            imprimirInfo(tipoEnemigo, "Eliminado ");
            
            notifyAll();
            
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
	
    private void imprimirInfo(int tipoEnemigo, String string) {
        StringBuilder sb = new StringBuilder();
        sb.append(string).append("enemigo tipo ").append(tipoEnemigo).append("\n--> Enemigos totales: ").append(contadorEnemigosTotales).append("\n");
        for (int i = 0; i < numTiposEnemigos; i++) {
	        sb.append("----> Enemigos tipo ").append(i).append(": ").append(contadoresEnemigosTipo.get(i));
	        sb.append(" ------ [Eliminados:").append(contadoresEliminadosTipo.get(i)).append("]\n");
        }
        
        System.out.println(sb.toString());
    }

	private synchronized void comprobarAntesDeGenerar(int tipoEnemigo) {
    }
	
	
	private synchronized void comprobarAntesDeEliminar(int tipoEnemigo) {
    }
    
    
    public int sumarContadores() {
        return 0;
    }
    
	
    public void checkInvariante() {	
    }
    
}
