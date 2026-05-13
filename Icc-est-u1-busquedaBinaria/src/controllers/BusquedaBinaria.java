package controllers;
import models.Product;
public class BusquedaBinaria {
    public Product fileProductByStock(Product[] products, int key){
        int bajo = 0;
        int alto = products.length-1;
        while(bajo <= alto){
            int centro1 = (bajo+alto)/2;
            if(products[centro1].getStock() == key ){
                return products[centro1]; //con el return se acaba todo el metodo y devuelve el centro
                
            //defino el camino hacia la derecha o a la izquierda //
        /* bajo = 0 {el bajo siempre es menor que el alto}
        alto = central-1 */
            }
            if (products[centro1].getStock() > key){
                alto = centro1-1; 
            }
            else
                bajo = centro1+1;   
        }
        return null; //si el objeto no se encuentra retorna el null
    }
    public int fileProductIndexByStock(Product[] products, int key){ //ordenamiento afuera o adentro del metodo
        int bajo = 0;
        int alto = products.length-1;
        while(bajo <= alto){
            int centro = (bajo+alto)/2;
            if(products[centro].getStock() == key ){
                return centro; //con el return se acaba todo el metodo y devuelve el centro
                
            //defino el camino hacia la derecha o a la izquierda //
        /* bajo = 0 {el bajo siempre es menor que el alto}
        alto = central-1 */
            }
            if (products[centro].getStock() > key){
                alto = centro-1; 
            }
            else
                bajo = centro+1;
        }
        return -1;    
    }
    private void sortProductsByStock(Product[] products){
        int tamProducts = products.length;
        for(int i = 0; i < tamProducts-1; i++ ){
            boolean existenCambios = false;
            for(int j = 0; j < tamProducts-1-i; j++){
                if(products[j].getStock() > products[j+1].getStock()){
                    Product aux = products[j];
                    products[j] = products[j+1];
                    products[j+1] = aux;
                    existenCambios = true;
                }
                }
            }
        }
    }
