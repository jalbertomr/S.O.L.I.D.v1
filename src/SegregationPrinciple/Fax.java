package SegregationPrinciple;

public class Fax implements IMultifunctional {

    @Override
    public void print() {
        System.out.println("Service not available");
    }

    @Override
    public void scan() {
        System.out.println("Service not available");
    }

    @Override
    public void phone() {
        System.out.println("Doing a Call");
    }

    @Override
    public void fax() {
        System.out.println("Faxing a document");
    }
}
