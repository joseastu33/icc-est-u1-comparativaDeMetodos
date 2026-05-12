public class App {
    public static void main(String[] args) throws Exception {
        Ejercicios ejercicio = new Ejercicios(); //instancia auxiliarpara poder llamar al metodo de instancia
        System.out.println("Ejercicio 1");
        int res1 = ejercicio.sumaConsecutivos(5);
        System.out.println(res1);
        int res2 = ejercicio.sumaConsecutivosPasos(5);
        System.out.println(res2);
        System.out.println("Ejercicio 2");
        int res3 = ejercicio.getPotencia(2, 5); //2*2*2*2*2
        System.out.println(res3);
        System.out.println("Ejercicio 3");
        int res4 = ejercicio.sumaDigitos(456);
        System.out.println(res4);
    }
}
