import java.util.ArrayList;
public class BusquedaBinaria {
    public Integer busquedaBinaria(Persona[] personas, int key){
        int tamArreglo = personas.length;
        int i;
        int inicio = 0;
        int finalArreglo = tamArreglo-1;
        int centro = (inicio + finalArreglo) / 2;
        while(inicio <= finalArreglo){ //para garantizar que al menos haya un arreglo de uno o dos elementos
            
            imprimirSubarreglo(personas, inicio, finalArreglo);
            centro = (inicio + finalArreglo)/2;

            System.out.print("bajo= " + inicio + "\t" + "alto=" + finalArreglo + "\t" + "centro=" + centro + "\t" +
             "valorCentro=" + personas[centro].getEdad());

            if (key > personas[centro].getEdad()){ //hacia la derecha
            System.out.println("--> DERECHA");
            inicio = centro+1;
            }
            else if (key < personas[centro].getEdad()){ //hacia la izquierda
            System.out.print("\t" + "--> IZQUIERDA");
            System.out.println();
            finalArreglo = centro-1;
            }
            else {
                System.out.println("\t" + "--> ENCONTRADO");
                i = centro;
                while(i > 0 && personas[i-1].getEdad() == key){
                    i--;
                }
                System.out.print("|" + personas[i].getEdad());
                return personas[i].getEdad();
             }

             imprimirSubarreglo(personas, inicio, finalArreglo);
        }
        System.out.println("Persona no encontrada");
        return null;
    }
    public static void imprimirSubarreglo(Persona[] arreglo, int inicio, int finalArreglo){
        for(int i = inicio; i <= finalArreglo; i++){
            System.out.print(arreglo[i].getEdad() + " | ");
        }
        System.out.println();
    }
}
 