package OpenClosePrincipleWITH;

public class InventoryCategory2 extends InventoryBase {
    public InventoryCategory2(Product product) {
        super(product);
    }

    @Override
    public double calcTotalInventory() {
        product.setPrice( product.getPrice() * 2);
        return product.getPrice();
    }
}
