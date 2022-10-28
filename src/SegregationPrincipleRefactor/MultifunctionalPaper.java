package SegregationPrincipleRefactor;

public class MultifunctionalPaper implements IMultifunctionalPaper {
    @Override
    public void print() {
        System.out.println("Printing a Document");
    }

    @Override
    public void scan() {
        System.out.println("Scanning a Document");
    }
}
