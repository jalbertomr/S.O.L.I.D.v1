package OpenClosePrinciple1;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productos = Arrays.asList(
                new Product("A", 1, 12.34),
                new Product("b",2, 22.22),
                new Product("c", 2, 32.34),
                new Product("D",1, 24.44),
                new Product("E", 1, 15.35),
                new Product("f",2, 26.62)
        );

        GroceryStore myGroceryStore = new GroceryStore(productos);
        myGroceryStore.calcTotalInventory();
    }

}
