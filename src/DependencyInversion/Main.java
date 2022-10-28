package DependencyInversion;

public class Main {
    private static Object Container;

    public static void main(String[] args) {
        Store store = new Store();
        Container container = new Container();
        Warehouse warehouse = new Warehouse();

        double total = 0;

        //Food 0, Medicine 1, Clothes 2
        store.addProduct( new Product("Piña", 0, 20.30));
        store.addProduct( new Product("Leche", 0, 17.55));
        store.addProduct( new Product("Aspirina", 1, 15.99));
        store.addProduct( new Product("Jarabe", 1, 120.30));
        store.addProduct( new Product("Penicilina", 1, 145.70));
        store.addProduct( new Product("Pantalon 501", 2, 20.30));
        store.addProduct( new Product("Chamarra light", 2, 670.00));
        store.addProduct( new Product("Manzana", 0, 5.59));

        Auditor auditor = new Auditor(store);

        total = auditor.calcTotalFoods();
        System.out.println("auditor total: " + total);
    }

}
