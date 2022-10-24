package OpenClosePrincipleWITH;

import java.util.List;

public class GroceryStore {

    private List<InventoryBase> products;

    public GroceryStore(List<InventoryBase> products) {
        this.products = products;
    }

    public void calcTotalInventory(){
        double total = 0;

        for ( var  product: products){  //InventoryBase -> var java 11
            System.out.println(product.getProduct().toString());
            total +=  product.getProduct().getPrice();
        }
        System.out.println("Total de Inventario: " + total);
    }
}