package DependencyInversion;

public class Product {
    private String name;
    private Integer type;
    private double cost;

    public Product(String name, Integer type, double cost) {
        this.name = name;
        this.type = type;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", type=" + (type == 0 ? "Alimento" : ( type == 1 ? "Medicina" : ( type == 2 ? "Ropa" : "Otros"))) +
                ", cost=" + cost +
                '}';
    }
}
