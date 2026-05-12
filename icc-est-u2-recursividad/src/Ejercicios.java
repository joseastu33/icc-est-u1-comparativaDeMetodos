public class Ejercicios {
    public Ejercicios(){
    }

    public int sumaConsecutivos(int num){
        System.out.println("El num es" + num);
        /*CASO BASE
        Lo que hace que mi recursividad se detenga es detectar un 0*/
        if (num == 0)
            return 0; //bloque de codigo con solo 1 linea de documentacion se puede obviar las llaves
        /*PARTE RECURSIVA
        sumaConsecutivos(num) vuelve a LLAMARSE*/
        return num + sumaConsecutivos(num-1); //se ocupa menos espacio (se llenan menos variables)
        }
    public int sumaConsecutivosPasos(int num){
        System.out.println("El num es" + num);
        /*CASO BASE
        Lo que hace que mi recursividad se detenga es detectar un 0*/
        if (num == 1)
            return num; //bloque de codigo con solo 1 linea de documentacion se puede obviar las llaves
        /*PARTE RECURSIVA
        sumaConsecutivos(num) vuelve a LLAMARSE*/
        int resultadoRecursivo = sumaConsecutivosPasos(num-1); //resultadoRecursivo = (5-1) = 4
        int resultadoOperacion = num+resultadoRecursivo; //funcion+num
        System.out.println("resultadoOperacion" + resultadoOperacion + " = " + num + "+" + "sumaConsecutivosPasos(" + resultadoRecursivo + ")");
        return resultadoOperacion; //se ocupa menos espacio (se llenan menos variables y el costo espacial es menor)
        }
        //Potencia de un numero: Escribe una funcion recursiva
        // que calcule la potencia de un numero base elevado a un exponente entero.
        //por ejemplo, si la base es 2 y el exponente es 3,
        //la funcion debe devolver 2^3 = 8 (2*2*2)
        public int getPotencia(int base, int exponente){
            //CASO BASE: lo que detiene el algoritmo es que el exponente sea 1 (2^1 = 2)
            if (exponente == 1){ //le resto, -1-1-1 hasta que llegue a uno
                return base;
            }
            //Parte recursiva; multiplicacion por si mismo
            return  base * getPotencia(base, exponente-1); //2^(3-1) --- 2*2*2 es exponente-1 porque 2^3 = 2^(3-1) + 2^(2-1)
            //es decir el exponente se resta    
        }
        //Ejercicio 3: Suma de digitos 
        // 456 = 4+5+6 = 15
        //456 --- 4 456 numero-valor
        //456 /10 = 45.6 /10 = 4.56 
        //texto[i] //num/10 = 0
        public int sumaDigitos(int numero){
            if(numero<10){
                return numero;
                //caso recursivo
                //6 + sumaDigitos(45)
            }
            return numero%10 + sumaDigitos(numero/10); //%10 saca el residuo, suma de residuos
            }
        }

