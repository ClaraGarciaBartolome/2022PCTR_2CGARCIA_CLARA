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
    	for(int i = 0; i<repeticiones(); i++) {
	        try {
	            TimeUnit.MILLISECONDS.sleep(random.nextInt(5000) + 1000);
	            juego.generarEnemigo(tipoEnemigo);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
    	}
    }
    
    private int repeticiones() { //N
    	if (tipoEnemigo == 0) {
    		return 4;
    	}
    	if (tipoEnemigo == 1) {
    		return 3;
    	}
    	if (tipoEnemigo == 2) {
    		return 2;
    	}
    	if (tipoEnemigo == 3) {
    		return 1;
    	}
    	
    	return 0;
    }
    
}
