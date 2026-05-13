import controllers.BusquedaBinaria;
import models.Product;

public class App {
    public static void main(String[] args) throws Exception {
    Product[] products = new Product[6];
    products[0] = new Product("Laptop", 10);
    products[1] = new Product("Smartphone", 20);
    products[2] = new Product("Headphones", 2);
    products[3] = new Product("Monitor", 5);
    products[4] = new Product("Keyboard", 15);

    BusquedaBinaria binaria = new BusquedaBinaria(); //objeto auxiliar
    int stockToFind = 2;
    binaria.fileProductIndexByStock(products, stockToFind);
    int indexResult = binaria.fileProductIndexByStock(products, stockToFind);
    if (indexResult >= 0){
        System.out.println("Se encontró el producto");
        System.out.println("la posicion es "+ indexResult);
    }
    else {
        System.out.println("No hay producto con este stock");
    }
    Product result = binaria.fileProductByStock(products, indexResult);
    if (result != null){
        System.out.println("Se encontró");
            System.out.println(result);
    } else {
        System.out.println("No hay producto con ese stock" + stockToFind);
    }  
}
}
