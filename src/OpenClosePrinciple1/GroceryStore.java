package OpenClosePrinciple1;

import java.util.List;

public class GroceryStore {

    private List<Product> products;

    public GroceryStore(List<Product> products) {
        this.products = products;
    }

    public void calcTotalInventory(){
        double total = 0;

//        for (Product product: products){
//            System.out.println(product.toString());
//            total += product.getPrice();
//        }

        // Due to a change on price politics of category product, the GroceryStore Class has to be changed

        for (Product product: products) {
            if (product.getCategory() == 1){
                product.setPrice( product.getPrice() * 2);
                total += product.getPrice();
            }
            if (product.getCategory() == 2){
                product.setPrice( product.getPrice() * 0.5);
                total += product.getPrice();
            }
        }

        System.out.println("Total de Inventario: " + total);
    }
}
