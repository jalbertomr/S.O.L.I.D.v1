package DependencyInversion;

import java.util.ArrayList;
import java.util.List;

public class Container {
    private List<Product> inventory ;

    public Container() {
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
