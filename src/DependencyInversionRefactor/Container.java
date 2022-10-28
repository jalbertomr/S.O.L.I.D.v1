package DependencyInversionRefactor;

import java.util.ArrayList;
import java.util.List;

public class Container implements IAuditable {

    // inventory not available to the outside world :)
    private List<Product> inventory ;

    public Container() {
        this.inventory = new ArrayList<>();
    }

    public void addProduct(Product product){
        inventory.add( product);
    }

    @Override
    public Iterable<Product> getProducts(int type) {
        List<Product> productsType = new ArrayList<>();

        for( Product product : inventory){
            if (product.getType() == type){
                productsType.add(product);
            }
        }
        return productsType;
    }
}
