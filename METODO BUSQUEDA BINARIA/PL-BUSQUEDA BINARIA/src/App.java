
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int edadKey = 0;
        int edadPersonas = 0;
        System.out.print("Ingrese cantidad de Personas del listado: ");
        int cantidadPersonas = sc.nextInt();
        Persona[] personas = new Persona[cantidadPersonas]; 
        String buffer = sc.nextLine(); //cada nextInt se pulsa el enter y queda un espacio, ese espacio se compensa con el line
        for (int i = 0; i < cantidadPersonas; i++){ //menor o igual a 8, puede ser 8 o menor  012345678
            boolean contieneNumero;
            String nombrePersonas;

            //DO WHILE DE LOS NOMBRES
            do {
            System.out.println("Ingrese Persona: ");
            System.out.print("  " + "Nombre: ");
            nombrePersonas = sc.nextLine();
            contieneNumero = false; //inicio de la validacion si es o no un numero
            char[] caractPersonas = nombrePersonas.toCharArray(); //no se puede recorrer un String, se lo convierte en arreglo
            for(char c : caractPersonas){
                if (Character.isDigit(c)){
                    contieneNumero = true;
                    break; //si contiene un numero no es necesario evaluar más
                }
                }
                if (contieneNumero)
                System.out.println("Ingrese un nombre sin numeros");
            } while (contieneNumero);
            System.out.println("Nombre aceptado");
            //DO WHILE DE LAS EDADES
            boolean edadValida = false;
            do {
                System.out.print("  " + "Edad: ");
            try { //lo que está dentro del try se ejecuta solo si no hay ninguna excepcion
                edadPersonas = sc.nextInt();
                String buffer2 = sc.nextLine();
                if (!(edadPersonas > 0))
                    System.out.println("La edad no puede ser negativa");
                else
                    edadValida = true;
            } catch (InputMismatchException excepcion) {
                System.out.println("Ingrese una edad sin letras"); 
                String buffer3 = sc.nextLine();           
            }
            } while (!edadValida);

            System.out.println("Edad aceptada");
            personas[i] = (new Persona(nombrePersonas, edadPersonas));
    }
    boolean edadKeyValida = false;

    //DO WHILE DE LA KEY
    do {
    System.out.println("Valor edad de la persona: ");
    try {
        edadKey = sc.nextInt();
        if ((edadKey > 0)){
            edadKeyValida = true;
        }
        else{
            System.out.println("La edad no puede ser negativa");
            edadKeyValida = false;
        }
    } catch (InputMismatchException excepcion) {
        System.out.println("Ingrese una edad válida a buscar");
        edadKeyValida = false;
        String buffer4 = sc.nextLine();
    }
    } while(!edadKeyValida);



    //Ordenamiento por insercion
    InsertionSort insercion = new InsertionSort();
    insercion.insertionSort(personas); //arreglo ya ordenado
    //busqueda del elemento
    BusquedaBinaria busqueda = new BusquedaBinaria();
    busqueda.busquedaBinaria(personas, edadKey);

    }
}

