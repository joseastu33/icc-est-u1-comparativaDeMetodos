import java.util.ArrayList;
public class InsertionSort {
    public void insertionSort(Persona[] arreglo){
        int tamArreglo = arreglo.length;
        int i;
        for(i = 1; i < tamArreglo; i++){
            Persona guardarValor = arreglo[i];
            //Persona guardarValor = arreglo.get(i) es todo el objeto
            int j;
            for(j = i-1; j >= 0; j--){
                if (arreglo[j].getEdad() > guardarValor.getEdad() ){
                    arreglo[j+1] = arreglo[j]; //(posicion, valor)
                } else {
                    break;
                }
            }
            arreglo[j+1] = guardarValor;
        }
    }
}
