import java.util.Random;
import java.util.concurrent.TimeUnit;

class ActividadEnemiga implements Runnable {
    private final IJuego juego;
    private final int tipoEnemigo;

    public ActividadEnemiga( int tipoEnemigo, IJuego juego) {
        this.juego = juego;
        this.tipoEnemigo = tipoEnemigo;
    }

    @Override
    public void run() {
    	Random random = new Random();
        try {
            TimeUnit.MILLISECONDS.sleep(random.nextInt(5000) + 1000);
            juego.generarEnemigo(tipoEnemigo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
