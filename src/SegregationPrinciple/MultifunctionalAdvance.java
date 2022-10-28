package SegregationPrinciple;

public class MultifunctionalAdvance implements IMultifunctional {
    @Override
    public void print() {
        System.out.println("Printing a Document");
    }

    @Override
    public void scan() {
        System.out.println("Scanning a Document");
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
