package OpenClosePrinciple1Refactor;

public class InventoryCategory1 extends InventoryBase {
    public InventoryCategory1(Product product) {
        super(product);
    }

    @Override
    public double calcTotalInventory() {
        product.setPrice( product.getPrice() * 0.5);
        return product.getPrice();
    }
}
