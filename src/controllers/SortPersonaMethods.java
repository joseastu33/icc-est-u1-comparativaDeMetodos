package controllers;
import models.Persona;
public class SortPersonaMethods {
    public void insertionSort(Persona[] personas){
        int nPersonas = personas.length;
        int j;
        for(int i = 1; i < nPersonas; i++){
            Persona aux = personas[i];
            for(j = i-1; j >= 0; j--){
                if(aux.getEdad() < personas[j].getEdad()){
                    personas[j+1] = personas[j];
                }
                else {
                    break;
                }
            }
            personas[j+1] = aux;
        }
    }
    public void quickSort(Persona[] personas, int inicio, int fin){
        if(inicio < fin){
            int indicePivote = participar(personas, inicio, fin);
            quickSort(personas, inicio, indicePivote-1);
            quickSort(personas, indicePivote+1, fin);
    }}
    private int participar(Persona[] personas, int inicio, int fin){
        int indicePivoteAleatorio = inicio + (int) (Math.random() * (fin-inicio+1));
        intercambiar(personas, indicePivoteAleatorio, fin);
        Persona pivote = personas[fin];
        int i = inicio-1;
        for(int j = inicio; j < fin; j++){
            if(personas[j].getCriterioOrdenamiento() <= pivote.getCriterioOrdenamiento()){
                i++;
                intercambiar(personas, i, j);
            }
        }
        intercambiar(personas, i+1, fin);
        return i+1;
    }
    private void intercambiar(Persona[] personas, int i, int j){
        Persona aux = personas[i];
        personas[i] = personas[j];
        personas[j] = aux;
    }
    public static Persona[] agregarPersona(Persona[] personasOrdenado, Persona nuevaPersona){

        Persona[] arregloAdicional = new Persona[personasOrdenado.length+1]; //+1 persona al final
        System.arraycopy(personasOrdenado, 0, arregloAdicional, 0, personasOrdenado.length);
        arregloAdicional[arregloAdicional.length-1] = nuevaPersona; //la nueva persona se agrega al final
        return arregloAdicional;
    }
}
