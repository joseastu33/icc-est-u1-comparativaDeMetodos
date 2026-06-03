public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Este es un programa en Java");
        int array[] = new int[] {1,2,3,4,5};
        System.out.println(array[0]);
        System.out.println(array); //-- imprime un OBJETO, no el ARREGLO
        //ciclo para IMPRIMIR el ARREGLO
        // for normal
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        //for each
        for (int i: array){
            System.out.println(i);
        }
        /* archivo en verde: preparado para hacer un commit(GUARDAR)
         archivo en amarillo: ya existe en Git, pero ha sido modificado */
         // git 
    }
}
// clonar un Proyecto en GIT
//con la URL sirve para clonar
//abrir github,  luego Ctrl + Shift + P
// buscar git clone y colocar la URL: https://github.com/joseastu33/icc-est-u4-complejidad.git
// elegir una carpeta destino para clonar el archivo (ESTRUCTURA DE DATOS)