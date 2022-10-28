package DependencyInversion;

public class Auditor {
    private Store store;

    public Auditor(Store store) {
        this.store = store;
    }

    public double calcTotalFoods(){
        double total = 0;

        for( Product product : store.getInventory()){
            if (product.getType() == 0){
                System.out.println(product);
                total += product.getCost();
            }
        }
        return total;
    }
}
