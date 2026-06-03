## Universidad Politécnica Salesiana 

## Estructura de datos
## Estudiante: Jose Astudillo

## Practica 04.01 Comparativa de métodos
### Fecha: 1/06/2026

### Descripción: 

Se implementaron varias clases y paquetes independientes para separar responsabilidades con el objetivo de medir tiempos de ejecución de dos algoritmos de ordenamiento (InsertionSort y QuickSort) utilizando conceptos de Benchmarking y funciones como System.currentTimeMillis() en diferentes escenarios, obteniendo resultados interesantes sobre la escala de tiempos tanto del arreglo ordenado y un elemento adicional como desordenado.

## Tabla 1. Escenario 1: arreglo completamente desordenado

![alt text](image.png)

## Tabla 2. Escenario 2: arreglo ordenado más una nueva persona

![alt text](image-1.png)

## ¿Qué algoritmo fue más rápido en el escenario desordenado?
El algoritmo más rápido fue QuickSort debido a su naturalidad como algoritmo diseñado para grandes cantidades de datos, como
se puede observar en las gráficas, el rendimiento fue mucho mayor al insertion sort, llegando a obtener casi 200 veces más rápido que insercion, esto tiene sentido si consideramos que su complejidad es *O(n log n)*, en este caso si se tienen por ejemplo 100 000 elementos, Insertion requeriría de 10 000^2 = 10^10 cantidades de operaciones (mayor a quick).

## ¿Qué algoritmo fue más rápido en el escenario casi ordenado?
Para el arreglo casi ordenado no existe ningun caso (al igual que en el desordenado) donde insertion sort superara a QuickSort, ya que al aumentar el tamaño de muestra la complejidad crece cuadráticamente. Si bien generalmente InsertionSort es especialmente eficiente cuando los datos están casi ordenados, probablemente al agregar una sola persona más esta puede haber quedado en el peor caso (al último del arreglo), obligando a desplazar demasiados elementos.

## ¿El crecimiento del tamaño de muestra afectó por igual a ambos algoritmos?
Esta es una de las diferencias más notables de la medición de tiempos, el crecimiento de n no afectó por igual a ambos, pues se ha logrado ver que el tiempo se multiplicó en 188 veces (pasando de 73 ms en n= 10000 a 13781ms en n = 100000), mientras que siguiendo estas mismas operaciones, en QuickSort el tiempo solo se multiplicó en 16 veces (pasando de 2.78ms a 44.64ms).

## ¿Por qué inserción puede mejorar cuando el arreglo está casi ordenado?
Porque cuando el arreglo está casi ordenado, los elementos estan cerca (o algunos ya están) de su posición correcta, entonces se hacen muy pocos desplazamientos. Aunque esta mejoría no se vió notable en el escenario con 100000 personas, lo que se debió en parte a la gran cantidad de desplazamientos porque probablemente en el último elemento agregado, todas las personas con edades mayores a la indicada(26 en este caso) fueron movidas hacia la derecha, quizá existan muchas mas personas con esa misma edad.

## ¿Por qué QuickSort suele ser mejor cuando los datos están muy desordenados?
QuickSort en este caso puede ser útil debido a que permite juntar los datos desordenados por grupos y poder unirlos, ya que la naturalidad de este algoritmo es utilizar grandes cantidades de datos no ordenados.

## Conclusión 1

## Conclusión 2

## Conclusión 3