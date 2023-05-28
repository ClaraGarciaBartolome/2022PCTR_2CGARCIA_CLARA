import java.util.Random;
import java.util.concurrent.TimeUnit;

class ActividadAliada implements Runnable {
    private final IJuego juego;
    private final int tipoEnemigo;

    public ActividadAliada( int tipoEnemigo, IJuego juego) {
        this.juego = juego;
        this.tipoEnemigo = tipoEnemigo;
    }

    @Override
	public void run() {
	    Random random = new Random();
	    try {
	        TimeUnit.MILLISECONDS.sleep(random.nextInt(5000) + 1000);
	        juego.eliminarEnemigo(tipoEnemigo);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
    }
}
