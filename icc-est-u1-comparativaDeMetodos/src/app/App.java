package app;
import models.Persona;
import models.Resultado;

import java.util.concurrent.Callable;

import controllers.SortPersonaMethods;
import utils.Benchmarking;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Desordenado 10000");
        ejecutarEscenarioDesordenado(10000, new SortPersonaMethods());
        System.out.println("Desordenado 50000");
        ejecutarEscenarioDesordenado(50000, new SortPersonaMethods());
        System.out.println("Desordenado 100000");
        ejecutarEscenarioDesordenado(100000, new SortPersonaMethods());

        System.out.println("Ordenado 10000");
        ejecutarEscenarioOrdenado(10000, new SortPersonaMethods());
        System.out.println("Ordenado 50000");
        ejecutarEscenarioOrdenado(50000, new SortPersonaMethods());
        System.out.println("Ordenado 100000");
        ejecutarEscenarioOrdenado(100000, new SortPersonaMethods());

        System.out.println("Ordenado 10000+1");
        ejecutarEscenarioOrdenadoMasUno(10000, new SortPersonaMethods());
        System.out.println("Ordenado 50000+1");
        ejecutarEscenarioOrdenadoMasUno(50000, new SortPersonaMethods());
        System.out.println("Ordenado 100000+1"); //100 000
        ejecutarEscenarioOrdenadoMasUno(100000, new SortPersonaMethods());


    }
    public static Persona[] generarPersonas(int cantidad){
        Persona[] personas = new Persona[cantidad];
        for(int i = 0; i < cantidad; i++){
            String nombre = "Persona " + (i+1);
            int edad = (int) (Math.random()*100000);
            personas[i] = new Persona(nombre, edad);
        }
        return personas;
    }

    public static void ejecutarEscenarioDesordenado(int size, SortPersonaMethods sPm){

        Persona[] base = generarPersonas(size);
        Persona[] copiaInsercion = base.clone();
        Persona[] copiaQuick = base.clone();

        Callable<Void> insertion = () -> {
            sPm.insertionSort(copiaInsercion);
            return null;
        };

        Callable<Void> quick = () -> {
            sPm.quickSort(copiaQuick, 0, copiaQuick.length-1);
            return null;
        };

        Resultado r1 = Benchmarking.medirTiempo(insertion, "Insercion", "Desordenado", size);
        Resultado r2 = Benchmarking.medirTiempo(quick, "QuickSort", "Desordenado", size);

        imprimirResultado(r1);
        imprimirResultado(r2);
    }

    public static void ejecutarEscenarioOrdenado(int size, SortPersonaMethods sPm){
        Persona[] base = generarPersonas(size);
        sPm.insertionSort(base);
        Persona[] copiaInsercion = base.clone();
        Persona[] copiaQuick = base.clone();

        Callable<Void> insertion = () -> {
            sPm.insertionSort(copiaInsercion);
            return null;
        };

        Callable<Void> quick = () -> {
            sPm.quickSort(copiaQuick, 0, copiaQuick.length-1);
            return null;
        };

        Resultado r1 = Benchmarking.medirTiempo(insertion, "Insercion", "Ordenado", size);
        Resultado r2 = Benchmarking.medirTiempo(quick, "QuickSort", "Ordenado", size);

        imprimirResultado(r1);
        imprimirResultado(r2);
    }

    public static void ejecutarEscenarioOrdenadoMasUno(int size, SortPersonaMethods sPm){

        Persona[] base = generarPersonas(size);
        base = SortPersonaMethods.agregarPersona(base, new Persona("Luis", 26));
        Persona[] copiaInsertion = base.clone();
        Persona[] copiaQuick = base.clone();

         Callable<Void> insertion = () -> {
            sPm.insertionSort(copiaInsertion);
            return null;
        };

        Callable<Void> quick = () -> {
            sPm.quickSort(copiaQuick, 0, copiaQuick.length-1);
            return null;
        };

        Resultado r1MasUno = Benchmarking.medirTiempo(insertion, "Insercion", "Ordenado+1", base.length);
        Resultado r2MasUno = Benchmarking.medirTiempo(quick, "QuickSort", "Ordenado+1", base.length);

        imprimirResultado(r1MasUno);
        imprimirResultado(r2MasUno);

    }
    public static void imprimirResultado(Resultado res){
        System.out.println(res.getEscenario() + " " + "|" + " " + res.getAlgoritmo() + " " + "|" + " " + res.getSample() + "|" + " " + 
        res.getTiempoMilis() + "ms");
        ;
    }
    }

