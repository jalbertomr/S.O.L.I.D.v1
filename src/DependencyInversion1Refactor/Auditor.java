package DependencyInversion1Refactor;

import java.util.concurrent.atomic.AtomicReference;

public class Auditor {
    private IAuditable store;

    public Auditor(IAuditable store) {
        this.store = store;
    }

    public double calcTotalFoods(){
        AtomicReference<Double> total = new AtomicReference<>((double) 0);

        Iterable<Product> productsOfType = store.getProducts(0);

        productsOfType.forEach( p -> {
            System.out.println(p);
            total.updateAndGet(v -> new Double((double) (v + p.getCost())));
        });

        return total.get();
    }
}
