
class ActividadAliada implements Runnable {
    private final IJuego juego;
    private final int tipoEnemigo;

    public ActividadAliada( int tipoEnemigo, IJuego juego) {
        this.juego = juego;
        this.tipoEnemigo = tipoEnemigo;
    }

    @Override
	public void run() {

    }
}