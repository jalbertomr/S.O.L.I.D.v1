package OpenClosePrinciple1Refactor;

import java.util.List;

public class GroceryStore {

    private List<InventoryBase> products;

    public GroceryStore(List<InventoryBase> products) {
        this.products = products;
    }

    public void calcTotalInventory(){
        double total = 0;

        for ( InventoryBase  product: products){
            System.out.println(product.getProduct().toString());
            total +=  product.getProduct().getPrice();
        }

        System.out.println("Total de Inventario: " + total);
    }
}
