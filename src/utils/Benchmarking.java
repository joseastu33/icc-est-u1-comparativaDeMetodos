package utils;
import java.util.concurrent.Callable;
import javax.management.RuntimeErrorException;
import models.Resultado;
public class Benchmarking {
    public static Resultado medirTiempo(Callable<Void> function, String algoritmo, String escenario, int sample){
        
        try {
            long inicio = System.nanoTime();
            function.call();
            long fin = System.nanoTime();
            double duracion = fin - inicio;

            return new Resultado(algoritmo, escenario, sample, duracion);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error al ejecutar la funcion de ordenamiento");
        }
    }
}

