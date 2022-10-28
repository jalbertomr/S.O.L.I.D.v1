package DependencyInversion;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private List<Product> inventory ;

    public Warehouse() {
        this.inventory = new ArrayList<>();
    }

    // available inventory to outside world >:(
    public List<Product> getInventory() {
        return inventory;
    }

    public void addProduct(Product product){
        inventory.add( product);
    }

}
