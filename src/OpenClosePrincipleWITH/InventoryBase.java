package OpenClosePrincipleWITH;

abstract class InventoryBase {
    protected Product product;

    public InventoryBase(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "InventoryBase{" +
                "product=" + product +
                '}';
    }

    public abstract double calcTotalInventory();
}
