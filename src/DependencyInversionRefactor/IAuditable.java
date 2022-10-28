package DependencyInversionRefactor;

public interface IAuditable {
    Iterable<Product> getProducts(int type);
}
