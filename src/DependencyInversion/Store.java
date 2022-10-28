package DependencyInversion;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> inventory ;

    public Store() {
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
