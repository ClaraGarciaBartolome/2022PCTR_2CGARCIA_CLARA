
class ActividadEnemiga implements Runnable {
    private final IJuego juego;
    private final int tipoEnemigo;

    public ActividadEnemiga( int tipoEnemigo, IJuego juego) {
        this.juego = juego;
        this.tipoEnemigo = tipoEnemigo;
    }

    @Override
    public void run() {
    	
    }
}