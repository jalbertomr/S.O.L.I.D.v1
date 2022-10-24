package OpenClosePrincipleWITH;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<InventoryBase> productos = (List<InventoryBase>) Arrays.asList(
                new InventoryCategory1( new Product("A", 1, 12.34)),
                new InventoryCategory2( new Product("b",2, 22.22)),
                new InventoryCategory2( new Product("c", 2, 32.34)),
                new InventoryCategory1( new Product("D",1, 24.44)),
                new InventoryCategory1( new Product("E", 1, 15.35)),
                new InventoryCategory2( new Product("f",2, 26.62))
        );

        GroceryStore myGroceryStore = new GroceryStore(productos);
        myGroceryStore.calcTotalInventory();
    }

}
