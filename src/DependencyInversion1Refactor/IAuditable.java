package DependencyInversion1Refactor;

public interface IAuditable {
    Iterable<Product> getProducts(int type);
}
